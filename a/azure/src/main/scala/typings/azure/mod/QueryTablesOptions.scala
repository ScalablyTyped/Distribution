package typings.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryTablesOptions extends TimeoutIntervalOptions {
  var nextTableName: js.UndefOr[String] = js.undefined
}

object QueryTablesOptions {
  @scala.inline
  def apply(
    locationMode: String = null,
    maximumExecutionTimeInMs: js.UndefOr[Double] = js.undefined,
    nextTableName: String = null,
    timeoutIntervalInMs: js.UndefOr[Double] = js.undefined
  ): QueryTablesOptions = {
    val __obj = js.Dynamic.literal()
    if (locationMode != null) __obj.updateDynamic("locationMode")(locationMode.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumExecutionTimeInMs)) __obj.updateDynamic("maximumExecutionTimeInMs")(maximumExecutionTimeInMs.get.asInstanceOf[js.Any])
    if (nextTableName != null) __obj.updateDynamic("nextTableName")(nextTableName.asInstanceOf[js.Any])
    if (!js.isUndefined(timeoutIntervalInMs)) __obj.updateDynamic("timeoutIntervalInMs")(timeoutIntervalInMs.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryTablesOptions]
  }
}

