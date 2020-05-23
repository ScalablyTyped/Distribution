package typings.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadBlobOptions extends GetBlobPropertiesOptions {
  var disableContentMD5Validation: js.UndefOr[Boolean] = js.undefined
  var rangeEnd: js.UndefOr[String] = js.undefined
  var rangeStart: js.UndefOr[String] = js.undefined
  var useTransactionalMD5: js.UndefOr[Boolean] = js.undefined
}

object ReadBlobOptions {
  @scala.inline
  def apply(
    accessConditions: StorageAccessCondition = null,
    disableContentMD5Validation: js.UndefOr[Boolean] = js.undefined,
    leaseId: String = null,
    locationMode: String = null,
    maximumExecutionTimeInMs: js.UndefOr[Double] = js.undefined,
    rangeEnd: String = null,
    rangeStart: String = null,
    snapshotId: String = null,
    timeoutIntervalInMs: js.UndefOr[Double] = js.undefined,
    useTransactionalMD5: js.UndefOr[Boolean] = js.undefined
  ): ReadBlobOptions = {
    val __obj = js.Dynamic.literal()
    if (accessConditions != null) __obj.updateDynamic("accessConditions")(accessConditions.asInstanceOf[js.Any])
    if (!js.isUndefined(disableContentMD5Validation)) __obj.updateDynamic("disableContentMD5Validation")(disableContentMD5Validation.get.asInstanceOf[js.Any])
    if (leaseId != null) __obj.updateDynamic("leaseId")(leaseId.asInstanceOf[js.Any])
    if (locationMode != null) __obj.updateDynamic("locationMode")(locationMode.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumExecutionTimeInMs)) __obj.updateDynamic("maximumExecutionTimeInMs")(maximumExecutionTimeInMs.get.asInstanceOf[js.Any])
    if (rangeEnd != null) __obj.updateDynamic("rangeEnd")(rangeEnd.asInstanceOf[js.Any])
    if (rangeStart != null) __obj.updateDynamic("rangeStart")(rangeStart.asInstanceOf[js.Any])
    if (snapshotId != null) __obj.updateDynamic("snapshotId")(snapshotId.asInstanceOf[js.Any])
    if (!js.isUndefined(timeoutIntervalInMs)) __obj.updateDynamic("timeoutIntervalInMs")(timeoutIntervalInMs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useTransactionalMD5)) __obj.updateDynamic("useTransactionalMD5")(useTransactionalMD5.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadBlobOptions]
  }
}

