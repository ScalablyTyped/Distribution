package typings.blueprintjsDatetime.timePickerMod

import typings.blueprintjsCore.propsMod.IProps
import typings.blueprintjsDatetime.timeUnitMod.TimeUnit
import typings.react.mod.FocusEvent
import typings.react.mod.KeyboardEvent
import typings.std.Date
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimePickerProps extends IProps {
  /**
    * Whether to focus the first input when it opens initially.
    * @default false
    */
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  /**
    * Initial time the `TimePicker` will display.
    * This should not be set if `value` is set.
    */
  var defaultValue: js.UndefOr[Date] = js.undefined
  /**
    * Whether the time picker is non-interactive.
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The latest time the user can select. The year, month, and day parts of the `Date` object are ignored.
    * While the `maxTime` will be later than the `minTime` in the basic case,
    * it is also allowed to be earlier than the `minTime`.
    * This is useful, for example, to express a time range that extends before and after midnight.
    * If the `maxTime` and `minTime` are equal, then the valid time range is constrained to only that one value.
    */
  var maxTime: js.UndefOr[Date] = js.undefined
  /**
    * The earliest time the user can select. The year, month, and day parts of the `Date` object are ignored.
    * While the `minTime` will be earlier than the `maxTime` in the basic case,
    * it is also allowed to be later than the `maxTime`.
    * This is useful, for example, to express a time range that extends before and after midnight.
    * If the `maxTime` and `minTime` are equal, then the valid time range is constrained to only that one value.
    */
  var minTime: js.UndefOr[Date] = js.undefined
  /**
    * Callback invoked on blur event emitted by specific time unit input
    */
  var onBlur: js.UndefOr[
    js.Function2[/* event */ FocusEvent[HTMLInputElement], /* unit */ TimeUnit, Unit]
  ] = js.undefined
  /**
    * Callback invoked when the user changes the time.
    */
  var onChange: js.UndefOr[js.Function1[/* newTime */ Date, Unit]] = js.undefined
  /**
    * Callback invoked on focus event emitted by specific time unit input
    */
  var onFocus: js.UndefOr[
    js.Function2[/* event */ FocusEvent[HTMLInputElement], /* unit */ TimeUnit, Unit]
  ] = js.undefined
  /**
    * Callback invoked on keydown event emitted by specific time unit input
    */
  var onKeyDown: js.UndefOr[
    js.Function2[/* event */ KeyboardEvent[HTMLInputElement], /* unit */ TimeUnit, Unit]
  ] = js.undefined
  /**
    * Callback invoked on keyup event emitted by specific time unit input
    */
  var onKeyUp: js.UndefOr[
    js.Function2[/* event */ KeyboardEvent[HTMLInputElement], /* unit */ TimeUnit, Unit]
  ] = js.undefined
  /**
    * The precision of time the user can set.
    * @default TimePrecision.MINUTE
    */
  var precision: js.UndefOr[TimePrecision] = js.undefined
  /**
    * Whether all the text in each input should be selected on focus.
    * @default false
    */
  var selectAllOnFocus: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to show arrows buttons for changing the time.
    * @default false
    */
  var showArrowButtons: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to use a 12 hour format with an AM/PM dropdown.
    * @default false
    */
  var useAmPm: js.UndefOr[Boolean] = js.undefined
  /**
    * The currently set time.
    * If this prop is provided, the component acts in a controlled manner.
    */
  var value: js.UndefOr[Date] = js.undefined
}

object ITimePickerProps {
  @scala.inline
  def apply(
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    defaultValue: Date = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    maxTime: Date = null,
    minTime: Date = null,
    onBlur: (/* event */ FocusEvent[HTMLInputElement], /* unit */ TimeUnit) => Unit = null,
    onChange: /* newTime */ Date => Unit = null,
    onFocus: (/* event */ FocusEvent[HTMLInputElement], /* unit */ TimeUnit) => Unit = null,
    onKeyDown: (/* event */ KeyboardEvent[HTMLInputElement], /* unit */ TimeUnit) => Unit = null,
    onKeyUp: (/* event */ KeyboardEvent[HTMLInputElement], /* unit */ TimeUnit) => Unit = null,
    precision: TimePrecision = null,
    selectAllOnFocus: js.UndefOr[Boolean] = js.undefined,
    showArrowButtons: js.UndefOr[Boolean] = js.undefined,
    useAmPm: js.UndefOr[Boolean] = js.undefined,
    value: Date = null
  ): ITimePickerProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (maxTime != null) __obj.updateDynamic("maxTime")(maxTime.asInstanceOf[js.Any])
    if (minTime != null) __obj.updateDynamic("minTime")(minTime.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction2(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction2(onFocus))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction2(onKeyDown))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction2(onKeyUp))
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (!js.isUndefined(selectAllOnFocus)) __obj.updateDynamic("selectAllOnFocus")(selectAllOnFocus.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showArrowButtons)) __obj.updateDynamic("showArrowButtons")(showArrowButtons.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useAmPm)) __obj.updateDynamic("useAmPm")(useAmPm.get.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimePickerProps]
  }
}

