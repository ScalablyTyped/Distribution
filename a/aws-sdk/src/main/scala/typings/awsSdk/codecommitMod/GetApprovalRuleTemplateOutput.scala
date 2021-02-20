package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetApprovalRuleTemplateOutput extends StObject {
  
  /**
    * The content and structure of the approval rule template.
    */
  var approvalRuleTemplate: ApprovalRuleTemplate = js.native
}
object GetApprovalRuleTemplateOutput {
  
  @scala.inline
  def apply(approvalRuleTemplate: ApprovalRuleTemplate): GetApprovalRuleTemplateOutput = {
    val __obj = js.Dynamic.literal(approvalRuleTemplate = approvalRuleTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetApprovalRuleTemplateOutput]
  }
  
  @scala.inline
  implicit class GetApprovalRuleTemplateOutputMutableBuilder[Self <: GetApprovalRuleTemplateOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApprovalRuleTemplate(value: ApprovalRuleTemplate): Self = StObject.set(x, "approvalRuleTemplate", value.asInstanceOf[js.Any])
  }
}
