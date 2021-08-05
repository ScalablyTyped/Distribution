package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEndpointsRequest extends StObject {
  
  /**
    * Optional. Max number of endpoints, up to twenty, that will be returned at one time.
    */
  var MaxResults: js.UndefOr[integer] = js.undefined
  
  /**
    * Optional field, defaults to DEFAULT. Specify DEFAULT for this operation to return your endpoints if any exist, or to create an endpoint for you and return it if one doesn't already exist. Specify GET_ONLY to return your endpoints if any exist, or an empty list if none exist.
    */
  var Mode: js.UndefOr[DescribeEndpointsMode] = js.undefined
  
  /**
    * Use this string, provided with the response to a previous request, to request the next batch of endpoints.
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object DescribeEndpointsRequest {
  
  inline def apply(): DescribeEndpointsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEndpointsRequest]
  }
  
  extension [Self <: DescribeEndpointsRequest](x: Self) {
    
    inline def setMaxResults(value: integer): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setMode(value: DescribeEndpointsMode): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "Mode", js.undefined)
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
