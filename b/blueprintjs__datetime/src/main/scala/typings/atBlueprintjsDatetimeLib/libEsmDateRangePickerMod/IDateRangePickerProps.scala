package typings
package atBlueprintjsDatetimeLib.libEsmDateRangePickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDateRangePickerProps
  extends atBlueprintjsDatetimeLib.libEsmDatePickerCoreMod.IDatePickerBaseProps
     with atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps {
  /**
    * Whether the start and end dates of the range can be the same day.
    * If `true`, clicking a selected date will create a one-day range.
    * If `false`, clicking a selected date will clear the selection.
    * @default false
    */
  var allowSingleDayRange: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The date-range boundary that the next click should modify.
    * This will be honored unless the next click would overlap the other boundary date.
    * In that case, the two boundary dates will be auto-swapped to keep them in chronological order.
    * If `undefined`, the picker will revert to its default selection behavior.
    */
  var boundaryToModify: js.UndefOr[atBlueprintjsCoreLib.libEsmCommonBoundaryMod.Boundary] = js.undefined
  /**
    * Whether displayed months in the calendar are contiguous.
    * If false, each side of the calendar can move independently to non-contiguous months.
    * @default true
    */
  var contiguousCalendarMonths: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Props to pass to ReactDayPicker. See API documentation
    * [here](http://react-day-picker.js.org/docs/api-daypicker.html).
    *
    * The following props are managed by the component and cannot be configured:
    * `canChangeMonth`, `captionElement`, `numberOfMonths`, `fromMonth` (use
    * `minDate`), `month` (use `initialMonth`), `toMonth` (use `maxDate`).
    */
  var dayPickerProps: js.UndefOr[reactDashDayDashPickerLib.typesPropsMod.DayPickerProps] = js.undefined
  /**
    * Initial `DateRange` the calendar will display as selected.
    * This should not be set if `value` is set.
    */
  var defaultValue: js.UndefOr[atBlueprintjsDatetimeLib.libEsmCommonDateUtilsMod.DateRange] = js.undefined
  /**
    * Called when the user selects a day.
    * If no days are selected, it will pass `[null, null]`.
    * If a start date is selected but not an end date, it will pass `[selectedDate, null]`.
    * If both a start and end date are selected, it will pass `[startDate, endDate]`.
    */
  var onChange: js.UndefOr[
    js.Function1[
      /* selectedDates */ atBlueprintjsDatetimeLib.libEsmCommonDateUtilsMod.DateRange, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Called when the user changes the hovered date range, either from mouseenter or mouseleave.
    * When triggered from mouseenter, it will pass the date range that would result from next click.
    * When triggered from mouseleave, it will pass `undefined`.
    */
  var onHoverChange: js.UndefOr[
    js.Function3[
      /* hoveredDates */ atBlueprintjsDatetimeLib.libEsmCommonDateUtilsMod.DateRange, 
      /* hoveredDay */ stdLib.Date, 
      /* hoveredBoundary */ atBlueprintjsCoreLib.libEsmCommonBoundaryMod.Boundary, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Whether shortcuts to quickly select a range of dates are displayed or not.
    * If `true`, preset shortcuts will be displayed.
    * If `false`, no shortcuts will be displayed.
    * If an array is provided, the custom shortcuts will be displayed.
    * @default true
    */
  var shortcuts: js.UndefOr[
    scala.Boolean | js.Array[atBlueprintjsDatetimeLib.libEsmShortcutsMod.IDateRangeShortcut]
  ] = js.undefined
  /**
    * Whether to show only a single month calendar.
    * @default false
    */
  var singleMonthOnly: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The currently selected `DateRange`.
    * If this prop is provided, the component acts in a controlled manner.
    */
  var value: js.UndefOr[atBlueprintjsDatetimeLib.libEsmCommonDateUtilsMod.DateRange] = js.undefined
}

object IDateRangePickerProps {
  @scala.inline
  def apply(
    allowSingleDayRange: js.UndefOr[scala.Boolean] = js.undefined,
    boundaryToModify: atBlueprintjsCoreLib.libEsmCommonBoundaryMod.Boundary = null,
    className: java.lang.String = null,
    contiguousCalendarMonths: js.UndefOr[scala.Boolean] = js.undefined,
    dayPickerProps: reactDashDayDashPickerLib.typesPropsMod.DayPickerProps = null,
    defaultValue: atBlueprintjsDatetimeLib.libEsmCommonDateUtilsMod.DateRange = null,
    initialMonth: stdLib.Date = null,
    locale: java.lang.String = null,
    localeUtils: reactDashDayDashPickerLib.typesUtilsMod.LocaleUtils = null,
    maxDate: stdLib.Date = null,
    minDate: stdLib.Date = null,
    modifiers: atBlueprintjsDatetimeLib.libEsmDatePickerCoreMod.IDatePickerModifiers = null,
    onChange: /* selectedDates */ atBlueprintjsDatetimeLib.libEsmCommonDateUtilsMod.DateRange => scala.Unit = null,
    onHoverChange: (/* hoveredDates */ atBlueprintjsDatetimeLib.libEsmCommonDateUtilsMod.DateRange, /* hoveredDay */ stdLib.Date, /* hoveredBoundary */ atBlueprintjsCoreLib.libEsmCommonBoundaryMod.Boundary) => scala.Unit = null,
    reverseMonthAndYearMenus: js.UndefOr[scala.Boolean] = js.undefined,
    shortcuts: scala.Boolean | js.Array[atBlueprintjsDatetimeLib.libEsmShortcutsMod.IDateRangeShortcut] = null,
    singleMonthOnly: js.UndefOr[scala.Boolean] = js.undefined,
    timePickerProps: atBlueprintjsDatetimeLib.libEsmTimePickerMod.ITimePickerProps = null,
    timePrecision: atBlueprintjsDatetimeLib.libEsmTimePickerMod.TimePrecision = null,
    value: atBlueprintjsDatetimeLib.libEsmCommonDateUtilsMod.DateRange = null
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
    if (!js.isUndefined(reverseMonthAndYearMenus)) __obj.updateDynamic("reverseMonthAndYearMenus")(reverseMonthAndYearMenus)
    if (shortcuts != null) __obj.updateDynamic("shortcuts")(shortcuts.asInstanceOf[js.Any])
    if (!js.isUndefined(singleMonthOnly)) __obj.updateDynamic("singleMonthOnly")(singleMonthOnly)
    if (timePickerProps != null) __obj.updateDynamic("timePickerProps")(timePickerProps)
    if (timePrecision != null) __obj.updateDynamic("timePrecision")(timePrecision)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[IDateRangePickerProps]
  }
}

