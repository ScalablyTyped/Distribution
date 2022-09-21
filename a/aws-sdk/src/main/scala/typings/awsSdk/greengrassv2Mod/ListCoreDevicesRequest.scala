package typings.awsSdk.greengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCoreDevicesRequest extends StObject {
  
  /**
    * The maximum number of results to be returned per paginated request.
    */
  var maxResults: js.UndefOr[DefaultMaxResults] = js.undefined
  
  /**
    * The token to be used for the next set of paginated results.
    */
  var nextToken: js.UndefOr[NextTokenString] = js.undefined
  
  /**
    * The core device status by which to filter. If you specify this parameter, the list includes only core devices that have this status. Choose one of the following options:    HEALTHY – The IoT Greengrass Core software and all components run on the core device without issue.    UNHEALTHY – The IoT Greengrass Core software or a component is in a failed state on the core device.  
    */
  var status: js.UndefOr[CoreDeviceStatus] = js.undefined
  
  /**
    * The ARN of the IoT thing group by which to filter. If you specify this parameter, the list includes only core devices that have successfully deployed a deployment that targets the thing group. When you remove a core device from a thing group, the list continues to include that core device.
    */
  var thingGroupArn: js.UndefOr[ThingGroupARN] = js.undefined
}
object ListCoreDevicesRequest {
  
  inline def apply(): ListCoreDevicesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCoreDevicesRequest]
  }
  
  extension [Self <: ListCoreDevicesRequest](x: Self) {
    
    inline def setMaxResults(value: DefaultMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextTokenString): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setStatus(value: CoreDeviceStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setThingGroupArn(value: ThingGroupARN): Self = StObject.set(x, "thingGroupArn", value.asInstanceOf[js.Any])
    
    inline def setThingGroupArnUndefined: Self = StObject.set(x, "thingGroupArn", js.undefined)
  }
}
