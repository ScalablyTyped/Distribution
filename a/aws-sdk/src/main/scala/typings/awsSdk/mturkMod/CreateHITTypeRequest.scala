package typings.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateHITTypeRequest extends StObject {
  
  /**
    *  The amount of time, in seconds, that a Worker has to complete the HIT after accepting it. If a Worker does not complete the assignment within the specified duration, the assignment is considered abandoned. If the HIT is still active (that is, its lifetime has not elapsed), the assignment becomes available for other users to find and accept. 
    */
  var AssignmentDurationInSeconds: Long = js.native
  
  /**
    *  The number of seconds after an assignment for the HIT has been submitted, after which the assignment is considered Approved automatically unless the Requester explicitly rejects it. 
    */
  var AutoApprovalDelayInSeconds: js.UndefOr[Long] = js.native
  
  /**
    *  A general description of the HIT. A description includes detailed information about the kind of task the HIT contains. On the Amazon Mechanical Turk web site, the HIT description appears in the expanded view of search results, and in the HIT and assignment screens. A good description gives the user enough information to evaluate the HIT before accepting it. 
    */
  var Description: String = js.native
  
  /**
    *  One or more words or phrases that describe the HIT, separated by commas. These words are used in searches to find HITs. 
    */
  var Keywords: js.UndefOr[String] = js.native
  
  /**
    *  Conditions that a Worker's Qualifications must meet in order to accept the HIT. A HIT can have between zero and ten Qualification requirements. All requirements must be met in order for a Worker to accept the HIT. Additionally, other actions can be restricted using the ActionsGuarded field on each QualificationRequirement structure. 
    */
  var QualificationRequirements: js.UndefOr[QualificationRequirementList] = js.native
  
  /**
    *  The amount of money the Requester will pay a Worker for successfully completing the HIT. 
    */
  var Reward: CurrencyAmount = js.native
  
  /**
    *  The title of the HIT. A title should be short and descriptive about the kind of task the HIT contains. On the Amazon Mechanical Turk web site, the HIT title appears in search results, and everywhere the HIT is mentioned. 
    */
  var Title: String = js.native
}
object CreateHITTypeRequest {
  
  @scala.inline
  def apply(AssignmentDurationInSeconds: Long, Description: String, Reward: CurrencyAmount, Title: String): CreateHITTypeRequest = {
    val __obj = js.Dynamic.literal(AssignmentDurationInSeconds = AssignmentDurationInSeconds.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Reward = Reward.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHITTypeRequest]
  }
  
  @scala.inline
  implicit class CreateHITTypeRequestMutableBuilder[Self <: CreateHITTypeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssignmentDurationInSeconds(value: Long): Self = StObject.set(x, "AssignmentDurationInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoApprovalDelayInSeconds(value: Long): Self = StObject.set(x, "AutoApprovalDelayInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoApprovalDelayInSecondsUndefined: Self = StObject.set(x, "AutoApprovalDelayInSeconds", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeywords(value: String): Self = StObject.set(x, "Keywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeywordsUndefined: Self = StObject.set(x, "Keywords", js.undefined)
    
    @scala.inline
    def setQualificationRequirements(value: QualificationRequirementList): Self = StObject.set(x, "QualificationRequirements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualificationRequirementsUndefined: Self = StObject.set(x, "QualificationRequirements", js.undefined)
    
    @scala.inline
    def setQualificationRequirementsVarargs(value: QualificationRequirement*): Self = StObject.set(x, "QualificationRequirements", js.Array(value :_*))
    
    @scala.inline
    def setReward(value: CurrencyAmount): Self = StObject.set(x, "Reward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
  }
}
