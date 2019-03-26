package typings
package atBlueprintjsDatetimeLib.libEsmTimePickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimePickerProps
  extends atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps {
  /**
    * Initial time the `TimePicker` will display.
    * This should not be set if `value` is set.
    */
  var defaultValue: js.UndefOr[stdLib.Date] = js.undefined
  /**
    * Whether the time picker is non-interactive.
    * @default false
    */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The latest time the user can select. The year, month, and day parts of the `Date` object are ignored.
    * While the `maxTime` will be later than the `minTime` in the basic case,
    * it is also allowed to be earlier than the `minTime`.
    * This is useful, for example, to express a time range that extends before and after midnight.
    * If the `maxTime` and `minTime` are equal, then the valid time range is constrained to only that one value.
    */
  var maxTime: js.UndefOr[stdLib.Date] = js.undefined
  /**
    * The earliest time the user can select. The year, month, and day parts of the `Date` object are ignored.
    * While the `minTime` will be earlier than the `maxTime` in the basic case,
    * it is also allowed to be later than the `maxTime`.
    * This is useful, for example, to express a time range that extends before and after midnight.
    * If the `maxTime` and `minTime` are equal, then the valid time range is constrained to only that one value.
    */
  var minTime: js.UndefOr[stdLib.Date] = js.undefined
  /**
    * Callback invoked when the user changes the time.
    */
  var onChange: js.UndefOr[js.Function1[/* newTime */ stdLib.Date, scala.Unit]] = js.undefined
  /**
    * The precision of time the user can set.
    * @default TimePrecision.MINUTE
    */
  var precision: js.UndefOr[TimePrecision] = js.undefined
  /**
    * Whether all the text in each input should be selected on focus.
    * @default false
    */
  var selectAllOnFocus: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to show arrows buttons for changing the time.
    * @default false
    */
  var showArrowButtons: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to use a 12 hour format with an AM/PM dropdown.
    * @default false
    */
  var useAmPm: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The currently set time.
    * If this prop is provided, the component acts in a controlled manner.
    */
  var value: js.UndefOr[stdLib.Date] = js.undefined
}

object ITimePickerProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    defaultValue: stdLib.Date = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    maxTime: stdLib.Date = null,
    minTime: stdLib.Date = null,
    onChange: /* newTime */ stdLib.Date => scala.Unit = null,
    precision: TimePrecision = null,
    selectAllOnFocus: js.UndefOr[scala.Boolean] = js.undefined,
    showArrowButtons: js.UndefOr[scala.Boolean] = js.undefined,
    useAmPm: js.UndefOr[scala.Boolean] = js.undefined,
    value: stdLib.Date = null
  ): ITimePickerProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (maxTime != null) __obj.updateDynamic("maxTime")(maxTime)
    if (minTime != null) __obj.updateDynamic("minTime")(minTime)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (precision != null) __obj.updateDynamic("precision")(precision)
    if (!js.isUndefined(selectAllOnFocus)) __obj.updateDynamic("selectAllOnFocus")(selectAllOnFocus)
    if (!js.isUndefined(showArrowButtons)) __obj.updateDynamic("showArrowButtons")(showArrowButtons)
    if (!js.isUndefined(useAmPm)) __obj.updateDynamic("useAmPm")(useAmPm)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ITimePickerProps]
  }
}

