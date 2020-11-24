package typings.bootstrap.anon

import typings.bootstrap.bootstrapStrings.static
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<bootstrap.bootstrap/js/dist/modal.Modal.Options> */
@js.native
trait PartialOptionsBackdrop extends js.Object {
  
  var backdrop: js.UndefOr[static | Boolean] = js.native
  
  var focus: js.UndefOr[Boolean] = js.native
  
  var keyboard: js.UndefOr[Boolean] = js.native
  
  var show: js.UndefOr[Boolean] = js.native
}
object PartialOptionsBackdrop {
  
  @scala.inline
  def apply(): PartialOptionsBackdrop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptionsBackdrop]
  }
  
  @scala.inline
  implicit class PartialOptionsBackdropOps[Self <: PartialOptionsBackdrop] (val x: Self) extends AnyVal {
    
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
    def setBackdrop(value: static | Boolean): Self = this.set("backdrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackdrop: Self = this.set("backdrop", js.undefined)
    
    @scala.inline
    def setFocus(value: Boolean): Self = this.set("focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocus: Self = this.set("focus", js.undefined)
    
    @scala.inline
    def setKeyboard(value: Boolean): Self = this.set("keyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyboard: Self = this.set("keyboard", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
  }
}
