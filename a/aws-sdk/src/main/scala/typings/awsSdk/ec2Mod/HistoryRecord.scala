package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HistoryRecord extends StObject {
  
  /**
    * Information about the event.
    */
  var EventInformation: js.UndefOr[typings.awsSdk.ec2Mod.EventInformation] = js.native
  
  /**
    * The event type.    error - An error with the Spot Fleet request.    fleetRequestChange - A change in the status or configuration of the Spot Fleet request.    instanceChange - An instance was launched or terminated.    Information - An informational event.  
    */
  var EventType: js.UndefOr[typings.awsSdk.ec2Mod.EventType] = js.native
  
  /**
    * The date and time of the event, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ).
    */
  var Timestamp: js.UndefOr[DateTime] = js.native
}
object HistoryRecord {
  
  @scala.inline
  def apply(): HistoryRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistoryRecord]
  }
  
  @scala.inline
  implicit class HistoryRecordMutableBuilder[Self <: HistoryRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventInformation(value: EventInformation): Self = StObject.set(x, "EventInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventInformationUndefined: Self = StObject.set(x, "EventInformation", js.undefined)
    
    @scala.inline
    def setEventType(value: EventType): Self = StObject.set(x, "EventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTypeUndefined: Self = StObject.set(x, "EventType", js.undefined)
    
    @scala.inline
    def setTimestamp(value: DateTime): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
  }
}
