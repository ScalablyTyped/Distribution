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
  
  inline def apply(
    disassociatedRepositoryNames: RepositoryNameList,
    errors: BatchDisassociateApprovalRuleTemplateFromRepositoriesErrorsList
  ): BatchDisassociateApprovalRuleTemplateFromRepositoriesOutput = {
    val __obj = js.Dynamic.literal(disassociatedRepositoryNames = disassociatedRepositoryNames.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDisassociateApprovalRuleTemplateFromRepositoriesOutput]
  }
  
  extension [Self <: BatchDisassociateApprovalRuleTemplateFromRepositoriesOutput](x: Self) {
    
    inline def setDisassociatedRepositoryNames(value: RepositoryNameList): Self = StObject.set(x, "disassociatedRepositoryNames", value.asInstanceOf[js.Any])
    
    inline def setDisassociatedRepositoryNamesVarargs(value: RepositoryName*): Self = StObject.set(x, "disassociatedRepositoryNames", js.Array(value :_*))
    
    inline def setErrors(value: BatchDisassociateApprovalRuleTemplateFromRepositoriesErrorsList): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: BatchDisassociateApprovalRuleTemplateFromRepositoriesError*): Self = StObject.set(x, "errors", js.Array(value :_*))
  }
}
