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

@js.native
trait ITimePickerProps extends IProps {
  /**
    * Whether to focus the first input when it opens initially.
    * @default false
    */
  var autoFocus: js.UndefOr[Boolean] = js.native
  /**
    * Initial time the `TimePicker` will display.
    * This should not be set if `value` is set.
    */
  var defaultValue: js.UndefOr[Date] = js.native
  /**
    * Whether the time picker is non-interactive.
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * The latest time the user can select. The year, month, and day parts of the `Date` object are ignored.
    * While the `maxTime` will be later than the `minTime` in the basic case,
    * it is also allowed to be earlier than the `minTime`.
    * This is useful, for example, to express a time range that extends before and after midnight.
    * If the `maxTime` and `minTime` are equal, then the valid time range is constrained to only that one value.
    */
  var maxTime: js.UndefOr[Date] = js.native
  /**
    * The earliest time the user can select. The year, month, and day parts of the `Date` object are ignored.
    * While the `minTime` will be earlier than the `maxTime` in the basic case,
    * it is also allowed to be later than the `maxTime`.
    * This is useful, for example, to express a time range that extends before and after midnight.
    * If the `maxTime` and `minTime` are equal, then the valid time range is constrained to only that one value.
    */
  var minTime: js.UndefOr[Date] = js.native
  /**
    * Callback invoked on blur event emitted by specific time unit input
    */
  var onBlur: js.UndefOr[
    js.Function2[/* event */ FocusEvent[HTMLInputElement], /* unit */ TimeUnit, Unit]
  ] = js.native
  /**
    * Callback invoked when the user changes the time.
    */
  var onChange: js.UndefOr[js.Function1[/* newTime */ Date, Unit]] = js.native
  /**
    * Callback invoked on focus event emitted by specific time unit input
    */
  var onFocus: js.UndefOr[
    js.Function2[/* event */ FocusEvent[HTMLInputElement], /* unit */ TimeUnit, Unit]
  ] = js.native
  /**
    * Callback invoked on keydown event emitted by specific time unit input
    */
  var onKeyDown: js.UndefOr[
    js.Function2[/* event */ KeyboardEvent[HTMLInputElement], /* unit */ TimeUnit, Unit]
  ] = js.native
  /**
    * Callback invoked on keyup event emitted by specific time unit input
    */
  var onKeyUp: js.UndefOr[
    js.Function2[/* event */ KeyboardEvent[HTMLInputElement], /* unit */ TimeUnit, Unit]
  ] = js.native
  /**
    * The precision of time the user can set.
    * @default TimePrecision.MINUTE
    */
  var precision: js.UndefOr[TimePrecision] = js.native
  /**
    * Whether all the text in each input should be selected on focus.
    * @default false
    */
  var selectAllOnFocus: js.UndefOr[Boolean] = js.native
  /**
    * Whether to show arrows buttons for changing the time.
    * @default false
    */
  var showArrowButtons: js.UndefOr[Boolean] = js.native
  /**
    * Whether to use a 12 hour format with an AM/PM dropdown.
    * @default false
    */
  var useAmPm: js.UndefOr[Boolean] = js.native
  /**
    * The currently set time.
    * If this prop is provided, the component acts in a controlled manner.
    */
  var value: js.UndefOr[Date] = js.native
}

object ITimePickerProps {
  @scala.inline
  def apply(): ITimePickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITimePickerProps]
  }
  @scala.inline
  implicit class ITimePickerPropsOps[Self <: ITimePickerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    @scala.inline
    def setDefaultValue(value: Date): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setMaxTime(value: Date): Self = this.set("maxTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxTime: Self = this.set("maxTime", js.undefined)
    @scala.inline
    def setMinTime(value: Date): Self = this.set("minTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinTime: Self = this.set("minTime", js.undefined)
    @scala.inline
    def setOnBlur(value: (/* event */ FocusEvent[HTMLInputElement], /* unit */ TimeUnit) => Unit): Self = this.set("onBlur", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    @scala.inline
    def setOnChange(value: /* newTime */ Date => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnFocus(value: (/* event */ FocusEvent[HTMLInputElement], /* unit */ TimeUnit) => Unit): Self = this.set("onFocus", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    @scala.inline
    def setOnKeyDown(value: (/* event */ KeyboardEvent[HTMLInputElement], /* unit */ TimeUnit) => Unit): Self = this.set("onKeyDown", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    @scala.inline
    def setOnKeyUp(value: (/* event */ KeyboardEvent[HTMLInputElement], /* unit */ TimeUnit) => Unit): Self = this.set("onKeyUp", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnKeyUp: Self = this.set("onKeyUp", js.undefined)
    @scala.inline
    def setPrecision(value: TimePrecision): Self = this.set("precision", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
    @scala.inline
    def setSelectAllOnFocus(value: Boolean): Self = this.set("selectAllOnFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectAllOnFocus: Self = this.set("selectAllOnFocus", js.undefined)
    @scala.inline
    def setShowArrowButtons(value: Boolean): Self = this.set("showArrowButtons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowArrowButtons: Self = this.set("showArrowButtons", js.undefined)
    @scala.inline
    def setUseAmPm(value: Boolean): Self = this.set("useAmPm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseAmPm: Self = this.set("useAmPm", js.undefined)
    @scala.inline
    def setValue(value: Date): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

