package typings.ckeditor.CKEDITOR.dialog.definition

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait labeledElement extends uiElement {
  
  var controlStyle: js.UndefOr[String] = js.native
  
  var inputStyle: js.UndefOr[String] = js.native
  
  var labelLayout: js.UndefOr[String] = js.native
  
  var labelStyle: js.UndefOr[String] = js.native
  
  var widths: js.UndefOr[js.Array[Double]] = js.native
}
object labeledElement {
  
  @scala.inline
  def apply(): labeledElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[labeledElement]
  }
  
  @scala.inline
  implicit class labeledElementOps[Self <: labeledElement] (val x: Self) extends AnyVal {
    
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
    def setControlStyle(value: String): Self = this.set("controlStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControlStyle: Self = this.set("controlStyle", js.undefined)
    
    @scala.inline
    def setInputStyle(value: String): Self = this.set("inputStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputStyle: Self = this.set("inputStyle", js.undefined)
    
    @scala.inline
    def setLabelLayout(value: String): Self = this.set("labelLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelLayout: Self = this.set("labelLayout", js.undefined)
    
    @scala.inline
    def setLabelStyle(value: String): Self = this.set("labelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelStyle: Self = this.set("labelStyle", js.undefined)
    
    @scala.inline
    def setWidthsVarargs(value: Double*): Self = this.set("widths", js.Array(value :_*))
    
    @scala.inline
    def setWidths(value: js.Array[Double]): Self = this.set("widths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidths: Self = this.set("widths", js.undefined)
  }
}
