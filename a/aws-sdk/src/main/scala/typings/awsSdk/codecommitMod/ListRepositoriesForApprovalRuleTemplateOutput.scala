package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRepositoriesForApprovalRuleTemplateOutput extends StObject {
  
  /**
    * An enumeration token that allows the operation to batch the next results of the operation.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * A list of repository names that are associated with the specified approval rule template.
    */
  var repositoryNames: js.UndefOr[RepositoryNameList] = js.undefined
}
object ListRepositoriesForApprovalRuleTemplateOutput {
  
  inline def apply(): ListRepositoriesForApprovalRuleTemplateOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRepositoriesForApprovalRuleTemplateOutput]
  }
  
  extension [Self <: ListRepositoriesForApprovalRuleTemplateOutput](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setRepositoryNames(value: RepositoryNameList): Self = StObject.set(x, "repositoryNames", value.asInstanceOf[js.Any])
    
    inline def setRepositoryNamesUndefined: Self = StObject.set(x, "repositoryNames", js.undefined)
    
    inline def setRepositoryNamesVarargs(value: RepositoryName*): Self = StObject.set(x, "repositoryNames", js.Array(value :_*))
  }
}
