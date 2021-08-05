package typings.dashjs.mod

import typings.dashjs.anon.Cc
import typings.dashjs.dashjsStrings.cc
import typings.dashjs.dashjsStrings.error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimedTextErrorEvent
  extends StObject
     with Event
     with ErrorEvent {
  
  var error: cc
  
  var event: Cc
  
  @JSName("type")
  var type_TimedTextErrorEvent: error
}
object TimedTextErrorEvent {
  
  inline def apply(event: Cc): TimedTextErrorEvent = {
    val __obj = js.Dynamic.literal(error = "cc", event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("error")
    __obj.asInstanceOf[TimedTextErrorEvent]
  }
  
  extension [Self <: TimedTextErrorEvent](x: Self) {
    
    inline def setError(value: cc): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: Cc): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setType(value: error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
