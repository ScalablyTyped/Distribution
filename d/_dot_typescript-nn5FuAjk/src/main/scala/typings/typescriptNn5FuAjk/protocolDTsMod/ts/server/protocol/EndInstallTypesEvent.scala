package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndInstallTypesEvent
  extends StObject
     with Event {
  
  @JSName("body")
  var body_EndInstallTypesEvent: EndInstallTypesEventBody
  
  @JSName("event")
  var event_EndInstallTypesEvent: EndInstallTypesEventName
}
object EndInstallTypesEvent {
  
  inline def apply(body: EndInstallTypesEventBody, event: EndInstallTypesEventName, seq: Double): EndInstallTypesEvent = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("event")
    __obj.asInstanceOf[EndInstallTypesEvent]
  }
  
  extension [Self <: EndInstallTypesEvent](x: Self) {
    
    inline def setBody(value: EndInstallTypesEventBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: EndInstallTypesEventName): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
