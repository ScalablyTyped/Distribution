package typings.azure.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateBlockOptions extends LeaseAccessConditionsOptions {
  var contentMD5: js.UndefOr[String] = js.undefined
  var useTransactionalMD5: js.UndefOr[Boolean] = js.undefined
}

object CreateBlockOptions {
  @scala.inline
  def apply(
    accessConditions: StorageAccessCondition = null,
    contentMD5: String = null,
    leaseId: String = null,
    locationMode: String = null,
    maximumExecutionTimeInMs: Int | Double = null,
    timeoutIntervalInMs: Int | Double = null,
    useTransactionalMD5: js.UndefOr[Boolean] = js.undefined
  ): CreateBlockOptions = {
    val __obj = js.Dynamic.literal()
    if (accessConditions != null) __obj.updateDynamic("accessConditions")(accessConditions)
    if (contentMD5 != null) __obj.updateDynamic("contentMD5")(contentMD5)
    if (leaseId != null) __obj.updateDynamic("leaseId")(leaseId)
    if (locationMode != null) __obj.updateDynamic("locationMode")(locationMode)
    if (maximumExecutionTimeInMs != null) __obj.updateDynamic("maximumExecutionTimeInMs")(maximumExecutionTimeInMs.asInstanceOf[js.Any])
    if (timeoutIntervalInMs != null) __obj.updateDynamic("timeoutIntervalInMs")(timeoutIntervalInMs.asInstanceOf[js.Any])
    if (!js.isUndefined(useTransactionalMD5)) __obj.updateDynamic("useTransactionalMD5")(useTransactionalMD5)
    __obj.asInstanceOf[CreateBlockOptions]
  }
}

