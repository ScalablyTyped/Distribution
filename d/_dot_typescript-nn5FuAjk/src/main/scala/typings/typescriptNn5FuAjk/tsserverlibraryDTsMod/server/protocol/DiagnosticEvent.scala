package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Event message for DiagnosticEventKind event types.
  * These events provide syntactic and semantic errors for a file.
  */
trait DiagnosticEvent
  extends StObject
     with Event {
  
  @JSName("body")
  var body_DiagnosticEvent: js.UndefOr[DiagnosticEventBody] = js.undefined
  
  @JSName("event")
  var event_DiagnosticEvent: DiagnosticEventKind
}
object DiagnosticEvent {
  
  inline def apply(event: DiagnosticEventKind, seq: Double): DiagnosticEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("event")
    __obj.asInstanceOf[DiagnosticEvent]
  }
  
  extension [Self <: DiagnosticEvent](x: Self) {
    
    inline def setBody(value: DiagnosticEventBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setEvent(value: DiagnosticEventKind): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
