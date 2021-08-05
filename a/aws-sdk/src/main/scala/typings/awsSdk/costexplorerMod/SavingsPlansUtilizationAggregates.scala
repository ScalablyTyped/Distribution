package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavingsPlansUtilizationAggregates extends StObject {
  
  /**
    * The total amortized commitment for a Savings Plans. This includes the sum of the upfront and recurring Savings Plans fees.
    */
  var AmortizedCommitment: js.UndefOr[SavingsPlansAmortizedCommitment] = js.undefined
  
  /**
    * The amount saved by using existing Savings Plans. Savings returns both net savings from Savings Plans, as well as the onDemandCostEquivalent of the Savings Plans when considering the utilization rate.
    */
  var Savings: js.UndefOr[SavingsPlansSavings] = js.undefined
  
  /**
    * A ratio of your effectiveness of using existing Savings Plans to apply to workloads that are Savings Plans eligible.
    */
  var Utilization: SavingsPlansUtilization
}
object SavingsPlansUtilizationAggregates {
  
  inline def apply(Utilization: SavingsPlansUtilization): SavingsPlansUtilizationAggregates = {
    val __obj = js.Dynamic.literal(Utilization = Utilization.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavingsPlansUtilizationAggregates]
  }
  
  extension [Self <: SavingsPlansUtilizationAggregates](x: Self) {
    
    inline def setAmortizedCommitment(value: SavingsPlansAmortizedCommitment): Self = StObject.set(x, "AmortizedCommitment", value.asInstanceOf[js.Any])
    
    inline def setAmortizedCommitmentUndefined: Self = StObject.set(x, "AmortizedCommitment", js.undefined)
    
    inline def setSavings(value: SavingsPlansSavings): Self = StObject.set(x, "Savings", value.asInstanceOf[js.Any])
    
    inline def setSavingsUndefined: Self = StObject.set(x, "Savings", js.undefined)
    
    inline def setUtilization(value: SavingsPlansUtilization): Self = StObject.set(x, "Utilization", value.asInstanceOf[js.Any])
  }
}
