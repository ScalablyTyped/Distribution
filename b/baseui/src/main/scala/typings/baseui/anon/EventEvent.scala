package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventEvent extends StObject {
  
  var date: typings.std.Date = js.native
  
  var event: typings.std.Event = js.native
}
object EventEvent {
  
  @scala.inline
  def apply(date: typings.std.Date, event: typings.std.Event): EventEvent = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventEvent]
  }
  
  @scala.inline
  implicit class EventEventMutableBuilder[Self <: EventEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: typings.std.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: typings.std.Event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
