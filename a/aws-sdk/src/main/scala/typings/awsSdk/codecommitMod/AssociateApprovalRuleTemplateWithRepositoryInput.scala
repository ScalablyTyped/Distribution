package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateApprovalRuleTemplateWithRepositoryInput extends StObject {
  
  /**
    * The name for the approval rule template. 
    */
  var approvalRuleTemplateName: ApprovalRuleTemplateName
  
  /**
    * The name of the repository that you want to associate with the template.
    */
  var repositoryName: RepositoryName
}
object AssociateApprovalRuleTemplateWithRepositoryInput {
  
  @scala.inline
  def apply(approvalRuleTemplateName: ApprovalRuleTemplateName, repositoryName: RepositoryName): AssociateApprovalRuleTemplateWithRepositoryInput = {
    val __obj = js.Dynamic.literal(approvalRuleTemplateName = approvalRuleTemplateName.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateApprovalRuleTemplateWithRepositoryInput]
  }
  
  @scala.inline
  implicit class AssociateApprovalRuleTemplateWithRepositoryInputMutableBuilder[Self <: AssociateApprovalRuleTemplateWithRepositoryInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApprovalRuleTemplateName(value: ApprovalRuleTemplateName): Self = StObject.set(x, "approvalRuleTemplateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
  }
}
