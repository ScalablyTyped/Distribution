package typings.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Proposal extends js.Object {
  
  /**
    * The actions to perform on the network if the proposal is APPROVED.
    */
  var Actions: js.UndefOr[ProposalActions] = js.native
  
  /**
    *  The date and time that the proposal was created. 
    */
  var CreationDate: js.UndefOr[Timestamp] = js.native
  
  /**
    * The description of the proposal.
    */
  var Description: js.UndefOr[DescriptionString] = js.native
  
  /**
    *  The date and time that the proposal expires. This is the CreationDate plus the ProposalDurationInHours that is specified in the ProposalThresholdPolicy. After this date and time, if members have not cast enough votes to determine the outcome according to the voting policy, the proposal is EXPIRED and Actions are not carried out. 
    */
  var ExpirationDate: js.UndefOr[Timestamp] = js.native
  
  /**
    * The unique identifier of the network for which the proposal is made.
    */
  var NetworkId: js.UndefOr[ResourceIdString] = js.native
  
  /**
    *  The current total of NO votes cast on the proposal by members. 
    */
  var NoVoteCount: js.UndefOr[VoteCount] = js.native
  
  /**
    *  The number of votes remaining to be cast on the proposal by members. In other words, the number of members minus the sum of YES votes and NO votes. 
    */
  var OutstandingVoteCount: js.UndefOr[VoteCount] = js.native
  
  /**
    * The unique identifier of the proposal.
    */
  var ProposalId: js.UndefOr[ResourceIdString] = js.native
  
  /**
    * The unique identifier of the member that created the proposal.
    */
  var ProposedByMemberId: js.UndefOr[ResourceIdString] = js.native
  
  /**
    * The name of the member that created the proposal.
    */
  var ProposedByMemberName: js.UndefOr[NetworkMemberNameString] = js.native
  
  /**
    * The status of the proposal. Values are as follows:    IN_PROGRESS - The proposal is active and open for member voting.    APPROVED - The proposal was approved with sufficient YES votes among members according to the VotingPolicy specified for the Network. The specified proposal actions are carried out.    REJECTED - The proposal was rejected with insufficient YES votes among members according to the VotingPolicy specified for the Network. The specified ProposalActions are not carried out.    EXPIRED - Members did not cast the number of votes required to determine the proposal outcome before the proposal expired. The specified ProposalActions are not carried out.    ACTION_FAILED - One or more of the specified ProposalActions in a proposal that was approved could not be completed because of an error. The ACTION_FAILED status occurs even if only one ProposalAction fails and other actions are successful.  
    */
  var Status: js.UndefOr[ProposalStatus] = js.native
  
  /**
    *  The current total of YES votes cast on the proposal by members. 
    */
  var YesVoteCount: js.UndefOr[VoteCount] = js.native
}
object Proposal {
  
  @scala.inline
  def apply(): Proposal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Proposal]
  }
  
  @scala.inline
  implicit class ProposalOps[Self <: Proposal] (val x: Self) extends AnyVal {
    
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
    def setActions(value: ProposalActions): Self = this.set("Actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActions: Self = this.set("Actions", js.undefined)
    
    @scala.inline
    def setCreationDate(value: Timestamp): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationDate: Self = this.set("CreationDate", js.undefined)
    
    @scala.inline
    def setDescription(value: DescriptionString): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setExpirationDate(value: Timestamp): Self = this.set("ExpirationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpirationDate: Self = this.set("ExpirationDate", js.undefined)
    
    @scala.inline
    def setNetworkId(value: ResourceIdString): Self = this.set("NetworkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkId: Self = this.set("NetworkId", js.undefined)
    
    @scala.inline
    def setNoVoteCount(value: VoteCount): Self = this.set("NoVoteCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoVoteCount: Self = this.set("NoVoteCount", js.undefined)
    
    @scala.inline
    def setOutstandingVoteCount(value: VoteCount): Self = this.set("OutstandingVoteCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutstandingVoteCount: Self = this.set("OutstandingVoteCount", js.undefined)
    
    @scala.inline
    def setProposalId(value: ResourceIdString): Self = this.set("ProposalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProposalId: Self = this.set("ProposalId", js.undefined)
    
    @scala.inline
    def setProposedByMemberId(value: ResourceIdString): Self = this.set("ProposedByMemberId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProposedByMemberId: Self = this.set("ProposedByMemberId", js.undefined)
    
    @scala.inline
    def setProposedByMemberName(value: NetworkMemberNameString): Self = this.set("ProposedByMemberName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProposedByMemberName: Self = this.set("ProposedByMemberName", js.undefined)
    
    @scala.inline
    def setStatus(value: ProposalStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setYesVoteCount(value: VoteCount): Self = this.set("YesVoteCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYesVoteCount: Self = this.set("YesVoteCount", js.undefined)
  }
}
