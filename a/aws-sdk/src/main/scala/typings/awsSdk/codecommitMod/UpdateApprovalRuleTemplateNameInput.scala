package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateApprovalRuleTemplateNameInput extends js.Object {
  /**
    * The new name you want to apply to the approval rule template.
    */
  var newApprovalRuleTemplateName: ApprovalRuleTemplateName = js.native
  /**
    * The current name of the approval rule template.
    */
  var oldApprovalRuleTemplateName: ApprovalRuleTemplateName = js.native
}

object UpdateApprovalRuleTemplateNameInput {
  @scala.inline
  def apply(
    newApprovalRuleTemplateName: ApprovalRuleTemplateName,
    oldApprovalRuleTemplateName: ApprovalRuleTemplateName
  ): UpdateApprovalRuleTemplateNameInput = {
    val __obj = js.Dynamic.literal(newApprovalRuleTemplateName = newApprovalRuleTemplateName.asInstanceOf[js.Any], oldApprovalRuleTemplateName = oldApprovalRuleTemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApprovalRuleTemplateNameInput]
  }
}

