package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateApprovalRuleTemplateOutput extends StObject {
  
  /**
    * The content and structure of the created approval rule template.
    */
  var approvalRuleTemplate: ApprovalRuleTemplate
}
object CreateApprovalRuleTemplateOutput {
  
  inline def apply(approvalRuleTemplate: ApprovalRuleTemplate): CreateApprovalRuleTemplateOutput = {
    val __obj = js.Dynamic.literal(approvalRuleTemplate = approvalRuleTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApprovalRuleTemplateOutput]
  }
  
  extension [Self <: CreateApprovalRuleTemplateOutput](x: Self) {
    
    inline def setApprovalRuleTemplate(value: ApprovalRuleTemplate): Self = StObject.set(x, "approvalRuleTemplate", value.asInstanceOf[js.Any])
  }
}
