package typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreTraceMod

import typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreSegmentMod._UnmarshalledSegment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledTrace extends _Trace {
  /**
    * <p>Segment documents for the segments and subsegments that comprise the trace.</p>
    */
  @JSName("Segments")
  var Segments__UnmarshalledTrace: js.UndefOr[js.Array[_UnmarshalledSegment]] = js.undefined
}

object _UnmarshalledTrace {
  @scala.inline
  def apply(Duration: Int | Double = null, Id: String = null, Segments: js.Array[_UnmarshalledSegment] = null): _UnmarshalledTrace = {
    val __obj = js.Dynamic.literal()
    if (Duration != null) __obj.updateDynamic("Duration")(Duration.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Segments != null) __obj.updateDynamic("Segments")(Segments.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledTrace]
  }
}

