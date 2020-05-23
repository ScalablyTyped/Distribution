package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudWatchLogsConfiguration extends js.Object {
  /**
    * Whether CloudWatch Logs is enabled for a layer.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
  /**
    * A list of configuration options for CloudWatch Logs.
    */
  var LogStreams: js.UndefOr[CloudWatchLogsLogStreams] = js.native
}

object CloudWatchLogsConfiguration {
  @scala.inline
  def apply(Enabled: js.UndefOr[Boolean] = js.undefined, LogStreams: CloudWatchLogsLogStreams = null): CloudWatchLogsConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.get.asInstanceOf[js.Any])
    if (LogStreams != null) __obj.updateDynamic("LogStreams")(LogStreams.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudWatchLogsConfiguration]
  }
}

