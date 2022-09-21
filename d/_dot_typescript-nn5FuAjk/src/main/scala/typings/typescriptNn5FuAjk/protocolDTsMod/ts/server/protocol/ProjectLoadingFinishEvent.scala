package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectLoadingFinishEvent
  extends StObject
     with Event {
  
  @JSName("body")
  var body_ProjectLoadingFinishEvent: ProjectLoadingFinishEventBody
  
  @JSName("event")
  var event_ProjectLoadingFinishEvent: ProjectLoadingFinishEventName
}
object ProjectLoadingFinishEvent {
  
  inline def apply(body: ProjectLoadingFinishEventBody, event: ProjectLoadingFinishEventName, seq: Double): ProjectLoadingFinishEvent = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("event")
    __obj.asInstanceOf[ProjectLoadingFinishEvent]
  }
  
  extension [Self <: ProjectLoadingFinishEvent](x: Self) {
    
    inline def setBody(value: ProjectLoadingFinishEventBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: ProjectLoadingFinishEventName): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
