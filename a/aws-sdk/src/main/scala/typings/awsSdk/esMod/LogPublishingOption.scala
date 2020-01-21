package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogPublishingOption extends js.Object {
  var CloudWatchLogsLogGroupArn: js.UndefOr[typings.awsSdk.esMod.CloudWatchLogsLogGroupArn] = js.native
  /**
    *  Specifies whether given log publishing option is enabled or not.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
}

object LogPublishingOption {
  @scala.inline
  def apply(
    CloudWatchLogsLogGroupArn: CloudWatchLogsLogGroupArn = null,
    Enabled: js.UndefOr[scala.Boolean] = js.undefined
  ): LogPublishingOption = {
    val __obj = js.Dynamic.literal()
    if (CloudWatchLogsLogGroupArn != null) __obj.updateDynamic("CloudWatchLogsLogGroupArn")(CloudWatchLogsLogGroupArn.asInstanceOf[js.Any])
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogPublishingOption]
  }
}

