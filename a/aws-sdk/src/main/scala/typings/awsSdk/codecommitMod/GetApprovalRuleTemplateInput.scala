package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetApprovalRuleTemplateInput extends js.Object {
  /**
    * The name of the approval rule template for which you want to get information.
    */
  var approvalRuleTemplateName: ApprovalRuleTemplateName = js.native
}

object GetApprovalRuleTemplateInput {
  @scala.inline
  def apply(approvalRuleTemplateName: ApprovalRuleTemplateName): GetApprovalRuleTemplateInput = {
    val __obj = js.Dynamic.literal(approvalRuleTemplateName = approvalRuleTemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetApprovalRuleTemplateInput]
  }
}

