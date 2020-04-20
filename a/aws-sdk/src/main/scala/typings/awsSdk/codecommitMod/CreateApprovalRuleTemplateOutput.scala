package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateApprovalRuleTemplateOutput extends js.Object {
  /**
    * The content and structure of the created approval rule template.
    */
  var approvalRuleTemplate: ApprovalRuleTemplate = js.native
}

object CreateApprovalRuleTemplateOutput {
  @scala.inline
  def apply(approvalRuleTemplate: ApprovalRuleTemplate): CreateApprovalRuleTemplateOutput = {
    val __obj = js.Dynamic.literal(approvalRuleTemplate = approvalRuleTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApprovalRuleTemplateOutput]
  }
}

