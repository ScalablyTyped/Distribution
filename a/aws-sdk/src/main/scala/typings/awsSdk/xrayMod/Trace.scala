package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Trace extends js.Object {
  /**
    * The length of time in seconds between the start time of the root segment and the end time of the last segment that completed.
    */
  var Duration: js.UndefOr[NullableDouble] = js.native
  /**
    * The unique identifier for the request that generated the trace's segments and subsegments.
    */
  var Id: js.UndefOr[TraceId] = js.native
  /**
    * Segment documents for the segments and subsegments that comprise the trace.
    */
  var Segments: js.UndefOr[SegmentList] = js.native
}

object Trace {
  @scala.inline
  def apply(): Trace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Trace]
  }
  @scala.inline
  implicit class TraceOps[Self <: Trace] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDuration(value: NullableDouble): Self = this.set("Duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("Duration", js.undefined)
    @scala.inline
    def setId(value: TraceId): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setSegmentsVarargs(value: Segment*): Self = this.set("Segments", js.Array(value :_*))
    @scala.inline
    def setSegments(value: SegmentList): Self = this.set("Segments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegments: Self = this.set("Segments", js.undefined)
  }
  
}

