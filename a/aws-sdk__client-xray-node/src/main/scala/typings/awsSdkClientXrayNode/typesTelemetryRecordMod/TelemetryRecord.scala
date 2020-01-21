package typings.awsSdkClientXrayNode.typesTelemetryRecordMod

import typings.awsSdkClientXrayNode.typesBackendConnectionErrorsMod.BackendConnectionErrors
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TelemetryRecord extends js.Object {
  /**
    * <p/>
    */
  var BackendConnectionErrors: js.UndefOr[
    typings.awsSdkClientXrayNode.typesBackendConnectionErrorsMod.BackendConnectionErrors
  ] = js.undefined
  /**
    * <p/>
    */
  var SegmentsReceivedCount: js.UndefOr[Double] = js.undefined
  /**
    * <p/>
    */
  var SegmentsRejectedCount: js.UndefOr[Double] = js.undefined
  /**
    * <p/>
    */
  var SegmentsSentCount: js.UndefOr[Double] = js.undefined
  /**
    * <p/>
    */
  var SegmentsSpilloverCount: js.UndefOr[Double] = js.undefined
  /**
    * <p/>
    */
  var Timestamp: Date | String | Double
}

object TelemetryRecord {
  @scala.inline
  def apply(
    Timestamp: Date | String | Double,
    BackendConnectionErrors: BackendConnectionErrors = null,
    SegmentsReceivedCount: Int | Double = null,
    SegmentsRejectedCount: Int | Double = null,
    SegmentsSentCount: Int | Double = null,
    SegmentsSpilloverCount: Int | Double = null
  ): TelemetryRecord = {
    val __obj = js.Dynamic.literal(Timestamp = Timestamp.asInstanceOf[js.Any])
    if (BackendConnectionErrors != null) __obj.updateDynamic("BackendConnectionErrors")(BackendConnectionErrors.asInstanceOf[js.Any])
    if (SegmentsReceivedCount != null) __obj.updateDynamic("SegmentsReceivedCount")(SegmentsReceivedCount.asInstanceOf[js.Any])
    if (SegmentsRejectedCount != null) __obj.updateDynamic("SegmentsRejectedCount")(SegmentsRejectedCount.asInstanceOf[js.Any])
    if (SegmentsSentCount != null) __obj.updateDynamic("SegmentsSentCount")(SegmentsSentCount.asInstanceOf[js.Any])
    if (SegmentsSpilloverCount != null) __obj.updateDynamic("SegmentsSpilloverCount")(SegmentsSpilloverCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelemetryRecord]
  }
}

