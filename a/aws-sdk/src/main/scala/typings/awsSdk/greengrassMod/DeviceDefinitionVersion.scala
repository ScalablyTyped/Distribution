package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceDefinitionVersion extends StObject {
  
  /**
    * A list of devices in the definition version.
    */
  var Devices: js.UndefOr[listOfDevice] = js.native
}
object DeviceDefinitionVersion {
  
  @scala.inline
  def apply(): DeviceDefinitionVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceDefinitionVersion]
  }
  
  @scala.inline
  implicit class DeviceDefinitionVersionMutableBuilder[Self <: DeviceDefinitionVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevices(value: listOfDevice): Self = StObject.set(x, "Devices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevicesUndefined: Self = StObject.set(x, "Devices", js.undefined)
    
    @scala.inline
    def setDevicesVarargs(value: Device*): Self = StObject.set(x, "Devices", js.Array(value :_*))
  }
}
