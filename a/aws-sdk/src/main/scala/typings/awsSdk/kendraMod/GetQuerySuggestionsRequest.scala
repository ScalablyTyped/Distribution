package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetQuerySuggestionsRequest extends StObject {
  
  /**
    * The identifier of the index you want to get query suggestions from.
    */
  var IndexId: typings.awsSdk.kendraMod.IndexId
  
  /**
    * The maximum number of query suggestions you want to show to your users.
    */
  var MaxSuggestionsCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The text of a user's query to generate query suggestions. A query is suggested if the query prefix matches what a user starts to type as their query. Amazon Kendra does not show any suggestions if a user types fewer than two characters or more than 60 characters. A query must also have at least one search result and contain at least one word of more than four characters.
    */
  var QueryText: SuggestionQueryText
}
object GetQuerySuggestionsRequest {
  
  inline def apply(IndexId: IndexId, QueryText: SuggestionQueryText): GetQuerySuggestionsRequest = {
    val __obj = js.Dynamic.literal(IndexId = IndexId.asInstanceOf[js.Any], QueryText = QueryText.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetQuerySuggestionsRequest]
  }
  
  extension [Self <: GetQuerySuggestionsRequest](x: Self) {
    
    inline def setIndexId(value: IndexId): Self = StObject.set(x, "IndexId", value.asInstanceOf[js.Any])
    
    inline def setMaxSuggestionsCount(value: Integer): Self = StObject.set(x, "MaxSuggestionsCount", value.asInstanceOf[js.Any])
    
    inline def setMaxSuggestionsCountUndefined: Self = StObject.set(x, "MaxSuggestionsCount", js.undefined)
    
    inline def setQueryText(value: SuggestionQueryText): Self = StObject.set(x, "QueryText", value.asInstanceOf[js.Any])
  }
}
