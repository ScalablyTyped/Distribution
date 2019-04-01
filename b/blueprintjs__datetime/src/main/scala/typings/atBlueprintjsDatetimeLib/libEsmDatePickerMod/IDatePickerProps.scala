package typings
package atBlueprintjsDatetimeLib.libEsmDatePickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDatePickerProps
  extends atBlueprintjsDatetimeLib.libEsmDatePickerCoreMod.IDatePickerBaseProps
     with atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps {
  /**
    * Allows the user to clear the selection by clicking the currently selected day.
    * @default true
    */
  var canClearSelection: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Text for the reset button in the action bar.
    * @default "Clear"
    */
  var clearButtonText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Props to pass to ReactDayPicker. See API documentation
    * [here](http://react-day-picker.js.org/api/DayPicker).
    *
    * The following props are managed by the component and cannot be configured:
    * `canChangeMonth`, `captionElement`, `fromMonth` (use `minDate`), `month` (use
    * `initialMonth`), `toMonth` (use `maxDate`).
    */
  var dayPickerProps: js.UndefOr[reactDashDayDashPickerLib.typesPropsMod.DayPickerProps] = js.undefined
  /**
    * Initial day the calendar will display as selected.
    * This should not be set if `value` is set.
    */
  var defaultValue: js.UndefOr[stdLib.Date] = js.undefined
  /**
    * Called when the user selects a day.
    * If being used in an uncontrolled manner, `selectedDate` will be `null` if the user clicks the currently selected
    * day. If being used in a controlled manner, `selectedDate` will contain the day clicked no matter what.
    * `isUserChange` is true if the user selected a day, and false if the date was automatically changed
    * by the user navigating to a new month or year rather than explicitly clicking on a date in the calendar.
    */
  var onChange: js.UndefOr[
    js.Function2[/* selectedDate */ stdLib.Date, /* isUserChange */ scala.Boolean, scala.Unit]
  ] = js.undefined
  /**
    * Whether the bottom bar displaying "Today" and "Clear" buttons should be shown.
    * @default false
    */
  var showActionsBar: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Text for the today button in the action bar.
    * @default "Today"
    */
  var todayButtonText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The currently selected day. If this prop is provided, the component acts in a controlled manner.
    */
  var value: js.UndefOr[stdLib.Date] = js.undefined
}

object IDatePickerProps {
  @scala.inline
  def apply(
    canClearSelection: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    clearButtonText: java.lang.String = null,
    dayPickerProps: reactDashDayDashPickerLib.typesPropsMod.DayPickerProps = null,
    defaultValue: stdLib.Date = null,
    initialMonth: stdLib.Date = null,
    locale: java.lang.String = null,
    localeUtils: reactDashDayDashPickerLib.typesUtilsMod.LocaleUtils = null,
    maxDate: stdLib.Date = null,
    minDate: stdLib.Date = null,
    modifiers: atBlueprintjsDatetimeLib.libEsmDatePickerCoreMod.IDatePickerModifiers = null,
    onChange: (/* selectedDate */ stdLib.Date, /* isUserChange */ scala.Boolean) => scala.Unit = null,
    reverseMonthAndYearMenus: js.UndefOr[scala.Boolean] = js.undefined,
    showActionsBar: js.UndefOr[scala.Boolean] = js.undefined,
    timePickerProps: atBlueprintjsDatetimeLib.libEsmTimePickerMod.ITimePickerProps = null,
    timePrecision: atBlueprintjsDatetimeLib.libEsmTimePickerMod.TimePrecision = null,
    todayButtonText: java.lang.String = null,
    value: stdLib.Date = null
  ): IDatePickerProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(canClearSelection)) __obj.updateDynamic("canClearSelection")(canClearSelection)
    if (className != null) __obj.updateDynamic("className")(className)
    if (clearButtonText != null) __obj.updateDynamic("clearButtonText")(clearButtonText)
    if (dayPickerProps != null) __obj.updateDynamic("dayPickerProps")(dayPickerProps)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (initialMonth != null) __obj.updateDynamic("initialMonth")(initialMonth)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (localeUtils != null) __obj.updateDynamic("localeUtils")(localeUtils)
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate)
    if (minDate != null) __obj.updateDynamic("minDate")(minDate)
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (!js.isUndefined(reverseMonthAndYearMenus)) __obj.updateDynamic("reverseMonthAndYearMenus")(reverseMonthAndYearMenus)
    if (!js.isUndefined(showActionsBar)) __obj.updateDynamic("showActionsBar")(showActionsBar)
    if (timePickerProps != null) __obj.updateDynamic("timePickerProps")(timePickerProps)
    if (timePrecision != null) __obj.updateDynamic("timePrecision")(timePrecision)
    if (todayButtonText != null) __obj.updateDynamic("todayButtonText")(todayButtonText)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[IDatePickerProps]
  }
}

