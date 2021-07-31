package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDeviceResponse extends StObject {
  
  /**
    * Information about the device.
    */
  var Device: js.UndefOr[typings.awsSdk.networkmanagerMod.Device] = js.undefined
}
object DeleteDeviceResponse {
  
  @scala.inline
  def apply(): DeleteDeviceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDeviceResponse]
  }
  
  @scala.inline
  implicit class DeleteDeviceResponseMutableBuilder[Self <: DeleteDeviceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevice(value: Device): Self = StObject.set(x, "Device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceUndefined: Self = StObject.set(x, "Device", js.undefined)
  }
}
