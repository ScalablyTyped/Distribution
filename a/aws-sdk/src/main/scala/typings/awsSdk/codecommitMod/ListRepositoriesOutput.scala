package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRepositoriesOutput extends StObject {
  
  /**
    * An enumeration token that allows the operation to batch the results of the operation. Batch sizes are 1,000 for list repository operations. When the client sends the token back to AWS CodeCommit, another page of 1,000 records is retrieved.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * Lists the repositories called by the list repositories operation.
    */
  var repositories: js.UndefOr[RepositoryNameIdPairList] = js.undefined
}
object ListRepositoriesOutput {
  
  inline def apply(): ListRepositoriesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRepositoriesOutput]
  }
  
  extension [Self <: ListRepositoriesOutput](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setRepositories(value: RepositoryNameIdPairList): Self = StObject.set(x, "repositories", value.asInstanceOf[js.Any])
    
    inline def setRepositoriesUndefined: Self = StObject.set(x, "repositories", js.undefined)
    
    inline def setRepositoriesVarargs(value: RepositoryNameIdPair*): Self = StObject.set(x, "repositories", js.Array(value :_*))
  }
}
