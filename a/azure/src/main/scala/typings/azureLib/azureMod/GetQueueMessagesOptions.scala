package typings
package azureLib.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetQueueMessagesOptions extends PeekQueueMessagesOptions {
  var peekonly: js.UndefOr[scala.Boolean] = js.undefined
  var visibilitytimeout: js.UndefOr[scala.Double] = js.undefined
}

object GetQueueMessagesOptions {
  @scala.inline
  def apply(
    locationMode: java.lang.String = null,
    maximumExecutionTimeInMs: scala.Int | scala.Double = null,
    numofmessages: scala.Int | scala.Double = null,
    peekonly: js.UndefOr[scala.Boolean] = js.undefined,
    timeoutIntervalInMs: scala.Int | scala.Double = null,
    visibilitytimeout: scala.Int | scala.Double = null
  ): GetQueueMessagesOptions = {
    val __obj = js.Dynamic.literal()
    if (locationMode != null) __obj.updateDynamic("locationMode")(locationMode)
    if (maximumExecutionTimeInMs != null) __obj.updateDynamic("maximumExecutionTimeInMs")(maximumExecutionTimeInMs.asInstanceOf[js.Any])
    if (numofmessages != null) __obj.updateDynamic("numofmessages")(numofmessages.asInstanceOf[js.Any])
    if (!js.isUndefined(peekonly)) __obj.updateDynamic("peekonly")(peekonly)
    if (timeoutIntervalInMs != null) __obj.updateDynamic("timeoutIntervalInMs")(timeoutIntervalInMs.asInstanceOf[js.Any])
    if (visibilitytimeout != null) __obj.updateDynamic("visibilitytimeout")(visibilitytimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetQueueMessagesOptions]
  }
}

