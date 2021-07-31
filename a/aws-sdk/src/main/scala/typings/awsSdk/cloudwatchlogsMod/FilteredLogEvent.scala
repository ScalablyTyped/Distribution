package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilteredLogEvent extends StObject {
  
  /**
    * The ID of the event.
    */
  var eventId: js.UndefOr[EventId] = js.undefined
  
  /**
    * The time the event was ingested, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
    */
  var ingestionTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The name of the log stream to which this event belongs.
    */
  var logStreamName: js.UndefOr[LogStreamName] = js.undefined
  
  /**
    * The data contained in the log event.
    */
  var message: js.UndefOr[EventMessage] = js.undefined
  
  /**
    * The time the event occurred, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
    */
  var timestamp: js.UndefOr[Timestamp] = js.undefined
}
object FilteredLogEvent {
  
  @scala.inline
  def apply(): FilteredLogEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilteredLogEvent]
  }
  
  @scala.inline
  implicit class FilteredLogEventMutableBuilder[Self <: FilteredLogEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventId(value: EventId): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventIdUndefined: Self = StObject.set(x, "eventId", js.undefined)
    
    @scala.inline
    def setIngestionTime(value: Timestamp): Self = StObject.set(x, "ingestionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIngestionTimeUndefined: Self = StObject.set(x, "ingestionTime", js.undefined)
    
    @scala.inline
    def setLogStreamName(value: LogStreamName): Self = StObject.set(x, "logStreamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogStreamNameUndefined: Self = StObject.set(x, "logStreamName", js.undefined)
    
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
