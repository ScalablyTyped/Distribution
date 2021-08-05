package typings.awsSdk.managedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApprovalThresholdPolicy extends StObject {
  
  /**
    * The duration from the time that a proposal is created until it expires. If members cast neither the required number of YES votes to approve the proposal nor the number of NO votes required to reject it before the duration expires, the proposal is EXPIRED and ProposalActions are not carried out.
    */
  var ProposalDurationInHours: js.UndefOr[ProposalDurationInt] = js.undefined
  
  /**
    * Determines whether the vote percentage must be greater than the ThresholdPercentage or must be greater than or equal to the ThreholdPercentage to be approved.
    */
  var ThresholdComparator: js.UndefOr[typings.awsSdk.managedblockchainMod.ThresholdComparator] = js.undefined
  
  /**
    * The percentage of votes among all members that must be YES for a proposal to be approved. For example, a ThresholdPercentage value of 50 indicates 50%. The ThresholdComparator determines the precise comparison. If a ThresholdPercentage value of 50 is specified on a network with 10 members, along with a ThresholdComparator value of GREATER_THAN, this indicates that 6 YES votes are required for the proposal to be approved.
    */
  var ThresholdPercentage: js.UndefOr[ThresholdPercentageInt] = js.undefined
}
object ApprovalThresholdPolicy {
  
  inline def apply(): ApprovalThresholdPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApprovalThresholdPolicy]
  }
  
  extension [Self <: ApprovalThresholdPolicy](x: Self) {
    
    inline def setProposalDurationInHours(value: ProposalDurationInt): Self = StObject.set(x, "ProposalDurationInHours", value.asInstanceOf[js.Any])
    
    inline def setProposalDurationInHoursUndefined: Self = StObject.set(x, "ProposalDurationInHours", js.undefined)
    
    inline def setThresholdComparator(value: ThresholdComparator): Self = StObject.set(x, "ThresholdComparator", value.asInstanceOf[js.Any])
    
    inline def setThresholdComparatorUndefined: Self = StObject.set(x, "ThresholdComparator", js.undefined)
    
    inline def setThresholdPercentage(value: ThresholdPercentageInt): Self = StObject.set(x, "ThresholdPercentage", value.asInstanceOf[js.Any])
    
    inline def setThresholdPercentageUndefined: Self = StObject.set(x, "ThresholdPercentage", js.undefined)
  }
}
