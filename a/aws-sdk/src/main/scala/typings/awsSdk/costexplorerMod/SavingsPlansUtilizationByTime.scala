package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SavingsPlansUtilizationByTime extends StObject {
  
  /**
    * The total amortized commitment for a Savings Plans. This includes the sum of the upfront and recurring Savings Plans fees.
    */
  var AmortizedCommitment: js.UndefOr[SavingsPlansAmortizedCommitment] = js.native
  
  /**
    * The amount saved by using existing Savings Plans. Savings returns both net savings from Savings Plans as well as the onDemandCostEquivalent of the Savings Plans when considering the utilization rate.
    */
  var Savings: js.UndefOr[SavingsPlansSavings] = js.native
  
  var TimePeriod: DateInterval = js.native
  
  /**
    * A ratio of your effectiveness of using existing Savings Plans to apply to workloads that are Savings Plans eligible.
    */
  var Utilization: SavingsPlansUtilization = js.native
}
object SavingsPlansUtilizationByTime {
  
  @scala.inline
  def apply(TimePeriod: DateInterval, Utilization: SavingsPlansUtilization): SavingsPlansUtilizationByTime = {
    val __obj = js.Dynamic.literal(TimePeriod = TimePeriod.asInstanceOf[js.Any], Utilization = Utilization.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavingsPlansUtilizationByTime]
  }
  
  @scala.inline
  implicit class SavingsPlansUtilizationByTimeMutableBuilder[Self <: SavingsPlansUtilizationByTime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmortizedCommitment(value: SavingsPlansAmortizedCommitment): Self = StObject.set(x, "AmortizedCommitment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmortizedCommitmentUndefined: Self = StObject.set(x, "AmortizedCommitment", js.undefined)
    
    @scala.inline
    def setSavings(value: SavingsPlansSavings): Self = StObject.set(x, "Savings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSavingsUndefined: Self = StObject.set(x, "Savings", js.undefined)
    
    @scala.inline
    def setTimePeriod(value: DateInterval): Self = StObject.set(x, "TimePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtilization(value: SavingsPlansUtilization): Self = StObject.set(x, "Utilization", value.asInstanceOf[js.Any])
  }
}
