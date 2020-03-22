package typings.blueprintjsDatetime

import typings.blueprintjsCore.inputGroupMod.IInputGroupProps
import typings.blueprintjsCore.propsMod.HTMLInputProps
import typings.blueprintjsDatetime.blueprintjsDatetimeBooleans.`false`
import typings.blueprintjsDatetime.datePickerCoreMod.IDatePickerModifiers
import typings.blueprintjsDatetime.shortcutsMod.IDatePickerShortcut
import typings.blueprintjsDatetime.timePickerMod.ITimePickerProps
import typings.blueprintjsDatetime.timePickerMod.TimePrecision
import typings.react.mod._Global_.JSX.Element
import typings.reactDayPicker.propsMod.DayPickerProps
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@blueprintjs/datetime.@blueprintjs/datetime/lib/esm/dateInput.IDateInputProps> */
trait PartialIDateInputProps extends js.Object {
  var canClearSelection: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var clearButtonText: js.UndefOr[String] = js.undefined
  var closeOnSelection: js.UndefOr[Boolean] = js.undefined
  var dayPickerProps: js.UndefOr[DayPickerProps] = js.undefined
  var defaultValue: js.UndefOr[Date] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var fill: js.UndefOr[Boolean] = js.undefined
  var formatDate: js.UndefOr[js.Function2[/* date */ Date, /* locale */ js.UndefOr[String], String]] = js.undefined
  var initialMonth: js.UndefOr[Date] = js.undefined
  var inputProps: js.UndefOr[HTMLInputProps with IInputGroupProps] = js.undefined
  var invalidDateMessage: js.UndefOr[String] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
  var localeUtils: js.UndefOr[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LocaleUtils */ js.Any
  ] = js.undefined
  var maxDate: js.UndefOr[Date] = js.undefined
  var minDate: js.UndefOr[Date] = js.undefined
  var modifiers: js.UndefOr[IDatePickerModifiers] = js.undefined
  var onChange: js.UndefOr[js.Function2[/* selectedDate */ Date, /* isUserChange */ Boolean, Unit]] = js.undefined
  var onError: js.UndefOr[js.Function1[/* errorDate */ Date, Unit]] = js.undefined
  var outOfRangeMessage: js.UndefOr[String] = js.undefined
  var parseDate: js.UndefOr[
    js.Function2[/* str */ String, /* locale */ js.UndefOr[String], Date | `false` | Null]
  ] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var popoverProps: js.UndefOr[PartialIPopoverProps with js.Object] = js.undefined
  var reverseMonthAndYearMenus: js.UndefOr[Boolean] = js.undefined
  var rightElement: js.UndefOr[Element] = js.undefined
  var shortcuts: js.UndefOr[Boolean | js.Array[IDatePickerShortcut]] = js.undefined
  var showActionsBar: js.UndefOr[Boolean] = js.undefined
  var timePickerProps: js.UndefOr[ITimePickerProps] = js.undefined
  var timePrecision: js.UndefOr[TimePrecision] = js.undefined
  var todayButtonText: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[Date] = js.undefined
}

object PartialIDateInputProps {
  @scala.inline
  def apply(
    canClearSelection: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    clearButtonText: String = null,
    closeOnSelection: js.UndefOr[Boolean] = js.undefined,
    dayPickerProps: DayPickerProps = null,
    defaultValue: Date = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    fill: js.UndefOr[Boolean] = js.undefined,
    formatDate: (/* date */ Date, /* locale */ js.UndefOr[String]) => String = null,
    initialMonth: Date = null,
    inputProps: HTMLInputProps with IInputGroupProps = null,
    invalidDateMessage: String = null,
    locale: String = null,
    localeUtils: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LocaleUtils */ js.Any = null,
    maxDate: Date = null,
    minDate: Date = null,
    modifiers: IDatePickerModifiers = null,
    onChange: (/* selectedDate */ Date, /* isUserChange */ Boolean) => Unit = null,
    onError: /* errorDate */ Date => Unit = null,
    outOfRangeMessage: String = null,
    parseDate: (/* str */ String, /* locale */ js.UndefOr[String]) => Date | `false` | Null = null,
    placeholder: String = null,
    popoverProps: PartialIPopoverProps with js.Object = null,
    reverseMonthAndYearMenus: js.UndefOr[Boolean] = js.undefined,
    rightElement: Element = null,
    shortcuts: Boolean | js.Array[IDatePickerShortcut] = null,
    showActionsBar: js.UndefOr[Boolean] = js.undefined,
    timePickerProps: ITimePickerProps = null,
    timePrecision: TimePrecision = null,
    todayButtonText: String = null,
    value: Date = null
  ): PartialIDateInputProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(canClearSelection)) __obj.updateDynamic("canClearSelection")(canClearSelection.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (clearButtonText != null) __obj.updateDynamic("clearButtonText")(clearButtonText.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnSelection)) __obj.updateDynamic("closeOnSelection")(closeOnSelection.asInstanceOf[js.Any])
    if (dayPickerProps != null) __obj.updateDynamic("dayPickerProps")(dayPickerProps.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (formatDate != null) __obj.updateDynamic("formatDate")(js.Any.fromFunction2(formatDate))
    if (initialMonth != null) __obj.updateDynamic("initialMonth")(initialMonth.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (invalidDateMessage != null) __obj.updateDynamic("invalidDateMessage")(invalidDateMessage.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (localeUtils != null) __obj.updateDynamic("localeUtils")(localeUtils.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (outOfRangeMessage != null) __obj.updateDynamic("outOfRangeMessage")(outOfRangeMessage.asInstanceOf[js.Any])
    if (parseDate != null) __obj.updateDynamic("parseDate")(js.Any.fromFunction2(parseDate))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (popoverProps != null) __obj.updateDynamic("popoverProps")(popoverProps.asInstanceOf[js.Any])
    if (!js.isUndefined(reverseMonthAndYearMenus)) __obj.updateDynamic("reverseMonthAndYearMenus")(reverseMonthAndYearMenus.asInstanceOf[js.Any])
    if (rightElement != null) __obj.updateDynamic("rightElement")(rightElement.asInstanceOf[js.Any])
    if (shortcuts != null) __obj.updateDynamic("shortcuts")(shortcuts.asInstanceOf[js.Any])
    if (!js.isUndefined(showActionsBar)) __obj.updateDynamic("showActionsBar")(showActionsBar.asInstanceOf[js.Any])
    if (timePickerProps != null) __obj.updateDynamic("timePickerProps")(timePickerProps.asInstanceOf[js.Any])
    if (timePrecision != null) __obj.updateDynamic("timePrecision")(timePrecision.asInstanceOf[js.Any])
    if (todayButtonText != null) __obj.updateDynamic("todayButtonText")(todayButtonText.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialIDateInputProps]
  }
}

