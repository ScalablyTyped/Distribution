package typings.awsSdk.ssmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTimelineEventInput extends StObject {
  
  /**
    * A token ensuring that the operation is called only once with the specified details.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * A short description of the event.
    */
  var eventData: js.UndefOr[EventData] = js.undefined
  
  /**
    * The ID of the event you are updating. You can find this by using ListTimelineEvents.
    */
  var eventId: UUID
  
  /**
    * The time that the event occurred.
    */
  var eventTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The type of the event. You can update events of type Custom Event.
    */
  var eventType: js.UndefOr[TimelineEventType] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the incident that includes the timeline event.
    */
  var incidentRecordArn: Arn
}
object UpdateTimelineEventInput {
  
  inline def apply(eventId: UUID, incidentRecordArn: Arn): UpdateTimelineEventInput = {
    val __obj = js.Dynamic.literal(eventId = eventId.asInstanceOf[js.Any], incidentRecordArn = incidentRecordArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTimelineEventInput]
  }
  
  extension [Self <: UpdateTimelineEventInput](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setEventData(value: EventData): Self = StObject.set(x, "eventData", value.asInstanceOf[js.Any])
    
    inline def setEventDataUndefined: Self = StObject.set(x, "eventData", js.undefined)
    
    inline def setEventId(value: UUID): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    inline def setEventTime(value: js.Date): Self = StObject.set(x, "eventTime", value.asInstanceOf[js.Any])
    
    inline def setEventTimeUndefined: Self = StObject.set(x, "eventTime", js.undefined)
    
    inline def setEventType(value: TimelineEventType): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    inline def setEventTypeUndefined: Self = StObject.set(x, "eventType", js.undefined)
    
    inline def setIncidentRecordArn(value: Arn): Self = StObject.set(x, "incidentRecordArn", value.asInstanceOf[js.Any])
  }
}
