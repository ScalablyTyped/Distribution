package typings.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VotingPolicy extends js.Object {
  /**
    * Defines the rules for the network for voting on proposals, such as the percentage of YES votes required for the proposal to be approved and the duration of the proposal. The policy applies to all proposals and is specified when the network is created.
    */
  var ApprovalThresholdPolicy: js.UndefOr[typings.awsSdk.managedblockchainMod.ApprovalThresholdPolicy] = js.native
}

object VotingPolicy {
  @scala.inline
  def apply(): VotingPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VotingPolicy]
  }
  @scala.inline
  implicit class VotingPolicyOps[Self <: VotingPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApprovalThresholdPolicy(value: ApprovalThresholdPolicy): Self = this.set("ApprovalThresholdPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApprovalThresholdPolicy: Self = this.set("ApprovalThresholdPolicy", js.undefined)
  }
  
}

