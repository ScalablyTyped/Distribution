package typings.awsSdk.codeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListRepositoriesRequest extends StObject {
  
  /**
    *  The maximum number of results to return per page. 
    */
  var maxResults: js.UndefOr[ListRepositoriesMaxResults] = js.native
  
  /**
    *  The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    *  A prefix used to filter returned repositories. Only repositories with names that start with repositoryPrefix are returned.
    */
  var repositoryPrefix: js.UndefOr[RepositoryName] = js.native
}
object ListRepositoriesRequest {
  
  @scala.inline
  def apply(): ListRepositoriesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRepositoriesRequest]
  }
  
  @scala.inline
  implicit class ListRepositoriesRequestMutableBuilder[Self <: ListRepositoriesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: ListRepositoriesMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setRepositoryPrefix(value: RepositoryName): Self = StObject.set(x, "repositoryPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryPrefixUndefined: Self = StObject.set(x, "repositoryPrefix", js.undefined)
  }
}
