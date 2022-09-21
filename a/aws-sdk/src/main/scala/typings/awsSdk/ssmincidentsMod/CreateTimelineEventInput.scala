package typings.awsSdk.ssmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTimelineEventInput extends StObject {
  
  /**
    * A token ensuring that the action is called only once with the specified details.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * A short description of the event.
    */
  var eventData: EventData
  
  /**
    * The time that the event occurred.
    */
  var eventTime: js.Date
  
  /**
    * The type of the event. You can create timeline events of type Custom Event.
    */
  var eventType: TimelineEventType
  
  /**
    * The Amazon Resource Name (ARN) of the incident record to which the event will be added.
    */
  var incidentRecordArn: Arn
}
object CreateTimelineEventInput {
  
  inline def apply(eventData: EventData, eventTime: js.Date, eventType: TimelineEventType, incidentRecordArn: Arn): CreateTimelineEventInput = {
    val __obj = js.Dynamic.literal(eventData = eventData.asInstanceOf[js.Any], eventTime = eventTime.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], incidentRecordArn = incidentRecordArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTimelineEventInput]
  }
  
  extension [Self <: CreateTimelineEventInput](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setEventData(value: EventData): Self = StObject.set(x, "eventData", value.asInstanceOf[js.Any])
    
    inline def setEventTime(value: js.Date): Self = StObject.set(x, "eventTime", value.asInstanceOf[js.Any])
    
    inline def setEventType(value: TimelineEventType): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    inline def setIncidentRecordArn(value: Arn): Self = StObject.set(x, "incidentRecordArn", value.asInstanceOf[js.Any])
  }
}
