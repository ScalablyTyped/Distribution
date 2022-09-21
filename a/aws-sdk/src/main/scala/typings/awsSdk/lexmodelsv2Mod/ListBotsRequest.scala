package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBotsRequest extends StObject {
  
  /**
    * Provides the specification of a filter used to limit the bots in the response to only those that match the filter specification. You can only specify one filter and one string to filter on.
    */
  var filters: js.UndefOr[BotFilters] = js.undefined
  
  /**
    * The maximum number of bots to return in each page of results. If there are fewer results than the maximum page size, only the actual number of results are returned.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * If the response from the ListBots operation contains more results than specified in the maxResults parameter, a token is returned in the response.  Use the returned token in the nextToken parameter of a ListBots request to return the next page of results. For a complete set of results, call the ListBots operation until the nextToken returned in the response is null.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * Specifies sorting parameters for the list of bots. You can specify that the list be sorted by bot name in ascending or descending order.
    */
  var sortBy: js.UndefOr[BotSortBy] = js.undefined
}
object ListBotsRequest {
  
  inline def apply(): ListBotsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBotsRequest]
  }
  
  extension [Self <: ListBotsRequest](x: Self) {
    
    inline def setFilters(value: BotFilters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: BotFilter*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSortBy(value: BotSortBy): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "sortBy", js.undefined)
  }
}
