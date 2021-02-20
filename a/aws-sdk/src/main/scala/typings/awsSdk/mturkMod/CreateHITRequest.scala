package typings.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateHITRequest extends StObject {
  
  /**
    *  The amount of time, in seconds, that a Worker has to complete the HIT after accepting it. If a Worker does not complete the assignment within the specified duration, the assignment is considered abandoned. If the HIT is still active (that is, its lifetime has not elapsed), the assignment becomes available for other users to find and accept. 
    */
  var AssignmentDurationInSeconds: Long = js.native
  
  /**
    *  The Assignment-level Review Policy applies to the assignments under the HIT. You can specify for Mechanical Turk to take various actions based on the policy. 
    */
  var AssignmentReviewPolicy: js.UndefOr[ReviewPolicy] = js.native
  
  /**
    *  The number of seconds after an assignment for the HIT has been submitted, after which the assignment is considered Approved automatically unless the Requester explicitly rejects it. 
    */
  var AutoApprovalDelayInSeconds: js.UndefOr[Long] = js.native
  
  /**
    *  A general description of the HIT. A description includes detailed information about the kind of task the HIT contains. On the Amazon Mechanical Turk web site, the HIT description appears in the expanded view of search results, and in the HIT and assignment screens. A good description gives the user enough information to evaluate the HIT before accepting it. 
    */
  var Description: String = js.native
  
  /**
    *  The HITLayoutId allows you to use a pre-existing HIT design with placeholder values and create an additional HIT by providing those values as HITLayoutParameters.   Constraints: Either a Question parameter or a HITLayoutId parameter must be provided. 
    */
  var HITLayoutId: js.UndefOr[EntityId] = js.native
  
  /**
    *  If the HITLayoutId is provided, any placeholder values must be filled in with values using the HITLayoutParameter structure. For more information, see HITLayout. 
    */
  var HITLayoutParameters: js.UndefOr[HITLayoutParameterList] = js.native
  
  /**
    *  The HIT-level Review Policy applies to the HIT. You can specify for Mechanical Turk to take various actions based on the policy. 
    */
  var HITReviewPolicy: js.UndefOr[ReviewPolicy] = js.native
  
  /**
    *  One or more words or phrases that describe the HIT, separated by commas. These words are used in searches to find HITs. 
    */
  var Keywords: js.UndefOr[String] = js.native
  
  /**
    *  An amount of time, in seconds, after which the HIT is no longer available for users to accept. After the lifetime of the HIT elapses, the HIT no longer appears in HIT searches, even if not all of the assignments for the HIT have been accepted. 
    */
  var LifetimeInSeconds: Long = js.native
  
  /**
    *  The number of times the HIT can be accepted and completed before the HIT becomes unavailable. 
    */
  var MaxAssignments: js.UndefOr[Integer] = js.native
  
  /**
    *  Conditions that a Worker's Qualifications must meet in order to accept the HIT. A HIT can have between zero and ten Qualification requirements. All requirements must be met in order for a Worker to accept the HIT. Additionally, other actions can be restricted using the ActionsGuarded field on each QualificationRequirement structure. 
    */
  var QualificationRequirements: js.UndefOr[QualificationRequirementList] = js.native
  
  /**
    *  The data the person completing the HIT uses to produce the results.   Constraints: Must be a QuestionForm data structure, an ExternalQuestion data structure, or an HTMLQuestion data structure. The XML question data must not be larger than 64 kilobytes (65,535 bytes) in size, including whitespace.  Either a Question parameter or a HITLayoutId parameter must be provided.
    */
  var Question: js.UndefOr[String] = js.native
  
  /**
    *  An arbitrary data field. The RequesterAnnotation parameter lets your application attach arbitrary data to the HIT for tracking purposes. For example, this parameter could be an identifier internal to the Requester's application that corresponds with the HIT.   The RequesterAnnotation parameter for a HIT is only visible to the Requester who created the HIT. It is not shown to the Worker, or any other Requester.   The RequesterAnnotation parameter may be different for each HIT you submit. It does not affect how your HITs are grouped. 
    */
  var RequesterAnnotation: js.UndefOr[String] = js.native
  
  /**
    *  The amount of money the Requester will pay a Worker for successfully completing the HIT. 
    */
  var Reward: CurrencyAmount = js.native
  
  /**
    *  The title of the HIT. A title should be short and descriptive about the kind of task the HIT contains. On the Amazon Mechanical Turk web site, the HIT title appears in search results, and everywhere the HIT is mentioned. 
    */
  var Title: String = js.native
  
  /**
    *  A unique identifier for this request which allows you to retry the call on error without creating duplicate HITs. This is useful in cases such as network timeouts where it is unclear whether or not the call succeeded on the server. If the HIT already exists in the system from a previous call using the same UniqueRequestToken, subsequent calls will return a AWS.MechanicalTurk.HitAlreadyExists error with a message containing the HITId.    Note: It is your responsibility to ensure uniqueness of the token. The unique token expires after 24 hours. Subsequent calls using the same UniqueRequestToken made after the 24 hour limit could create duplicate HITs.  
    */
  var UniqueRequestToken: js.UndefOr[IdempotencyToken] = js.native
}
object CreateHITRequest {
  
