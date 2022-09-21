package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectLanguageServiceStateEvent
  extends StObject
     with Event {
  
  @JSName("body")
  var body_ProjectLanguageServiceStateEvent: js.UndefOr[ProjectLanguageServiceStateEventBody] = js.undefined
  
  @JSName("event")
  var event_ProjectLanguageServiceStateEvent: ProjectLanguageServiceStateEventName
}
object ProjectLanguageServiceStateEvent {
  
  inline def apply(event: ProjectLanguageServiceStateEventName, seq: Double): ProjectLanguageServiceStateEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("event")
    __obj.asInstanceOf[ProjectLanguageServiceStateEvent]
  }
  
  extension [Self <: ProjectLanguageServiceStateEvent](x: Self) {
    
    inline def setBody(value: ProjectLanguageServiceStateEventBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setEvent(value: ProjectLanguageServiceStateEventName): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
