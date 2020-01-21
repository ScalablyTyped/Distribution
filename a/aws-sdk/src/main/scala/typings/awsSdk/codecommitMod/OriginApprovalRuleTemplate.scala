package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OriginApprovalRuleTemplate extends js.Object {
  /**
    * The ID of the template that created the approval rule.
    */
  var approvalRuleTemplateId: js.UndefOr[ApprovalRuleTemplateId] = js.native
  /**
    * The name of the template that created the approval rule.
    */
  var approvalRuleTemplateName: js.UndefOr[ApprovalRuleTemplateName] = js.native
}

object OriginApprovalRuleTemplate {
  @scala.inline
  def apply(
    approvalRuleTemplateId: ApprovalRuleTemplateId = null,
    approvalRuleTemplateName: ApprovalRuleTemplateName = null
  ): OriginApprovalRuleTemplate = {
    val __obj = js.Dynamic.literal()
    if (approvalRuleTemplateId != null) __obj.updateDynamic("approvalRuleTemplateId")(approvalRuleTemplateId.asInstanceOf[js.Any])
    if (approvalRuleTemplateName != null) __obj.updateDynamic("approvalRuleTemplateName")(approvalRuleTemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginApprovalRuleTemplate]
  }
}

