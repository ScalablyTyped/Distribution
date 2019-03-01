package typings
package azureLib.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryTablesOptions extends TimeoutIntervalOptions {
  var nextTableName: js.UndefOr[java.lang.String] = js.undefined
}

object QueryTablesOptions {
  @scala.inline
  def apply(
    locationMode: java.lang.String = null,
    maximumExecutionTimeInMs: scala.Int | scala.Double = null,
    nextTableName: java.lang.String = null,
    timeoutIntervalInMs: scala.Int | scala.Double = null
  ): QueryTablesOptions = {
    val __obj = js.Dynamic.literal()
    if (locationMode != null) __obj.updateDynamic("locationMode")(locationMode)
    if (maximumExecutionTimeInMs != null) __obj.updateDynamic("maximumExecutionTimeInMs")(maximumExecutionTimeInMs.asInstanceOf[js.Any])
    if (nextTableName != null) __obj.updateDynamic("nextTableName")(nextTableName)
    if (timeoutIntervalInMs != null) __obj.updateDynamic("timeoutIntervalInMs")(timeoutIntervalInMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryTablesOptions]
  }
}

