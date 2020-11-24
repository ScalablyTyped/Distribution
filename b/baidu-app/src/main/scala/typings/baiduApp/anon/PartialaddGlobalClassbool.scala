package typings.baiduApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  addGlobalClass :boolean,   multipleSlots :boolean}> */
@js.native
trait PartialaddGlobalClassbool extends js.Object {
  
  var addGlobalClass: js.UndefOr[Boolean] = js.native
  
  var multipleSlots: js.UndefOr[Boolean] = js.native
}
object PartialaddGlobalClassbool {
  
  @scala.inline
  def apply(): PartialaddGlobalClassbool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialaddGlobalClassbool]
  }
  
  @scala.inline
  implicit class PartialaddGlobalClassboolOps[Self <: PartialaddGlobalClassbool] (val x: Self) extends AnyVal {
    
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
    def setAddGlobalClass(value: Boolean): Self = this.set("addGlobalClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddGlobalClass: Self = this.set("addGlobalClass", js.undefined)
    
    @scala.inline
    def setMultipleSlots(value: Boolean): Self = this.set("multipleSlots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultipleSlots: Self = this.set("multipleSlots", js.undefined)
  }
}
