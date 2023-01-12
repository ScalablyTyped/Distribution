package typings.dashjs.mod

import typings.dashjs.dashjsStrings.capability
import typings.dashjs.dashjsStrings.error
import typings.dashjs.dashjsStrings.key_message
import typings.dashjs.dashjsStrings.key_session
import typings.dashjs.dashjsStrings.mediasource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenericErrorEvent
  extends StObject
     with Event
     with ErrorEvent {
  
  var error: capability | mediasource | key_session | key_message
  
  var event: String
  
  @JSName("type")
  var type_GenericErrorEvent: error
}
object GenericErrorEvent {
  
  inline def apply(error: capability | mediasource | key_session | key_message, event: String): GenericErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("error")
    __obj.asInstanceOf[GenericErrorEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GenericErrorEvent] (val x: Self) extends AnyVal {
    
    inline def setError(value: capability | mediasource | key_session | key_message): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setType(value: error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
