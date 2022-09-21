package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStoredQueriesRequest extends StObject {
  
  /**
    * The maximum number of results to be returned with a single call.
    */
  var MaxResults: js.UndefOr[Limit] = js.undefined
  
  /**
    * The nextToken string returned in a previous request that you use to request the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListStoredQueriesRequest {
  
  inline def apply(): ListStoredQueriesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStoredQueriesRequest]
  }
  
  extension [Self <: ListStoredQueriesRequest](x: Self) {
    
    inline def setMaxResults(value: Limit): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
