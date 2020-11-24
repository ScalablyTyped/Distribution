package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetServiceLinkedRoleDeletionStatusResponse extends js.Object {
  
  /**
    * An object that contains details about the reason the deletion failed.
    */
  var Reason: js.UndefOr[DeletionTaskFailureReasonType] = js.native
  
  /**
    * The status of the deletion.
    */
  var Status: DeletionTaskStatusType = js.native
}
object GetServiceLinkedRoleDeletionStatusResponse {
  
  @scala.inline
  def apply(Status: DeletionTaskStatusType): GetServiceLinkedRoleDeletionStatusResponse = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServiceLinkedRoleDeletionStatusResponse]
  }
  
  @scala.inline
  implicit class GetServiceLinkedRoleDeletionStatusResponseOps[Self <: GetServiceLinkedRoleDeletionStatusResponse] (val x: Self) extends AnyVal {
    
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
    def setStatus(value: DeletionTaskStatusType): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: DeletionTaskFailureReasonType): Self = this.set("Reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReason: Self = this.set("Reason", js.undefined)
  }
}
