package typings.azure.azureMod

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
    maximumExecutionTimeInMs: Int | Double = null,
    messagetext: String = null,
    timeoutIntervalInMs: Int | Double = null
  ): UpdateQueueMessagesOptions = {
    val __obj = js.Dynamic.literal()
    if (locationMode != null) __obj.updateDynamic("locationMode")(locationMode)
    if (maximumExecutionTimeInMs != null) __obj.updateDynamic("maximumExecutionTimeInMs")(maximumExecutionTimeInMs.asInstanceOf[js.Any])
    if (messagetext != null) __obj.updateDynamic("messagetext")(messagetext)
    if (timeoutIntervalInMs != null) __obj.updateDynamic("timeoutIntervalInMs")(timeoutIntervalInMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateQueueMessagesOptions]
  }
}

