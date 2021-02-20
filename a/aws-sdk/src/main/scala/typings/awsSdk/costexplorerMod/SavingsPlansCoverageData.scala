package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SavingsPlansCoverageData extends StObject {
  
  /**
    * The percentage of your existing Savings Plans covered usage, divided by all of your eligible Savings Plans usage in an account(or set of accounts).
    */
  var CoveragePercentage: js.UndefOr[GenericString] = js.native
  
  /**
    * The cost of your AWS usage at the public On-Demand rate.
    */
  var OnDemandCost: js.UndefOr[GenericString] = js.native
  
  /**
    * The amount of your AWS usage that is covered by a Savings Plans.
    */
  var SpendCoveredBySavingsPlans: js.UndefOr[GenericString] = js.native
  
  /**
    * The total cost of your AWS usage, regardless of your purchase option.
    */
  var TotalCost: js.UndefOr[GenericString] = js.native
}
object SavingsPlansCoverageData {
  
  @scala.inline
  def apply(): SavingsPlansCoverageData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsPlansCoverageData]
  }
  
  @scala.inline
  implicit class SavingsPlansCoverageDataMutableBuilder[Self <: SavingsPlansCoverageData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoveragePercentage(value: GenericString): Self = StObject.set(x, "CoveragePercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoveragePercentageUndefined: Self = StObject.set(x, "CoveragePercentage", js.undefined)
    
    @scala.inline
    def setOnDemandCost(value: GenericString): Self = StObject.set(x, "OnDemandCost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDemandCostUndefined: Self = StObject.set(x, "OnDemandCost", js.undefined)
    
    @scala.inline
    def setSpendCoveredBySavingsPlans(value: GenericString): Self = StObject.set(x, "SpendCoveredBySavingsPlans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpendCoveredBySavingsPlansUndefined: Self = StObject.set(x, "SpendCoveredBySavingsPlans", js.undefined)
    
    @scala.inline
    def setTotalCost(value: GenericString): Self = StObject.set(x, "TotalCost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalCostUndefined: Self = StObject.set(x, "TotalCost", js.undefined)
  }
}
