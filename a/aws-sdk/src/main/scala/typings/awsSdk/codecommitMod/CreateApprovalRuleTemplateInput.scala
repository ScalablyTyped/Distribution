package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateApprovalRuleTemplateInput extends js.Object {
  /**
    * The content of the approval rule that is created on pull requests in associated repositories. If you specify one or more destination references (branches), approval rules are created in an associated repository only if their destination references (branches) match those specified in the template.  When you create the content of the approval rule template, you can specify approvers in an approval pool in one of two ways:    CodeCommitApprovers: This option only requires an AWS account and a resource. It can be used for both IAM users and federated access users whose name matches the provided resource name. This is a very powerful option that offers a great deal of flexibility. For example, if you specify the AWS account 123456789012 and Mary_Major, all of the following are counted as approvals coming from that user:   An IAM user in the account (arn:aws:iam::123456789012:user/Mary_Major)   A federated user identified in IAM as Mary_Major (arn:aws:sts::123456789012:federated-user/Mary_Major)   This option does not recognize an active session of someone assuming the role of CodeCommitReview with a role session name of Mary_Major (arn:aws:sts::123456789012:assumed-role/CodeCommitReview/Mary_Major) unless you include a wildcard (*Mary_Major).    Fully qualified ARN: This option allows you to specify the fully qualified Amazon Resource Name (ARN) of the IAM user or role.    For more information about IAM ARNs, wildcards, and formats, see IAM Identifiers in the IAM User Guide. 
    */
  var approvalRuleTemplateContent: ApprovalRuleTemplateContent = js.native
  /**
    * The description of the approval rule template. Consider providing a description that explains what this template does and when it might be appropriate to associate it with repositories.
    */
  var approvalRuleTemplateDescription: js.UndefOr[ApprovalRuleTemplateDescription] = js.native
  /**
    * The name of the approval rule template. Provide descriptive names, because this name is applied to the approval rules created automatically in associated repositories.
    */
  var approvalRuleTemplateName: ApprovalRuleTemplateName = js.native
}

object CreateApprovalRuleTemplateInput {
  @scala.inline
  def apply(
    approvalRuleTemplateContent: ApprovalRuleTemplateContent,
    approvalRuleTemplateName: ApprovalRuleTemplateName,
    approvalRuleTemplateDescription: ApprovalRuleTemplateDescription = null
  ): CreateApprovalRuleTemplateInput = {
    val __obj = js.Dynamic.literal(approvalRuleTemplateContent = approvalRuleTemplateContent.asInstanceOf[js.Any], approvalRuleTemplateName = approvalRuleTemplateName.asInstanceOf[js.Any])
    if (approvalRuleTemplateDescription != null) __obj.updateDynamic("approvalRuleTemplateDescription")(approvalRuleTemplateDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApprovalRuleTemplateInput]
  }
}

