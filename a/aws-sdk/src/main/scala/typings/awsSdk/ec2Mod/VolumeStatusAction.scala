package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VolumeStatusAction extends js.Object {
  
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
  implicit class VolumeStatusActionOps[Self <: VolumeStatusAction] (val x: Self) extends AnyVal {
    
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
    def setCode(value: String): Self = this.set("Code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("Code", js.undefined)
    
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
  }
}
