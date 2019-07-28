package typings.azure.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlobSnapshotOptions extends GetBlobPropertiesOptions {
  var metadata: js.UndefOr[StorageMetadata] = js.undefined
}

object BlobSnapshotOptions {
  @scala.inline
  def apply(
    accessConditions: StorageAccessCondition = null,
    leaseId: String = null,
    locationMode: String = null,
    maximumExecutionTimeInMs: Int | Double = null,
    metadata: StorageMetadata = null,
    snapshotId: String = null,
    timeoutIntervalInMs: Int | Double = null
  ): BlobSnapshotOptions = {
    val __obj = js.Dynamic.literal()
    if (accessConditions != null) __obj.updateDynamic("accessConditions")(accessConditions)
    if (leaseId != null) __obj.updateDynamic("leaseId")(leaseId)
    if (locationMode != null) __obj.updateDynamic("locationMode")(locationMode)
    if (maximumExecutionTimeInMs != null) __obj.updateDynamic("maximumExecutionTimeInMs")(maximumExecutionTimeInMs.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (snapshotId != null) __obj.updateDynamic("snapshotId")(snapshotId)
    if (timeoutIntervalInMs != null) __obj.updateDynamic("timeoutIntervalInMs")(timeoutIntervalInMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlobSnapshotOptions]
  }
}

