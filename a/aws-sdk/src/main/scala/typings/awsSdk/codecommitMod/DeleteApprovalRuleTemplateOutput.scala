package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteApprovalRuleTemplateOutput extends StObject {
  
  /**
    * The system-generated ID of the deleted approval rule template. If the template has been previously deleted, the only response is a 200 OK.
    */
  var approvalRuleTemplateId: ApprovalRuleTemplateId
}
object DeleteApprovalRuleTemplateOutput {
  
  @scala.inline
  def apply(approvalRuleTemplateId: ApprovalRuleTemplateId): DeleteApprovalRuleTemplateOutput = {
    val __obj = js.Dynamic.literal(approvalRuleTemplateId = approvalRuleTemplateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApprovalRuleTemplateOutput]
  }
  
  @scala.inline
  implicit class DeleteApprovalRuleTemplateOutputMutableBuilder[Self <: DeleteApprovalRuleTemplateOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApprovalRuleTemplateId(value: ApprovalRuleTemplateId): Self = StObject.set(x, "approvalRuleTemplateId", value.asInstanceOf[js.Any])
  }
}
