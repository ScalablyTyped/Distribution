package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RejectAssignmentRequest extends js.Object {
  /**
    *  The ID of the assignment. The assignment must correspond to a HIT created by the Requester. 
    */
  var AssignmentId: EntityId = js.native
  /**
    *  A message for the Worker, which the Worker can see in the Status section of the web site. 
    */
  var RequesterFeedback: String = js.native
}

object RejectAssignmentRequest {
  @scala.inline
  def apply(AssignmentId: EntityId, RequesterFeedback: String): RejectAssignmentRequest = {
    val __obj = js.Dynamic.literal(AssignmentId = AssignmentId.asInstanceOf[js.Any], RequesterFeedback = RequesterFeedback.asInstanceOf[js.Any])
    __obj.asInstanceOf[RejectAssignmentRequest]
  }
  @scala.inline
  implicit class RejectAssignmentRequestOps[Self <: RejectAssignmentRequest] (val x: Self) extends AnyVal {
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
    def setRequesterFeedback(value: String): Self = this.set("RequesterFeedback", value.asInstanceOf[js.Any])
  }
  
}

