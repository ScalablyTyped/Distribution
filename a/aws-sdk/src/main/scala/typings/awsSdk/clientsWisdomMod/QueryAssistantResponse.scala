package typings.awsSdk.clientsWisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryAssistantResponse extends StObject {
  
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The results of the query.
    */
  var results: QueryResultsList
}
object QueryAssistantResponse {
  
  inline def apply(results: QueryResultsList): QueryAssistantResponse = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryAssistantResponse]
  }
  
  extension [Self <: QueryAssistantResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setResults(value: QueryResultsList): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsVarargs(value: ResultData*): Self = StObject.set(x, "results", js.Array(value*))
  }
}
