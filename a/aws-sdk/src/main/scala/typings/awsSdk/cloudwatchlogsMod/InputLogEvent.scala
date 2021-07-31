package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputLogEvent extends StObject {
  
  /**
    * The raw event message.
    */
  var message: EventMessage
  
  /**
    * The time the event occurred, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
    */
  var timestamp: Timestamp
}
object InputLogEvent {
  
  @scala.inline
  def apply(message: EventMessage, timestamp: Timestamp): InputLogEvent = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputLogEvent]
  }
  
  @scala.inline
  implicit class InputLogEventMutableBuilder[Self <: InputLogEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: EventMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Timestamp): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
