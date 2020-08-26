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
  def apply(): AutomaticTapeCreationPolicyInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutomaticTapeCreationPolicyInfo]
  }
  @scala.inline
  implicit class AutomaticTapeCreationPolicyInfoOps[Self <: AutomaticTapeCreationPolicyInfo] (val x: Self) extends AnyVal {
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
    def deleteAutomaticTapeCreationRules: Self = this.set("AutomaticTapeCreationRules", js.undefined)
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = this.set("GatewayARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGatewayARN: Self = this.set("GatewayARN", js.undefined)
  }
  
}

