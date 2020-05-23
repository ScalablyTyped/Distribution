package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionLogResponseOptions extends js.Object {
  /**
    * The name of the Amazon CloudWatch Logs log group to which connection logging data is published.
    */
  var CloudwatchLogGroup: js.UndefOr[String] = js.native
  /**
    * The name of the Amazon CloudWatch Logs log stream to which connection logging data is published.
    */
  var CloudwatchLogStream: js.UndefOr[String] = js.native
  /**
    * Indicates whether client connection logging is enabled for the Client VPN endpoint.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
}

object ConnectionLogResponseOptions {
  @scala.inline
  def apply(
    CloudwatchLogGroup: String = null,
    CloudwatchLogStream: String = null,
    Enabled: js.UndefOr[Boolean] = js.undefined
  ): ConnectionLogResponseOptions = {
    val __obj = js.Dynamic.literal()
    if (CloudwatchLogGroup != null) __obj.updateDynamic("CloudwatchLogGroup")(CloudwatchLogGroup.asInstanceOf[js.Any])
    if (CloudwatchLogStream != null) __obj.updateDynamic("CloudwatchLogStream")(CloudwatchLogStream.asInstanceOf[js.Any])
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionLogResponseOptions]
  }
}

