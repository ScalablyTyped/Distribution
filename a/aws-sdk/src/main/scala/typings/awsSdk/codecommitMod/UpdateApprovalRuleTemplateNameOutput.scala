package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateApprovalRuleTemplateNameOutput extends StObject {
  
  /**
    * The structure and content of the updated approval rule template.
    */
  var approvalRuleTemplate: ApprovalRuleTemplate = js.native
}
object UpdateApprovalRuleTemplateNameOutput {
  
  @scala.inline
  def apply(approvalRuleTemplate: ApprovalRuleTemplate): UpdateApprovalRuleTemplateNameOutput = {
    val __obj = js.Dynamic.literal(approvalRuleTemplate = approvalRuleTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApprovalRuleTemplateNameOutput]
  }
  
  @scala.inline
  implicit class UpdateApprovalRuleTemplateNameOutputMutableBuilder[Self <: UpdateApprovalRuleTemplateNameOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApprovalRuleTemplate(value: ApprovalRuleTemplate): Self = StObject.set(x, "approvalRuleTemplate", value.asInstanceOf[js.Any])
  }
}
