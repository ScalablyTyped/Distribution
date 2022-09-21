package typings.awsSdk.iotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WirelessDeviceEventLogOption extends StObject {
  
  var Event: WirelessDeviceEvent
  
  var LogLevel: typings.awsSdk.iotwirelessMod.LogLevel
}
object WirelessDeviceEventLogOption {
  
  inline def apply(Event: WirelessDeviceEvent, LogLevel: LogLevel): WirelessDeviceEventLogOption = {
    val __obj = js.Dynamic.literal(Event = Event.asInstanceOf[js.Any], LogLevel = LogLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[WirelessDeviceEventLogOption]
  }
  
  extension [Self <: WirelessDeviceEventLogOption](x: Self) {
    
    inline def setEvent(value: WirelessDeviceEvent): Self = StObject.set(x, "Event", value.asInstanceOf[js.Any])
    
    inline def setLogLevel(value: LogLevel): Self = StObject.set(x, "LogLevel", value.asInstanceOf[js.Any])
  }
}
