package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApprovalRule extends js.Object {
  /**
    * The content of the approval rule.
    */
  var approvalRuleContent: js.UndefOr[ApprovalRuleContent] = js.native
  /**
    * The system-generated ID of the approval rule.
    */
  var approvalRuleId: js.UndefOr[ApprovalRuleId] = js.native
  /**
    * The name of the approval rule.
    */
  var approvalRuleName: js.UndefOr[ApprovalRuleName] = js.native
  /**
    * The date the approval rule was created, in timestamp format.
    */
  var creationDate: js.UndefOr[CreationDate] = js.native
  /**
    * The date the approval rule was most recently changed, in timestamp format.
    */
  var lastModifiedDate: js.UndefOr[LastModifiedDate] = js.native
  /**
    * The Amazon Resource Name (ARN) of the user who made the most recent changes to the approval rule.
    */
  var lastModifiedUser: js.UndefOr[Arn] = js.native
  /**
    * The approval rule template used to create the rule.
    */
  var originApprovalRuleTemplate: js.UndefOr[OriginApprovalRuleTemplate] = js.native
  /**
    * The SHA-256 hash signature for the content of the approval rule.
    */
  var ruleContentSha256: js.UndefOr[RuleContentSha256] = js.native
}

object ApprovalRule {
  @scala.inline
  def apply(
    approvalRuleContent: ApprovalRuleContent = null,
    approvalRuleId: ApprovalRuleId = null,
    approvalRuleName: ApprovalRuleName = null,
    creationDate: CreationDate = null,
    lastModifiedDate: LastModifiedDate = null,
    lastModifiedUser: Arn = null,
    originApprovalRuleTemplate: OriginApprovalRuleTemplate = null,
    ruleContentSha256: RuleContentSha256 = null
  ): ApprovalRule = {
    val __obj = js.Dynamic.literal()
    if (approvalRuleContent != null) __obj.updateDynamic("approvalRuleContent")(approvalRuleContent.asInstanceOf[js.Any])
    if (approvalRuleId != null) __obj.updateDynamic("approvalRuleId")(approvalRuleId.asInstanceOf[js.Any])
    if (approvalRuleName != null) __obj.updateDynamic("approvalRuleName")(approvalRuleName.asInstanceOf[js.Any])
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate.asInstanceOf[js.Any])
    if (lastModifiedDate != null) __obj.updateDynamic("lastModifiedDate")(lastModifiedDate.asInstanceOf[js.Any])
    if (lastModifiedUser != null) __obj.updateDynamic("lastModifiedUser")(lastModifiedUser.asInstanceOf[js.Any])
    if (originApprovalRuleTemplate != null) __obj.updateDynamic("originApprovalRuleTemplate")(originApprovalRuleTemplate.asInstanceOf[js.Any])
    if (ruleContentSha256 != null) __obj.updateDynamic("ruleContentSha256")(ruleContentSha256.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApprovalRule]
  }
}

