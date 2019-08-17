package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreEventsResponseMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreItemResponseMod._UnmarshalledItemResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledEventsResponse extends _EventsResponse {
  /**
    * A map that contains a multipart response for each endpoint. Each item in this object uses the endpoint ID as the key, and the item response as the value.
    *
    * If no item response exists, the value can also be one of the following: 202 (if the request was processed successfully) or 400 (if the payload was invalid, or required fields were missing).
    */
  @JSName("Results")
  var Results__UnmarshalledEventsResponse: js.UndefOr[StringDictionary[_UnmarshalledItemResponse]] = js.undefined
}

object _UnmarshalledEventsResponse {
  @scala.inline
  def apply(Results: StringDictionary[_UnmarshalledItemResponse] = null): _UnmarshalledEventsResponse = {
    val __obj = js.Dynamic.literal()
    if (Results != null) __obj.updateDynamic("Results")(Results)
    __obj.asInstanceOf[_UnmarshalledEventsResponse]
  }
}

