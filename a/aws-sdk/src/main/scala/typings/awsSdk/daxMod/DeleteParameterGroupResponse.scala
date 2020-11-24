package typings.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteParameterGroupResponse extends js.Object {
  
  /**
    * A user-specified message for this action (i.e., a reason for deleting the parameter group).
    */
  var DeletionMessage: js.UndefOr[String] = js.native
}
object DeleteParameterGroupResponse {
  
  @scala.inline
  def apply(): DeleteParameterGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteParameterGroupResponse]
  }
  
  @scala.inline
  implicit class DeleteParameterGroupResponseOps[Self <: DeleteParameterGroupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDeletionMessage(value: String): Self = this.set("DeletionMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeletionMessage: Self = this.set("DeletionMessage", js.undefined)
  }
}
