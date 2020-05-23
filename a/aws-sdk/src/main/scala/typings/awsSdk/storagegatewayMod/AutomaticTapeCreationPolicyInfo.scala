package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutomaticTapeCreationPolicyInfo extends js.Object {
  /**
    * An automatic tape creation policy consists of a list of automatic tape creation rules. This returns the rules that determine when and how to automatically create new tapes.
    */
  var AutomaticTapeCreationRules: js.UndefOr[typings.awsSdk.storagegatewayMod.AutomaticTapeCreationRules] = js.native
  var GatewayARN: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayARN] = js.native
}

object AutomaticTapeCreationPolicyInfo {
  @scala.inline
  def apply(AutomaticTapeCreationRules: AutomaticTapeCreationRules = null, GatewayARN: GatewayARN = null): AutomaticTapeCreationPolicyInfo = {
    val __obj = js.Dynamic.literal()
    if (AutomaticTapeCreationRules != null) __obj.updateDynamic("AutomaticTapeCreationRules")(AutomaticTapeCreationRules.asInstanceOf[js.Any])
    if (GatewayARN != null) __obj.updateDynamic("GatewayARN")(GatewayARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutomaticTapeCreationPolicyInfo]
  }
}

