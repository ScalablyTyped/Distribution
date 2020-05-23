package typings.awsSdkClientXrayNode.typesTraceMod

import typings.awsSdkClientXrayNode.typesSegmentMod.UnmarshalledSegment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledTrace extends Trace {
  /**
    * <p>Segment documents for the segments and subsegments that comprise the trace.</p>
    */
  @JSName("Segments")
  var Segments_UnmarshalledTrace: js.UndefOr[js.Array[UnmarshalledSegment]] = js.undefined
}

object UnmarshalledTrace {
  @scala.inline
  def apply(
    Duration: js.UndefOr[Double] = js.undefined,
    Id: String = null,
    Segments: js.Array[UnmarshalledSegment] = null
  ): UnmarshalledTrace = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Duration)) __obj.updateDynamic("Duration")(Duration.get.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Segments != null) __obj.updateDynamic("Segments")(Segments.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledTrace]
  }
}

