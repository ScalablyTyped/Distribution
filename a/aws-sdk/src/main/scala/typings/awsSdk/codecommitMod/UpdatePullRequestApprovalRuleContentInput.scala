package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePullRequestApprovalRuleContentInput extends StObject {
  
  /**
    * The name of the approval rule you want to update.
    */
  var approvalRuleName: ApprovalRuleName
  
  /**
    * The SHA-256 hash signature for the content of the approval rule. You can retrieve this information by using GetPullRequest.
    */
  var existingRuleContentSha256: js.UndefOr[RuleContentSha256] = js.undefined
  
  /**
    * The updated content for the approval rule.  When you update the content of the approval rule, you can specify approvers in an approval pool in one of two ways:    CodeCommitApprovers: This option only requires an AWS account and a resource. It can be used for both IAM users and federated access users whose name matches the provided resource name. This is a very powerful option that offers a great deal of flexibility. For example, if you specify the AWS account 123456789012 and Mary_Major, all of the following are counted as approvals coming from that user:   An IAM user in the account (arn:aws:iam::123456789012:user/Mary_Major)   A federated user identified in IAM as Mary_Major (arn:aws:sts::123456789012:federated-user/Mary_Major)   This option does not recognize an active session of someone assuming the role of CodeCommitReview with a role session name of Mary_Major (arn:aws:sts::123456789012:assumed-role/CodeCommitReview/Mary_Major) unless you include a wildcard (*Mary_Major).    Fully qualified ARN: This option allows you to specify the fully qualified Amazon Resource Name (ARN) of the IAM user or role.    For more information about IAM ARNs, wildcards, and formats, see IAM Identifiers in the IAM User Guide. 
    */
  var newRuleContent: ApprovalRuleContent
  
  /**
    * The system-generated ID of the pull request.
    */
  var pullRequestId: PullRequestId
}
object UpdatePullRequestApprovalRuleContentInput {
  
  @scala.inline
  def apply(
    approvalRuleName: ApprovalRuleName,
    newRuleContent: ApprovalRuleContent,
    pullRequestId: PullRequestId
  ): UpdatePullRequestApprovalRuleContentInput = {
    val __obj = js.Dynamic.literal(approvalRuleName = approvalRuleName.asInstanceOf[js.Any], newRuleContent = newRuleContent.asInstanceOf[js.Any], pullRequestId = pullRequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePullRequestApprovalRuleContentInput]
  }
  
  @scala.inline
  implicit class UpdatePullRequestApprovalRuleContentInputMutableBuilder[Self <: UpdatePullRequestApprovalRuleContentInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApprovalRuleName(value: ApprovalRuleName): Self = StObject.set(x, "approvalRuleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExistingRuleContentSha256(value: RuleContentSha256): Self = StObject.set(x, "existingRuleContentSha256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExistingRuleContentSha256Undefined: Self = StObject.set(x, "existingRuleContentSha256", js.undefined)
    
    @scala.inline
    def setNewRuleContent(value: ApprovalRuleContent): Self = StObject.set(x, "newRuleContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPullRequestId(value: PullRequestId): Self = StObject.set(x, "pullRequestId", value.asInstanceOf[js.Any])
  }
}
