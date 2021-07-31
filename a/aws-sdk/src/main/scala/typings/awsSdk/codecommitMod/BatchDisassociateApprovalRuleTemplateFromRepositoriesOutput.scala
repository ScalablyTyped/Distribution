package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDisassociateApprovalRuleTemplateFromRepositoriesOutput extends StObject {
  
  /**
    * A list of repository names that have had their association with the template removed.
    */
  var disassociatedRepositoryNames: RepositoryNameList
  
  /**
    * A list of any errors that might have occurred while attempting to remove the association between the template and the repositories.
    */
  var errors: BatchDisassociateApprovalRuleTemplateFromRepositoriesErrorsList
}
object BatchDisassociateApprovalRuleTemplateFromRepositoriesOutput {
  
  @scala.inline
  def apply(
    disassociatedRepositoryNames: RepositoryNameList,
    errors: BatchDisassociateApprovalRuleTemplateFromRepositoriesErrorsList
  ): BatchDisassociateApprovalRuleTemplateFromRepositoriesOutput = {
    val __obj = js.Dynamic.literal(disassociatedRepositoryNames = disassociatedRepositoryNames.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDisassociateApprovalRuleTemplateFromRepositoriesOutput]
  }
  
  @scala.inline
  implicit class BatchDisassociateApprovalRuleTemplateFromRepositoriesOutputMutableBuilder[Self <: BatchDisassociateApprovalRuleTemplateFromRepositoriesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisassociatedRepositoryNames(value: RepositoryNameList): Self = StObject.set(x, "disassociatedRepositoryNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisassociatedRepositoryNamesVarargs(value: RepositoryName*): Self = StObject.set(x, "disassociatedRepositoryNames", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: BatchDisassociateApprovalRuleTemplateFromRepositoriesErrorsList): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsVarargs(value: BatchDisassociateApprovalRuleTemplateFromRepositoriesError*): Self = StObject.set(x, "errors", js.Array(value :_*))
  }
}
