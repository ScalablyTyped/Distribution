package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteApprovalRuleTemplateInput extends StObject {
  
  /**
    * The name of the approval rule template to delete.
    */
  var approvalRuleTemplateName: ApprovalRuleTemplateName
}
object DeleteApprovalRuleTemplateInput {
  
  inline def apply(approvalRuleTemplateName: ApprovalRuleTemplateName): DeleteApprovalRuleTemplateInput = {
    val __obj = js.Dynamic.literal(approvalRuleTemplateName = approvalRuleTemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApprovalRuleTemplateInput]
  }
  
  extension [Self <: DeleteApprovalRuleTemplateInput](x: Self) {
    
    inline def setApprovalRuleTemplateName(value: ApprovalRuleTemplateName): Self = StObject.set(x, "approvalRuleTemplateName", value.asInstanceOf[js.Any])
  }
}
