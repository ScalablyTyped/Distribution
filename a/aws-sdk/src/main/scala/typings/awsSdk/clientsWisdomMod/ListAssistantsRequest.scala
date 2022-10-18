package typings.awsSdk.clientsWisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAssistantsRequest extends StObject {
  
  /**
    * The maximum number of results to return per page.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListAssistantsRequest {
  
  inline def apply(): ListAssistantsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAssistantsRequest]
  }
  
  extension [Self <: ListAssistantsRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
