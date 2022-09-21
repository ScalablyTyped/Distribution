package typings.awsSdk.ssmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventSummary extends StObject {
  
  /**
    * The timeline event ID.
    */
  var eventId: UUID
  
  /**
    * The time that the event occurred.
    */
  var eventTime: js.Date
  
  /**
    * The type of event. The timeline event must be Custom Event.
    */
  var eventType: TimelineEventType
  
  /**
    * The time that the timeline event was last updated.
    */
  var eventUpdatedTime: js.Date
  
  /**
    * The Amazon Resource Name (ARN) of the incident that the event happened during.
    */
  var incidentRecordArn: Arn
}
object EventSummary {
  
  inline def apply(
    eventId: UUID,
    eventTime: js.Date,
    eventType: TimelineEventType,
    eventUpdatedTime: js.Date,
    incidentRecordArn: Arn
  ): EventSummary = {
    val __obj = js.Dynamic.literal(eventId = eventId.asInstanceOf[js.Any], eventTime = eventTime.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], eventUpdatedTime = eventUpdatedTime.asInstanceOf[js.Any], incidentRecordArn = incidentRecordArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventSummary]
  }
  
  extension [Self <: EventSummary](x: Self) {
    
    inline def setEventId(value: UUID): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    inline def setEventTime(value: js.Date): Self = StObject.set(x, "eventTime", value.asInstanceOf[js.Any])
    
    inline def setEventType(value: TimelineEventType): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    inline def setEventUpdatedTime(value: js.Date): Self = StObject.set(x, "eventUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setIncidentRecordArn(value: Arn): Self = StObject.set(x, "incidentRecordArn", value.asInstanceOf[js.Any])
  }
}
