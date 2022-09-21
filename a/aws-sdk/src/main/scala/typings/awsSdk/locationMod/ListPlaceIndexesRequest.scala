package typings.awsSdk.locationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPlaceIndexesRequest extends StObject {
  
  /**
    * An optional limit for the maximum number of results returned in a single call. Default value: 100 
    */
  var MaxResults: js.UndefOr[ListPlaceIndexesRequestMaxResultsInteger] = js.undefined
  
  /**
    * The pagination token specifying which page of results to return in the response. If no token is provided, the default page is the first page. Default value: null 
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object ListPlaceIndexesRequest {
  
  inline def apply(): ListPlaceIndexesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPlaceIndexesRequest]
  }
  
  extension [Self <: ListPlaceIndexesRequest](x: Self) {
    
    inline def setMaxResults(value: ListPlaceIndexesRequestMaxResultsInteger): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
