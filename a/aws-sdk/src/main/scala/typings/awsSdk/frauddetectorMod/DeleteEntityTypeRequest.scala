package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteEntityTypeRequest extends js.Object {
  
  /**
    * The name of the entity type to delete.
    */
  var name: identifier = js.native
}
object DeleteEntityTypeRequest {
  
  @scala.inline
  def apply(name: identifier): DeleteEntityTypeRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEntityTypeRequest]
  }
  
  @scala.inline
  implicit class DeleteEntityTypeRequestOps[Self <: DeleteEntityTypeRequest] (val x: Self) extends AnyVal {
    
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
    def setName(value: identifier): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
