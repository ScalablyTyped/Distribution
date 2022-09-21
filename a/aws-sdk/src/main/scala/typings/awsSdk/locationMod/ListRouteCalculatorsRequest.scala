package typings.awsSdk.locationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRouteCalculatorsRequest extends StObject {
  
  /**
    * An optional maximum number of results returned in a single call. Default Value: 100 
    */
  var MaxResults: js.UndefOr[ListRouteCalculatorsRequestMaxResultsInteger] = js.undefined
  
  /**
    * The pagination token specifying which page of results to return in the response. If no token is provided, the default page is the first page. Default Value: null 
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object ListRouteCalculatorsRequest {
  
  inline def apply(): ListRouteCalculatorsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRouteCalculatorsRequest]
  }
  
  extension [Self <: ListRouteCalculatorsRequest](x: Self) {
    
    inline def setMaxResults(value: ListRouteCalculatorsRequestMaxResultsInteger): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
