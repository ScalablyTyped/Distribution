package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreItemResponseMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreEndpointItemResponseMod._UnmarshalledEndpointItemResponse
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreEventItemResponseMod._UnmarshalledEventItemResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledItemResponse extends _ItemResponse {
  /**
    * The response received after the endpoint was accepted.
    */
  @JSName("EndpointItemResponse")
  var EndpointItemResponse__UnmarshalledItemResponse: js.UndefOr[_UnmarshalledEndpointItemResponse] = js.undefined
  /**
    * A multipart response object that contains a key and value for each event ID in the request. In each object, the event ID is the key, and an EventItemResponse object is the value.
    */
  @JSName("EventsItemResponse")
  var EventsItemResponse__UnmarshalledItemResponse: js.UndefOr[StringDictionary[_UnmarshalledEventItemResponse]] = js.undefined
}

object _UnmarshalledItemResponse {
  @scala.inline
  def apply(
    EndpointItemResponse: _UnmarshalledEndpointItemResponse = null,
    EventsItemResponse: StringDictionary[_UnmarshalledEventItemResponse] = null
  ): _UnmarshalledItemResponse = {
    val __obj = js.Dynamic.literal()
    if (EndpointItemResponse != null) __obj.updateDynamic("EndpointItemResponse")(EndpointItemResponse.asInstanceOf[js.Any])
    if (EventsItemResponse != null) __obj.updateDynamic("EventsItemResponse")(EventsItemResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledItemResponse]
  }
}

