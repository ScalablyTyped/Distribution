package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchAssociateApprovalRuleTemplateWithRepositoriesOutput extends StObject {
  
  /**
    * A list of names of the repositories that have been associated with the template.
    */
  var associatedRepositoryNames: RepositoryNameList
  
  /**
    * A list of any errors that might have occurred while attempting to create the association between the template and the repositories.
    */
  var errors: BatchAssociateApprovalRuleTemplateWithRepositoriesErrorsList
}
object BatchAssociateApprovalRuleTemplateWithRepositoriesOutput {
  
  @scala.inline
  def apply(
    associatedRepositoryNames: RepositoryNameList,
    errors: BatchAssociateApprovalRuleTemplateWithRepositoriesErrorsList
  ): BatchAssociateApprovalRuleTemplateWithRepositoriesOutput = {
    val __obj = js.Dynamic.literal(associatedRepositoryNames = associatedRepositoryNames.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchAssociateApprovalRuleTemplateWithRepositoriesOutput]
  }
  
  @scala.inline
  implicit class BatchAssociateApprovalRuleTemplateWithRepositoriesOutputMutableBuilder[Self <: BatchAssociateApprovalRuleTemplateWithRepositoriesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociatedRepositoryNames(value: RepositoryNameList): Self = StObject.set(x, "associatedRepositoryNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociatedRepositoryNamesVarargs(value: RepositoryName*): Self = StObject.set(x, "associatedRepositoryNames", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: BatchAssociateApprovalRuleTemplateWithRepositoriesErrorsList): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsVarargs(value: BatchAssociateApprovalRuleTemplateWithRepositoriesError*): Self = StObject.set(x, "errors", js.Array(value :_*))
  }
}
