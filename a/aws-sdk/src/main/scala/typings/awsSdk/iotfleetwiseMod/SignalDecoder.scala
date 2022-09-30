package typings.awsSdk.iotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignalDecoder extends StObject {
  
  /**
    * Information about signal decoder using the Controller Area Network (CAN) protocol.
    */
  var canSignal: js.UndefOr[CanSignal] = js.undefined
  
  /**
    * The fully qualified name of a signal decoder as defined in a vehicle model.
    */
  var fullyQualifiedName: FullyQualifiedName
  
  /**
    * The ID of a network interface that specifies what network protocol a vehicle follows.
    */
  var interfaceId: InterfaceId
  
  /**
    * Information about signal decoder using the On-board diagnostic (OBD) II protocol.
    */
  var obdSignal: js.UndefOr[ObdSignal] = js.undefined
  
  /**
    * The network protocol for the vehicle. For example, CAN_SIGNAL specifies a protocol that defines how data is communicated between electronic control units (ECUs). OBD_SIGNAL specifies a protocol that defines how self-diagnostic data is communicated between ECUs.
    */
  var `type`: SignalDecoderType
}
object SignalDecoder {
  
  inline def apply(fullyQualifiedName: FullyQualifiedName, interfaceId: InterfaceId, `type`: SignalDecoderType): SignalDecoder = {
    val __obj = js.Dynamic.literal(fullyQualifiedName = fullyQualifiedName.asInstanceOf[js.Any], interfaceId = interfaceId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignalDecoder]
  }
  
  extension [Self <: SignalDecoder](x: Self) {
    
    inline def setCanSignal(value: CanSignal): Self = StObject.set(x, "canSignal", value.asInstanceOf[js.Any])
    
    inline def setCanSignalUndefined: Self = StObject.set(x, "canSignal", js.undefined)
    
    inline def setFullyQualifiedName(value: FullyQualifiedName): Self = StObject.set(x, "fullyQualifiedName", value.asInstanceOf[js.Any])
    
    inline def setInterfaceId(value: InterfaceId): Self = StObject.set(x, "interfaceId", value.asInstanceOf[js.Any])
    
    inline def setObdSignal(value: ObdSignal): Self = StObject.set(x, "obdSignal", value.asInstanceOf[js.Any])
    
    inline def setObdSignalUndefined: Self = StObject.set(x, "obdSignal", js.undefined)
    
    inline def setType(value: SignalDecoderType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
