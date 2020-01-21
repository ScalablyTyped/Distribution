package typings.awsSdkClientPinpointBrowser.typesItemResponseMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientPinpointBrowser.typesEndpointItemResponseMod.UnmarshalledEndpointItemResponse
import typings.awsSdkClientPinpointBrowser.typesEventItemResponseMod.UnmarshalledEventItemResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledItemResponse extends ItemResponse {
  /**
    * The response received after the endpoint was accepted.
    */
  @JSName("EndpointItemResponse")
  var EndpointItemResponse_UnmarshalledItemResponse: js.UndefOr[UnmarshalledEndpointItemResponse] = js.undefined
  /**
    * A multipart response object that contains a key and value for each event ID in the request. In each object, the event ID is the key, and an EventItemResponse object is the value.
    */
  @JSName("EventsItemResponse")
  var EventsItemResponse_UnmarshalledItemResponse: js.UndefOr[StringDictionary[UnmarshalledEventItemResponse]] = js.undefined
}

object UnmarshalledItemResponse {
  @scala.inline
  def apply(
    EndpointItemResponse: UnmarshalledEndpointItemResponse = null,
    EventsItemResponse: StringDictionary[UnmarshalledEventItemResponse] = null
  ): UnmarshalledItemResponse = {
    val __obj = js.Dynamic.literal()
    if (EndpointItemResponse != null) __obj.updateDynamic("EndpointItemResponse")(EndpointItemResponse.asInstanceOf[js.Any])
    if (EventsItemResponse != null) __obj.updateDynamic("EventsItemResponse")(EventsItemResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledItemResponse]
  }
}

