package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemResponse extends StObject {
  
  /**
    * The response that was received after the endpoint data was accepted.
    */
  var EndpointItemResponse: js.UndefOr[typings.awsSdk.pinpointMod.EndpointItemResponse] = js.native
  
  /**
    * A multipart response object that contains a key and a value for each event in the request. In each object, the event ID is the key and an EventItemResponse object is the value.
    */
  var EventsItemResponse: js.UndefOr[MapOfEventItemResponse] = js.native
}
object ItemResponse {
  
  @scala.inline
  def apply(): ItemResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemResponse]
  }
  
  @scala.inline
  implicit class ItemResponseMutableBuilder[Self <: ItemResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpointItemResponse(value: EndpointItemResponse): Self = StObject.set(x, "EndpointItemResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointItemResponseUndefined: Self = StObject.set(x, "EndpointItemResponse", js.undefined)
    
    @scala.inline
    def setEventsItemResponse(value: MapOfEventItemResponse): Self = StObject.set(x, "EventsItemResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsItemResponseUndefined: Self = StObject.set(x, "EventsItemResponse", js.undefined)
  }
}
