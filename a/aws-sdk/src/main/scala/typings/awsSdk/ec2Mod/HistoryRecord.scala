package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistoryRecord extends StObject {
  
  /**
    * Information about the event.
    */
  var EventInformation: js.UndefOr[typings.awsSdk.ec2Mod.EventInformation] = js.undefined
  
  /**
    * The event type.    error - An error with the Spot Fleet request.    fleetRequestChange - A change in the status or configuration of the Spot Fleet request.    instanceChange - An instance was launched or terminated.    Information - An informational event.  
    */
  var EventType: js.UndefOr[typings.awsSdk.ec2Mod.EventType] = js.undefined
  
  /**
    * The date and time of the event, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ).
    */
  var Timestamp: js.UndefOr[js.Date] = js.undefined
}
object HistoryRecord {
  
  inline def apply(): HistoryRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistoryRecord]
  }
  
  extension [Self <: HistoryRecord](x: Self) {
    
    inline def setEventInformation(value: EventInformation): Self = StObject.set(x, "EventInformation", value.asInstanceOf[js.Any])
    
    inline def setEventInformationUndefined: Self = StObject.set(x, "EventInformation", js.undefined)
    
    inline def setEventType(value: EventType): Self = StObject.set(x, "EventType", value.asInstanceOf[js.Any])
    
    inline def setEventTypeUndefined: Self = StObject.set(x, "EventType", js.undefined)
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
  }
}
