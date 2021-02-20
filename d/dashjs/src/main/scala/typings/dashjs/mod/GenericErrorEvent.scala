package typings.dashjs.mod

import typings.dashjs.dashjsStrings.capability
import typings.dashjs.dashjsStrings.error
import typings.dashjs.dashjsStrings.key_message
import typings.dashjs.dashjsStrings.key_session
import typings.dashjs.dashjsStrings.mediasource
import org.scalablytyped.runtime.StObject
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
  implicit class GenericErrorEventMutableBuilder[Self <: GenericErrorEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: capability | mediasource | key_session | key_message): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
