package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutputLogEvent extends StObject {
  
  /**
    * The time the event was ingested, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
    */
  var ingestionTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The data contained in the log event.
    */
  var message: js.UndefOr[EventMessage] = js.native
  
  /**
    * The time the event occurred, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
    */
  var timestamp: js.UndefOr[Timestamp] = js.native
}
object OutputLogEvent {
  
  @scala.inline
  def apply(): OutputLogEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputLogEvent]
  }
  
  @scala.inline
  implicit class OutputLogEventMutableBuilder[Self <: OutputLogEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIngestionTime(value: Timestamp): Self = StObject.set(x, "ingestionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIngestionTimeUndefined: Self = StObject.set(x, "ingestionTime", js.undefined)
    
    @scala.inline
    def setMessage(value: EventMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setTimestamp(value: Timestamp): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
