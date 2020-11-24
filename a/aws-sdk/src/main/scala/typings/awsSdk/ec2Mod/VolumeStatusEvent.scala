package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VolumeStatusEvent extends js.Object {
  
  /**
    * A description of the event.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * The ID of this event.
    */
  var EventId: js.UndefOr[String] = js.native
  
  /**
    * The type of this event.
    */
  var EventType: js.UndefOr[String] = js.native
  
  /**
    * The ID of the instance associated with the event.
    */
  var InstanceId: js.UndefOr[String] = js.native
  
  /**
    * The latest end time of the event.
    */
  var NotAfter: js.UndefOr[MillisecondDateTime] = js.native
  
  /**
    * The earliest start time of the event.
    */
  var NotBefore: js.UndefOr[MillisecondDateTime] = js.native
}
object VolumeStatusEvent {
  
  @scala.inline
  def apply(): VolumeStatusEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeStatusEvent]
  }
  
  @scala.inline
  implicit class VolumeStatusEventOps[Self <: VolumeStatusEvent] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setEventId(value: String): Self = this.set("EventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventId: Self = this.set("EventId", js.undefined)
    
    @scala.inline
    def setEventType(value: String): Self = this.set("EventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventType: Self = this.set("EventType", js.undefined)
    
    @scala.inline
    def setInstanceId(value: String): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceId: Self = this.set("InstanceId", js.undefined)
    
    @scala.inline
    def setNotAfter(value: MillisecondDateTime): Self = this.set("NotAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotAfter: Self = this.set("NotAfter", js.undefined)
    
    @scala.inline
    def setNotBefore(value: MillisecondDateTime): Self = this.set("NotBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotBefore: Self = this.set("NotBefore", js.undefined)
  }
}
