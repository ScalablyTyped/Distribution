package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListV2LoggingLevelsResponse extends js.Object {
  /**
    * The logging configuration for a target.
    */
  var logTargetConfigurations: js.UndefOr[LogTargetConfigurations] = js.native
  /**
    * The token used to get the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListV2LoggingLevelsResponse {
  @scala.inline
  def apply(): ListV2LoggingLevelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListV2LoggingLevelsResponse]
  }
  @scala.inline
  implicit class ListV2LoggingLevelsResponseOps[Self <: ListV2LoggingLevelsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLogTargetConfigurationsVarargs(value: LogTargetConfiguration*): Self = this.set("logTargetConfigurations", js.Array(value :_*))
    @scala.inline
    def setLogTargetConfigurations(value: LogTargetConfigurations): Self = this.set("logTargetConfigurations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogTargetConfigurations: Self = this.set("logTargetConfigurations", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

