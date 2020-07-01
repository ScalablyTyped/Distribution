package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAutomaticTapeCreationPolicyInput extends js.Object {
  /**
    * An automatic tape creation policy consists of a list of automatic tape creation rules. The rules determine when and how to automatically create new tapes.
    */
  var AutomaticTapeCreationRules: typings.awsSdk.storagegatewayMod.AutomaticTapeCreationRules = js.native
  var GatewayARN: typings.awsSdk.storagegatewayMod.GatewayARN = js.native
}

object UpdateAutomaticTapeCreationPolicyInput {
  @scala.inline
  def apply(AutomaticTapeCreationRules: AutomaticTapeCreationRules, GatewayARN: GatewayARN): UpdateAutomaticTapeCreationPolicyInput = {
    val __obj = js.Dynamic.literal(AutomaticTapeCreationRules = AutomaticTapeCreationRules.asInstanceOf[js.Any], GatewayARN = GatewayARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAutomaticTapeCreationPolicyInput]
  }
}

