package typings.blueprintjsCore.formGroupMod

import typings.blueprintjsCore.propsMod.IIntentProps
import typings.blueprintjsCore.propsMod.IProps
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFormGroupProps
  extends IIntentProps
     with IProps {
  
  /**
    * A space-delimited list of class names to pass along to the
    * `Classes.FORM_CONTENT` element that contains `children`.
    */
  var contentClassName: js.UndefOr[String] = js.native
  
  /**
    * Whether form group should appear as non-interactive.
    * Remember that `input` elements must be disabled separately.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional helper text. The given content will be wrapped in
    * `Classes.FORM_HELPER_TEXT` and displayed beneath `children`.
    * Helper text color is determined by the `intent`.
    */
  var helperText: js.UndefOr[ReactNode] = js.native
  
  /** Whether to render the label and children on a single line. */
  var `inline`: js.UndefOr[Boolean] = js.native
  
  /** Label of this form group. */
  var label: js.UndefOr[ReactNode] = js.native
  
  /**
    * `id` attribute of the labelable form element that this `FormGroup` controls,
    * used as `<label for>` attribute.
    */
  var labelFor: js.UndefOr[String] = js.native
  
  /**
    * Optional secondary text that appears after the label.
    */
  var labelInfo: js.UndefOr[ReactNode] = js.native
  
  /** CSS properties to apply to the root element. */
  var style: js.UndefOr[CSSProperties] = js.native
}
object IFormGroupProps {
  
  @scala.inline
  def apply(): IFormGroupProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFormGroupProps]
  }
  
  @scala.inline
  implicit class IFormGroupPropsOps[Self <: IFormGroupProps] (val x: Self) extends AnyVal {
    
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
    def setContentClassName(value: String): Self = this.set("contentClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentClassName: Self = this.set("contentClassName", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setHelperText(value: ReactNode): Self = this.set("helperText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHelperText: Self = this.set("helperText", js.undefined)
    
    @scala.inline
    def setInline(value: Boolean): Self = this.set("inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
    
    @scala.inline
    def setLabel(value: ReactNode): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLabelFor(value: String): Self = this.set("labelFor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelFor: Self = this.set("labelFor", js.undefined)
    
    @scala.inline
    def setLabelInfo(value: ReactNode): Self = this.set("labelInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelInfo: Self = this.set("labelInfo", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
