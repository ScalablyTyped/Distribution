package typings.dashjs.mod

import typings.dashjs.dashjsStrings.log
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogEvent extends Event {
  
  var message: String = js.native
  
  @JSName("type")
  var type_LogEvent: log = js.native
}
object LogEvent {
  
  @scala.inline
  def apply(message: String, `type`: log): LogEvent = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEvent]
  }
  
  @scala.inline
  implicit class LogEventMutableBuilder[Self <: LogEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: log): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
