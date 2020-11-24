package typings.dashjs.mod

import typings.dashjs.dashjsStrings.capability
import typings.dashjs.dashjsStrings.error
import typings.dashjs.dashjsStrings.key_message
import typings.dashjs.dashjsStrings.key_session
import typings.dashjs.dashjsStrings.mediasource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenericErrorEvent
  extends Event
     with ErrorEvent {
  
  var error: capability | mediasource | key_session | key_message = js.native
  
  var event: String = js.native
  
  @JSName("type")
  var type_GenericErrorEvent: error = js.native
}
object GenericErrorEvent {
  
  @scala.inline
  def apply(error: capability | mediasource | key_session | key_message, event: String, `type`: error): GenericErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenericErrorEvent]
  }
  
  @scala.inline
  implicit class GenericErrorEventOps[Self <: GenericErrorEvent] (val x: Self) extends AnyVal {
    
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
    def setError(value: capability | mediasource | key_session | key_message): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: String): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: error): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
