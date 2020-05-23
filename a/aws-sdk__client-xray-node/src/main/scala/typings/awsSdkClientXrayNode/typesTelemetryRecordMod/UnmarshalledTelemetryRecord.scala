package typings.awsSdkClientXrayNode.typesTelemetryRecordMod

import typings.awsSdkClientXrayNode.typesBackendConnectionErrorsMod.UnmarshalledBackendConnectionErrors
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledTelemetryRecord extends TelemetryRecord {
  /**
    * <p/>
    */
  @JSName("BackendConnectionErrors")
  var BackendConnectionErrors_UnmarshalledTelemetryRecord: js.UndefOr[UnmarshalledBackendConnectionErrors] = js.undefined
  /**
    * <p/>
    */
  @JSName("Timestamp")
  var Timestamp_UnmarshalledTelemetryRecord: Date
}

object UnmarshalledTelemetryRecord {
  @scala.inline
  def apply(
    Timestamp: Date,
    BackendConnectionErrors: UnmarshalledBackendConnectionErrors = null,
    SegmentsReceivedCount: js.UndefOr[Double] = js.undefined,
    SegmentsRejectedCount: js.UndefOr[Double] = js.undefined,
    SegmentsSentCount: js.UndefOr[Double] = js.undefined,
    SegmentsSpilloverCount: js.UndefOr[Double] = js.undefined
  ): UnmarshalledTelemetryRecord = {
    val __obj = js.Dynamic.literal(Timestamp = Timestamp.asInstanceOf[js.Any])
    if (BackendConnectionErrors != null) __obj.updateDynamic("BackendConnectionErrors")(BackendConnectionErrors.asInstanceOf[js.Any])
    if (!js.isUndefined(SegmentsReceivedCount)) __obj.updateDynamic("SegmentsReceivedCount")(SegmentsReceivedCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(SegmentsRejectedCount)) __obj.updateDynamic("SegmentsRejectedCount")(SegmentsRejectedCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(SegmentsSentCount)) __obj.updateDynamic("SegmentsSentCount")(SegmentsSentCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(SegmentsSpilloverCount)) __obj.updateDynamic("SegmentsSpilloverCount")(SegmentsSpilloverCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledTelemetryRecord]
  }
}

