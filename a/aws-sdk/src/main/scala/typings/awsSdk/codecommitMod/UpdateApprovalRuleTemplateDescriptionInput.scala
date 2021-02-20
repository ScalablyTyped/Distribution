package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateApprovalRuleTemplateDescriptionInput extends StObject {
  
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
  implicit class UpdateApprovalRuleTemplateDescriptionInputMutableBuilder[Self <: UpdateApprovalRuleTemplateDescriptionInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApprovalRuleTemplateDescription(value: ApprovalRuleTemplateDescription): Self = StObject.set(x, "approvalRuleTemplateDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApprovalRuleTemplateName(value: ApprovalRuleTemplateName): Self = StObject.set(x, "approvalRuleTemplateName", value.asInstanceOf[js.Any])
  }
}
