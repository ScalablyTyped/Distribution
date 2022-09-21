package typings.awsSdk.iotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WirelessGatewayEventLogOption extends StObject {
  
  var Event: WirelessGatewayEvent
  
  var LogLevel: typings.awsSdk.iotwirelessMod.LogLevel
}
object WirelessGatewayEventLogOption {
  
  inline def apply(Event: WirelessGatewayEvent, LogLevel: LogLevel): WirelessGatewayEventLogOption = {
    val __obj = js.Dynamic.literal(Event = Event.asInstanceOf[js.Any], LogLevel = LogLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[WirelessGatewayEventLogOption]
  }
  
  extension [Self <: WirelessGatewayEventLogOption](x: Self) {
    
    inline def setEvent(value: WirelessGatewayEvent): Self = StObject.set(x, "Event", value.asInstanceOf[js.Any])
    
    inline def setLogLevel(value: LogLevel): Self = StObject.set(x, "LogLevel", value.asInstanceOf[js.Any])
  }
}
