package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateApprovalRuleTemplateContentOutput extends js.Object {
  var approvalRuleTemplate: ApprovalRuleTemplate = js.native
}

object UpdateApprovalRuleTemplateContentOutput {
  @scala.inline
  def apply(approvalRuleTemplate: ApprovalRuleTemplate): UpdateApprovalRuleTemplateContentOutput = {
    val __obj = js.Dynamic.literal(approvalRuleTemplate = approvalRuleTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApprovalRuleTemplateContentOutput]
  }
  @scala.inline
  implicit class UpdateApprovalRuleTemplateContentOutputOps[Self <: UpdateApprovalRuleTemplateContentOutput] (val x: Self) extends AnyVal {
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
    def setApprovalRuleTemplate(value: ApprovalRuleTemplate): Self = this.set("approvalRuleTemplate", value.asInstanceOf[js.Any])
  }
  
}

