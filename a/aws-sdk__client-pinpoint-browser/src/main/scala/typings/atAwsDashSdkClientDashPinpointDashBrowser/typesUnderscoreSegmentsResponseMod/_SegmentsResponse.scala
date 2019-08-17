package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreSegmentsResponseMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreSegmentResponseMod._SegmentResponse
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _SegmentsResponse extends js.Object {
  /**
    * The list of segments.
    */
  var Item: js.UndefOr[js.Array[_SegmentResponse] | Iterable[_SegmentResponse]] = js.undefined
  /**
    * An identifier used to retrieve the next page of results. The token is null if no additional pages exist.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object _SegmentsResponse {
  @scala.inline
  def apply(Item: js.Array[_SegmentResponse] | Iterable[_SegmentResponse] = null, NextToken: String = null): _SegmentsResponse = {
    val __obj = js.Dynamic.literal()
    if (Item != null) __obj.updateDynamic("Item")(Item.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[_SegmentsResponse]
  }
}

