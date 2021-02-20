package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceStatusEvent extends StObject {
  
  /**
    * The event code.
    */
  var Code: js.UndefOr[EventCode] = js.native
  
  /**
    * A description of the event. After a scheduled event is completed, it can still be described for up to a week. If the event has been completed, this description starts with the following text: [Completed].
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * The ID of the event.
    */
  var InstanceEventId: js.UndefOr[typings.awsSdk.ec2Mod.InstanceEventId] = js.native
  
  /**
    * The latest scheduled end time for the event.
    */
  var NotAfter: js.UndefOr[DateTime] = js.native
  
  /**
    * The earliest scheduled start time for the event.
    */
  var NotBefore: js.UndefOr[DateTime] = js.native
  
  /**
    * The deadline for starting the event.
    */
  var NotBeforeDeadline: js.UndefOr[DateTime] = js.native
}
object InstanceStatusEvent {
  
  @scala.inline
  def apply(): InstanceStatusEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceStatusEvent]
  }
  
  @scala.inline
  implicit class InstanceStatusEventMutableBuilder[Self <: InstanceStatusEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: EventCode): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setInstanceEventId(value: InstanceEventId): Self = StObject.set(x, "InstanceEventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceEventIdUndefined: Self = StObject.set(x, "InstanceEventId", js.undefined)
    
    @scala.inline
    def setNotAfter(value: DateTime): Self = StObject.set(x, "NotAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotAfterUndefined: Self = StObject.set(x, "NotAfter", js.undefined)
    
    @scala.inline
    def setNotBefore(value: DateTime): Self = StObject.set(x, "NotBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotBeforeDeadline(value: DateTime): Self = StObject.set(x, "NotBeforeDeadline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotBeforeDeadlineUndefined: Self = StObject.set(x, "NotBeforeDeadline", js.undefined)
    
    @scala.inline
    def setNotBeforeUndefined: Self = StObject.set(x, "NotBefore", js.undefined)
  }
}
