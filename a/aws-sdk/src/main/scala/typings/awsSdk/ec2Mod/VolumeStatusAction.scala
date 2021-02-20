package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VolumeStatusAction extends StObject {
  
  /**
    * The code identifying the operation, for example, enable-volume-io.
    */
  var Code: js.UndefOr[String] = js.native
  
  /**
    * A description of the operation.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * The ID of the event associated with this operation.
    */
  var EventId: js.UndefOr[String] = js.native
  
  /**
    * The event type associated with this operation.
    */
  var EventType: js.UndefOr[String] = js.native
}
object VolumeStatusAction {
  
  @scala.inline
  def apply(): VolumeStatusAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeStatusAction]
  }
  
  @scala.inline
  implicit class VolumeStatusActionMutableBuilder[Self <: VolumeStatusAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
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
  }
}
