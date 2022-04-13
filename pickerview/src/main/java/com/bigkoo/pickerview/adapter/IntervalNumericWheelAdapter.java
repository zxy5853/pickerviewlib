package com.bigkoo.pickerview.adapter;


import com.contrarywind.adapter.WheelAdapter;

/**
 * Numeric Wheel adapter.
 */
public class IntervalNumericWheelAdapter implements WheelAdapter {

    private int minValue;
    private int maxValue;
    private int interval;

    /**
     * Constructor
     *
     * @param minValue the wheel min value
     * @param maxValue the wheel max value
     */
    public IntervalNumericWheelAdapter(int minValue, int maxValue, int interval) {
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.interval = interval;
    }

    @Override
    public Object getItem(int index) {
        if (index >= 0 && index < getItemsCount()) {
            int value = minValue + index * interval;
            return value;
        }
        return 0;
    }

    @Override
    public int getItemsCount() {
        return (maxValue - minValue + 1) / interval;
    }

    @Override
    public int indexOf(Object o) {
        try {
            return ((int) o - minValue) / interval;
        } catch (Exception e) {
            return -1;
        }

    }
}
