package typings.awsSdk.iotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateWirelessDeviceWithThingRequest extends StObject {
  
  /**
    * The ID of the resource to update.
    */
  var Id: WirelessDeviceId
  
  /**
    * The ARN of the thing to associate with the wireless device.
    */
  var ThingArn: typings.awsSdk.iotwirelessMod.ThingArn
}
object AssociateWirelessDeviceWithThingRequest {
  
  inline def apply(Id: WirelessDeviceId, ThingArn: ThingArn): AssociateWirelessDeviceWithThingRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], ThingArn = ThingArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateWirelessDeviceWithThingRequest]
  }
  
  extension [Self <: AssociateWirelessDeviceWithThingRequest](x: Self) {
    
    inline def setId(value: WirelessDeviceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setThingArn(value: ThingArn): Self = StObject.set(x, "ThingArn", value.asInstanceOf[js.Any])
  }
}
