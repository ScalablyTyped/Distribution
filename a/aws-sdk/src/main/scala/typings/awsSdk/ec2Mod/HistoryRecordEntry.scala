package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistoryRecordEntry extends StObject {
  
  /**
    * Information about the event.
    */
  var EventInformation: js.UndefOr[typings.awsSdk.ec2Mod.EventInformation] = js.undefined
  
  /**
    * The event type.
    */
  var EventType: js.UndefOr[FleetEventType] = js.undefined
  
  /**
    * The date and time of the event, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ).
    */
  var Timestamp: js.UndefOr[DateTime] = js.undefined
}
object HistoryRecordEntry {
  
  @scala.inline
  def apply(): HistoryRecordEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistoryRecordEntry]
  }
  
  @scala.inline
  implicit class HistoryRecordEntryMutableBuilder[Self <: HistoryRecordEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventInformation(value: EventInformation): Self = StObject.set(x, "EventInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventInformationUndefined: Self = StObject.set(x, "EventInformation", js.undefined)
    
    @scala.inline
    def setEventType(value: FleetEventType): Self = StObject.set(x, "EventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTypeUndefined: Self = StObject.set(x, "EventType", js.undefined)
    
    @scala.inline
    def setTimestamp(value: DateTime): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
  }
}
