package typings
package azureLib.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageRangeOptions extends LeaseIdOptions {
  var rangeEnd: js.UndefOr[scala.Double] = js.undefined
  var rangeStart: js.UndefOr[scala.Double] = js.undefined
  var snapshotId: js.UndefOr[java.lang.String] = js.undefined
}

object PageRangeOptions {
  @scala.inline
  def apply(
    leaseId: java.lang.String = null,
    locationMode: java.lang.String = null,
    maximumExecutionTimeInMs: scala.Int | scala.Double = null,
    rangeEnd: scala.Int | scala.Double = null,
    rangeStart: scala.Int | scala.Double = null,
    snapshotId: java.lang.String = null,
    timeoutIntervalInMs: scala.Int | scala.Double = null
  ): PageRangeOptions = {
    val __obj = js.Dynamic.literal()
    if (leaseId != null) __obj.updateDynamic("leaseId")(leaseId)
    if (locationMode != null) __obj.updateDynamic("locationMode")(locationMode)
    if (maximumExecutionTimeInMs != null) __obj.updateDynamic("maximumExecutionTimeInMs")(maximumExecutionTimeInMs.asInstanceOf[js.Any])
    if (rangeEnd != null) __obj.updateDynamic("rangeEnd")(rangeEnd.asInstanceOf[js.Any])
    if (rangeStart != null) __obj.updateDynamic("rangeStart")(rangeStart.asInstanceOf[js.Any])
    if (snapshotId != null) __obj.updateDynamic("snapshotId")(snapshotId)
    if (timeoutIntervalInMs != null) __obj.updateDynamic("timeoutIntervalInMs")(timeoutIntervalInMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageRangeOptions]
  }
}

