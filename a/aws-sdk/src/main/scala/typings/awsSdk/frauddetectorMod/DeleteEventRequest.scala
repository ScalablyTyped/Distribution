package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteEventRequest extends StObject {
  
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
  implicit class DeleteEventRequestMutableBuilder[Self <: DeleteEventRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventId(value: identifier): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTypeName(value: identifier): Self = StObject.set(x, "eventTypeName", value.asInstanceOf[js.Any])
  }
}
