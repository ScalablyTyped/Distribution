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
}

