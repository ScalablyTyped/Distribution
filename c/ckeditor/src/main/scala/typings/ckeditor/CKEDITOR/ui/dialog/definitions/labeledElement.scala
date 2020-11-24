package typings.ckeditor.CKEDITOR.ui.dialog.definitions

import typings.ckeditor.ckeditorStrings.horizontal
import typings.ckeditor.ckeditorStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait labeledElement extends js.Object {
  
  var includeLabel: js.UndefOr[Boolean] = js.native
  
  var label: String = js.native
  
  var labelLayout: js.UndefOr[horizontal | vertical] = js.native
  
  var role: js.UndefOr[String] = js.native
  
  var widths: js.UndefOr[js.Tuple2[String, String]] = js.native
}
object labeledElement {
  
  @scala.inline
  def apply(label: String): labeledElement = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
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
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeLabel(value: Boolean): Self = this.set("includeLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeLabel: Self = this.set("includeLabel", js.undefined)
    
    @scala.inline
    def setLabelLayout(value: horizontal | vertical): Self = this.set("labelLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelLayout: Self = this.set("labelLayout", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    
    @scala.inline
    def setWidths(value: js.Tuple2[String, String]): Self = this.set("widths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidths: Self = this.set("widths", js.undefined)
  }
}
