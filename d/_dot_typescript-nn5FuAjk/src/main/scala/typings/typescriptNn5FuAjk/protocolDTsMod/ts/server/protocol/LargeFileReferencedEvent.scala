package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LargeFileReferencedEvent
  extends StObject
     with Event {
  
  @JSName("body")
  var body_LargeFileReferencedEvent: LargeFileReferencedEventBody
  
  @JSName("event")
  var event_LargeFileReferencedEvent: LargeFileReferencedEventName
}
object LargeFileReferencedEvent {
  
  inline def apply(body: LargeFileReferencedEventBody, event: LargeFileReferencedEventName, seq: Double): LargeFileReferencedEvent = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("event")
    __obj.asInstanceOf[LargeFileReferencedEvent]
  }
  
  extension [Self <: LargeFileReferencedEvent](x: Self) {
    
    inline def setBody(value: LargeFileReferencedEventBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: LargeFileReferencedEventName): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
