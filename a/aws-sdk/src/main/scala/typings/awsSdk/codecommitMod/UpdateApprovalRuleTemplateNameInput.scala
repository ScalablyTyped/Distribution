package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class UpdateApprovalRuleTemplateNameInputOps[Self <: UpdateApprovalRuleTemplateNameInput] (val x: Self) extends AnyVal {
    
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
    def setNewApprovalRuleTemplateName(value: ApprovalRuleTemplateName): Self = this.set("newApprovalRuleTemplateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldApprovalRuleTemplateName(value: ApprovalRuleTemplateName): Self = this.set("oldApprovalRuleTemplateName", value.asInstanceOf[js.Any])
  }
}
