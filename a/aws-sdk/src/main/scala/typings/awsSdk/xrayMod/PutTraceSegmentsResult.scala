package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutTraceSegmentsResult extends js.Object {
  /**
    * Segments that failed processing.
    */
  var UnprocessedTraceSegments: js.UndefOr[UnprocessedTraceSegmentList] = js.native
}

object PutTraceSegmentsResult {
  @scala.inline
  def apply(UnprocessedTraceSegments: UnprocessedTraceSegmentList = null): PutTraceSegmentsResult = {
    val __obj = js.Dynamic.literal()
    if (UnprocessedTraceSegments != null) __obj.updateDynamic("UnprocessedTraceSegments")(UnprocessedTraceSegments.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutTraceSegmentsResult]
  }
}

