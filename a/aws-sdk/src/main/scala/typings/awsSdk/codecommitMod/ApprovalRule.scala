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
  def apply(): ApprovalRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApprovalRule]
  }
  @scala.inline
  implicit class ApprovalRuleOps[Self <: ApprovalRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApprovalRuleContent(value: ApprovalRuleContent): Self = this.set("approvalRuleContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApprovalRuleContent: Self = this.set("approvalRuleContent", js.undefined)
    @scala.inline
    def setApprovalRuleId(value: ApprovalRuleId): Self = this.set("approvalRuleId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApprovalRuleId: Self = this.set("approvalRuleId", js.undefined)
    @scala.inline
    def setApprovalRuleName(value: ApprovalRuleName): Self = this.set("approvalRuleName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApprovalRuleName: Self = this.set("approvalRuleName", js.undefined)
    @scala.inline
    def setCreationDate(value: CreationDate): Self = this.set("creationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDate: Self = this.set("creationDate", js.undefined)
    @scala.inline
    def setLastModifiedDate(value: LastModifiedDate): Self = this.set("lastModifiedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedDate: Self = this.set("lastModifiedDate", js.undefined)
    @scala.inline
    def setLastModifiedUser(value: Arn): Self = this.set("lastModifiedUser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedUser: Self = this.set("lastModifiedUser", js.undefined)
    @scala.inline
    def setOriginApprovalRuleTemplate(value: OriginApprovalRuleTemplate): Self = this.set("originApprovalRuleTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginApprovalRuleTemplate: Self = this.set("originApprovalRuleTemplate", js.undefined)
    @scala.inline
    def setRuleContentSha256(value: RuleContentSha256): Self = this.set("ruleContentSha256", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuleContentSha256: Self = this.set("ruleContentSha256", js.undefined)
  }
  
}

