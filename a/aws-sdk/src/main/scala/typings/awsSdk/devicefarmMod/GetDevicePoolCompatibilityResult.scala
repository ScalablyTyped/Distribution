package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDevicePoolCompatibilityResult extends StObject {
  
  /**
    * Information about compatible devices.
    */
  var compatibleDevices: js.UndefOr[DevicePoolCompatibilityResults] = js.native
  
  /**
    * Information about incompatible devices.
    */
  var incompatibleDevices: js.UndefOr[DevicePoolCompatibilityResults] = js.native
}
object GetDevicePoolCompatibilityResult {
  
  @scala.inline
  def apply(): GetDevicePoolCompatibilityResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDevicePoolCompatibilityResult]
  }
  
  @scala.inline
  implicit class GetDevicePoolCompatibilityResultMutableBuilder[Self <: GetDevicePoolCompatibilityResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompatibleDevices(value: DevicePoolCompatibilityResults): Self = StObject.set(x, "compatibleDevices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompatibleDevicesUndefined: Self = StObject.set(x, "compatibleDevices", js.undefined)
    
    @scala.inline
    def setCompatibleDevicesVarargs(value: DevicePoolCompatibilityResult*): Self = StObject.set(x, "compatibleDevices", js.Array(value :_*))
    
    @scala.inline
    def setIncompatibleDevices(value: DevicePoolCompatibilityResults): Self = StObject.set(x, "incompatibleDevices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncompatibleDevicesUndefined: Self = StObject.set(x, "incompatibleDevices", js.undefined)
    
    @scala.inline
    def setIncompatibleDevicesVarargs(value: DevicePoolCompatibilityResult*): Self = StObject.set(x, "incompatibleDevices", js.Array(value :_*))
  }
}
