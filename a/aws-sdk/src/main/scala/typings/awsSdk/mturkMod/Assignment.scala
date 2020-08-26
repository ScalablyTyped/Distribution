package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Assignment extends js.Object {
  /**
    *  The date and time the Worker accepted the assignment.
    */
  var AcceptTime: js.UndefOr[Timestamp] = js.native
  /**
    *  The Worker's answers submitted for the HIT contained in a QuestionFormAnswers document, if the Worker provides an answer. If the Worker does not provide any answers, Answer may contain a QuestionFormAnswers document, or Answer may be empty.
    */
  var Answer: js.UndefOr[String] = js.native
  /**
    *  If the Worker has submitted results and the Requester has approved the results, ApprovalTime is the date and time the Requester approved the results. This value is omitted from the assignment if the Requester has not yet approved the results.
    */
  var ApprovalTime: js.UndefOr[Timestamp] = js.native
  /**
    *  A unique identifier for the assignment.
    */
  var AssignmentId: js.UndefOr[EntityId] = js.native
  /**
    *  The status of the assignment.
    */
  var AssignmentStatus: js.UndefOr[typings.awsSdk.mturkMod.AssignmentStatus] = js.native
  /**
    *  If results have been submitted, AutoApprovalTime is the date and time the results of the assignment results are considered Approved automatically if they have not already been explicitly approved or rejected by the Requester. This value is derived from the auto-approval delay specified by the Requester in the HIT. This value is omitted from the assignment if the Worker has not yet submitted results.
    */
  var AutoApprovalTime: js.UndefOr[Timestamp] = js.native
  /**
    *  The date and time of the deadline for the assignment. This value is derived from the deadline specification for the HIT and the date and time the Worker accepted the HIT.
    */
  var Deadline: js.UndefOr[Timestamp] = js.native
  /**
    *  The ID of the HIT.
    */
  var HITId: js.UndefOr[EntityId] = js.native
  /**
    *  If the Worker has submitted results and the Requester has rejected the results, RejectionTime is the date and time the Requester rejected the results.
    */
  var RejectionTime: js.UndefOr[Timestamp] = js.native
  /**
    *  The feedback string included with the call to the ApproveAssignment operation or the RejectAssignment operation, if the Requester approved or rejected the assignment and specified feedback.
    */
  var RequesterFeedback: js.UndefOr[String] = js.native
  /**
    *  If the Worker has submitted results, SubmitTime is the date and time the assignment was submitted. This value is omitted from the assignment if the Worker has not yet submitted results.
    */
  var SubmitTime: js.UndefOr[Timestamp] = js.native
  /**
    *  The ID of the Worker who accepted the HIT.
    */
  var WorkerId: js.UndefOr[CustomerId] = js.native
}

object Assignment {
  @scala.inline
  def apply(): Assignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Assignment]
  }
  @scala.inline
  implicit class AssignmentOps[Self <: Assignment] (val x: Self) extends AnyVal {
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
    def setAcceptTime(value: Timestamp): Self = this.set("AcceptTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceptTime: Self = this.set("AcceptTime", js.undefined)
    @scala.inline
    def setAnswer(value: String): Self = this.set("Answer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnswer: Self = this.set("Answer", js.undefined)
    @scala.inline
    def setApprovalTime(value: Timestamp): Self = this.set("ApprovalTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApprovalTime: Self = this.set("ApprovalTime", js.undefined)
    @scala.inline
    def setAssignmentId(value: EntityId): Self = this.set("AssignmentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssignmentId: Self = this.set("AssignmentId", js.undefined)
    @scala.inline
    def setAssignmentStatus(value: AssignmentStatus): Self = this.set("AssignmentStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssignmentStatus: Self = this.set("AssignmentStatus", js.undefined)
    @scala.inline
    def setAutoApprovalTime(value: Timestamp): Self = this.set("AutoApprovalTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoApprovalTime: Self = this.set("AutoApprovalTime", js.undefined)
    @scala.inline
    def setDeadline(value: Timestamp): Self = this.set("Deadline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeadline: Self = this.set("Deadline", js.undefined)
    @scala.inline
    def setHITId(value: EntityId): Self = this.set("HITId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHITId: Self = this.set("HITId", js.undefined)
    @scala.inline
    def setRejectionTime(value: Timestamp): Self = this.set("RejectionTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRejectionTime: Self = this.set("RejectionTime", js.undefined)
    @scala.inline
    def setRequesterFeedback(value: String): Self = this.set("RequesterFeedback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequesterFeedback: Self = this.set("RequesterFeedback", js.undefined)
    @scala.inline
    def setSubmitTime(value: Timestamp): Self = this.set("SubmitTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubmitTime: Self = this.set("SubmitTime", js.undefined)
    @scala.inline
    def setWorkerId(value: CustomerId): Self = this.set("WorkerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkerId: Self = this.set("WorkerId", js.undefined)
  }
  
}

