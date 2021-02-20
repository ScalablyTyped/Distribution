package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteApprovalRuleTemplateInput extends StObject {
  
  /**
    * The name of the approval rule template to delete.
    */
  var approvalRuleTemplateName: ApprovalRuleTemplateName = js.native
}
object DeleteApprovalRuleTemplateInput {
  
  @scala.inline
  def apply(approvalRuleTemplateName: ApprovalRuleTemplateName): DeleteApprovalRuleTemplateInput = {
    val __obj = js.Dynamic.literal(approvalRuleTemplateName = approvalRuleTemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApprovalRuleTemplateInput]
  }
  
  @scala.inline
  implicit class DeleteApprovalRuleTemplateInputMutableBuilder[Self <: DeleteApprovalRuleTemplateInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApprovalRuleTemplateName(value: ApprovalRuleTemplateName): Self = StObject.set(x, "approvalRuleTemplateName", value.asInstanceOf[js.Any])
  }
}
