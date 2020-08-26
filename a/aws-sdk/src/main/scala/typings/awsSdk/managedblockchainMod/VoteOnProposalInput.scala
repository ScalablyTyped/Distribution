package typings.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VoteOnProposalInput extends js.Object {
  /**
    *  The unique identifier of the network. 
    */
  var NetworkId: ResourceIdString = js.native
  /**
    *  The unique identifier of the proposal. 
    */
  var ProposalId: ResourceIdString = js.native
  /**
    *  The value of the vote. 
    */
  var Vote: VoteValue = js.native
  /**
    * The unique identifier of the member casting the vote. 
    */
  var VoterMemberId: ResourceIdString = js.native
}

object VoteOnProposalInput {
  @scala.inline
  def apply(
    NetworkId: ResourceIdString,
    ProposalId: ResourceIdString,
    Vote: VoteValue,
    VoterMemberId: ResourceIdString
  ): VoteOnProposalInput = {
    val __obj = js.Dynamic.literal(NetworkId = NetworkId.asInstanceOf[js.Any], ProposalId = ProposalId.asInstanceOf[js.Any], Vote = Vote.asInstanceOf[js.Any], VoterMemberId = VoterMemberId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoteOnProposalInput]
  }
  @scala.inline
  implicit class VoteOnProposalInputOps[Self <: VoteOnProposalInput] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setVote(value: VoteValue): Self = this.set("Vote", value.asInstanceOf[js.Any])
    @scala.inline
    def setVoterMemberId(value: ResourceIdString): Self = this.set("VoterMemberId", value.asInstanceOf[js.Any])
  }
  
}

