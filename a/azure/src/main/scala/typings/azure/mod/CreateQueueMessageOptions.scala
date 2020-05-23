package typings.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateQueueMessageOptions extends TimeoutIntervalOptions {
  var messagettl: js.UndefOr[Double] = js.undefined
  var visibilitytimeout: js.UndefOr[Double] = js.undefined
}

object CreateQueueMessageOptions {
  @scala.inline
  def apply(
    locationMode: String = null,
    maximumExecutionTimeInMs: js.UndefOr[Double] = js.undefined,
    messagettl: js.UndefOr[Double] = js.undefined,
    timeoutIntervalInMs: js.UndefOr[Double] = js.undefined,
    visibilitytimeout: js.UndefOr[Double] = js.undefined
  ): CreateQueueMessageOptions = {
    val __obj = js.Dynamic.literal()
    if (locationMode != null) __obj.updateDynamic("locationMode")(locationMode.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumExecutionTimeInMs)) __obj.updateDynamic("maximumExecutionTimeInMs")(maximumExecutionTimeInMs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(messagettl)) __obj.updateDynamic("messagettl")(messagettl.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeoutIntervalInMs)) __obj.updateDynamic("timeoutIntervalInMs")(timeoutIntervalInMs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visibilitytimeout)) __obj.updateDynamic("visibilitytimeout")(visibilitytimeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateQueueMessageOptions]
  }
}

