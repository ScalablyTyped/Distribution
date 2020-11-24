package typings.dashjs.mod

import typings.dashjs.anon.Cc
import typings.dashjs.dashjsStrings.cc
import typings.dashjs.dashjsStrings.error
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
  implicit class TimedTextErrorEventOps[Self <: TimedTextErrorEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setError(value: cc): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: Cc): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: error): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
