package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OriginApprovalRuleTemplate extends js.Object {
  
  /**
    * The ID of the template that created the approval rule.
    */
  var approvalRuleTemplateId: js.UndefOr[ApprovalRuleTemplateId] = js.native
  
  /**
    * The name of the template that created the approval rule.
    */
  var approvalRuleTemplateName: js.UndefOr[ApprovalRuleTemplateName] = js.native
}
object OriginApprovalRuleTemplate {
  
  @scala.inline
  def apply(): OriginApprovalRuleTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OriginApprovalRuleTemplate]
  }
  
  @scala.inline
  implicit class OriginApprovalRuleTemplateOps[Self <: OriginApprovalRuleTemplate] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def deleteApprovalRuleTemplateId: Self = this.set("approvalRuleTemplateId", js.undefined)
    
    @scala.inline
    def setApprovalRuleTemplateName(value: ApprovalRuleTemplateName): Self = this.set("approvalRuleTemplateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApprovalRuleTemplateName: Self = this.set("approvalRuleTemplateName", js.undefined)
  }
}
