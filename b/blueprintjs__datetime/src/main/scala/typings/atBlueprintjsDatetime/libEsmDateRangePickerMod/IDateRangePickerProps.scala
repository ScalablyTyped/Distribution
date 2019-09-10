package typings.atBlueprintjsDatetime.libEsmDateRangePickerMod

import typings.atBlueprintjsCore.libEsmCommonBoundaryMod.Boundary
import typings.atBlueprintjsCore.libEsmCommonPropsMod.IProps
import typings.atBlueprintjsDatetime.Anon_Day
import typings.atBlueprintjsDatetime.libEsmCommonDateUtilsMod.DateRange
import typings.atBlueprintjsDatetime.libEsmDatePickerCoreMod.IDatePickerBaseProps
import typings.atBlueprintjsDatetime.libEsmDatePickerCoreMod.IDatePickerModifiers
import typings.atBlueprintjsDatetime.libEsmShortcutsMod.IDateRangeShortcut
import typings.atBlueprintjsDatetime.libEsmTimePickerMod.ITimePickerProps
import typings.atBlueprintjsDatetime.libEsmTimePickerMod.TimePrecision
import typings.reactDashDayDashPicker.typesPropsMod.DayPickerProps
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDateRangePickerProps
  extends IDatePickerBaseProps
     with IProps {
  /**
    * Whether the start and end dates of the range can be the same day.
    * If `true`, clicking a selected date will create a one-day range.
    * If `false`, clicking a selected date will clear the selection.
    * @default false
    */
  var allowSingleDayRange: js.UndefOr[Boolean] = js.undefined
  /**
    * The date-range boundary that the next click should modify.
    * This will be honored unless the next click would overlap the other boundary date.
    * In that case, the two boundary dates will be auto-swapped to keep them in chronological order.
    * If `undefined`, the picker will revert to its default selection behavior.
    */
  var boundaryToModify: js.UndefOr[Boundary] = js.undefined
  /**
    * Whether displayed months in the calendar are contiguous.
    * If false, each side of the calendar can move independently to non-contiguous months.
    * @default true
    */
  var contiguousCalendarMonths: js.UndefOr[Boolean] = js.undefined
  /**
    * Props to pass to ReactDayPicker. See API documentation
    * [here](http://react-day-picker.js.org/api/DayPicker).
    *
    * The following props are managed by the component and cannot be configured:
    * `canChangeMonth`, `captionElement`, `numberOfMonths`, `fromMonth` (use
    * `minDate`), `month` (use `initialMonth`), `toMonth` (use `maxDate`).
    */
  var dayPickerProps: js.UndefOr[DayPickerProps] = js.undefined
  /**
    * Initial `DateRange` the calendar will display as selected.
    * This should not be set if `value` is set.
    */
  var defaultValue: js.UndefOr[DateRange] = js.undefined
  /**
    * Called when the user selects a day.
    * If no days are selected, it will pass `[null, null]`.
    * If a start date is selected but not an end date, it will pass `[selectedDate, null]`.
    * If both a start and end date are selected, it will pass `[startDate, endDate]`.
    */
  var onChange: js.UndefOr[js.Function1[/* selectedDates */ DateRange, Unit]] = js.undefined
  /**
    * Called when the user changes the hovered date range, either from mouseenter or mouseleave.
    * When triggered from mouseenter, it will pass the date range that would result from next click.
    * When triggered from mouseleave, it will pass `undefined`.
    */
  var onHoverChange: js.UndefOr[
    js.Function3[
      /* hoveredDates */ DateRange, 
      /* hoveredDay */ Date, 
      /* hoveredBoundary */ Boundary, 
      Unit
    ]
  ] = js.undefined
  /**
    * Called when the `shortcuts` props is enabled and the user changes the shortcut.
    */
  var onShortcutChange: js.UndefOr[js.Function2[/* shortcut */ IDateRangeShortcut, /* index */ Double, Unit]] = js.undefined
  /**
    * The currently selected shortcut.
    * If this prop is provided, the component acts in a controlled manner.
    */
  var selectedShortcutIndex: js.UndefOr[Double] = js.undefined
  /**
    * Whether shortcuts to quickly select a range of dates are displayed or not.
    * If `true`, preset shortcuts will be displayed.
    * If `false`, no shortcuts will be displayed.
    * If an array is provided, the custom shortcuts will be displayed.
    * @default true
    */
  var shortcuts: js.UndefOr[Boolean | js.Array[IDateRangeShortcut]] = js.undefined
  /**
    * Whether to show only a single month calendar.
    * @default false
    */
  var singleMonthOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * The currently selected `DateRange`.
    * If this prop is provided, the component acts in a controlled manner.
    */
  var value: js.UndefOr[DateRange] = js.undefined
}

