package typings
package azureLib.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyBlobOptions extends BlobSnapshotOptions {
  var sourceAccessConditions: StorageAccessCondition
  var sourceLeaseId: js.UndefOr[java.lang.String] = js.undefined
}

object CopyBlobOptions {
  @scala.inline
  def apply(
    sourceAccessConditions: StorageAccessCondition,
    accessConditions: StorageAccessCondition = null,
    leaseId: java.lang.String = null,
    locationMode: java.lang.String = null,
    maximumExecutionTimeInMs: scala.Int | scala.Double = null,
    metadata: StorageMetadata = null,
    snapshotId: java.lang.String = null,
    sourceLeaseId: java.lang.String = null,
    timeoutIntervalInMs: scala.Int | scala.Double = null
  ): CopyBlobOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("sourceAccessConditions")(sourceAccessConditions)
    if (accessConditions != null) __obj.updateDynamic("accessConditions")(accessConditions)
    if (leaseId != null) __obj.updateDynamic("leaseId")(leaseId)
    if (locationMode != null) __obj.updateDynamic("locationMode")(locationMode)
    if (maximumExecutionTimeInMs != null) __obj.updateDynamic("maximumExecutionTimeInMs")(maximumExecutionTimeInMs.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (snapshotId != null) __obj.updateDynamic("snapshotId")(snapshotId)
    if (sourceLeaseId != null) __obj.updateDynamic("sourceLeaseId")(sourceLeaseId)
    if (timeoutIntervalInMs != null) __obj.updateDynamic("timeoutIntervalInMs")(timeoutIntervalInMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyBlobOptions]
  }
}

