package typings.awsSdk.codeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRepositoriesInDomainResult extends StObject {
  
  /**
    *  If there are additional results, this is the token for the next set of results. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    *  The returned list of repositories. 
    */
  var repositories: js.UndefOr[RepositorySummaryList] = js.undefined
}
object ListRepositoriesInDomainResult {
  
  @scala.inline
  def apply(): ListRepositoriesInDomainResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRepositoriesInDomainResult]
  }
  
  @scala.inline
  implicit class ListRepositoriesInDomainResultMutableBuilder[Self <: ListRepositoriesInDomainResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setRepositories(value: RepositorySummaryList): Self = StObject.set(x, "repositories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoriesUndefined: Self = StObject.set(x, "repositories", js.undefined)
    
    @scala.inline
    def setRepositoriesVarargs(value: RepositorySummary*): Self = StObject.set(x, "repositories", js.Array(value :_*))
  }
}
