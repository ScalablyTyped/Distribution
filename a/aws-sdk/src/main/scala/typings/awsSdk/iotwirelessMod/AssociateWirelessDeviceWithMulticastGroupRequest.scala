package typings.awsSdk.iotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateWirelessDeviceWithMulticastGroupRequest extends StObject {
  
  var Id: MulticastGroupId
  
  var WirelessDeviceId: typings.awsSdk.iotwirelessMod.WirelessDeviceId
}
object AssociateWirelessDeviceWithMulticastGroupRequest {
  
  inline def apply(Id: MulticastGroupId, WirelessDeviceId: WirelessDeviceId): AssociateWirelessDeviceWithMulticastGroupRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], WirelessDeviceId = WirelessDeviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateWirelessDeviceWithMulticastGroupRequest]
  }
  
  extension [Self <: AssociateWirelessDeviceWithMulticastGroupRequest](x: Self) {
    
    inline def setId(value: MulticastGroupId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setWirelessDeviceId(value: WirelessDeviceId): Self = StObject.set(x, "WirelessDeviceId", value.asInstanceOf[js.Any])
  }
}
