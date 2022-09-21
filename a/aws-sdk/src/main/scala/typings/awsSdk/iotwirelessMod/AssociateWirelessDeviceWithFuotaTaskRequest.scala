package typings.awsSdk.iotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateWirelessDeviceWithFuotaTaskRequest extends StObject {
  
  var Id: FuotaTaskId
  
  var WirelessDeviceId: typings.awsSdk.iotwirelessMod.WirelessDeviceId
}
object AssociateWirelessDeviceWithFuotaTaskRequest {
  
  inline def apply(Id: FuotaTaskId, WirelessDeviceId: WirelessDeviceId): AssociateWirelessDeviceWithFuotaTaskRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], WirelessDeviceId = WirelessDeviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateWirelessDeviceWithFuotaTaskRequest]
  }
  
  extension [Self <: AssociateWirelessDeviceWithFuotaTaskRequest](x: Self) {
    
    inline def setId(value: FuotaTaskId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setWirelessDeviceId(value: WirelessDeviceId): Self = StObject.set(x, "WirelessDeviceId", value.asInstanceOf[js.Any])
  }
}
