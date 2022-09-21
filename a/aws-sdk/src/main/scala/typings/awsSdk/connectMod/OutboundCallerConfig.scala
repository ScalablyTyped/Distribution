package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutboundCallerConfig extends StObject {
  
  /**
    * The caller ID name.
    */
  var OutboundCallerIdName: js.UndefOr[typings.awsSdk.connectMod.OutboundCallerIdName] = js.undefined
  
  /**
    * The caller ID number.
    */
  var OutboundCallerIdNumberId: js.UndefOr[PhoneNumberId] = js.undefined
  
  /**
    * The outbound whisper flow to be used during an outbound call.
    */
  var OutboundFlowId: js.UndefOr[ContactFlowId] = js.undefined
}
object OutboundCallerConfig {
  
  inline def apply(): OutboundCallerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutboundCallerConfig]
  }
  
  extension [Self <: OutboundCallerConfig](x: Self) {
    
    inline def setOutboundCallerIdName(value: OutboundCallerIdName): Self = StObject.set(x, "OutboundCallerIdName", value.asInstanceOf[js.Any])
    
    inline def setOutboundCallerIdNameUndefined: Self = StObject.set(x, "OutboundCallerIdName", js.undefined)
    
    inline def setOutboundCallerIdNumberId(value: PhoneNumberId): Self = StObject.set(x, "OutboundCallerIdNumberId", value.asInstanceOf[js.Any])
    
    inline def setOutboundCallerIdNumberIdUndefined: Self = StObject.set(x, "OutboundCallerIdNumberId", js.undefined)
    
    inline def setOutboundFlowId(value: ContactFlowId): Self = StObject.set(x, "OutboundFlowId", value.asInstanceOf[js.Any])
    
    inline def setOutboundFlowIdUndefined: Self = StObject.set(x, "OutboundFlowId", js.undefined)
  }
}
