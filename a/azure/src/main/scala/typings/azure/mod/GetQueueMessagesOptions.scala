package typings.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetQueueMessagesOptions extends PeekQueueMessagesOptions {
  var peekonly: js.UndefOr[Boolean] = js.undefined
  var visibilitytimeout: js.UndefOr[Double] = js.undefined
}

object GetQueueMessagesOptions {
  @scala.inline
  def apply(
    locationMode: String = null,
    maximumExecutionTimeInMs: js.UndefOr[Double] = js.undefined,
    numofmessages: js.UndefOr[Double] = js.undefined,
    peekonly: js.UndefOr[Boolean] = js.undefined,
    timeoutIntervalInMs: js.UndefOr[Double] = js.undefined,
    visibilitytimeout: js.UndefOr[Double] = js.undefined
  ): GetQueueMessagesOptions = {
    val __obj = js.Dynamic.literal()
    if (locationMode != null) __obj.updateDynamic("locationMode")(locationMode.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumExecutionTimeInMs)) __obj.updateDynamic("maximumExecutionTimeInMs")(maximumExecutionTimeInMs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numofmessages)) __obj.updateDynamic("numofmessages")(numofmessages.get.asInstanceOf[js.Any])
    if (!js.isUndefined(peekonly)) __obj.updateDynamic("peekonly")(peekonly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeoutIntervalInMs)) __obj.updateDynamic("timeoutIntervalInMs")(timeoutIntervalInMs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visibilitytimeout)) __obj.updateDynamic("visibilitytimeout")(visibilitytimeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetQueueMessagesOptions]
  }
}

