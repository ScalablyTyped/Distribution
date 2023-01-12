package typings.dashjs.mod

import typings.dashjs.dashjsStrings.log
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogEvent
  extends StObject
     with Event {
  
  var message: String
  
  @JSName("type")
  var type_LogEvent: log
}
object LogEvent {
  
  inline def apply(message: String): LogEvent = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("log")
    __obj.asInstanceOf[LogEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LogEvent] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setType(value: log): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
