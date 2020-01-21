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
    SegmentsReceivedCount: Int | Double = null,
    SegmentsRejectedCount: Int | Double = null,
    SegmentsSentCount: Int | Double = null,
    SegmentsSpilloverCount: Int | Double = null
  ): UnmarshalledTelemetryRecord = {
    val __obj = js.Dynamic.literal(Timestamp = Timestamp.asInstanceOf[js.Any])
    if (BackendConnectionErrors != null) __obj.updateDynamic("BackendConnectionErrors")(BackendConnectionErrors.asInstanceOf[js.Any])
    if (SegmentsReceivedCount != null) __obj.updateDynamic("SegmentsReceivedCount")(SegmentsReceivedCount.asInstanceOf[js.Any])
    if (SegmentsRejectedCount != null) __obj.updateDynamic("SegmentsRejectedCount")(SegmentsRejectedCount.asInstanceOf[js.Any])
    if (SegmentsSentCount != null) __obj.updateDynamic("SegmentsSentCount")(SegmentsSentCount.asInstanceOf[js.Any])
    if (SegmentsSpilloverCount != null) __obj.updateDynamic("SegmentsSpilloverCount")(SegmentsSpilloverCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledTelemetryRecord]
  }
}

