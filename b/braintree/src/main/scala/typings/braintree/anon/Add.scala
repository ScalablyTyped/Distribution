package typings.braintree.anon

import typings.braintree.mod.AddOnAddRequest
import typings.braintree.mod.AddOnUpdateRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Add extends js.Object {
  
  var add: js.UndefOr[js.Array[AddOnAddRequest]] = js.native
  
  var remove: js.UndefOr[js.Array[String]] = js.native
  
  var update: js.UndefOr[js.Array[AddOnUpdateRequest]] = js.native
}
object Add {
  
  @scala.inline
  def apply(): Add = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Add]
  }
  
  @scala.inline
  implicit class AddOps[Self <: Add] (val x: Self) extends AnyVal {
    
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
    def setAddVarargs(value: AddOnAddRequest*): Self = this.set("add", js.Array(value :_*))
    
    @scala.inline
    def setAdd(value: js.Array[AddOnAddRequest]): Self = this.set("add", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdd: Self = this.set("add", js.undefined)
    
    @scala.inline
    def setRemoveVarargs(value: String*): Self = this.set("remove", js.Array(value :_*))
    
    @scala.inline
    def setRemove(value: js.Array[String]): Self = this.set("remove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    
    @scala.inline
    def setUpdateVarargs(value: AddOnUpdateRequest*): Self = this.set("update", js.Array(value :_*))
    
    @scala.inline
    def setUpdate(value: js.Array[AddOnUpdateRequest]): Self = this.set("update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
  }
}
