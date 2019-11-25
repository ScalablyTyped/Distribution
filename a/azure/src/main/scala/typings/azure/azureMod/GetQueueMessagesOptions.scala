package typings.azure.azureMod

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
    maximumExecutionTimeInMs: Int | Double = null,
    numofmessages: Int | Double = null,
    peekonly: js.UndefOr[Boolean] = js.undefined,
    timeoutIntervalInMs: Int | Double = null,
    visibilitytimeout: Int | Double = null
  ): GetQueueMessagesOptions = {
    val __obj = js.Dynamic.literal()
    if (locationMode != null) __obj.updateDynamic("locationMode")(locationMode.asInstanceOf[js.Any])
    if (maximumExecutionTimeInMs != null) __obj.updateDynamic("maximumExecutionTimeInMs")(maximumExecutionTimeInMs.asInstanceOf[js.Any])
    if (numofmessages != null) __obj.updateDynamic("numofmessages")(numofmessages.asInstanceOf[js.Any])
    if (!js.isUndefined(peekonly)) __obj.updateDynamic("peekonly")(peekonly.asInstanceOf[js.Any])
    if (timeoutIntervalInMs != null) __obj.updateDynamic("timeoutIntervalInMs")(timeoutIntervalInMs.asInstanceOf[js.Any])
    if (visibilitytimeout != null) __obj.updateDynamic("visibilitytimeout")(visibilitytimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetQueueMessagesOptions]
  }
}

