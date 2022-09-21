package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BeginInstallTypesEvent
  extends StObject
     with Event {
  
  @JSName("body")
  var body_BeginInstallTypesEvent: BeginInstallTypesEventBody
  
  @JSName("event")
  var event_BeginInstallTypesEvent: BeginInstallTypesEventName
}
object BeginInstallTypesEvent {
  
  inline def apply(body: BeginInstallTypesEventBody, event: BeginInstallTypesEventName, seq: Double): BeginInstallTypesEvent = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("event")
    __obj.asInstanceOf[BeginInstallTypesEvent]
  }
  
  extension [Self <: BeginInstallTypesEvent](x: Self) {
    
    inline def setBody(value: BeginInstallTypesEventBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: BeginInstallTypesEventName): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
