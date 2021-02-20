package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutEventsResponse extends StObject {
  
  var EventsResponse: typings.awsSdk.pinpointMod.EventsResponse = js.native
}
object PutEventsResponse {
  
  @scala.inline
  def apply(EventsResponse: EventsResponse): PutEventsResponse = {
    val __obj = js.Dynamic.literal(EventsResponse = EventsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutEventsResponse]
  }
  
  @scala.inline
  implicit class PutEventsResponseMutableBuilder[Self <: PutEventsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventsResponse(value: EventsResponse): Self = StObject.set(x, "EventsResponse", value.asInstanceOf[js.Any])
  }
}
