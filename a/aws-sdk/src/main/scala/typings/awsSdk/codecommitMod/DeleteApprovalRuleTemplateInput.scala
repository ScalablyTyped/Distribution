package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteApprovalRuleTemplateInput extends js.Object {
  /**
    * The name of the approval rule template to delete.
    */
  var approvalRuleTemplateName: ApprovalRuleTemplateName = js.native
}

object DeleteApprovalRuleTemplateInput {
  @scala.inline
  def apply(approvalRuleTemplateName: ApprovalRuleTemplateName): DeleteApprovalRuleTemplateInput = {
    val __obj = js.Dynamic.literal(approvalRuleTemplateName = approvalRuleTemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApprovalRuleTemplateInput]
  }
}

