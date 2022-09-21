package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBotLocalesRequest extends StObject {
  
  /**
    * The identifier of the bot to list locales for.
    */
  var botId: Id
  
  /**
    * The version of the bot to list locales for.
    */
  var botVersion: BotVersion
  
  /**
    * Provides the specification for a filter used to limit the response to only those locales that match the filter specification. You can only specify one filter and one value to filter on.
    */
  var filters: js.UndefOr[BotLocaleFilters] = js.undefined
  
  /**
    * The maximum number of aliases to return in each page of results. If there are fewer results than the max page size, only the actual number of results are returned.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * If the response from the ListBotLocales operation contains more results than specified in the maxResults parameter, a token is returned in the response. Use that token as the nextToken parameter to return the next page of results. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * Specifies sorting parameters for the list of locales. You can sort by locale name in ascending or descending order.
    */
  var sortBy: js.UndefOr[BotLocaleSortBy] = js.undefined
}
object ListBotLocalesRequest {
  
  inline def apply(botId: Id, botVersion: BotVersion): ListBotLocalesRequest = {
    val __obj = js.Dynamic.literal(botId = botId.asInstanceOf[js.Any], botVersion = botVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBotLocalesRequest]
  }
  
  extension [Self <: ListBotLocalesRequest](x: Self) {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotVersion(value: BotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setFilters(value: BotLocaleFilters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: BotLocaleFilter*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSortBy(value: BotLocaleSortBy): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "sortBy", js.undefined)
  }
}
