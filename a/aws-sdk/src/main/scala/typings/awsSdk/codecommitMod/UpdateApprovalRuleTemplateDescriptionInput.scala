package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateApprovalRuleTemplateDescriptionInput extends js.Object {
  /**
    * The updated description of the approval rule template.
    */
  var approvalRuleTemplateDescription: ApprovalRuleTemplateDescription = js.native
  /**
    * The name of the template for which you want to update the description.
    */
  var approvalRuleTemplateName: ApprovalRuleTemplateName = js.native
}

object UpdateApprovalRuleTemplateDescriptionInput {
  @scala.inline
  def apply(
    approvalRuleTemplateDescription: ApprovalRuleTemplateDescription,
    approvalRuleTemplateName: ApprovalRuleTemplateName
  ): UpdateApprovalRuleTemplateDescriptionInput = {
    val __obj = js.Dynamic.literal(approvalRuleTemplateDescription = approvalRuleTemplateDescription.asInstanceOf[js.Any], approvalRuleTemplateName = approvalRuleTemplateName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateApprovalRuleTemplateDescriptionInput]
  }
}

