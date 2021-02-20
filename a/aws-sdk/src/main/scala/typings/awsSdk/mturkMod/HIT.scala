package typings.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HIT extends StObject {
  
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
  implicit class HITMutableBuilder[Self <: HIT] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssignmentDurationInSeconds(value: Long): Self = StObject.set(x, "AssignmentDurationInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignmentDurationInSecondsUndefined: Self = StObject.set(x, "AssignmentDurationInSeconds", js.undefined)
    
    @scala.inline
    def setAutoApprovalDelayInSeconds(value: Long): Self = StObject.set(x, "AutoApprovalDelayInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoApprovalDelayInSecondsUndefined: Self = StObject.set(x, "AutoApprovalDelayInSeconds", js.undefined)
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setExpiration(value: Timestamp): Self = StObject.set(x, "Expiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationUndefined: Self = StObject.set(x, "Expiration", js.undefined)
    
    @scala.inline
    def setHITGroupId(value: EntityId): Self = StObject.set(x, "HITGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHITGroupIdUndefined: Self = StObject.set(x, "HITGroupId", js.undefined)
    
    @scala.inline
    def setHITId(value: EntityId): Self = StObject.set(x, "HITId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHITIdUndefined: Self = StObject.set(x, "HITId", js.undefined)
    
    @scala.inline
    def setHITLayoutId(value: EntityId): Self = StObject.set(x, "HITLayoutId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHITLayoutIdUndefined: Self = StObject.set(x, "HITLayoutId", js.undefined)
    
    @scala.inline
    def setHITReviewStatus(value: HITReviewStatus): Self = StObject.set(x, "HITReviewStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHITReviewStatusUndefined: Self = StObject.set(x, "HITReviewStatus", js.undefined)
    
    @scala.inline
    def setHITStatus(value: HITStatus): Self = StObject.set(x, "HITStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHITStatusUndefined: Self = StObject.set(x, "HITStatus", js.undefined)
    
    @scala.inline
    def setHITTypeId(value: EntityId): Self = StObject.set(x, "HITTypeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHITTypeIdUndefined: Self = StObject.set(x, "HITTypeId", js.undefined)
    
    @scala.inline
    def setKeywords(value: String): Self = StObject.set(x, "Keywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeywordsUndefined: Self = StObject.set(x, "Keywords", js.undefined)
    
    @scala.inline
    def setMaxAssignments(value: Integer): Self = StObject.set(x, "MaxAssignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAssignmentsUndefined: Self = StObject.set(x, "MaxAssignments", js.undefined)
    
    @scala.inline
    def setNumberOfAssignmentsAvailable(value: Integer): Self = StObject.set(x, "NumberOfAssignmentsAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfAssignmentsAvailableUndefined: Self = StObject.set(x, "NumberOfAssignmentsAvailable", js.undefined)
    
    @scala.inline
    def setNumberOfAssignmentsCompleted(value: Integer): Self = StObject.set(x, "NumberOfAssignmentsCompleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfAssignmentsCompletedUndefined: Self = StObject.set(x, "NumberOfAssignmentsCompleted", js.undefined)
    
    @scala.inline
    def setNumberOfAssignmentsPending(value: Integer): Self = StObject.set(x, "NumberOfAssignmentsPending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfAssignmentsPendingUndefined: Self = StObject.set(x, "NumberOfAssignmentsPending", js.undefined)
    
    @scala.inline
    def setQualificationRequirements(value: QualificationRequirementList): Self = StObject.set(x, "QualificationRequirements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualificationRequirementsUndefined: Self = StObject.set(x, "QualificationRequirements", js.undefined)
    
    @scala.inline
    def setQualificationRequirementsVarargs(value: QualificationRequirement*): Self = StObject.set(x, "QualificationRequirements", js.Array(value :_*))
    
    @scala.inline
    def setQuestion(value: String): Self = StObject.set(x, "Question", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuestionUndefined: Self = StObject.set(x, "Question", js.undefined)
    
    @scala.inline
    def setRequesterAnnotation(value: String): Self = StObject.set(x, "RequesterAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequesterAnnotationUndefined: Self = StObject.set(x, "RequesterAnnotation", js.undefined)
    
    @scala.inline
    def setReward(value: CurrencyAmount): Self = StObject.set(x, "Reward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRewardUndefined: Self = StObject.set(x, "Reward", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "Title", js.undefined)
  }
}
