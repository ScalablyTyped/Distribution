package typings.ckeditor.anon

import typings.ckeditor.CKEDITOR.dom.element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FocusElement extends js.Object {
  
  var focusElement: js.UndefOr[element | Boolean] = js.native
  
  var show: js.UndefOr[Boolean] = js.native
}
object FocusElement {
  
  @scala.inline
  def apply(): FocusElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FocusElement]
  }
  
  @scala.inline
  implicit class FocusElementOps[Self <: FocusElement] (val x: Self) extends AnyVal {
    
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
    def setFocusElement(value: element | Boolean): Self = this.set("focusElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusElement: Self = this.set("focusElement", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
  }
}
