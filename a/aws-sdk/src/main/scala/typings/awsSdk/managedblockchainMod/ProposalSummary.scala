package typings.awsSdk.managedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProposalSummary extends StObject {
  
  /**
    *  The date and time that the proposal was created. 
    */
  var CreationDate: js.UndefOr[Timestamp] = js.undefined
  
  /**
    *  The description of the proposal. 
    */
  var Description: js.UndefOr[DescriptionString] = js.undefined
  
  /**
    *  The date and time that the proposal expires. This is the CreationDate plus the ProposalDurationInHours that is specified in the ProposalThresholdPolicy. After this date and time, if members have not cast enough votes to determine the outcome according to the voting policy, the proposal is EXPIRED and Actions are not carried out. 
    */
  var ExpirationDate: js.UndefOr[Timestamp] = js.undefined
  
  /**
    *  The unique identifier of the proposal. 
    */
  var ProposalId: js.UndefOr[ResourceIdString] = js.undefined
  
  /**
    *  The unique identifier of the member that created the proposal. 
    */
  var ProposedByMemberId: js.UndefOr[ResourceIdString] = js.undefined
  
  /**
    *  The name of the member that created the proposal. 
    */
  var ProposedByMemberName: js.UndefOr[NetworkMemberNameString] = js.undefined
  
  /**
    * The status of the proposal. Values are as follows:    IN_PROGRESS - The proposal is active and open for member voting.    APPROVED - The proposal was approved with sufficient YES votes among members according to the VotingPolicy specified for the Network. The specified proposal actions are carried out.    REJECTED - The proposal was rejected with insufficient YES votes among members according to the VotingPolicy specified for the Network. The specified ProposalActions are not carried out.    EXPIRED - Members did not cast the number of votes required to determine the proposal outcome before the proposal expired. The specified ProposalActions are not carried out.    ACTION_FAILED - One or more of the specified ProposalActions in a proposal that was approved could not be completed because of an error.  
    */
  var Status: js.UndefOr[ProposalStatus] = js.undefined
}
object ProposalSummary {
  
  inline def apply(): ProposalSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProposalSummary]
  }
  
  extension [Self <: ProposalSummary](x: Self) {
    
    inline def setCreationDate(value: Timestamp): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setDescription(value: DescriptionString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setExpirationDate(value: Timestamp): Self = StObject.set(x, "ExpirationDate", value.asInstanceOf[js.Any])
    
    inline def setExpirationDateUndefined: Self = StObject.set(x, "ExpirationDate", js.undefined)
    
    inline def setProposalId(value: ResourceIdString): Self = StObject.set(x, "ProposalId", value.asInstanceOf[js.Any])
    
    inline def setProposalIdUndefined: Self = StObject.set(x, "ProposalId", js.undefined)
    
    inline def setProposedByMemberId(value: ResourceIdString): Self = StObject.set(x, "ProposedByMemberId", value.asInstanceOf[js.Any])
    
    inline def setProposedByMemberIdUndefined: Self = StObject.set(x, "ProposedByMemberId", js.undefined)
    
    inline def setProposedByMemberName(value: NetworkMemberNameString): Self = StObject.set(x, "ProposedByMemberName", value.asInstanceOf[js.Any])
    
    inline def setProposedByMemberNameUndefined: Self = StObject.set(x, "ProposedByMemberName", js.undefined)
    
    inline def setStatus(value: ProposalStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
