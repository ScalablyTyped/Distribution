package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeletePullRequestApprovalRuleInput extends StObject {
  
  /**
    * The name of the approval rule you want to delete.
    */
  var approvalRuleName: ApprovalRuleName = js.native
  
  /**
    * The system-generated ID of the pull request that contains the approval rule you want to delete.
    */
  var pullRequestId: PullRequestId = js.native
}
object DeletePullRequestApprovalRuleInput {
  
  @scala.inline
  def apply(approvalRuleName: ApprovalRuleName, pullRequestId: PullRequestId): DeletePullRequestApprovalRuleInput = {
    val __obj = js.Dynamic.literal(approvalRuleName = approvalRuleName.asInstanceOf[js.Any], pullRequestId = pullRequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePullRequestApprovalRuleInput]
  }
  
  @scala.inline
  implicit class DeletePullRequestApprovalRuleInputMutableBuilder[Self <: DeletePullRequestApprovalRuleInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApprovalRuleName(value: ApprovalRuleName): Self = StObject.set(x, "approvalRuleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPullRequestId(value: PullRequestId): Self = StObject.set(x, "pullRequestId", value.asInstanceOf[js.Any])
  }
}
