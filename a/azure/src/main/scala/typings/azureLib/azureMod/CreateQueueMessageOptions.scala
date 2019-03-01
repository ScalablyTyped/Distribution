package typings
package azureLib.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateQueueMessageOptions extends TimeoutIntervalOptions {
  var messagettl: js.UndefOr[scala.Double] = js.undefined
  var visibilitytimeout: js.UndefOr[scala.Double] = js.undefined
}

object CreateQueueMessageOptions {
  @scala.inline
  def apply(
    locationMode: java.lang.String = null,
    maximumExecutionTimeInMs: scala.Int | scala.Double = null,
    messagettl: scala.Int | scala.Double = null,
    timeoutIntervalInMs: scala.Int | scala.Double = null,
    visibilitytimeout: scala.Int | scala.Double = null
  ): CreateQueueMessageOptions = {
    val __obj = js.Dynamic.literal()
    if (locationMode != null) __obj.updateDynamic("locationMode")(locationMode)
    if (maximumExecutionTimeInMs != null) __obj.updateDynamic("maximumExecutionTimeInMs")(maximumExecutionTimeInMs.asInstanceOf[js.Any])
    if (messagettl != null) __obj.updateDynamic("messagettl")(messagettl.asInstanceOf[js.Any])
    if (timeoutIntervalInMs != null) __obj.updateDynamic("timeoutIntervalInMs")(timeoutIntervalInMs.asInstanceOf[js.Any])
    if (visibilitytimeout != null) __obj.updateDynamic("visibilitytimeout")(visibilitytimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateQueueMessageOptions]
  }
}

