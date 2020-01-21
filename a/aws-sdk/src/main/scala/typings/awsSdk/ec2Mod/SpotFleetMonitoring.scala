package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpotFleetMonitoring extends js.Object {
  /**
    * Enables monitoring for the instance. Default: false 
    */
  var Enabled: js.UndefOr[Boolean] = js.native
}

object SpotFleetMonitoring {
  @scala.inline
  def apply(Enabled: js.UndefOr[scala.Boolean] = js.undefined): SpotFleetMonitoring = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpotFleetMonitoring]
  }
}

