package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSlotTypesRequest extends StObject {
  
  /**
    * The unique identifier of the bot that contains the slot types.
    */
  var botId: Id
  
  /**
    * The version of the bot that contains the slot type.
    */
  var botVersion: BotVersion
  
  /**
    * Provides the specification of a filter used to limit the slot types in the response to only those that match the filter specification. You can only specify one filter and only one string to filter on.
    */
  var filters: js.UndefOr[SlotTypeFilters] = js.undefined
  
  /**
    * The identifier of the language and locale of the slot types to list. The string must match one of the supported locales. For more information, see Supported languages.
    */
  var localeId: LocaleId
  
  /**
    * The maximum number of slot types to return in each page of results. If there are fewer results than the max page size, only the actual number of results are returned.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * If the response from the ListSlotTypes operation contains more results than specified in the maxResults parameter, a token is returned in the response. Use that token in the nextToken parameter to return the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * Determines the sort order for the response from the ListSlotTypes operation. You can choose to sort by the slot type name or last updated date in either ascending or descending order.
    */
  var sortBy: js.UndefOr[SlotTypeSortBy] = js.undefined
}
object ListSlotTypesRequest {
  
  inline def apply(botId: Id, botVersion: BotVersion, localeId: LocaleId): ListSlotTypesRequest = {
    val __obj = js.Dynamic.literal(botId = botId.asInstanceOf[js.Any], botVersion = botVersion.asInstanceOf[js.Any], localeId = localeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSlotTypesRequest]
  }
  
  extension [Self <: ListSlotTypesRequest](x: Self) {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotVersion(value: BotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setFilters(value: SlotTypeFilters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: SlotTypeFilter*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSortBy(value: SlotTypeSortBy): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "sortBy", js.undefined)
  }
}
