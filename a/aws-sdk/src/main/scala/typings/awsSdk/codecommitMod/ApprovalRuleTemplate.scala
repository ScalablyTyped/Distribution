package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApprovalRuleTemplate extends js.Object {
  /**
    * The content of the approval rule template.
    */
  var approvalRuleTemplateContent: js.UndefOr[ApprovalRuleTemplateContent] = js.native
  /**
    * The description of the approval rule template.
    */
  var approvalRuleTemplateDescription: js.UndefOr[ApprovalRuleTemplateDescription] = js.native
  /**
    * The system-generated ID of the approval rule template.
    */
  var approvalRuleTemplateId: js.UndefOr[ApprovalRuleTemplateId] = js.native
  /**
    * The name of the approval rule template.
    */
  var approvalRuleTemplateName: js.UndefOr[ApprovalRuleTemplateName] = js.native
  /**
    * The date the approval rule template was created, in timestamp format.
    */
  var creationDate: js.UndefOr[CreationDate] = js.native
  /**
    * The date the approval rule template was most recently changed, in timestamp format.
    */
  var lastModifiedDate: js.UndefOr[LastModifiedDate] = js.native
  /**
    * The Amazon Resource Name (ARN) of the user who made the most recent changes to the approval rule template.
    */
  var lastModifiedUser: js.UndefOr[Arn] = js.native
  /**
    * The SHA-256 hash signature for the content of the approval rule template.
    */
  var ruleContentSha256: js.UndefOr[RuleContentSha256] = js.native
}

object ApprovalRuleTemplate {
  @scala.inline
  def apply(): ApprovalRuleTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApprovalRuleTemplate]
  }
  @scala.inline
  implicit class ApprovalRuleTemplateOps[Self <: ApprovalRuleTemplate] (val x: Self) extends AnyVal {
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
    def setApprovalRuleTemplateContent(value: ApprovalRuleTemplateContent): Self = this.set("approvalRuleTemplateContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApprovalRuleTemplateContent: Self = this.set("approvalRuleTemplateContent", js.undefined)
    @scala.inline
    def setApprovalRuleTemplateDescription(value: ApprovalRuleTemplateDescription): Self = this.set("approvalRuleTemplateDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApprovalRuleTemplateDescription: Self = this.set("approvalRuleTemplateDescription", js.undefined)
    @scala.inline
    def setApprovalRuleTemplateId(value: ApprovalRuleTemplateId): Self = this.set("approvalRuleTemplateId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApprovalRuleTemplateId: Self = this.set("approvalRuleTemplateId", js.undefined)
    @scala.inline
    def setApprovalRuleTemplateName(value: ApprovalRuleTemplateName): Self = this.set("approvalRuleTemplateName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApprovalRuleTemplateName: Self = this.set("approvalRuleTemplateName", js.undefined)
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
    def setRuleContentSha256(value: RuleContentSha256): Self = this.set("ruleContentSha256", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuleContentSha256: Self = this.set("ruleContentSha256", js.undefined)
  }
  
}

