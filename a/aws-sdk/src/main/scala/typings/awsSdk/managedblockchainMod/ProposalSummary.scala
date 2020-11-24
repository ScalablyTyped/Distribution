package typings.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProposalSummary extends js.Object {
  
  /**
    *  The date and time that the proposal was created. 
    */
  var CreationDate: js.UndefOr[Timestamp] = js.native
  
  /**
    *  The description of the proposal. 
    */
  var Description: js.UndefOr[DescriptionString] = js.native
  
  /**
    *  The date and time that the proposal expires. This is the CreationDate plus the ProposalDurationInHours that is specified in the ProposalThresholdPolicy. After this date and time, if members have not cast enough votes to determine the outcome according to the voting policy, the proposal is EXPIRED and Actions are not carried out. 
    */
  var ExpirationDate: js.UndefOr[Timestamp] = js.native
  
  /**
    *  The unique identifier of the proposal. 
    */
  var ProposalId: js.UndefOr[ResourceIdString] = js.native
  
  /**
    *  The unique identifier of the member that created the proposal. 
    */
  var ProposedByMemberId: js.UndefOr[ResourceIdString] = js.native
  
  /**
    *  The name of the member that created the proposal. 
    */
  var ProposedByMemberName: js.UndefOr[NetworkMemberNameString] = js.native
  
  /**
    * The status of the proposal. Values are as follows:    IN_PROGRESS - The proposal is active and open for member voting.    APPROVED - The proposal was approved with sufficient YES votes among members according to the VotingPolicy specified for the Network. The specified proposal actions are carried out.    REJECTED - The proposal was rejected with insufficient YES votes among members according to the VotingPolicy specified for the Network. The specified ProposalActions are not carried out.    EXPIRED - Members did not cast the number of votes required to determine the proposal outcome before the proposal expired. The specified ProposalActions are not carried out.    ACTION_FAILED - One or more of the specified ProposalActions in a proposal that was approved could not be completed because of an error.  
    */
  var Status: js.UndefOr[ProposalStatus] = js.native
}
object ProposalSummary {
  
  @scala.inline
  def apply(): ProposalSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProposalSummary]
  }
  
  @scala.inline
  implicit class ProposalSummaryOps[Self <: ProposalSummary] (val x: Self) extends AnyVal {
    
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
  }
}
