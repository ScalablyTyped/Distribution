package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteEventRequest extends js.Object {
  
  /**
    * The ID of the event to delete.
    */
  var eventId: identifier = js.native
  
  /**
    * The name of the event type.
    */
  var eventTypeName: identifier = js.native
}
object DeleteEventRequest {
  
  @scala.inline
  def apply(eventId: identifier, eventTypeName: identifier): DeleteEventRequest = {
    val __obj = js.Dynamic.literal(eventId = eventId.asInstanceOf[js.Any], eventTypeName = eventTypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEventRequest]
  }
  
  @scala.inline
  implicit class DeleteEventRequestOps[Self <: DeleteEventRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEventId(value: identifier): Self = this.set("eventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTypeName(value: identifier): Self = this.set("eventTypeName", value.asInstanceOf[js.Any])
  }
}
