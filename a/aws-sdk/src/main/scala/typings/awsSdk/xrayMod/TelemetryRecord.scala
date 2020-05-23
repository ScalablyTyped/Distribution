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
  def apply(
    Timestamp: Timestamp,
    BackendConnectionErrors: BackendConnectionErrors = null,
    SegmentsReceivedCount: js.UndefOr[NullableInteger] = js.undefined,
    SegmentsRejectedCount: js.UndefOr[NullableInteger] = js.undefined,
    SegmentsSentCount: js.UndefOr[NullableInteger] = js.undefined,
    SegmentsSpilloverCount: js.UndefOr[NullableInteger] = js.undefined
  ): TelemetryRecord = {
    val __obj = js.Dynamic.literal(Timestamp = Timestamp.asInstanceOf[js.Any])
    if (BackendConnectionErrors != null) __obj.updateDynamic("BackendConnectionErrors")(BackendConnectionErrors.asInstanceOf[js.Any])
    if (!js.isUndefined(SegmentsReceivedCount)) __obj.updateDynamic("SegmentsReceivedCount")(SegmentsReceivedCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(SegmentsRejectedCount)) __obj.updateDynamic("SegmentsRejectedCount")(SegmentsRejectedCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(SegmentsSentCount)) __obj.updateDynamic("SegmentsSentCount")(SegmentsSentCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(SegmentsSpilloverCount)) __obj.updateDynamic("SegmentsSpilloverCount")(SegmentsSpilloverCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelemetryRecord]
  }
}

