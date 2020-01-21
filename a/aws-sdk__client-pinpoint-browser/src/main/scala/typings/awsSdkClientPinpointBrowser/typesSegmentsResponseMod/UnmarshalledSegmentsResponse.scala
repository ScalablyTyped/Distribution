package typings.awsSdkClientPinpointBrowser.typesSegmentsResponseMod

import typings.awsSdkClientPinpointBrowser.typesSegmentResponseMod.UnmarshalledSegmentResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledSegmentsResponse extends SegmentsResponse {
  /**
    * The list of segments.
    */
  @JSName("Item")
  var Item_UnmarshalledSegmentsResponse: js.UndefOr[js.Array[UnmarshalledSegmentResponse]] = js.undefined
}

object UnmarshalledSegmentsResponse {
  @scala.inline
  def apply(Item: js.Array[UnmarshalledSegmentResponse] = null, NextToken: String = null): UnmarshalledSegmentsResponse = {
    val __obj = js.Dynamic.literal()
    if (Item != null) __obj.updateDynamic("Item")(Item.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledSegmentsResponse]
  }
}

