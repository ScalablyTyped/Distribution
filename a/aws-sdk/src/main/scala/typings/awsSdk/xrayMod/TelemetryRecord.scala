package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TelemetryRecord extends js.Object {
  /**
    * 
    */
  var BackendConnectionErrors: js.UndefOr[typings.awsSdk.xrayMod.BackendConnectionErrors] = js.native
  /**
    * 
    */
  var SegmentsReceivedCount: js.UndefOr[NullableInteger] = js.native
  /**
    * 
    */
  var SegmentsRejectedCount: js.UndefOr[NullableInteger] = js.native
  /**
    * 
    */
  var SegmentsSentCount: js.UndefOr[NullableInteger] = js.native
  /**
    * 
    */
  var SegmentsSpilloverCount: js.UndefOr[NullableInteger] = js.native
  /**
    * 
    */
  var Timestamp: typings.awsSdk.xrayMod.Timestamp = js.native
}

object TelemetryRecord {
  @scala.inline
  def apply(Timestamp: Timestamp): TelemetryRecord = {
    val __obj = js.Dynamic.literal(Timestamp = Timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelemetryRecord]
  }
  @scala.inline
  implicit class TelemetryRecordOps[Self <: TelemetryRecord] (val x: Self) extends AnyVal {
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
    def setTimestamp(value: Timestamp): Self = this.set("Timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackendConnectionErrors(value: BackendConnectionErrors): Self = this.set("BackendConnectionErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackendConnectionErrors: Self = this.set("BackendConnectionErrors", js.undefined)
    @scala.inline
    def setSegmentsReceivedCount(value: NullableInteger): Self = this.set("SegmentsReceivedCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegmentsReceivedCount: Self = this.set("SegmentsReceivedCount", js.undefined)
    @scala.inline
    def setSegmentsRejectedCount(value: NullableInteger): Self = this.set("SegmentsRejectedCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegmentsRejectedCount: Self = this.set("SegmentsRejectedCount", js.undefined)
    @scala.inline
    def setSegmentsSentCount(value: NullableInteger): Self = this.set("SegmentsSentCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegmentsSentCount: Self = this.set("SegmentsSentCount", js.undefined)
    @scala.inline
    def setSegmentsSpilloverCount(value: NullableInteger): Self = this.set("SegmentsSpilloverCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegmentsSpilloverCount: Self = this.set("SegmentsSpilloverCount", js.undefined)
  }
  
}

