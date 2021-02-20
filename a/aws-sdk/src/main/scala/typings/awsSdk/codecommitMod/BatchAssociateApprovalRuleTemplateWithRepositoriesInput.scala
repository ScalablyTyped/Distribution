package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchAssociateApprovalRuleTemplateWithRepositoriesInput extends StObject {
  
  /**
    * The name of the template you want to associate with one or more repositories.
    */
  var approvalRuleTemplateName: ApprovalRuleTemplateName = js.native
  
  /**
    * The names of the repositories you want to associate with the template.  The length constraint limit is for each string in the array. The array itself can be empty. 
    */
  var repositoryNames: RepositoryNameList = js.native
}
object BatchAssociateApprovalRuleTemplateWithRepositoriesInput {
  
  @scala.inline
  def apply(approvalRuleTemplateName: ApprovalRuleTemplateName, repositoryNames: RepositoryNameList): BatchAssociateApprovalRuleTemplateWithRepositoriesInput = {
    val __obj = js.Dynamic.literal(approvalRuleTemplateName = approvalRuleTemplateName.asInstanceOf[js.Any], repositoryNames = repositoryNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchAssociateApprovalRuleTemplateWithRepositoriesInput]
  }
  
  @scala.inline
  implicit class BatchAssociateApprovalRuleTemplateWithRepositoriesInputMutableBuilder[Self <: BatchAssociateApprovalRuleTemplateWithRepositoriesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApprovalRuleTemplateName(value: ApprovalRuleTemplateName): Self = StObject.set(x, "approvalRuleTemplateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryNames(value: RepositoryNameList): Self = StObject.set(x, "repositoryNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryNamesVarargs(value: RepositoryName*): Self = StObject.set(x, "repositoryNames", js.Array(value :_*))
  }
}