  @scala.inline
  def apply(
    AssignmentDurationInSeconds: Long,
    Description: String,
    LifetimeInSeconds: Long,
    Reward: CurrencyAmount,
    Title: String
  ): CreateHITRequest = {
    val __obj = js.Dynamic.literal(AssignmentDurationInSeconds = AssignmentDurationInSeconds.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], LifetimeInSeconds = LifetimeInSeconds.asInstanceOf[js.Any], Reward = Reward.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHITRequest]
  }
  
  @scala.inline
  implicit class CreateHITRequestMutableBuilder[Self <: CreateHITRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssignmentDurationInSeconds(value: Long): Self = StObject.set(x, "AssignmentDurationInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignmentReviewPolicy(value: ReviewPolicy): Self = StObject.set(x, "AssignmentReviewPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignmentReviewPolicyUndefined: Self = StObject.set(x, "AssignmentReviewPolicy", js.undefined)
    
    @scala.inline
    def setAutoApprovalDelayInSeconds(value: Long): Self = StObject.set(x, "AutoApprovalDelayInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoApprovalDelayInSecondsUndefined: Self = StObject.set(x, "AutoApprovalDelayInSeconds", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHITLayoutId(value: EntityId): Self = StObject.set(x, "HITLayoutId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHITLayoutIdUndefined: Self = StObject.set(x, "HITLayoutId", js.undefined)
    
    @scala.inline
    def setHITLayoutParameters(value: HITLayoutParameterList): Self = StObject.set(x, "HITLayoutParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHITLayoutParametersUndefined: Self = StObject.set(x, "HITLayoutParameters", js.undefined)
    
    @scala.inline
    def setHITLayoutParametersVarargs(value: HITLayoutParameter*): Self = StObject.set(x, "HITLayoutParameters", js.Array(value :_*))
    
    @scala.inline
    def setHITReviewPolicy(value: ReviewPolicy): Self = StObject.set(x, "HITReviewPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHITReviewPolicyUndefined: Self = StObject.set(x, "HITReviewPolicy", js.undefined)
    
    @scala.inline
    def setKeywords(value: String): Self = StObject.set(x, "Keywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeywordsUndefined: Self = StObject.set(x, "Keywords", js.undefined)
    
    @scala.inline
    def setLifetimeInSeconds(value: Long): Self = StObject.set(x, "LifetimeInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAssignments(value: Integer): Self = StObject.set(x, "MaxAssignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAssignmentsUndefined: Self = StObject.set(x, "MaxAssignments", js.undefined)
    
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
    def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueRequestToken(value: IdempotencyToken): Self = StObject.set(x, "UniqueRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueRequestTokenUndefined: Self = StObject.set(x, "UniqueRequestToken", js.undefined)
  }
}
