package typings.awsSdk.greengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListClientDevicesAssociatedWithCoreDeviceRequest extends StObject {
  
  /**
    * The name of the core device. This is also the name of the IoT thing.
    */
  var coreDeviceThingName: IoTThingName
  
  /**
    * The maximum number of results to be returned per paginated request.
    */
  var maxResults: js.UndefOr[DefaultMaxResults] = js.undefined
  
  /**
    * The token to be used for the next set of paginated results.
    */
  var nextToken: js.UndefOr[NextTokenString] = js.undefined
}
object ListClientDevicesAssociatedWithCoreDeviceRequest {
  
  inline def apply(coreDeviceThingName: IoTThingName): ListClientDevicesAssociatedWithCoreDeviceRequest = {
    val __obj = js.Dynamic.literal(coreDeviceThingName = coreDeviceThingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListClientDevicesAssociatedWithCoreDeviceRequest]
  }
  
  extension [Self <: ListClientDevicesAssociatedWithCoreDeviceRequest](x: Self) {
    
    inline def setCoreDeviceThingName(value: IoTThingName): Self = StObject.set(x, "coreDeviceThingName", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: DefaultMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextTokenString): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
