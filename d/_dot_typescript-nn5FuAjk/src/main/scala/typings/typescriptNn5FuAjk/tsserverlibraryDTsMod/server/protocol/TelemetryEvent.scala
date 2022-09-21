package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TelemetryEvent
  extends StObject
     with Event {
  
  @JSName("body")
  var body_TelemetryEvent: TelemetryEventBody
  
  @JSName("event")
  var event_TelemetryEvent: TelemetryEventName
}
object TelemetryEvent {
  
  inline def apply(body: TelemetryEventBody, event: TelemetryEventName, seq: Double): TelemetryEvent = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("event")
    __obj.asInstanceOf[TelemetryEvent]
  }
  
  extension [Self <: TelemetryEvent](x: Self) {
    
    inline def setBody(value: TelemetryEventBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: TelemetryEventName): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
