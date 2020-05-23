package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAutomaticTapeCreationPoliciesOutput extends js.Object {
  /**
    * Gets a listing of information about the gateway's automatic tape creation policies, including the automatic tape creation rules and the gateway that is using the policies.
    */
  var AutomaticTapeCreationPolicyInfos: js.UndefOr[typings.awsSdk.storagegatewayMod.AutomaticTapeCreationPolicyInfos] = js.native
}

object ListAutomaticTapeCreationPoliciesOutput {
  @scala.inline
  def apply(AutomaticTapeCreationPolicyInfos: AutomaticTapeCreationPolicyInfos = null): ListAutomaticTapeCreationPoliciesOutput = {
    val __obj = js.Dynamic.literal()
    if (AutomaticTapeCreationPolicyInfos != null) __obj.updateDynamic("AutomaticTapeCreationPolicyInfos")(AutomaticTapeCreationPolicyInfos.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAutomaticTapeCreationPoliciesOutput]
  }
}

