package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWorldGenerationJobsResponse extends StObject {
  
  /**
    * If the previous paginated request did not return all of the remaining results, the response object's nextToken parameter value is set to a token. To retrieve the next set of results, call ListWorldGeneratorJobsRequest again and assign that token to the request object's nextToken parameter. If there are no remaining results, the previous response object's NextToken parameter is set to null. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * Summary information for world generator jobs.
    */
  var worldGenerationJobSummaries: WorldGenerationJobSummaries
}
object ListWorldGenerationJobsResponse {
  
  @scala.inline
  def apply(worldGenerationJobSummaries: WorldGenerationJobSummaries): ListWorldGenerationJobsResponse = {
    val __obj = js.Dynamic.literal(worldGenerationJobSummaries = worldGenerationJobSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListWorldGenerationJobsResponse]
  }
  
  @scala.inline
  implicit class ListWorldGenerationJobsResponseMutableBuilder[Self <: ListWorldGenerationJobsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setWorldGenerationJobSummaries(value: WorldGenerationJobSummaries): Self = StObject.set(x, "worldGenerationJobSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorldGenerationJobSummariesVarargs(value: WorldGenerationJobSummary*): Self = StObject.set(x, "worldGenerationJobSummaries", js.Array(value :_*))
  }
}
