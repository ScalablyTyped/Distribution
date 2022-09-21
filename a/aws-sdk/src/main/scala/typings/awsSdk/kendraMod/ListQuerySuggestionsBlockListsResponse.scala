package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListQuerySuggestionsBlockListsResponse extends StObject {
  
  /**
    * Summary items for a block list. This includes summary items on the block list ID, block list name, when the block list was created, when the block list was last updated, and the count of block words/phrases in the block list. For information on the current quota limits for block lists, see Quotas for Amazon Kendra.
    */
  var BlockListSummaryItems: js.UndefOr[QuerySuggestionsBlockListSummaryItems] = js.undefined
  
  /**
    * If the response is truncated, Amazon Kendra returns this token that you can use in the subsequent request to retrieve the next set of block lists.
    */
  var NextToken: js.UndefOr[typings.awsSdk.kendraMod.NextToken] = js.undefined
}
object ListQuerySuggestionsBlockListsResponse {
  
  inline def apply(): ListQuerySuggestionsBlockListsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListQuerySuggestionsBlockListsResponse]
  }
  
  extension [Self <: ListQuerySuggestionsBlockListsResponse](x: Self) {
    
    inline def setBlockListSummaryItems(value: QuerySuggestionsBlockListSummaryItems): Self = StObject.set(x, "BlockListSummaryItems", value.asInstanceOf[js.Any])
    
    inline def setBlockListSummaryItemsUndefined: Self = StObject.set(x, "BlockListSummaryItems", js.undefined)
    
    inline def setBlockListSummaryItemsVarargs(value: QuerySuggestionsBlockListSummary*): Self = StObject.set(x, "BlockListSummaryItems", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
