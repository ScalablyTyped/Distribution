package typings.blueprintjsCore.editableTextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEditableTextState extends js.Object {
  
  /** Pixel height of the input, measured from span size */
  var inputHeight: js.UndefOr[Double] = js.native
  
  /** Pixel width of the input, measured from span size */
  var inputWidth: js.UndefOr[Double] = js.native
  
  /** Whether the value is currently being edited */
  var isEditing: js.UndefOr[Boolean] = js.native
  
  /** The last confirmed value */
  var lastValue: js.UndefOr[String] = js.native
  
  /** The controlled input value, may be different from prop during editing */
  var value: js.UndefOr[String] = js.native
}
object IEditableTextState {
  
  @scala.inline
  def apply(): IEditableTextState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEditableTextState]
  }
  
  @scala.inline
  implicit class IEditableTextStateOps[Self <: IEditableTextState] (val x: Self) extends AnyVal {
    
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
    def setInputHeight(value: Double): Self = this.set("inputHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputHeight: Self = this.set("inputHeight", js.undefined)
    
    @scala.inline
    def setInputWidth(value: Double): Self = this.set("inputWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputWidth: Self = this.set("inputWidth", js.undefined)
    
    @scala.inline
    def setIsEditing(value: Boolean): Self = this.set("isEditing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsEditing: Self = this.set("isEditing", js.undefined)
    
    @scala.inline
    def setLastValue(value: String): Self = this.set("lastValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastValue: Self = this.set("lastValue", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
