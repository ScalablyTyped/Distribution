package typings.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BreakLeaseOptions extends AccessConditionsOptions {
  var leaseBreakPeriod: js.UndefOr[Double] = js.undefined
}

object BreakLeaseOptions {
  @scala.inline
  def apply(
    accessConditions: StorageAccessCondition = null,
    leaseBreakPeriod: js.UndefOr[Double] = js.undefined,
    locationMode: String = null,
    maximumExecutionTimeInMs: js.UndefOr[Double] = js.undefined,
    timeoutIntervalInMs: js.UndefOr[Double] = js.undefined
  ): BreakLeaseOptions = {
    val __obj = js.Dynamic.literal()
    if (accessConditions != null) __obj.updateDynamic("accessConditions")(accessConditions.asInstanceOf[js.Any])
    if (!js.isUndefined(leaseBreakPeriod)) __obj.updateDynamic("leaseBreakPeriod")(leaseBreakPeriod.get.asInstanceOf[js.Any])
    if (locationMode != null) __obj.updateDynamic("locationMode")(locationMode.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumExecutionTimeInMs)) __obj.updateDynamic("maximumExecutionTimeInMs")(maximumExecutionTimeInMs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeoutIntervalInMs)) __obj.updateDynamic("timeoutIntervalInMs")(timeoutIntervalInMs.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreakLeaseOptions]
  }
}

