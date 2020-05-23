package typings.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeaseOptions extends AccessConditionsOptions {
  var leaseDuration: js.UndefOr[String] = js.undefined
  var proposedLeaseId: js.UndefOr[String] = js.undefined
}

object LeaseOptions {
  @scala.inline
  def apply(
    accessConditions: StorageAccessCondition = null,
    leaseDuration: String = null,
    locationMode: String = null,
    maximumExecutionTimeInMs: js.UndefOr[Double] = js.undefined,
    proposedLeaseId: String = null,
    timeoutIntervalInMs: js.UndefOr[Double] = js.undefined
  ): LeaseOptions = {
    val __obj = js.Dynamic.literal()
    if (accessConditions != null) __obj.updateDynamic("accessConditions")(accessConditions.asInstanceOf[js.Any])
    if (leaseDuration != null) __obj.updateDynamic("leaseDuration")(leaseDuration.asInstanceOf[js.Any])
    if (locationMode != null) __obj.updateDynamic("locationMode")(locationMode.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumExecutionTimeInMs)) __obj.updateDynamic("maximumExecutionTimeInMs")(maximumExecutionTimeInMs.get.asInstanceOf[js.Any])
    if (proposedLeaseId != null) __obj.updateDynamic("proposedLeaseId")(proposedLeaseId.asInstanceOf[js.Any])
    if (!js.isUndefined(timeoutIntervalInMs)) __obj.updateDynamic("timeoutIntervalInMs")(timeoutIntervalInMs.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeaseOptions]
  }
}

