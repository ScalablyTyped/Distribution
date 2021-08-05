package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDeviceInstancesRequest extends StObject {
  
  /**
    * An integer that specifies the maximum number of items you want to return in the API response.
    */
  var maxResults: js.UndefOr[Integer] = js.undefined
  
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListDeviceInstancesRequest {
  
  inline def apply(): ListDeviceInstancesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDeviceInstancesRequest]
  }
  
  extension [Self <: ListDeviceInstancesRequest](x: Self) {
    
    inline def setMaxResults(value: Integer): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
