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
  @scala.inline
  implicit class UpdateAutomaticTapeCreationPolicyInputOps[Self <: UpdateAutomaticTapeCreationPolicyInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutomaticTapeCreationRulesVarargs(value: AutomaticTapeCreationRule*): Self = this.set("AutomaticTapeCreationRules", js.Array(value :_*))
    @scala.inline
    def setAutomaticTapeCreationRules(value: AutomaticTapeCreationRules): Self = this.set("AutomaticTapeCreationRules", value.asInstanceOf[js.Any])
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = this.set("GatewayARN", value.asInstanceOf[js.Any])
  }
  
}

