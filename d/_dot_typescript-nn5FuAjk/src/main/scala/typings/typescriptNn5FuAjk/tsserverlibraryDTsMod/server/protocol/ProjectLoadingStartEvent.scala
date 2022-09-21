package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectLoadingStartEvent
  extends StObject
     with Event {
  
  @JSName("body")
  var body_ProjectLoadingStartEvent: ProjectLoadingStartEventBody
  
  @JSName("event")
  var event_ProjectLoadingStartEvent: ProjectLoadingStartEventName
}
object ProjectLoadingStartEvent {
  
  inline def apply(body: ProjectLoadingStartEventBody, event: ProjectLoadingStartEventName, seq: Double): ProjectLoadingStartEvent = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("event")
    __obj.asInstanceOf[ProjectLoadingStartEvent]
  }
  
  extension [Self <: ProjectLoadingStartEvent](x: Self) {
    
    inline def setBody(value: ProjectLoadingStartEventBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: ProjectLoadingStartEventName): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
