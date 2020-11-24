package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HistoryRecord extends js.Object {
  
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
  implicit class HistoryRecordOps[Self <: HistoryRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEventInformation(value: EventInformation): Self = this.set("EventInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventInformation: Self = this.set("EventInformation", js.undefined)
    
    @scala.inline
    def setEventType(value: EventType): Self = this.set("EventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventType: Self = this.set("EventType", js.undefined)
    
    @scala.inline
    def setTimestamp(value: DateTime): Self = this.set("Timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp: Self = this.set("Timestamp", js.undefined)
  }
}
