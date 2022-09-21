package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectsUpdatedInBackgroundEvent
  extends StObject
     with Event {
  
  @JSName("body")
  var body_ProjectsUpdatedInBackgroundEvent: ProjectsUpdatedInBackgroundEventBody
  
  @JSName("event")
  var event_ProjectsUpdatedInBackgroundEvent: ProjectsUpdatedInBackgroundEventName
}
object ProjectsUpdatedInBackgroundEvent {
  
  inline def apply(
    body: ProjectsUpdatedInBackgroundEventBody,
    event: ProjectsUpdatedInBackgroundEventName,
    seq: Double
  ): ProjectsUpdatedInBackgroundEvent = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("event")
    __obj.asInstanceOf[ProjectsUpdatedInBackgroundEvent]
  }
  
  extension [Self <: ProjectsUpdatedInBackgroundEvent](x: Self) {
    
    inline def setBody(value: ProjectsUpdatedInBackgroundEventBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: ProjectsUpdatedInBackgroundEventName): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
