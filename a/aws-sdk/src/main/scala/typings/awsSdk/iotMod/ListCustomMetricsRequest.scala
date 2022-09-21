package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCustomMetricsRequest extends StObject {
  
  /**
    *  The maximum number of results to return at one time. The default is 25. 
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    *  The token for the next set of results. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListCustomMetricsRequest {
  
  inline def apply(): ListCustomMetricsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCustomMetricsRequest]
  }
  
  extension [Self <: ListCustomMetricsRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