object IDateRangePickerProps {
  @scala.inline
  def apply(
    allowSingleDayRange: js.UndefOr[Boolean] = js.undefined,
    boundaryToModify: Boundary = null,
    className: String = null,
    contiguousCalendarMonths: js.UndefOr[Boolean] = js.undefined,
    dayPickerProps: DayPickerProps = null,
    defaultValue: DateRange = null,
    initialMonth: Date = null,
    locale: String = null,
    localeUtils: Anon_Day = null,
    maxDate: Date = null,
    minDate: Date = null,
    modifiers: IDatePickerModifiers = null,
    onChange: /* selectedDates */ DateRange => Unit = null,
    onHoverChange: (/* hoveredDates */ DateRange, /* hoveredDay */ Date, /* hoveredBoundary */ Boundary) => Unit = null,
    onShortcutChange: (/* shortcut */ IDateRangeShortcut, /* index */ Double) => Unit = null,
    reverseMonthAndYearMenus: js.UndefOr[Boolean] = js.undefined,
    selectedShortcutIndex: Int | Double = null,
    shortcuts: Boolean | js.Array[IDateRangeShortcut] = null,
    singleMonthOnly: js.UndefOr[Boolean] = js.undefined,
    timePickerProps: ITimePickerProps = null,
    timePrecision: TimePrecision = null,
    value: DateRange = null
  ): IDateRangePickerProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowSingleDayRange)) __obj.updateDynamic("allowSingleDayRange")(allowSingleDayRange)
    if (boundaryToModify != null) __obj.updateDynamic("boundaryToModify")(boundaryToModify)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(contiguousCalendarMonths)) __obj.updateDynamic("contiguousCalendarMonths")(contiguousCalendarMonths)
    if (dayPickerProps != null) __obj.updateDynamic("dayPickerProps")(dayPickerProps)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (initialMonth != null) __obj.updateDynamic("initialMonth")(initialMonth)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (localeUtils != null) __obj.updateDynamic("localeUtils")(localeUtils)
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate)
    if (minDate != null) __obj.updateDynamic("minDate")(minDate)
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onHoverChange != null) __obj.updateDynamic("onHoverChange")(js.Any.fromFunction3(onHoverChange))
    if (onShortcutChange != null) __obj.updateDynamic("onShortcutChange")(js.Any.fromFunction2(onShortcutChange))
    if (!js.isUndefined(reverseMonthAndYearMenus)) __obj.updateDynamic("reverseMonthAndYearMenus")(reverseMonthAndYearMenus)
    if (selectedShortcutIndex != null) __obj.updateDynamic("selectedShortcutIndex")(selectedShortcutIndex.asInstanceOf[js.Any])
    if (shortcuts != null) __obj.updateDynamic("shortcuts")(shortcuts.asInstanceOf[js.Any])
    if (!js.isUndefined(singleMonthOnly)) __obj.updateDynamic("singleMonthOnly")(singleMonthOnly)
    if (timePickerProps != null) __obj.updateDynamic("timePickerProps")(timePickerProps)
    if (timePrecision != null) __obj.updateDynamic("timePrecision")(timePrecision)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[IDateRangePickerProps]
  }
}

