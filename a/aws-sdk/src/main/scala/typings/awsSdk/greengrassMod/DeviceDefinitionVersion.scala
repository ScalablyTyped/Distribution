package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceDefinitionVersion extends StObject {
  
  /**
    * A list of devices in the definition version.
    */
  var Devices: js.UndefOr[listOfDevice] = js.undefined
}
object DeviceDefinitionVersion {
  
  inline def apply(): DeviceDefinitionVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceDefinitionVersion]
  }
  
  extension [Self <: DeviceDefinitionVersion](x: Self) {
    
    inline def setDevices(value: listOfDevice): Self = StObject.set(x, "Devices", value.asInstanceOf[js.Any])
    
    inline def setDevicesUndefined: Self = StObject.set(x, "Devices", js.undefined)
    
    inline def setDevicesVarargs(value: Device*): Self = StObject.set(x, "Devices", js.Array(value :_*))
  }
}
