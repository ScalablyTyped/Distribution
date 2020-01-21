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
  def apply(
    AssignmentDurationInSeconds: Int | Double = null,
    AutoApprovalDelayInSeconds: Int | Double = null,
    CreationTime: Timestamp = null,
    Description: String = null,
    Expiration: Timestamp = null,
    HITGroupId: EntityId = null,
    HITId: EntityId = null,
    HITLayoutId: EntityId = null,
    HITReviewStatus: HITReviewStatus = null,
    HITStatus: HITStatus = null,
    HITTypeId: EntityId = null,
    Keywords: String = null,
    MaxAssignments: Int | Double = null,
    NumberOfAssignmentsAvailable: Int | Double = null,
    NumberOfAssignmentsCompleted: Int | Double = null,
    NumberOfAssignmentsPending: Int | Double = null,
    QualificationRequirements: QualificationRequirementList = null,
    Question: String = null,
    RequesterAnnotation: String = null,
    Reward: CurrencyAmount = null,
    Title: String = null
  ): HIT = {
    val __obj = js.Dynamic.literal()
    if (AssignmentDurationInSeconds != null) __obj.updateDynamic("AssignmentDurationInSeconds")(AssignmentDurationInSeconds.asInstanceOf[js.Any])
    if (AutoApprovalDelayInSeconds != null) __obj.updateDynamic("AutoApprovalDelayInSeconds")(AutoApprovalDelayInSeconds.asInstanceOf[js.Any])
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Expiration != null) __obj.updateDynamic("Expiration")(Expiration.asInstanceOf[js.Any])
    if (HITGroupId != null) __obj.updateDynamic("HITGroupId")(HITGroupId.asInstanceOf[js.Any])
    if (HITId != null) __obj.updateDynamic("HITId")(HITId.asInstanceOf[js.Any])
    if (HITLayoutId != null) __obj.updateDynamic("HITLayoutId")(HITLayoutId.asInstanceOf[js.Any])
    if (HITReviewStatus != null) __obj.updateDynamic("HITReviewStatus")(HITReviewStatus.asInstanceOf[js.Any])
    if (HITStatus != null) __obj.updateDynamic("HITStatus")(HITStatus.asInstanceOf[js.Any])
    if (HITTypeId != null) __obj.updateDynamic("HITTypeId")(HITTypeId.asInstanceOf[js.Any])
    if (Keywords != null) __obj.updateDynamic("Keywords")(Keywords.asInstanceOf[js.Any])
    if (MaxAssignments != null) __obj.updateDynamic("MaxAssignments")(MaxAssignments.asInstanceOf[js.Any])
    if (NumberOfAssignmentsAvailable != null) __obj.updateDynamic("NumberOfAssignmentsAvailable")(NumberOfAssignmentsAvailable.asInstanceOf[js.Any])
    if (NumberOfAssignmentsCompleted != null) __obj.updateDynamic("NumberOfAssignmentsCompleted")(NumberOfAssignmentsCompleted.asInstanceOf[js.Any])
    if (NumberOfAssignmentsPending != null) __obj.updateDynamic("NumberOfAssignmentsPending")(NumberOfAssignmentsPending.asInstanceOf[js.Any])
    if (QualificationRequirements != null) __obj.updateDynamic("QualificationRequirements")(QualificationRequirements.asInstanceOf[js.Any])
    if (Question != null) __obj.updateDynamic("Question")(Question.asInstanceOf[js.Any])
    if (RequesterAnnotation != null) __obj.updateDynamic("RequesterAnnotation")(RequesterAnnotation.asInstanceOf[js.Any])
    if (Reward != null) __obj.updateDynamic("Reward")(Reward.asInstanceOf[js.Any])
    if (Title != null) __obj.updateDynamic("Title")(Title.asInstanceOf[js.Any])
    __obj.asInstanceOf[HIT]
  }
}

