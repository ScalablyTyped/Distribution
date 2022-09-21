package typings.awsSdk.greengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoreDevice extends StObject {
  
  /**
    * The name of the core device. This is also the name of the IoT thing.
    */
  var coreDeviceThingName: js.UndefOr[CoreDeviceThingName] = js.undefined
  
  /**
    * The time at which the core device's status last updated, expressed in ISO 8601 format.
    */
  var lastStatusUpdateTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The status of the core device. Core devices can have the following statuses:    HEALTHY – The IoT Greengrass Core software and all components run on the core device without issue.    UNHEALTHY – The IoT Greengrass Core software or a component is in a failed state on the core device.  
    */
  var status: js.UndefOr[CoreDeviceStatus] = js.undefined
}
object CoreDevice {
  
  inline def apply(): CoreDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoreDevice]
  }
  
  extension [Self <: CoreDevice](x: Self) {
    
    inline def setCoreDeviceThingName(value: CoreDeviceThingName): Self = StObject.set(x, "coreDeviceThingName", value.asInstanceOf[js.Any])
    
    inline def setCoreDeviceThingNameUndefined: Self = StObject.set(x, "coreDeviceThingName", js.undefined)
    
    inline def setLastStatusUpdateTimestamp(value: js.Date): Self = StObject.set(x, "lastStatusUpdateTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastStatusUpdateTimestampUndefined: Self = StObject.set(x, "lastStatusUpdateTimestamp", js.undefined)
    
    inline def setStatus(value: CoreDeviceStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
