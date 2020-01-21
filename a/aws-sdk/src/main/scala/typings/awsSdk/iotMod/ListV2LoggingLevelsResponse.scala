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
  def apply(logTargetConfigurations: LogTargetConfigurations = null, nextToken: NextToken = null): ListV2LoggingLevelsResponse = {
    val __obj = js.Dynamic.literal()
    if (logTargetConfigurations != null) __obj.updateDynamic("logTargetConfigurations")(logTargetConfigurations.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListV2LoggingLevelsResponse]
  }
}

