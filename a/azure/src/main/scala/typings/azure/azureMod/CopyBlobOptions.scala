package typings.azure.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyBlobOptions extends BlobSnapshotOptions {
  var sourceAccessConditions: StorageAccessCondition
  var sourceLeaseId: js.UndefOr[String] = js.undefined
}

object CopyBlobOptions {
  @scala.inline
  def apply(
    sourceAccessConditions: StorageAccessCondition,
    accessConditions: StorageAccessCondition = null,
    leaseId: String = null,
    locationMode: String = null,
    maximumExecutionTimeInMs: Int | Double = null,
    metadata: StorageMetadata = null,
    snapshotId: String = null,
    sourceLeaseId: String = null,
    timeoutIntervalInMs: Int | Double = null
  ): CopyBlobOptions = {
    val __obj = js.Dynamic.literal(sourceAccessConditions = sourceAccessConditions)
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

