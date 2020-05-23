package typings.azure.mod

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
    maximumExecutionTimeInMs: js.UndefOr[Double] = js.undefined,
    timeoutIntervalInMs: js.UndefOr[Double] = js.undefined,
    useTransactionalMD5: js.UndefOr[Boolean] = js.undefined
  ): CreateBlockOptions = {
    val __obj = js.Dynamic.literal()
    if (accessConditions != null) __obj.updateDynamic("accessConditions")(accessConditions.asInstanceOf[js.Any])
    if (contentMD5 != null) __obj.updateDynamic("contentMD5")(contentMD5.asInstanceOf[js.Any])
    if (leaseId != null) __obj.updateDynamic("leaseId")(leaseId.asInstanceOf[js.Any])
    if (locationMode != null) __obj.updateDynamic("locationMode")(locationMode.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumExecutionTimeInMs)) __obj.updateDynamic("maximumExecutionTimeInMs")(maximumExecutionTimeInMs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeoutIntervalInMs)) __obj.updateDynamic("timeoutIntervalInMs")(timeoutIntervalInMs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useTransactionalMD5)) __obj.updateDynamic("useTransactionalMD5")(useTransactionalMD5.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBlockOptions]
  }
}

