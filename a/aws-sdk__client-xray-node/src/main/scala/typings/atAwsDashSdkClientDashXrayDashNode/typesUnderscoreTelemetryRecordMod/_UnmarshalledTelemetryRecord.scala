package typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreTelemetryRecordMod

import typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreBackendConnectionErrorsMod._UnmarshalledBackendConnectionErrors
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledTelemetryRecord extends _TelemetryRecord {
  /**
    * <p/>
    */
  @JSName("BackendConnectionErrors")
  var BackendConnectionErrors__UnmarshalledTelemetryRecord: js.UndefOr[_UnmarshalledBackendConnectionErrors] = js.undefined
  /**
    * <p/>
    */
  @JSName("Timestamp")
  var Timestamp__UnmarshalledTelemetryRecord: Date
}

object _UnmarshalledTelemetryRecord {
  @scala.inline
  def apply(
    Timestamp: Date,
    BackendConnectionErrors: _UnmarshalledBackendConnectionErrors = null,
    SegmentsReceivedCount: Int | Double = null,
    SegmentsRejectedCount: Int | Double = null,
    SegmentsSentCount: Int | Double = null,
    SegmentsSpilloverCount: Int | Double = null
  ): _UnmarshalledTelemetryRecord = {
    val __obj = js.Dynamic.literal(Timestamp = Timestamp)
    if (BackendConnectionErrors != null) __obj.updateDynamic("BackendConnectionErrors")(BackendConnectionErrors)
    if (SegmentsReceivedCount != null) __obj.updateDynamic("SegmentsReceivedCount")(SegmentsReceivedCount.asInstanceOf[js.Any])
    if (SegmentsRejectedCount != null) __obj.updateDynamic("SegmentsRejectedCount")(SegmentsRejectedCount.asInstanceOf[js.Any])
    if (SegmentsSentCount != null) __obj.updateDynamic("SegmentsSentCount")(SegmentsSentCount.asInstanceOf[js.Any])
    if (SegmentsSpilloverCount != null) __obj.updateDynamic("SegmentsSpilloverCount")(SegmentsSpilloverCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledTelemetryRecord]
  }
}

