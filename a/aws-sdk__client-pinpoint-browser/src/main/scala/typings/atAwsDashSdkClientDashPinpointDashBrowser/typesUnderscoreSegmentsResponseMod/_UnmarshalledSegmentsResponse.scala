package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreSegmentsResponseMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreSegmentResponseMod._UnmarshalledSegmentResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledSegmentsResponse extends _SegmentsResponse {
  /**
    * The list of segments.
    */
  @JSName("Item")
  var Item__UnmarshalledSegmentsResponse: js.UndefOr[js.Array[_UnmarshalledSegmentResponse]] = js.undefined
}

object _UnmarshalledSegmentsResponse {
  @scala.inline
  def apply(Item: js.Array[_UnmarshalledSegmentResponse] = null, NextToken: String = null): _UnmarshalledSegmentsResponse = {
    val __obj = js.Dynamic.literal()
    if (Item != null) __obj.updateDynamic("Item")(Item.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledSegmentsResponse]
  }
}

