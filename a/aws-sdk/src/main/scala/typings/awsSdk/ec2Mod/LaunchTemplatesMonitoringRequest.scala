package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplatesMonitoringRequest extends js.Object {
  /**
    * Specify true to enable detailed monitoring. Otherwise, basic monitoring is enabled.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
}

object LaunchTemplatesMonitoringRequest {
  @scala.inline
  def apply(Enabled: js.UndefOr[scala.Boolean] = js.undefined): LaunchTemplatesMonitoringRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplatesMonitoringRequest]
  }
}

