package typings.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageRangeOptions extends LeaseIdOptions {
  var rangeEnd: js.UndefOr[Double] = js.undefined
  var rangeStart: js.UndefOr[Double] = js.undefined
  var snapshotId: js.UndefOr[String] = js.undefined
}

object PageRangeOptions {
  @scala.inline
  def apply(
    leaseId: String = null,
    locationMode: String = null,
    maximumExecutionTimeInMs: js.UndefOr[Double] = js.undefined,
    rangeEnd: js.UndefOr[Double] = js.undefined,
    rangeStart: js.UndefOr[Double] = js.undefined,
    snapshotId: String = null,
    timeoutIntervalInMs: js.UndefOr[Double] = js.undefined
  ): PageRangeOptions = {
    val __obj = js.Dynamic.literal()
    if (leaseId != null) __obj.updateDynamic("leaseId")(leaseId.asInstanceOf[js.Any])
    if (locationMode != null) __obj.updateDynamic("locationMode")(locationMode.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumExecutionTimeInMs)) __obj.updateDynamic("maximumExecutionTimeInMs")(maximumExecutionTimeInMs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rangeEnd)) __obj.updateDynamic("rangeEnd")(rangeEnd.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rangeStart)) __obj.updateDynamic("rangeStart")(rangeStart.get.asInstanceOf[js.Any])
    if (snapshotId != null) __obj.updateDynamic("snapshotId")(snapshotId.asInstanceOf[js.Any])
    if (!js.isUndefined(timeoutIntervalInMs)) __obj.updateDynamic("timeoutIntervalInMs")(timeoutIntervalInMs.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageRangeOptions]
  }
}

