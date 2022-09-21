package typings.awsSdk.greengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCoreDeviceRequest extends StObject {
  
  /**
    * The name of the core device. This is also the name of the IoT thing.
    */
  var coreDeviceThingName: CoreDeviceThingName
}
object DeleteCoreDeviceRequest {
  
  inline def apply(coreDeviceThingName: CoreDeviceThingName): DeleteCoreDeviceRequest = {
    val __obj = js.Dynamic.literal(coreDeviceThingName = coreDeviceThingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCoreDeviceRequest]
  }
  
  extension [Self <: DeleteCoreDeviceRequest](x: Self) {
    
    inline def setCoreDeviceThingName(value: CoreDeviceThingName): Self = StObject.set(x, "coreDeviceThingName", value.asInstanceOf[js.Any])
  }
}
