package typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreTraceMod

import typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreSegmentMod._Segment
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Trace extends js.Object {
  /**
    * <p>The length of time in seconds between the start time of the root segment and the end time of the last segment that completed.</p>
    */
  var Duration: js.UndefOr[Double] = js.undefined
  /**
    * <p>The unique identifier for the request that generated the trace's segments and subsegments.</p>
    */
  var Id: js.UndefOr[String] = js.undefined
  /**
    * <p>Segment documents for the segments and subsegments that comprise the trace.</p>
    */
  var Segments: js.UndefOr[js.Array[_Segment] | Iterable[_Segment]] = js.undefined
}

object _Trace {
  @scala.inline
  def apply(
    Duration: Int | Double = null,
    Id: String = null,
    Segments: js.Array[_Segment] | Iterable[_Segment] = null
  ): _Trace = {
    val __obj = js.Dynamic.literal()
    if (Duration != null) __obj.updateDynamic("Duration")(Duration.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Segments != null) __obj.updateDynamic("Segments")(Segments.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Trace]
  }
}

