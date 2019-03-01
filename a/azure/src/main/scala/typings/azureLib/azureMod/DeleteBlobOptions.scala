package typings
package azureLib.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteBlobOptions extends GetBlobPropertiesOptions {
  var deleteSnapshots: js.UndefOr[java.lang.String] = js.undefined
}

object DeleteBlobOptions {
  @scala.inline
  def apply(
    accessConditions: StorageAccessCondition = null,
    deleteSnapshots: java.lang.String = null,
    leaseId: java.lang.String = null,
    locationMode: java.lang.String = null,
    maximumExecutionTimeInMs: scala.Int | scala.Double = null,
    snapshotId: java.lang.String = null,
    timeoutIntervalInMs: scala.Int | scala.Double = null
  ): DeleteBlobOptions = {
    val __obj = js.Dynamic.literal()
    if (accessConditions != null) __obj.updateDynamic("accessConditions")(accessConditions)
    if (deleteSnapshots != null) __obj.updateDynamic("deleteSnapshots")(deleteSnapshots)
    if (leaseId != null) __obj.updateDynamic("leaseId")(leaseId)
    if (locationMode != null) __obj.updateDynamic("locationMode")(locationMode)
    if (maximumExecutionTimeInMs != null) __obj.updateDynamic("maximumExecutionTimeInMs")(maximumExecutionTimeInMs.asInstanceOf[js.Any])
    if (snapshotId != null) __obj.updateDynamic("snapshotId")(snapshotId)
    if (timeoutIntervalInMs != null) __obj.updateDynamic("timeoutIntervalInMs")(timeoutIntervalInMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBlobOptions]
  }
}

