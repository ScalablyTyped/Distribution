package typings.awsSdk.iotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkInterface extends StObject {
  
  /**
    * Information about a network interface specified by the Controller Area Network (CAN) protocol.
    */
  var canInterface: js.UndefOr[CanInterface] = js.undefined
  
  /**
    * The ID of the network interface.
    */
  var interfaceId: InterfaceId
  
  /**
    * Information about a network interface specified by the On-board diagnostic (OBD) II protocol.
    */
  var obdInterface: js.UndefOr[ObdInterface] = js.undefined
  
  /**
    * The network protocol for the vehicle. For example, CAN_SIGNAL specifies a protocol that defines how data is communicated between electronic control units (ECUs). OBD_SIGNAL specifies a protocol that defines how self-diagnostic data is communicated between ECUs.
    */
  var `type`: NetworkInterfaceType
}
object NetworkInterface {
  
  inline def apply(interfaceId: InterfaceId, `type`: NetworkInterfaceType): NetworkInterface = {
    val __obj = js.Dynamic.literal(interfaceId = interfaceId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkInterface]
  }
  
  extension [Self <: NetworkInterface](x: Self) {
    
    inline def setCanInterface(value: CanInterface): Self = StObject.set(x, "canInterface", value.asInstanceOf[js.Any])
    
    inline def setCanInterfaceUndefined: Self = StObject.set(x, "canInterface", js.undefined)
    
    inline def setInterfaceId(value: InterfaceId): Self = StObject.set(x, "interfaceId", value.asInstanceOf[js.Any])
    
    inline def setObdInterface(value: ObdInterface): Self = StObject.set(x, "obdInterface", value.asInstanceOf[js.Any])
    
    inline def setObdInterfaceUndefined: Self = StObject.set(x, "obdInterface", js.undefined)
    
    inline def setType(value: NetworkInterfaceType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
