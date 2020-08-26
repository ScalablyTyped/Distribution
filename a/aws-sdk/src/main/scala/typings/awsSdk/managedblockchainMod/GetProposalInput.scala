package typings.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetProposalInput extends js.Object {
  /**
    * The unique identifier of the network for which the proposal is made.
    */
  var NetworkId: ResourceIdString = js.native
  /**
    * The unique identifier of the proposal.
    */
  var ProposalId: ResourceIdString = js.native
}

object GetProposalInput {
  @scala.inline
  def apply(NetworkId: ResourceIdString, ProposalId: ResourceIdString): GetProposalInput = {
    val __obj = js.Dynamic.literal(NetworkId = NetworkId.asInstanceOf[js.Any], ProposalId = ProposalId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetProposalInput]
  }
  @scala.inline
  implicit class GetProposalInputOps[Self <: GetProposalInput] (val x: Self) extends AnyVal {
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
    def setNetworkId(value: ResourceIdString): Self = this.set("NetworkId", value.asInstanceOf[js.Any])
    @scala.inline
    def setProposalId(value: ResourceIdString): Self = this.set("ProposalId", value.asInstanceOf[js.Any])
  }
  
}

