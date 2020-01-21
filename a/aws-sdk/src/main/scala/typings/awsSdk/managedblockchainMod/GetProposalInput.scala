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
}

