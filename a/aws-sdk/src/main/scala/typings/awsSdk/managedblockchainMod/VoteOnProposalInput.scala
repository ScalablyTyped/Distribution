package typings.awsSdk.managedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoteOnProposalInput extends StObject {
  
  /**
    *  The unique identifier of the network. 
    */
  var NetworkId: ResourceIdString
  
  /**
    *  The unique identifier of the proposal. 
    */
  var ProposalId: ResourceIdString
  
  /**
    *  The value of the vote. 
    */
  var Vote: VoteValue
  
  /**
    * The unique identifier of the member casting the vote. 
    */
  var VoterMemberId: ResourceIdString
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
  implicit class VoteOnProposalInputMutableBuilder[Self <: VoteOnProposalInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNetworkId(value: ResourceIdString): Self = StObject.set(x, "NetworkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProposalId(value: ResourceIdString): Self = StObject.set(x, "ProposalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVote(value: VoteValue): Self = StObject.set(x, "Vote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoterMemberId(value: ResourceIdString): Self = StObject.set(x, "VoterMemberId", value.asInstanceOf[js.Any])
  }
}
