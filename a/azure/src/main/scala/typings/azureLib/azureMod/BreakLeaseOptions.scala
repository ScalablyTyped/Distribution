package typings
package azureLib.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BreakLeaseOptions extends AccessConditionsOptions {
  var leaseBreakPeriod: js.UndefOr[scala.Double] = js.undefined
}

object BreakLeaseOptions {
  @scala.inline
  def apply(
    accessConditions: StorageAccessCondition = null,
    leaseBreakPeriod: scala.Int | scala.Double = null,
    locationMode: java.lang.String = null,
    maximumExecutionTimeInMs: scala.Int | scala.Double = null,
    timeoutIntervalInMs: scala.Int | scala.Double = null
  ): BreakLeaseOptions = {
    val __obj = js.Dynamic.literal()
    if (accessConditions != null) __obj.updateDynamic("accessConditions")(accessConditions)
    if (leaseBreakPeriod != null) __obj.updateDynamic("leaseBreakPeriod")(leaseBreakPeriod.asInstanceOf[js.Any])
    if (locationMode != null) __obj.updateDynamic("locationMode")(locationMode)
    if (maximumExecutionTimeInMs != null) __obj.updateDynamic("maximumExecutionTimeInMs")(maximumExecutionTimeInMs.asInstanceOf[js.Any])
    if (timeoutIntervalInMs != null) __obj.updateDynamic("timeoutIntervalInMs")(timeoutIntervalInMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreakLeaseOptions]
  }
}

