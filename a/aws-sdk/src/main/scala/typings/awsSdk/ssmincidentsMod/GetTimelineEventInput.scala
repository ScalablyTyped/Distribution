package typings.awsSdk.ssmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTimelineEventInput extends StObject {
  
  /**
    * The ID of the event. You can get an event's ID when you create it, or by using ListTimelineEvents.
    */
  var eventId: UUID
  
  /**
    * The Amazon Resource Name (ARN) of the incident that includes the timeline event.
    */
  var incidentRecordArn: Arn
}
object GetTimelineEventInput {
  
  inline def apply(eventId: UUID, incidentRecordArn: Arn): GetTimelineEventInput = {
    val __obj = js.Dynamic.literal(eventId = eventId.asInstanceOf[js.Any], incidentRecordArn = incidentRecordArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTimelineEventInput]
  }
  
  extension [Self <: GetTimelineEventInput](x: Self) {
    
    inline def setEventId(value: UUID): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    inline def setIncidentRecordArn(value: Arn): Self = StObject.set(x, "incidentRecordArn", value.asInstanceOf[js.Any])
  }
}
