package typings.awsSdkClientPinpointBrowser.typesItemResponseMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientPinpointBrowser.typesEndpointItemResponseMod.UnmarshalledEndpointItemResponse
import typings.awsSdkClientPinpointBrowser.typesEventItemResponseMod.UnmarshalledEventItemResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledItemResponse extends ItemResponse {
  /**
    * The response received after the endpoint was accepted.
    */
  @JSName("EndpointItemResponse")
  var EndpointItemResponse_UnmarshalledItemResponse: js.UndefOr[UnmarshalledEndpointItemResponse] = js.native
  /**
    * A multipart response object that contains a key and value for each event ID in the request. In each object, the event ID is the key, and an EventItemResponse object is the value.
    */
  @JSName("EventsItemResponse")
  var EventsItemResponse_UnmarshalledItemResponse: js.UndefOr[StringDictionary[UnmarshalledEventItemResponse]] = js.native
}

object UnmarshalledItemResponse {
  @scala.inline
  def apply(): UnmarshalledItemResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledItemResponse]
  }
  @scala.inline
  implicit class UnmarshalledItemResponseOps[Self <: UnmarshalledItemResponse] (val x: Self) extends AnyVal {
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
    def setEndpointItemResponse(value: UnmarshalledEndpointItemResponse): Self = this.set("EndpointItemResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpointItemResponse: Self = this.set("EndpointItemResponse", js.undefined)
    @scala.inline
    def setEventsItemResponse(value: StringDictionary[UnmarshalledEventItemResponse]): Self = this.set("EventsItemResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventsItemResponse: Self = this.set("EventsItemResponse", js.undefined)
  }
  
}

