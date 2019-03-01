package typings
package azureLib.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListQueuesOptions extends TimeoutIntervalOptions {
  var include: js.UndefOr[java.lang.String] = js.undefined
  var marker: java.lang.String
  var maxresults: js.UndefOr[scala.Double] = js.undefined
  var prefix: js.UndefOr[java.lang.String] = js.undefined
}

object ListQueuesOptions {
  @scala.inline
  def apply(
    marker: java.lang.String,
    include: java.lang.String = null,
    locationMode: java.lang.String = null,
    maximumExecutionTimeInMs: scala.Int | scala.Double = null,
    maxresults: scala.Int | scala.Double = null,
    prefix: java.lang.String = null,
    timeoutIntervalInMs: scala.Int | scala.Double = null
  ): ListQueuesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("marker")(marker)
    if (include != null) __obj.updateDynamic("include")(include)
    if (locationMode != null) __obj.updateDynamic("locationMode")(locationMode)
    if (maximumExecutionTimeInMs != null) __obj.updateDynamic("maximumExecutionTimeInMs")(maximumExecutionTimeInMs.asInstanceOf[js.Any])
    if (maxresults != null) __obj.updateDynamic("maxresults")(maxresults.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (timeoutIntervalInMs != null) __obj.updateDynamic("timeoutIntervalInMs")(timeoutIntervalInMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListQueuesOptions]
  }
}

