package typings.dashjs.mod

import typings.dashjs.anon.Cc
import typings.dashjs.dashjsStrings.cc
import typings.dashjs.dashjsStrings.error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimedTextErrorEvent
  extends Event
     with ErrorEvent {
  
  var error: cc = js.native
  
  var event: Cc = js.native
  
  @JSName("type")
  var type_TimedTextErrorEvent: error = js.native
}
object TimedTextErrorEvent {
  
  @scala.inline
  def apply(error: cc, event: Cc, `type`: error): TimedTextErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimedTextErrorEvent]
  }
  
  @scala.inline
  implicit class TimedTextErrorEventMutableBuilder[Self <: TimedTextErrorEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: cc): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: Cc): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
