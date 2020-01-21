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
}

