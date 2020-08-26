package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteApprovalRuleTemplateOutput extends js.Object {
  /**
    * The system-generated ID of the deleted approval rule template. If the template has been previously deleted, the only response is a 200 OK.
    */
  var approvalRuleTemplateId: ApprovalRuleTemplateId = js.native
}

object DeleteApprovalRuleTemplateOutput {
  @scala.inline
  def apply(approvalRuleTemplateId: ApprovalRuleTemplateId): DeleteApprovalRuleTemplateOutput = {
    val __obj = js.Dynamic.literal(approvalRuleTemplateId = approvalRuleTemplateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApprovalRuleTemplateOutput]
  }
  @scala.inline
  implicit class DeleteApprovalRuleTemplateOutputOps[Self <: DeleteApprovalRuleTemplateOutput] (val x: Self) extends AnyVal {
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
    def setApprovalRuleTemplateId(value: ApprovalRuleTemplateId): Self = this.set("approvalRuleTemplateId", value.asInstanceOf[js.Any])
  }
  
}

