package typings.azure.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBlobPropertiesOptions extends LeaseAccessConditionsOptions {
  var snapshotId: js.UndefOr[String] = js.undefined
}

object GetBlobPropertiesOptions {
  @scala.inline
  def apply(
    accessConditions: StorageAccessCondition = null,
    leaseId: String = null,
    locationMode: String = null,
    maximumExecutionTimeInMs: Int | Double = null,
    snapshotId: String = null,
    timeoutIntervalInMs: Int | Double = null
  ): GetBlobPropertiesOptions = {
    val __obj = js.Dynamic.literal()
    if (accessConditions != null) __obj.updateDynamic("accessConditions")(accessConditions)
    if (leaseId != null) __obj.updateDynamic("leaseId")(leaseId)
    if (locationMode != null) __obj.updateDynamic("locationMode")(locationMode)
    if (maximumExecutionTimeInMs != null) __obj.updateDynamic("maximumExecutionTimeInMs")(maximumExecutionTimeInMs.asInstanceOf[js.Any])
    if (snapshotId != null) __obj.updateDynamic("snapshotId")(snapshotId)
    if (timeoutIntervalInMs != null) __obj.updateDynamic("timeoutIntervalInMs")(timeoutIntervalInMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBlobPropertiesOptions]
  }
}

