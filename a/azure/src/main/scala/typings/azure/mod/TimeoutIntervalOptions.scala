package typings.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeoutIntervalOptions extends js.Object {
  var locationMode: js.UndefOr[String] = js.undefined
  var maximumExecutionTimeInMs: js.UndefOr[Double] = js.undefined
  var timeoutIntervalInMs: js.UndefOr[Double] = js.undefined
}

object TimeoutIntervalOptions {
  @scala.inline
  def apply(
    locationMode: String = null,
    maximumExecutionTimeInMs: js.UndefOr[Double] = js.undefined,
    timeoutIntervalInMs: js.UndefOr[Double] = js.undefined
  ): TimeoutIntervalOptions = {
    val __obj = js.Dynamic.literal()
    if (locationMode != null) __obj.updateDynamic("locationMode")(locationMode.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumExecutionTimeInMs)) __obj.updateDynamic("maximumExecutionTimeInMs")(maximumExecutionTimeInMs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeoutIntervalInMs)) __obj.updateDynamic("timeoutIntervalInMs")(timeoutIntervalInMs.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeoutIntervalOptions]
  }
}

