package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionLogOptions extends js.Object {
  /**
    * The name of the CloudWatch Logs log group.
    */
  var CloudwatchLogGroup: js.UndefOr[String] = js.native
  /**
    * The name of the CloudWatch Logs log stream to which the connection data is published.
    */
  var CloudwatchLogStream: js.UndefOr[String] = js.native
  /**
    * Indicates whether connection logging is enabled.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
}

object ConnectionLogOptions {
  @scala.inline
  def apply(
    CloudwatchLogGroup: String = null,
    CloudwatchLogStream: String = null,
    Enabled: js.UndefOr[Boolean] = js.undefined
  ): ConnectionLogOptions = {
    val __obj = js.Dynamic.literal()
    if (CloudwatchLogGroup != null) __obj.updateDynamic("CloudwatchLogGroup")(CloudwatchLogGroup.asInstanceOf[js.Any])
    if (CloudwatchLogStream != null) __obj.updateDynamic("CloudwatchLogStream")(CloudwatchLogStream.asInstanceOf[js.Any])
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionLogOptions]
  }
}

