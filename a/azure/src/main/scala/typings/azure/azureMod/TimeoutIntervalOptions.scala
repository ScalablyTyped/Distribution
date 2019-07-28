package typings.azure.azureMod

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
    maximumExecutionTimeInMs: Int | Double = null,
    timeoutIntervalInMs: Int | Double = null
  ): TimeoutIntervalOptions = {
    val __obj = js.Dynamic.literal()
    if (locationMode != null) __obj.updateDynamic("locationMode")(locationMode)
    if (maximumExecutionTimeInMs != null) __obj.updateDynamic("maximumExecutionTimeInMs")(maximumExecutionTimeInMs.asInstanceOf[js.Any])
    if (timeoutIntervalInMs != null) __obj.updateDynamic("timeoutIntervalInMs")(timeoutIntervalInMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeoutIntervalOptions]
  }
}

