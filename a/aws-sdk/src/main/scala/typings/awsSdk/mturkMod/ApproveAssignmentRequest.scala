package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApproveAssignmentRequest extends js.Object {
  
  /**
    *  The ID of the assignment. The assignment must correspond to a HIT created by the Requester. 
    */
  var AssignmentId: EntityId = js.native
  
  /**
    *  A flag indicating that an assignment should be approved even if it was previously rejected. Defaults to False. 
    */
  var OverrideRejection: js.UndefOr[Boolean] = js.native
  
  /**
    *  A message for the Worker, which the Worker can see in the Status section of the web site. 
    */
  var RequesterFeedback: js.UndefOr[String] = js.native
}
object ApproveAssignmentRequest {
  
  @scala.inline
  def apply(AssignmentId: EntityId): ApproveAssignmentRequest = {
    val __obj = js.Dynamic.literal(AssignmentId = AssignmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApproveAssignmentRequest]
  }
  
  @scala.inline
  implicit class ApproveAssignmentRequestOps[Self <: ApproveAssignmentRequest] (val x: Self) extends AnyVal {
    
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
    def setAssignmentId(value: EntityId): Self = this.set("AssignmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverrideRejection(value: Boolean): Self = this.set("OverrideRejection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrideRejection: Self = this.set("OverrideRejection", js.undefined)
    
    @scala.inline
    def setRequesterFeedback(value: String): Self = this.set("RequesterFeedback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequesterFeedback: Self = this.set("RequesterFeedback", js.undefined)
  }
}
