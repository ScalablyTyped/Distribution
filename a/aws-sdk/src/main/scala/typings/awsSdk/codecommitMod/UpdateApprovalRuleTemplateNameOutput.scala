package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateApprovalRuleTemplateNameOutput extends js.Object {
  /**
    * The structure and content of the updated approval rule template.
    */
  var approvalRuleTemplate: ApprovalRuleTemplate = js.native
}

object UpdateApprovalRuleTemplateNameOutput {
  @scala.inline
  def apply(approvalRuleTemplate: ApprovalRuleTemplate): UpdateApprovalRuleTemplateNameOutput = {
    val __obj = js.Dynamic.literal(approvalRuleTemplate = approvalRuleTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApprovalRuleTemplateNameOutput]
  }
  @scala.inline
  implicit class UpdateApprovalRuleTemplateNameOutputOps[Self <: UpdateApprovalRuleTemplateNameOutput] (val x: Self) extends AnyVal {
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

