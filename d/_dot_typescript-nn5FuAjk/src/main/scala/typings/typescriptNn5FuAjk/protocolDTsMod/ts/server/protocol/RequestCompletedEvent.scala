package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Event that is sent when server have finished processing request with specified id.
  */
trait RequestCompletedEvent
  extends StObject
     with Event {
  
  @JSName("body")
  var body_RequestCompletedEvent: RequestCompletedEventBody
  
  @JSName("event")
  var event_RequestCompletedEvent: RequestCompletedEventName
}
object RequestCompletedEvent {
  
  inline def apply(body: RequestCompletedEventBody, event: RequestCompletedEventName, seq: Double): RequestCompletedEvent = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("event")
    __obj.asInstanceOf[RequestCompletedEvent]
  }
  
  extension [Self <: RequestCompletedEvent](x: Self) {
    
    inline def setBody(value: RequestCompletedEventBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: RequestCompletedEventName): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
