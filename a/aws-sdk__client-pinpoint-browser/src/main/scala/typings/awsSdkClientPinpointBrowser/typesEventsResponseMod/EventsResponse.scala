package typings.awsSdkClientPinpointBrowser.typesEventsResponseMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientPinpointBrowser.typesItemResponseMod.ItemResponse
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventsResponse extends js.Object {
  /**
    * A map that contains a multipart response for each endpoint. Each item in this object uses the endpoint ID as the key, and the item response as the value.
    *
    * If no item response exists, the value can also be one of the following: 202 (if the request was processed successfully) or 400 (if the payload was invalid, or required fields were missing).
    */
  var Results: js.UndefOr[StringDictionary[ItemResponse] | (Iterable[js.Tuple2[String, ItemResponse]])] = js.undefined
}

object EventsResponse {
  @scala.inline
  def apply(Results: StringDictionary[ItemResponse] | (Iterable[js.Tuple2[String, ItemResponse]]) = null): EventsResponse = {
    val __obj = js.Dynamic.literal()
    if (Results != null) __obj.updateDynamic("Results")(Results.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventsResponse]
  }
}

