package typings.awsSdkClientPinpointBrowser.typesItemResponseMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientPinpointBrowser.typesEndpointItemResponseMod.EndpointItemResponse
import typings.awsSdkClientPinpointBrowser.typesEventItemResponseMod.EventItemResponse
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemResponse extends js.Object {
  
  /**
    * The response received after the endpoint was accepted.
    */
  var EndpointItemResponse: js.UndefOr[
    typings.awsSdkClientPinpointBrowser.typesEndpointItemResponseMod.EndpointItemResponse
  ] = js.native
  
  /**
    * A multipart response object that contains a key and value for each event ID in the request. In each object, the event ID is the key, and an EventItemResponse object is the value.
    */
  var EventsItemResponse: js.UndefOr[
    StringDictionary[EventItemResponse] | (Iterable[js.Tuple2[String, EventItemResponse]])
  ] = js.native
}
object ItemResponse {
  
  @scala.inline
  def apply(): ItemResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemResponse]
  }
  
  @scala.inline
  implicit class ItemResponseOps[Self <: ItemResponse] (val x: Self) extends AnyVal {
    
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
    def setEndpointItemResponse(value: EndpointItemResponse): Self = this.set("EndpointItemResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpointItemResponse: Self = this.set("EndpointItemResponse", js.undefined)
    
    @scala.inline
    def setEventsItemResponse(value: StringDictionary[EventItemResponse] | (Iterable[js.Tuple2[String, EventItemResponse]])): Self = this.set("EventsItemResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventsItemResponse: Self = this.set("EventsItemResponse", js.undefined)
  }
}
