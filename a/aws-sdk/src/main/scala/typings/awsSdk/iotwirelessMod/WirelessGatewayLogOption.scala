package typings.awsSdk.iotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WirelessGatewayLogOption extends StObject {
  
  var Events: js.UndefOr[WirelessGatewayEventLogOptionList] = js.undefined
  
  var LogLevel: typings.awsSdk.iotwirelessMod.LogLevel
  
  var Type: WirelessGatewayType
}
object WirelessGatewayLogOption {
  
  inline def apply(LogLevel: LogLevel, Type: WirelessGatewayType): WirelessGatewayLogOption = {
    val __obj = js.Dynamic.literal(LogLevel = LogLevel.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[WirelessGatewayLogOption]
  }
  
  extension [Self <: WirelessGatewayLogOption](x: Self) {
    
    inline def setEvents(value: WirelessGatewayEventLogOptionList): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "Events", js.undefined)
    
    inline def setEventsVarargs(value: WirelessGatewayEventLogOption*): Self = StObject.set(x, "Events", js.Array(value*))
    
    inline def setLogLevel(value: LogLevel): Self = StObject.set(x, "LogLevel", value.asInstanceOf[js.Any])
    
    inline def setType(value: WirelessGatewayType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
