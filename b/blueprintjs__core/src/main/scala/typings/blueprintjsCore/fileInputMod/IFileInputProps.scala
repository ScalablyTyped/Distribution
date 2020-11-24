package typings.blueprintjsCore.fileInputMod

import typings.react.mod.FormEvent
import typings.react.mod.FormEventHandler
import typings.react.mod.HTMLProps
import typings.react.mod.LabelHTMLAttributes
import typings.react.mod.ReactNode
import typings.std.HTMLInputElement
import typings.std.HTMLLabelElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.blueprintjsCore.propsMod.IProps because var conflicts: className. Inlined  */ @js.native
trait IFileInputProps extends LabelHTMLAttributes[HTMLLabelElement] {
  
  /**
    * The button text.
    * @default "Browse"
    */
  var buttonText: js.UndefOr[String] = js.native
  
  /**
    * Whether the file input is non-interactive.
    * Setting this to `true` will automatically disable the child input too.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the file input should take up the full width of its container.
    */
  var fill: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the user has made a selection in the input. This will affect the component's
    * text styling. Make sure to set a non-empty value for the text prop as well.
    * @default false
    */
  var hasSelection: js.UndefOr[Boolean] = js.native
  
  /**
    * The props to pass to the child input.
    * `disabled` will be ignored in favor of the top-level prop.
    * `type` will be ignored, because the input _must_ be `type="file"`.
    * Pass `onChange` here to be notified when the user selects a file.
    */
  var inputProps: js.UndefOr[HTMLProps[HTMLInputElement]] = js.native
  
  /**
    * Whether the file input should appear with large styling.
    */
  var large: js.UndefOr[Boolean] = js.native
  
  /**
    * Callback invoked on `<input>` `change` events.
    *
    * This callback is offered as a convenience; it is equivalent to passing
    * `onChange` to `inputProps`.
    *
    * __Note:__ The top-level `onChange` prop is passed to the wrapping
    * `<label>` rather than the `<input>`, which may not be what you expect.
    */
  var onInputChange: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.native
  
  /**
    * The text to display.
    * @default "Choose file..."
    */
  var text: js.UndefOr[ReactNode] = js.native
}
object IFileInputProps {
  
  @scala.inline
  def apply(): IFileInputProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFileInputProps]
  }
  
  @scala.inline
  implicit class IFileInputPropsOps[Self <: IFileInputProps] (val x: Self) extends AnyVal {
    
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
    def setButtonText(value: String): Self = this.set("buttonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonText: Self = this.set("buttonText", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setFill(value: Boolean): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def setHasSelection(value: Boolean): Self = this.set("hasSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasSelection: Self = this.set("hasSelection", js.undefined)
    
    @scala.inline
    def setInputProps(value: HTMLProps[HTMLInputElement]): Self = this.set("inputProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputProps: Self = this.set("inputProps", js.undefined)
    
    @scala.inline
    def setLarge(value: Boolean): Self = this.set("large", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLarge: Self = this.set("large", js.undefined)
    
    @scala.inline
    def setOnInputChange(value: FormEvent[HTMLInputElement] => Unit): Self = this.set("onInputChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnInputChange: Self = this.set("onInputChange", js.undefined)
    
    @scala.inline
    def setText(value: ReactNode): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
