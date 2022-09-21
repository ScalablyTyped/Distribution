package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListImportsRequest extends StObject {
  
  /**
    * The unique identifier that Amazon Lex assigned to the bot.
    */
  var botId: js.UndefOr[Id] = js.undefined
  
  /**
    * The version of the bot to list imports for.
    */
  var botVersion: js.UndefOr[DraftBotVersion] = js.undefined
  
  /**
    * Provides the specification of a filter used to limit the bots in the response to only those that match the filter specification. You can only specify one filter and one string to filter on.
    */
  var filters: js.UndefOr[ImportFilters] = js.undefined
  
  /**
    * Specifies the locale that should be present in the list. If you don't specify a resource type in the filters parameter, the list contains both bot locales and custom vocabularies.
    */
  var localeId: js.UndefOr[LocaleId] = js.undefined
  
  /**
    * The maximum number of imports to return in each page of results. If there are fewer results than the max page size, only the actual number of results are returned.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * If the response from the ListImports operation contains more results than specified in the maxResults parameter, a token is returned in the response. Use the returned token in the nextToken parameter of a ListImports request to return the next page of results. For a complete set of results, call the ListImports operation until the nextToken returned in the response is null.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * Determines the field that the list of imports is sorted by. You can sort by the LastUpdatedDateTime field in ascending or descending order.
    */
  var sortBy: js.UndefOr[ImportSortBy] = js.undefined
}
object ListImportsRequest {
  
  inline def apply(): ListImportsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListImportsRequest]
  }
  
  extension [Self <: ListImportsRequest](x: Self) {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotIdUndefined: Self = StObject.set(x, "botId", js.undefined)
    
    inline def setBotVersion(value: DraftBotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setBotVersionUndefined: Self = StObject.set(x, "botVersion", js.undefined)
    
    inline def setFilters(value: ImportFilters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: ImportFilter*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
    
    inline def setLocaleIdUndefined: Self = StObject.set(x, "localeId", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSortBy(value: ImportSortBy): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "sortBy", js.undefined)
  }
}
