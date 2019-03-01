package typings
package azureLib.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeaseOptions extends AccessConditionsOptions {
  var leaseDuration: js.UndefOr[java.lang.String] = js.undefined
  var proposedLeaseId: js.UndefOr[java.lang.String] = js.undefined
}

object LeaseOptions {
  @scala.inline
  def apply(
    accessConditions: StorageAccessCondition = null,
    leaseDuration: java.lang.String = null,
    locationMode: java.lang.String = null,
    maximumExecutionTimeInMs: scala.Int | scala.Double = null,
    proposedLeaseId: java.lang.String = null,
    timeoutIntervalInMs: scala.Int | scala.Double = null
  ): LeaseOptions = {
    val __obj = js.Dynamic.literal()
    if (accessConditions != null) __obj.updateDynamic("accessConditions")(accessConditions)
    if (leaseDuration != null) __obj.updateDynamic("leaseDuration")(leaseDuration)
    if (locationMode != null) __obj.updateDynamic("locationMode")(locationMode)
    if (maximumExecutionTimeInMs != null) __obj.updateDynamic("maximumExecutionTimeInMs")(maximumExecutionTimeInMs.asInstanceOf[js.Any])
    if (proposedLeaseId != null) __obj.updateDynamic("proposedLeaseId")(proposedLeaseId)
    if (timeoutIntervalInMs != null) __obj.updateDynamic("timeoutIntervalInMs")(timeoutIntervalInMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeaseOptions]
  }
}

