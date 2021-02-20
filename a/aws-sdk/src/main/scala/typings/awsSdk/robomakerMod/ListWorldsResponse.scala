package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListWorldsResponse extends StObject {
  
  /**
    * If the previous paginated request did not return all of the remaining results, the response object's nextToken parameter value is set to a token. To retrieve the next set of results, call ListWorlds again and assign that token to the request object's nextToken parameter. If there are no remaining results, the previous response object's NextToken parameter is set to null. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * Summary information for worlds.
    */
  var worldSummaries: js.UndefOr[WorldSummaries] = js.native
}
object ListWorldsResponse {
  
  @scala.inline
  def apply(): ListWorldsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWorldsResponse]
  }
  
  @scala.inline
  implicit class ListWorldsResponseMutableBuilder[Self <: ListWorldsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setWorldSummaries(value: WorldSummaries): Self = StObject.set(x, "worldSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorldSummariesUndefined: Self = StObject.set(x, "worldSummaries", js.undefined)
    
    @scala.inline
    def setWorldSummariesVarargs(value: WorldSummary*): Self = StObject.set(x, "worldSummaries", js.Array(value :_*))
  }
}
