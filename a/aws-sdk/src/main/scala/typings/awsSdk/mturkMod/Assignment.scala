package typings.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Assignment extends StObject {
  
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
  implicit class AssignmentMutableBuilder[Self <: Assignment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptTime(value: Timestamp): Self = StObject.set(x, "AcceptTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptTimeUndefined: Self = StObject.set(x, "AcceptTime", js.undefined)
    
    @scala.inline
    def setAnswer(value: String): Self = StObject.set(x, "Answer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnswerUndefined: Self = StObject.set(x, "Answer", js.undefined)
    
    @scala.inline
    def setApprovalTime(value: Timestamp): Self = StObject.set(x, "ApprovalTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApprovalTimeUndefined: Self = StObject.set(x, "ApprovalTime", js.undefined)
    
    @scala.inline
    def setAssignmentId(value: EntityId): Self = StObject.set(x, "AssignmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignmentIdUndefined: Self = StObject.set(x, "AssignmentId", js.undefined)
    
    @scala.inline
    def setAssignmentStatus(value: AssignmentStatus): Self = StObject.set(x, "AssignmentStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignmentStatusUndefined: Self = StObject.set(x, "AssignmentStatus", js.undefined)
    
    @scala.inline
    def setAutoApprovalTime(value: Timestamp): Self = StObject.set(x, "AutoApprovalTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoApprovalTimeUndefined: Self = StObject.set(x, "AutoApprovalTime", js.undefined)
    
    @scala.inline
    def setDeadline(value: Timestamp): Self = StObject.set(x, "Deadline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeadlineUndefined: Self = StObject.set(x, "Deadline", js.undefined)
    
    @scala.inline
    def setHITId(value: EntityId): Self = StObject.set(x, "HITId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHITIdUndefined: Self = StObject.set(x, "HITId", js.undefined)
    
    @scala.inline
    def setRejectionTime(value: Timestamp): Self = StObject.set(x, "RejectionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRejectionTimeUndefined: Self = StObject.set(x, "RejectionTime", js.undefined)
    
    @scala.inline
    def setRequesterFeedback(value: String): Self = StObject.set(x, "RequesterFeedback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequesterFeedbackUndefined: Self = StObject.set(x, "RequesterFeedback", js.undefined)
    
    @scala.inline
    def setSubmitTime(value: Timestamp): Self = StObject.set(x, "SubmitTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmitTimeUndefined: Self = StObject.set(x, "SubmitTime", js.undefined)
    
    @scala.inline
    def setWorkerId(value: CustomerId): Self = StObject.set(x, "WorkerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerIdUndefined: Self = StObject.set(x, "WorkerId", js.undefined)
  }
}
