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
    val __obj = js.Dynamic.literal(sourceAccessConditions = sourceAccessConditions.asInstanceOf[js.Any])
    if (accessConditions != null) __obj.updateDynamic("accessConditions")(accessConditions.asInstanceOf[js.Any])
    if (leaseId != null) __obj.updateDynamic("leaseId")(leaseId.asInstanceOf[js.Any])
    if (locationMode != null) __obj.updateDynamic("locationMode")(locationMode.asInstanceOf[js.Any])
    if (maximumExecutionTimeInMs != null) __obj.updateDynamic("maximumExecutionTimeInMs")(maximumExecutionTimeInMs.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (snapshotId != null) __obj.updateDynamic("snapshotId")(snapshotId.asInstanceOf[js.Any])
    if (sourceLeaseId != null) __obj.updateDynamic("sourceLeaseId")(sourceLeaseId.asInstanceOf[js.Any])
    if (timeoutIntervalInMs != null) __obj.updateDynamic("timeoutIntervalInMs")(timeoutIntervalInMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyBlobOptions]
  }
}

