package typings.blueprintjsTimezone

import typings.blueprintjsCore.inputGroupMod.IInputGroupProps
import typings.blueprintjsCore.propsMod.HTMLInputProps
import typings.blueprintjsTimezone.timezoneDisplayFormatMod.TimezoneDisplayFormat
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@blueprintjs/timezone.@blueprintjs/timezone/lib/esm/components/timezone-picker/timezonePicker.ITimezonePickerProps> */
trait PartialITimezonePickerPro extends js.Object {
  var buttonProps: js.UndefOr[PartialIButtonProps] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var date: js.UndefOr[Date] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var inputProps: js.UndefOr[IInputGroupProps with HTMLInputProps] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* timezone */ String, Unit]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var popoverProps: js.UndefOr[PartialIPopoverProps] = js.undefined
  var showLocalTimezone: js.UndefOr[Boolean] = js.undefined
  var value: js.UndefOr[String] = js.undefined
  var valueDisplayFormat: js.UndefOr[TimezoneDisplayFormat] = js.undefined
}

object PartialITimezonePickerPro {
  @scala.inline
  def apply(
    buttonProps: PartialIButtonProps = null,
    className: String = null,
    date: Date = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    inputProps: IInputGroupProps with HTMLInputProps = null,
    onChange: /* timezone */ String => Unit = null,
    placeholder: String = null,
    popoverProps: PartialIPopoverProps = null,
    showLocalTimezone: js.UndefOr[Boolean] = js.undefined,
    value: String = null,
    valueDisplayFormat: TimezoneDisplayFormat = null
  ): PartialITimezonePickerPro = {
    val __obj = js.Dynamic.literal()
    if (buttonProps != null) __obj.updateDynamic("buttonProps")(buttonProps.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (popoverProps != null) __obj.updateDynamic("popoverProps")(popoverProps.asInstanceOf[js.Any])
    if (!js.isUndefined(showLocalTimezone)) __obj.updateDynamic("showLocalTimezone")(showLocalTimezone.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueDisplayFormat != null) __obj.updateDynamic("valueDisplayFormat")(valueDisplayFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialITimezonePickerPro]
  }
}

