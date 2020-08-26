package typings.awsSdkClientXrayNode.typesTraceMod

import typings.awsSdkClientXrayNode.typesSegmentMod.UnmarshalledSegment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledTrace extends Trace {
  /**
    * <p>Segment documents for the segments and subsegments that comprise the trace.</p>
    */
  @JSName("Segments")
  var Segments_UnmarshalledTrace: js.UndefOr[js.Array[UnmarshalledSegment]] = js.native
}

object UnmarshalledTrace {
  @scala.inline
  def apply(): UnmarshalledTrace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledTrace]
  }
  @scala.inline
  implicit class UnmarshalledTraceOps[Self <: UnmarshalledTrace] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSegmentsVarargs(value: UnmarshalledSegment*): Self = this.set("Segments", js.Array(value :_*))
    @scala.inline
    def setSegments(value: js.Array[UnmarshalledSegment]): Self = this.set("Segments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegments: Self = this.set("Segments", js.undefined)
  }
  
}

