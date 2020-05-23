package typings.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateQueueMessagesOptions extends TimeoutIntervalOptions {
  var messagetext: js.UndefOr[String] = js.undefined
}

object UpdateQueueMessagesOptions {
  @scala.inline
  def apply(
    locationMode: String = null,
    maximumExecutionTimeInMs: js.UndefOr[Double] = js.undefined,
    messagetext: String = null,
    timeoutIntervalInMs: js.UndefOr[Double] = js.undefined
  ): UpdateQueueMessagesOptions = {
    val __obj = js.Dynamic.literal()
    if (locationMode != null) __obj.updateDynamic("locationMode")(locationMode.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumExecutionTimeInMs)) __obj.updateDynamic("maximumExecutionTimeInMs")(maximumExecutionTimeInMs.get.asInstanceOf[js.Any])
    if (messagetext != null) __obj.updateDynamic("messagetext")(messagetext.asInstanceOf[js.Any])
    if (!js.isUndefined(timeoutIntervalInMs)) __obj.updateDynamic("timeoutIntervalInMs")(timeoutIntervalInMs.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateQueueMessagesOptions]
  }
}

