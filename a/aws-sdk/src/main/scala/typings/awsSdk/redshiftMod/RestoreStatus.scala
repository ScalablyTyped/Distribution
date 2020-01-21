package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestoreStatus extends js.Object {
  /**
    * The number of megabytes per second being transferred from the backup storage. Returns the average rate for a completed backup. This field is only updated when you restore to DC2 and DS2 node types. 
    */
  var CurrentRestoreRateInMegaBytesPerSecond: js.UndefOr[Double] = js.native
  /**
    * The amount of time an in-progress restore has been running, or the amount of time it took a completed restore to finish. This field is only updated when you restore to DC2 and DS2 node types. 
    */
  var ElapsedTimeInSeconds: js.UndefOr[Long] = js.native
  /**
    * The estimate of the time remaining before the restore will complete. Returns 0 for a completed restore. This field is only updated when you restore to DC2 and DS2 node types. 
    */
  var EstimatedTimeToCompletionInSeconds: js.UndefOr[Long] = js.native
  /**
    * The number of megabytes that have been transferred from snapshot storage. This field is only updated when you restore to DC2 and DS2 node types. 
    */
  var ProgressInMegaBytes: js.UndefOr[Long] = js.native
  /**
    * The size of the set of snapshot data used to restore the cluster. This field is only updated when you restore to DC2 and DS2 node types. 
    */
  var SnapshotSizeInMegaBytes: js.UndefOr[Long] = js.native
  /**
    * The status of the restore action. Returns starting, restoring, completed, or failed.
    */
  var Status: js.UndefOr[String] = js.native
}

object RestoreStatus {
  @scala.inline
  def apply(
    CurrentRestoreRateInMegaBytesPerSecond: Int | scala.Double = null,
    ElapsedTimeInSeconds: Int | scala.Double = null,
    EstimatedTimeToCompletionInSeconds: Int | scala.Double = null,
    ProgressInMegaBytes: Int | scala.Double = null,
    SnapshotSizeInMegaBytes: Int | scala.Double = null,
    Status: String = null
  ): RestoreStatus = {
    val __obj = js.Dynamic.literal()
    if (CurrentRestoreRateInMegaBytesPerSecond != null) __obj.updateDynamic("CurrentRestoreRateInMegaBytesPerSecond")(CurrentRestoreRateInMegaBytesPerSecond.asInstanceOf[js.Any])
    if (ElapsedTimeInSeconds != null) __obj.updateDynamic("ElapsedTimeInSeconds")(ElapsedTimeInSeconds.asInstanceOf[js.Any])
    if (EstimatedTimeToCompletionInSeconds != null) __obj.updateDynamic("EstimatedTimeToCompletionInSeconds")(EstimatedTimeToCompletionInSeconds.asInstanceOf[js.Any])
    if (ProgressInMegaBytes != null) __obj.updateDynamic("ProgressInMegaBytes")(ProgressInMegaBytes.asInstanceOf[js.Any])
    if (SnapshotSizeInMegaBytes != null) __obj.updateDynamic("SnapshotSizeInMegaBytes")(SnapshotSizeInMegaBytes.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreStatus]
  }
}

