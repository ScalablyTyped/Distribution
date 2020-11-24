package typings.blueprintjsTimezone.timezonePickerMod

import typings.blueprintjsCore.inputGroupMod.IInputGroupProps
import typings.blueprintjsCore.propsMod.HTMLInputProps
import typings.blueprintjsCore.propsMod.IProps
import typings.blueprintjsTimezone.anon.PartialIButtonProps
import typings.blueprintjsTimezone.anon.PartialIPopoverProps
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITimezonePickerProps extends IProps {
  
  /**
    * Props to spread to the target `Button`.
    * This prop will be ignored if `children` is provided.
    */
  var buttonProps: js.UndefOr[PartialIButtonProps] = js.native
  
  /**
    * The date to use when formatting timezone offsets.
    * An offset date is necessary to account for DST, but typically the default value of `now` will be sufficient.
    * @default now
    */
  var date: js.UndefOr[Date] = js.native
  
  /**
    * Whether this component is non-interactive.
    * This prop will be ignored if `children` is provided.
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Props to spread to the filter `InputGroup`.
    * All props are supported except `ref` (use `inputRef` instead).
    * If you want to control the filter input, you can pass `value` and `onChange` here
    * to override `Select`'s own behavior.
    */
  var inputProps: js.UndefOr[IInputGroupProps with HTMLInputProps] = js.native
  
  /**
    * Callback invoked when the user selects a timezone.
    */
  def onChange(timezone: String): Unit = js.native
  
  /**
    * Text to show when no timezone has been selected (`value === undefined`).
    * This prop will be ignored if `children` is provided.
    * @default "Select timezone..."
    */
  var placeholder: js.UndefOr[String] = js.native
  
  /** Props to spread to `Popover`. Note that `content` cannot be changed. */
  var popoverProps: js.UndefOr[PartialIPopoverProps] = js.native
  
  /**
    * Whether to show the local timezone at the top of the list of initial timezone suggestions.
    * @default true
    */
  var showLocalTimezone: js.UndefOr[Boolean] = js.native
  
  /**
    * The currently selected timezone UTC identifier, e.g. "Pacific/Honolulu".
    * See https://www.iana.org/time-zones for more information.
    */
  var value: js.UndefOr[String] = js.native
  
  /**
    * Format to use when displaying the selected (or default) timezone within the target element.
    * This prop will be ignored if `children` is provided.
    * @default TimezoneDisplayFormat.OFFSET
    */
  var valueDisplayFormat: js.UndefOr[typings.blueprintjsTimezone.timezoneDisplayFormatMod.TimezoneDisplayFormat] = js.native
}
object ITimezonePickerProps {
  
  @scala.inline
  def apply(onChange: String => Unit): ITimezonePickerProps = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[ITimezonePickerProps]
  }
  
  @scala.inline
  implicit class ITimezonePickerPropsOps[Self <: ITimezonePickerProps] (val x: Self) extends AnyVal {
    
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
    def setOnChange(value: String => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setButtonProps(value: PartialIButtonProps): Self = this.set("buttonProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonProps: Self = this.set("buttonProps", js.undefined)
    
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
    def setValueDisplayFormat(value: typings.blueprintjsTimezone.timezoneDisplayFormatMod.TimezoneDisplayFormat): Self = this.set("valueDisplayFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueDisplayFormat: Self = this.set("valueDisplayFormat", js.undefined)
  }
}
