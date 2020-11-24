package typings.ckeditor.CKEDITOR.plugins.widget

import typings.ckeditor.CKEDITOR.editable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait widgetselection extends js.Object {
  
  def addFillers(editable: editable): Boolean = js.native
  
  def removeFillers(editable: editable): Unit = js.native
}
object widgetselection {
  
  @scala.inline
  def apply(addFillers: editable => Boolean, removeFillers: editable => Unit): widgetselection = {
    val __obj = js.Dynamic.literal(addFillers = js.Any.fromFunction1(addFillers), removeFillers = js.Any.fromFunction1(removeFillers))
    __obj.asInstanceOf[widgetselection]
  }
  
  @scala.inline
  implicit class widgetselectionOps[Self <: widgetselection] (val x: Self) extends AnyVal {
    
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
    def setAddFillers(value: editable => Boolean): Self = this.set("addFillers", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveFillers(value: editable => Unit): Self = this.set("removeFillers", js.Any.fromFunction1(value))
  }
}
