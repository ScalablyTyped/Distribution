package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudWatchLoggingOptions extends js.Object {
  /**
    * Enables or disables CloudWatch logging.
    */
  var Enabled: js.UndefOr[BooleanObject] = js.native
  /**
    * The CloudWatch group name for logging. This value is required if CloudWatch logging is enabled.
    */
  var LogGroupName: js.UndefOr[typings.awsSdk.firehoseMod.LogGroupName] = js.native
  /**
    * The CloudWatch log stream name for logging. This value is required if CloudWatch logging is enabled.
    */
  var LogStreamName: js.UndefOr[typings.awsSdk.firehoseMod.LogStreamName] = js.native
}

object CloudWatchLoggingOptions {
  @scala.inline
  def apply(
    Enabled: js.UndefOr[Boolean] = js.undefined,
    LogGroupName: LogGroupName = null,
    LogStreamName: LogStreamName = null
  ): CloudWatchLoggingOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.asInstanceOf[js.Any])
    if (LogGroupName != null) __obj.updateDynamic("LogGroupName")(LogGroupName.asInstanceOf[js.Any])
    if (LogStreamName != null) __obj.updateDynamic("LogStreamName")(LogStreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudWatchLoggingOptions]
  }
}

