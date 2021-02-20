package typings.awsSdk.ecrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeRepositoriesResponse extends StObject {
  
  /**
    * The nextToken value to include in a future DescribeRepositories request. When the results of a DescribeRepositories request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * A list of repository objects corresponding to valid repositories.
    */
  var repositories: js.UndefOr[RepositoryList] = js.native
}
object DescribeRepositoriesResponse {
  
  @scala.inline
  def apply(): DescribeRepositoriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRepositoriesResponse]
  }
  
  @scala.inline
  implicit class DescribeRepositoriesResponseMutableBuilder[Self <: DescribeRepositoriesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setRepositories(value: RepositoryList): Self = StObject.set(x, "repositories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoriesUndefined: Self = StObject.set(x, "repositories", js.undefined)
    
    @scala.inline
    def setRepositoriesVarargs(value: Repository*): Self = StObject.set(x, "repositories", js.Array(value :_*))
  }
}
