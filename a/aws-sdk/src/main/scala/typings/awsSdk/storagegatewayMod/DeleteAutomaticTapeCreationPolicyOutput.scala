package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteAutomaticTapeCreationPolicyOutput extends js.Object {
  var GatewayARN: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayARN] = js.native
}

object DeleteAutomaticTapeCreationPolicyOutput {
  @scala.inline
  def apply(GatewayARN: GatewayARN = null): DeleteAutomaticTapeCreationPolicyOutput = {
    val __obj = js.Dynamic.literal()
    if (GatewayARN != null) __obj.updateDynamic("GatewayARN")(GatewayARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAutomaticTapeCreationPolicyOutput]
  }
}

