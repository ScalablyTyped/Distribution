package typings.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoggingConfiguration extends js.Object {
  /**
    * An object that describes where your execution history events will be logged. Limited to size 1. Required, if your log level is not set to OFF.
    */
  var destinations: js.UndefOr[LogDestinationList] = js.native
  /**
    * Determines whether execution history data is included in your log. When set to FALSE, data is excluded.
    */
  var includeExecutionData: js.UndefOr[IncludeExecutionData] = js.native
  /**
    * Defines which category of execution history events are logged.
    */
  var level: js.UndefOr[LogLevel] = js.native
}

object LoggingConfiguration {
  @scala.inline
  def apply(
    destinations: LogDestinationList = null,
    includeExecutionData: js.UndefOr[Boolean] = js.undefined,
    level: LogLevel = null
  ): LoggingConfiguration = {
    val __obj = js.Dynamic.literal()
    if (destinations != null) __obj.updateDynamic("destinations")(destinations.asInstanceOf[js.Any])
    if (!js.isUndefined(includeExecutionData)) __obj.updateDynamic("includeExecutionData")(includeExecutionData.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggingConfiguration]
  }
}

