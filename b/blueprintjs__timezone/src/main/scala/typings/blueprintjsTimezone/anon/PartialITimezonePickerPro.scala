package typings.blueprintjsTimezone.anon

import typings.blueprintjsCore.inputGroupMod.IInputGroupProps
import typings.blueprintjsCore.propsMod.HTMLInputProps
import typings.blueprintjsTimezone.timezoneDisplayFormatMod.TimezoneDisplayFormat
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@blueprintjs/timezone.@blueprintjs/timezone/lib/esm/components/timezone-picker/timezonePicker.ITimezonePickerProps> */
@js.native
trait PartialITimezonePickerPro extends js.Object {
  
  var buttonProps: js.UndefOr[PartialIButtonProps] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var date: js.UndefOr[Date] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var inputProps: js.UndefOr[IInputGroupProps with HTMLInputProps] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* timezone */ String, Unit]] = js.native
  
  var placeholder: js.UndefOr[String] = js.native
  
  var popoverProps: js.UndefOr[PartialIPopoverProps] = js.native
  
  var showLocalTimezone: js.UndefOr[Boolean] = js.native
  
  var value: js.UndefOr[String] = js.native
  
  var valueDisplayFormat: js.UndefOr[TimezoneDisplayFormat] = js.native
}
object PartialITimezonePickerPro {
  
  @scala.inline
  def apply(): PartialITimezonePickerPro = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialITimezonePickerPro]
  }
  
  @scala.inline
  implicit class PartialITimezonePickerProOps[Self <: PartialITimezonePickerPro] (val x: Self) extends AnyVal {
    
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
    def setButtonProps(value: PartialIButtonProps): Self = this.set("buttonProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonProps: Self = this.set("buttonProps", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setDate(value: Date): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setInputProps(value: IInputGroupProps with HTMLInputProps): Self = this.set("inputProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputProps: Self = this.set("inputProps", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* timezone */ String => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setPopoverProps(value: PartialIPopoverProps): Self = this.set("popoverProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopoverProps: Self = this.set("popoverProps", js.undefined)
    
    @scala.inline
    def setShowLocalTimezone(value: Boolean): Self = this.set("showLocalTimezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowLocalTimezone: Self = this.set("showLocalTimezone", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setValueDisplayFormat(value: TimezoneDisplayFormat): Self = this.set("valueDisplayFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueDisplayFormat: Self = this.set("valueDisplayFormat", js.undefined)
  }
}
