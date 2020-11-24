package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class UpdateApprovalRuleTemplateDescriptionInputOps[Self <: UpdateApprovalRuleTemplateDescriptionInput] (val x: Self) extends AnyVal {
    
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
    def setApprovalRuleTemplateDescription(value: ApprovalRuleTemplateDescription): Self = this.set("approvalRuleTemplateDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApprovalRuleTemplateName(value: ApprovalRuleTemplateName): Self = this.set("approvalRuleTemplateName", value.asInstanceOf[js.Any])
  }
}
