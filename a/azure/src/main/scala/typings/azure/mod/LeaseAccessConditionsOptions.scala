package typings.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeaseAccessConditionsOptions extends LeaseIdOptions {
  var accessConditions: js.UndefOr[StorageAccessCondition] = js.undefined
}

object LeaseAccessConditionsOptions {
  @scala.inline
  def apply(
    accessConditions: StorageAccessCondition = null,
    leaseId: String = null,
    locationMode: String = null,
    maximumExecutionTimeInMs: js.UndefOr[Double] = js.undefined,
    timeoutIntervalInMs: js.UndefOr[Double] = js.undefined
  ): LeaseAccessConditionsOptions = {
    val __obj = js.Dynamic.literal()
    if (accessConditions != null) __obj.updateDynamic("accessConditions")(accessConditions.asInstanceOf[js.Any])
    if (leaseId != null) __obj.updateDynamic("leaseId")(leaseId.asInstanceOf[js.Any])
    if (locationMode != null) __obj.updateDynamic("locationMode")(locationMode.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumExecutionTimeInMs)) __obj.updateDynamic("maximumExecutionTimeInMs")(maximumExecutionTimeInMs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeoutIntervalInMs)) __obj.updateDynamic("timeoutIntervalInMs")(timeoutIntervalInMs.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeaseAccessConditionsOptions]
  }
}

