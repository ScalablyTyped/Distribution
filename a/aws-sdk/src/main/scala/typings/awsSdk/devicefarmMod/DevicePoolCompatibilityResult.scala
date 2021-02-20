package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DevicePoolCompatibilityResult extends StObject {
  
  /**
    * Whether the result was compatible with the device pool.
    */
  var compatible: js.UndefOr[Boolean] = js.native
  
  /**
    * The device (phone or tablet) to return information about.
    */
  var device: js.UndefOr[Device] = js.native
  
  /**
    * Information about the compatibility.
    */
  var incompatibilityMessages: js.UndefOr[IncompatibilityMessages] = js.native
}
object DevicePoolCompatibilityResult {
  
  @scala.inline
  def apply(): DevicePoolCompatibilityResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DevicePoolCompatibilityResult]
  }
  
  @scala.inline
  implicit class DevicePoolCompatibilityResultMutableBuilder[Self <: DevicePoolCompatibilityResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompatible(value: Boolean): Self = StObject.set(x, "compatible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompatibleUndefined: Self = StObject.set(x, "compatible", js.undefined)
    
    @scala.inline
    def setDevice(value: Device): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    @scala.inline
    def setIncompatibilityMessages(value: IncompatibilityMessages): Self = StObject.set(x, "incompatibilityMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncompatibilityMessagesUndefined: Self = StObject.set(x, "incompatibilityMessages", js.undefined)
    
    @scala.inline
    def setIncompatibilityMessagesVarargs(value: IncompatibilityMessage*): Self = StObject.set(x, "incompatibilityMessages", js.Array(value :_*))
  }
}
