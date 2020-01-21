package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateVPCEConfigurationResult extends js.Object {
  /**
    * An object that contains information about your VPC endpoint configuration.
    */
  var vpceConfiguration: js.UndefOr[VPCEConfiguration] = js.native
}

object UpdateVPCEConfigurationResult {
  @scala.inline
  def apply(vpceConfiguration: VPCEConfiguration = null): UpdateVPCEConfigurationResult = {
    val __obj = js.Dynamic.literal()
    if (vpceConfiguration != null) __obj.updateDynamic("vpceConfiguration")(vpceConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVPCEConfigurationResult]
  }
}

