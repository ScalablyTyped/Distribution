package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OriginApprovalRuleTemplate extends StObject {
  
  /**
    * The ID of the template that created the approval rule.
    */
  var approvalRuleTemplateId: js.UndefOr[ApprovalRuleTemplateId] = js.undefined
  
  /**
    * The name of the template that created the approval rule.
    */
  var approvalRuleTemplateName: js.UndefOr[ApprovalRuleTemplateName] = js.undefined
}
object OriginApprovalRuleTemplate {
  
  inline def apply(): OriginApprovalRuleTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OriginApprovalRuleTemplate]
  }
  
  extension [Self <: OriginApprovalRuleTemplate](x: Self) {
    
    inline def setApprovalRuleTemplateId(value: ApprovalRuleTemplateId): Self = StObject.set(x, "approvalRuleTemplateId", value.asInstanceOf[js.Any])
    
    inline def setApprovalRuleTemplateIdUndefined: Self = StObject.set(x, "approvalRuleTemplateId", js.undefined)
    
    inline def setApprovalRuleTemplateName(value: ApprovalRuleTemplateName): Self = StObject.set(x, "approvalRuleTemplateName", value.asInstanceOf[js.Any])
    
    inline def setApprovalRuleTemplateNameUndefined: Self = StObject.set(x, "approvalRuleTemplateName", js.undefined)
  }
}
