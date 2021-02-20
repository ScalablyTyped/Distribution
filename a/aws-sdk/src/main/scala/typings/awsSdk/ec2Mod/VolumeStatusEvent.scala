package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VolumeStatusEvent extends StObject {
  
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
  implicit class VolumeStatusEventMutableBuilder[Self <: VolumeStatusEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setEventId(value: String): Self = StObject.set(x, "EventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventIdUndefined: Self = StObject.set(x, "EventId", js.undefined)
    
    @scala.inline
    def setEventType(value: String): Self = StObject.set(x, "EventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTypeUndefined: Self = StObject.set(x, "EventType", js.undefined)
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    @scala.inline
    def setNotAfter(value: MillisecondDateTime): Self = StObject.set(x, "NotAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotAfterUndefined: Self = StObject.set(x, "NotAfter", js.undefined)
    
    @scala.inline
    def setNotBefore(value: MillisecondDateTime): Self = StObject.set(x, "NotBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotBeforeUndefined: Self = StObject.set(x, "NotBefore", js.undefined)
  }
}
