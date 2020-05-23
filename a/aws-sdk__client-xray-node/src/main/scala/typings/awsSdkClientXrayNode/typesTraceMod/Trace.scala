package typings.awsSdkClientXrayNode.typesTraceMod

import typings.awsSdkClientXrayNode.typesSegmentMod.Segment
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Trace extends js.Object {
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
  var Segments: js.UndefOr[js.Array[Segment] | Iterable[Segment]] = js.undefined
}

object Trace {
  @scala.inline
  def apply(
    Duration: js.UndefOr[Double] = js.undefined,
    Id: String = null,
    Segments: js.Array[Segment] | Iterable[Segment] = null
  ): Trace = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Duration)) __obj.updateDynamic("Duration")(Duration.get.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Segments != null) __obj.updateDynamic("Segments")(Segments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Trace]
  }
}

