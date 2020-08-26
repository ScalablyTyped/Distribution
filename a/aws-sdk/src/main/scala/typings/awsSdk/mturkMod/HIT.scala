package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HIT extends js.Object {
  /**
    *  The length of time, in seconds, that a Worker has to complete the HIT after accepting it.
    */
  var AssignmentDurationInSeconds: js.UndefOr[Long] = js.native
  /**
    * The amount of time, in seconds, after the Worker submits an assignment for the HIT that the results are automatically approved by Amazon Mechanical Turk. This is the amount of time the Requester has to reject an assignment submitted by a Worker before the assignment is auto-approved and the Worker is paid. 
    */
  var AutoApprovalDelayInSeconds: js.UndefOr[Long] = js.native
  /**
    *  The date and time the HIT was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  /**
    *  A general description of the HIT.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The date and time the HIT expires.
    */
  var Expiration: js.UndefOr[Timestamp] = js.native
  /**
    *  The ID of the HIT Group of this HIT.
    */
  var HITGroupId: js.UndefOr[EntityId] = js.native
  /**
    *  A unique identifier for the HIT.
    */
  var HITId: js.UndefOr[EntityId] = js.native
  /**
    *  The ID of the HIT Layout of this HIT.
    */
  var HITLayoutId: js.UndefOr[EntityId] = js.native
  /**
    *  Indicates the review status of the HIT. Valid Values are NotReviewed | MarkedForReview | ReviewedAppropriate | ReviewedInappropriate.
    */
  var HITReviewStatus: js.UndefOr[typings.awsSdk.mturkMod.HITReviewStatus] = js.native
  /**
    * The status of the HIT and its assignments. Valid Values are Assignable | Unassignable | Reviewable | Reviewing | Disposed. 
    */
  var HITStatus: js.UndefOr[typings.awsSdk.mturkMod.HITStatus] = js.native
  /**
    * The ID of the HIT type of this HIT
    */
  var HITTypeId: js.UndefOr[EntityId] = js.native
  /**
    *  One or more words or phrases that describe the HIT, separated by commas. Search terms similar to the keywords of a HIT are more likely to have the HIT in the search results.
    */
  var Keywords: js.UndefOr[String] = js.native
  /**
    * The number of times the HIT can be accepted and completed before the HIT becomes unavailable. 
    */
  var MaxAssignments: js.UndefOr[Integer] = js.native
  /**
    *  The number of assignments for this HIT that are available for Workers to accept.
    */
  var NumberOfAssignmentsAvailable: js.UndefOr[Integer] = js.native
  /**
    *  The number of assignments for this HIT that have been approved or rejected.
    */
  var NumberOfAssignmentsCompleted: js.UndefOr[Integer] = js.native
  /**
    *  The number of assignments for this HIT that are being previewed or have been accepted by Workers, but have not yet been submitted, returned, or abandoned.
    */
  var NumberOfAssignmentsPending: js.UndefOr[Integer] = js.native
  /**
    *  Conditions that a Worker's Qualifications must meet in order to accept the HIT. A HIT can have between zero and ten Qualification requirements. All requirements must be met in order for a Worker to accept the HIT. Additionally, other actions can be restricted using the ActionsGuarded field on each QualificationRequirement structure. 
    */
  var QualificationRequirements: js.UndefOr[QualificationRequirementList] = js.native
  /**
    *  The data the Worker completing the HIT uses produce the results. This is either either a QuestionForm, HTMLQuestion or an ExternalQuestion data structure.
    */
  var Question: js.UndefOr[String] = js.native
  /**
    *  An arbitrary data field the Requester who created the HIT can use. This field is visible only to the creator of the HIT.
    */
  var RequesterAnnotation: js.UndefOr[String] = js.native
  var Reward: js.UndefOr[CurrencyAmount] = js.native
  /**
    *  The title of the HIT.
    */
  var Title: js.UndefOr[String] = js.native
}

object HIT {
  @scala.inline
  def apply(): HIT = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HIT]
  }
  @scala.inline
  implicit class HITOps[Self <: HIT] (val x: Self) extends AnyVal {
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
    def setAssignmentDurationInSeconds(value: Long): Self = this.set("AssignmentDurationInSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssignmentDurationInSeconds: Self = this.set("AssignmentDurationInSeconds", js.undefined)
    @scala.inline
    def setAutoApprovalDelayInSeconds(value: Long): Self = this.set("AutoApprovalDelayInSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoApprovalDelayInSeconds: Self = this.set("AutoApprovalDelayInSeconds", js.undefined)
    @scala.inline
    def setCreationTime(value: Timestamp): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setExpiration(value: Timestamp): Self = this.set("Expiration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpiration: Self = this.set("Expiration", js.undefined)
    @scala.inline
    def setHITGroupId(value: EntityId): Self = this.set("HITGroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHITGroupId: Self = this.set("HITGroupId", js.undefined)
    @scala.inline
    def setHITId(value: EntityId): Self = this.set("HITId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHITId: Self = this.set("HITId", js.undefined)
    @scala.inline
    def setHITLayoutId(value: EntityId): Self = this.set("HITLayoutId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHITLayoutId: Self = this.set("HITLayoutId", js.undefined)
    @scala.inline
    def setHITReviewStatus(value: HITReviewStatus): Self = this.set("HITReviewStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHITReviewStatus: Self = this.set("HITReviewStatus", js.undefined)
    @scala.inline
    def setHITStatus(value: HITStatus): Self = this.set("HITStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHITStatus: Self = this.set("HITStatus", js.undefined)
    @scala.inline
    def setHITTypeId(value: EntityId): Self = this.set("HITTypeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHITTypeId: Self = this.set("HITTypeId", js.undefined)
    @scala.inline
    def setKeywords(value: String): Self = this.set("Keywords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeywords: Self = this.set("Keywords", js.undefined)
    @scala.inline
    def setMaxAssignments(value: Integer): Self = this.set("MaxAssignments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAssignments: Self = this.set("MaxAssignments", js.undefined)
    @scala.inline
    def setNumberOfAssignmentsAvailable(value: Integer): Self = this.set("NumberOfAssignmentsAvailable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfAssignmentsAvailable: Self = this.set("NumberOfAssignmentsAvailable", js.undefined)
    @scala.inline
    def setNumberOfAssignmentsCompleted(value: Integer): Self = this.set("NumberOfAssignmentsCompleted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfAssignmentsCompleted: Self = this.set("NumberOfAssignmentsCompleted", js.undefined)
    @scala.inline
    def setNumberOfAssignmentsPending(value: Integer): Self = this.set("NumberOfAssignmentsPending", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfAssignmentsPending: Self = this.set("NumberOfAssignmentsPending", js.undefined)
    @scala.inline
    def setQualificationRequirementsVarargs(value: QualificationRequirement*): Self = this.set("QualificationRequirements", js.Array(value :_*))
    @scala.inline
    def setQualificationRequirements(value: QualificationRequirementList): Self = this.set("QualificationRequirements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQualificationRequirements: Self = this.set("QualificationRequirements", js.undefined)
    @scala.inline
    def setQuestion(value: String): Self = this.set("Question", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuestion: Self = this.set("Question", js.undefined)
    @scala.inline
    def setRequesterAnnotation(value: String): Self = this.set("RequesterAnnotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequesterAnnotation: Self = this.set("RequesterAnnotation", js.undefined)
    @scala.inline
    def setReward(value: CurrencyAmount): Self = this.set("Reward", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReward: Self = this.set("Reward", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("Title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("Title", js.undefined)
  }
  
}

