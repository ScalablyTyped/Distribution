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
  def apply(): ListAutomaticTapeCreationPoliciesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAutomaticTapeCreationPoliciesOutput]
  }
  @scala.inline
  implicit class ListAutomaticTapeCreationPoliciesOutputOps[Self <: ListAutomaticTapeCreationPoliciesOutput] (val x: Self) extends AnyVal {
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
    def setAutomaticTapeCreationPolicyInfosVarargs(value: AutomaticTapeCreationPolicyInfo*): Self = this.set("AutomaticTapeCreationPolicyInfos", js.Array(value :_*))
    @scala.inline
    def setAutomaticTapeCreationPolicyInfos(value: AutomaticTapeCreationPolicyInfos): Self = this.set("AutomaticTapeCreationPolicyInfos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutomaticTapeCreationPolicyInfos: Self = this.set("AutomaticTapeCreationPolicyInfos", js.undefined)
  }
  
}

