package typings.awsSdk.clientsWisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchContentResponse extends StObject {
  
  /**
    * Summary information about the content.
    */
  var contentSummaries: ContentSummaryList
  
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object SearchContentResponse {
  
  inline def apply(contentSummaries: ContentSummaryList): SearchContentResponse = {
    val __obj = js.Dynamic.literal(contentSummaries = contentSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchContentResponse]
  }
  
  extension [Self <: SearchContentResponse](x: Self) {
    
    inline def setContentSummaries(value: ContentSummaryList): Self = StObject.set(x, "contentSummaries", value.asInstanceOf[js.Any])
    
    inline def setContentSummariesVarargs(value: ContentSummary*): Self = StObject.set(x, "contentSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
