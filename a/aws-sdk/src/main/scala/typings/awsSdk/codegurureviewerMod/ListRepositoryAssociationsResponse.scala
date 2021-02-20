package typings.awsSdk.codegurureviewerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListRepositoryAssociationsResponse extends StObject {
  
  /**
    * The nextToken value to include in a future ListRecommendations request. When the results of a ListRecommendations request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.codegurureviewerMod.NextToken] = js.native
  
  /**
    * A list of repository associations that meet the criteria of the request.
    */
  var RepositoryAssociationSummaries: js.UndefOr[typings.awsSdk.codegurureviewerMod.RepositoryAssociationSummaries] = js.native
}
object ListRepositoryAssociationsResponse {
  
  @scala.inline
  def apply(): ListRepositoryAssociationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRepositoryAssociationsResponse]
  }
  
  @scala.inline
  implicit class ListRepositoryAssociationsResponseMutableBuilder[Self <: ListRepositoryAssociationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setRepositoryAssociationSummaries(value: RepositoryAssociationSummaries): Self = StObject.set(x, "RepositoryAssociationSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryAssociationSummariesUndefined: Self = StObject.set(x, "RepositoryAssociationSummaries", js.undefined)
    
    @scala.inline
    def setRepositoryAssociationSummariesVarargs(value: RepositoryAssociationSummary*): Self = StObject.set(x, "RepositoryAssociationSummaries", js.Array(value :_*))
  }
}
