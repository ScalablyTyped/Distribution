package typings
package azureLib.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePagesOptions extends LeaseAccessConditionsOptions {
  var contentMD5: js.UndefOr[java.lang.String] = js.undefined
  var useTransactionalMD5: js.UndefOr[scala.Boolean] = js.undefined
}

object CreatePagesOptions {
  @scala.inline
  def apply(
    accessConditions: StorageAccessCondition = null,
    contentMD5: java.lang.String = null,
    leaseId: java.lang.String = null,
    locationMode: java.lang.String = null,
    maximumExecutionTimeInMs: scala.Int | scala.Double = null,
    timeoutIntervalInMs: scala.Int | scala.Double = null,
    useTransactionalMD5: js.UndefOr[scala.Boolean] = js.undefined
  ): CreatePagesOptions = {
    val __obj = js.Dynamic.literal()
    if (accessConditions != null) __obj.updateDynamic("accessConditions")(accessConditions)
    if (contentMD5 != null) __obj.updateDynamic("contentMD5")(contentMD5)
    if (leaseId != null) __obj.updateDynamic("leaseId")(leaseId)
    if (locationMode != null) __obj.updateDynamic("locationMode")(locationMode)
    if (maximumExecutionTimeInMs != null) __obj.updateDynamic("maximumExecutionTimeInMs")(maximumExecutionTimeInMs.asInstanceOf[js.Any])
    if (timeoutIntervalInMs != null) __obj.updateDynamic("timeoutIntervalInMs")(timeoutIntervalInMs.asInstanceOf[js.Any])
    if (!js.isUndefined(useTransactionalMD5)) __obj.updateDynamic("useTransactionalMD5")(useTransactionalMD5)
    __obj.asInstanceOf[CreatePagesOptions]
  }
}

