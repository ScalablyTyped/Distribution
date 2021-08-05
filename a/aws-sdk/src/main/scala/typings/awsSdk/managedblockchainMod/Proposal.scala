package typings.awsSdk.managedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Proposal extends StObject {
  
  /**
    * The actions to perform on the network if the proposal is APPROVED.
    */
  var Actions: js.UndefOr[ProposalActions] = js.undefined
  
  /**
    *  The date and time that the proposal was created. 
    */
  var CreationDate: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The description of the proposal.
    */
  var Description: js.UndefOr[DescriptionString] = js.undefined
  
  /**
    *  The date and time that the proposal expires. This is the CreationDate plus the ProposalDurationInHours that is specified in the ProposalThresholdPolicy. After this date and time, if members have not cast enough votes to determine the outcome according to the voting policy, the proposal is EXPIRED and Actions are not carried out. 
    */
  var ExpirationDate: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The unique identifier of the network for which the proposal is made.
    */
  var NetworkId: js.UndefOr[ResourceIdString] = js.undefined
  
  /**
    *  The current total of NO votes cast on the proposal by members. 
    */
  var NoVoteCount: js.UndefOr[VoteCount] = js.undefined
  
  /**
    *  The number of votes remaining to be cast on the proposal by members. In other words, the number of members minus the sum of YES votes and NO votes. 
    */
  var OutstandingVoteCount: js.UndefOr[VoteCount] = js.undefined
  
  /**
    * The unique identifier of the proposal.
    */
  var ProposalId: js.UndefOr[ResourceIdString] = js.undefined
  
  /**
    * The unique identifier of the member that created the proposal.
    */
  var ProposedByMemberId: js.UndefOr[ResourceIdString] = js.undefined
  
  /**
    * The name of the member that created the proposal.
    */
  var ProposedByMemberName: js.UndefOr[NetworkMemberNameString] = js.undefined
  
  /**
    * The status of the proposal. Values are as follows:    IN_PROGRESS - The proposal is active and open for member voting.    APPROVED - The proposal was approved with sufficient YES votes among members according to the VotingPolicy specified for the Network. The specified proposal actions are carried out.    REJECTED - The proposal was rejected with insufficient YES votes among members according to the VotingPolicy specified for the Network. The specified ProposalActions are not carried out.    EXPIRED - Members did not cast the number of votes required to determine the proposal outcome before the proposal expired. The specified ProposalActions are not carried out.    ACTION_FAILED - One or more of the specified ProposalActions in a proposal that was approved could not be completed because of an error. The ACTION_FAILED status occurs even if only one ProposalAction fails and other actions are successful.  
    */
  var Status: js.UndefOr[ProposalStatus] = js.undefined
  
  /**
    *  The current total of YES votes cast on the proposal by members. 
    */
  var YesVoteCount: js.UndefOr[VoteCount] = js.undefined
}
object Proposal {
  
  inline def apply(): Proposal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Proposal]
  }
  
  extension [Self <: Proposal](x: Self) {
    
    inline def setActions(value: ProposalActions): Self = StObject.set(x, "Actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "Actions", js.undefined)
    
    inline def setCreationDate(value: Timestamp): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setDescription(value: DescriptionString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setExpirationDate(value: Timestamp): Self = StObject.set(x, "ExpirationDate", value.asInstanceOf[js.Any])
    
    inline def setExpirationDateUndefined: Self = StObject.set(x, "ExpirationDate", js.undefined)
    
    inline def setNetworkId(value: ResourceIdString): Self = StObject.set(x, "NetworkId", value.asInstanceOf[js.Any])
    
    inline def setNetworkIdUndefined: Self = StObject.set(x, "NetworkId", js.undefined)
    
    inline def setNoVoteCount(value: VoteCount): Self = StObject.set(x, "NoVoteCount", value.asInstanceOf[js.Any])
    
    inline def setNoVoteCountUndefined: Self = StObject.set(x, "NoVoteCount", js.undefined)
    
    inline def setOutstandingVoteCount(value: VoteCount): Self = StObject.set(x, "OutstandingVoteCount", value.asInstanceOf[js.Any])
    
    inline def setOutstandingVoteCountUndefined: Self = StObject.set(x, "OutstandingVoteCount", js.undefined)
    
    inline def setProposalId(value: ResourceIdString): Self = StObject.set(x, "ProposalId", value.asInstanceOf[js.Any])
    
    inline def setProposalIdUndefined: Self = StObject.set(x, "ProposalId", js.undefined)
    
    inline def setProposedByMemberId(value: ResourceIdString): Self = StObject.set(x, "ProposedByMemberId", value.asInstanceOf[js.Any])
    
    inline def setProposedByMemberIdUndefined: Self = StObject.set(x, "ProposedByMemberId", js.undefined)
    
    inline def setProposedByMemberName(value: NetworkMemberNameString): Self = StObject.set(x, "ProposedByMemberName", value.asInstanceOf[js.Any])
    
    inline def setProposedByMemberNameUndefined: Self = StObject.set(x, "ProposedByMemberName", js.undefined)
    
    inline def setStatus(value: ProposalStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setYesVoteCount(value: VoteCount): Self = StObject.set(x, "YesVoteCount", value.asInstanceOf[js.Any])
    
    inline def setYesVoteCountUndefined: Self = StObject.set(x, "YesVoteCount", js.undefined)
  }
}
