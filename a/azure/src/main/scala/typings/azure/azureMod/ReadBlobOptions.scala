package typings.azure.azureMod

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
    maximumExecutionTimeInMs: Int | Double = null,
    rangeEnd: String = null,
    rangeStart: String = null,
    snapshotId: String = null,
    timeoutIntervalInMs: Int | Double = null,
    useTransactionalMD5: js.UndefOr[Boolean] = js.undefined
  ): ReadBlobOptions = {
    val __obj = js.Dynamic.literal()
    if (accessConditions != null) __obj.updateDynamic("accessConditions")(accessConditions)
    if (!js.isUndefined(disableContentMD5Validation)) __obj.updateDynamic("disableContentMD5Validation")(disableContentMD5Validation)
    if (leaseId != null) __obj.updateDynamic("leaseId")(leaseId)
    if (locationMode != null) __obj.updateDynamic("locationMode")(locationMode)
    if (maximumExecutionTimeInMs != null) __obj.updateDynamic("maximumExecutionTimeInMs")(maximumExecutionTimeInMs.asInstanceOf[js.Any])
    if (rangeEnd != null) __obj.updateDynamic("rangeEnd")(rangeEnd)
    if (rangeStart != null) __obj.updateDynamic("rangeStart")(rangeStart)
    if (snapshotId != null) __obj.updateDynamic("snapshotId")(snapshotId)
    if (timeoutIntervalInMs != null) __obj.updateDynamic("timeoutIntervalInMs")(timeoutIntervalInMs.asInstanceOf[js.Any])
    if (!js.isUndefined(useTransactionalMD5)) __obj.updateDynamic("useTransactionalMD5")(useTransactionalMD5)
    __obj.asInstanceOf[ReadBlobOptions]
  }
}

