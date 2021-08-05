package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavingsPlansUtilizationDetail extends StObject {
  
  /**
    * The total amortized commitment for a Savings Plans. Includes the sum of the upfront and recurring Savings Plans fees.
    */
  var AmortizedCommitment: js.UndefOr[SavingsPlansAmortizedCommitment] = js.undefined
  
  /**
    * The attribute that applies to a specific Dimension.
    */
  var Attributes: js.UndefOr[typings.awsSdk.costexplorerMod.Attributes] = js.undefined
  
  /**
    * The amount saved by using existing Savings Plans. Savings returns both net savings from savings plans as well as the onDemandCostEquivalent of the Savings Plans when considering the utilization rate.
    */
  var Savings: js.UndefOr[SavingsPlansSavings] = js.undefined
  
  /**
    * The unique Amazon Resource Name (ARN) for a particular Savings Plan.
    */
  var SavingsPlanArn: js.UndefOr[typings.awsSdk.costexplorerMod.SavingsPlanArn] = js.undefined
  
  /**
    * A ratio of your effectiveness of using existing Savings Plans to apply to workloads that are Savings Plans eligible.
    */
  var Utilization: js.UndefOr[SavingsPlansUtilization] = js.undefined
}
object SavingsPlansUtilizationDetail {
  
  inline def apply(): SavingsPlansUtilizationDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsPlansUtilizationDetail]
  }
  
  extension [Self <: SavingsPlansUtilizationDetail](x: Self) {
    
    inline def setAmortizedCommitment(value: SavingsPlansAmortizedCommitment): Self = StObject.set(x, "AmortizedCommitment", value.asInstanceOf[js.Any])
    
    inline def setAmortizedCommitmentUndefined: Self = StObject.set(x, "AmortizedCommitment", js.undefined)
    
    inline def setAttributes(value: Attributes): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    inline def setSavings(value: SavingsPlansSavings): Self = StObject.set(x, "Savings", value.asInstanceOf[js.Any])
    
    inline def setSavingsPlanArn(value: SavingsPlanArn): Self = StObject.set(x, "SavingsPlanArn", value.asInstanceOf[js.Any])
    
    inline def setSavingsPlanArnUndefined: Self = StObject.set(x, "SavingsPlanArn", js.undefined)
    
    inline def setSavingsUndefined: Self = StObject.set(x, "Savings", js.undefined)
    
    inline def setUtilization(value: SavingsPlansUtilization): Self = StObject.set(x, "Utilization", value.asInstanceOf[js.Any])
    
    inline def setUtilizationUndefined: Self = StObject.set(x, "Utilization", js.undefined)
  }
}
