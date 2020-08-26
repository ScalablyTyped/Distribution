package typings.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoggingConfiguration extends js.Object {
  /**
    * An array of objects that describes where your execution history events will be logged. Limited to size 1. Required, if your log level is not set to OFF.
    */
  var destinations: js.UndefOr[LogDestinationList] = js.native
  /**
    * Determines whether execution data is included in your log. When set to FALSE, data is excluded.
    */
  var includeExecutionData: js.UndefOr[IncludeExecutionData] = js.native
  /**
    * Defines which category of execution history events are logged.
    */
  var level: js.UndefOr[LogLevel] = js.native
}

object LoggingConfiguration {
  @scala.inline
  def apply(): LoggingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoggingConfiguration]
  }
  @scala.inline
  implicit class LoggingConfigurationOps[Self <: LoggingConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDestinationsVarargs(value: LogDestination*): Self = this.set("destinations", js.Array(value :_*))
    @scala.inline
    def setDestinations(value: LogDestinationList): Self = this.set("destinations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinations: Self = this.set("destinations", js.undefined)
    @scala.inline
    def setIncludeExecutionData(value: IncludeExecutionData): Self = this.set("includeExecutionData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeExecutionData: Self = this.set("includeExecutionData", js.undefined)
    @scala.inline
    def setLevel(value: LogLevel): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
  }
  
}

