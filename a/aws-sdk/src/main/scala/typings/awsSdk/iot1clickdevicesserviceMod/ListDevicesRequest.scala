package typings.awsSdk.iot1clickdevicesserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDevicesRequest extends StObject {
  
  /**
    * The type of the device, such as "button".
    */
  var DeviceType: js.UndefOr[string] = js.undefined
  
  /**
    * The maximum number of results to return per request. If not set, a default value of
    100 is used.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.iot1clickdevicesserviceMod.MaxResults] = js.undefined
  
  /**
    * The token to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object ListDevicesRequest {
  
  inline def apply(): ListDevicesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDevicesRequest]
  }
  
  extension [Self <: ListDevicesRequest](x: Self) {
    
    inline def setDeviceType(value: string): Self = StObject.set(x, "DeviceType", value.asInstanceOf[js.Any])
    
    inline def setDeviceTypeUndefined: Self = StObject.set(x, "DeviceType", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
