package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavingsPlansSavings extends StObject {
  
  /**
    * The savings amount that you are accumulating for the usage that is covered by a Savings Plans, when compared to the On-Demand equivalent of the same usage.
    */
  var NetSavings: js.UndefOr[GenericString] = js.undefined
  
  /**
    * How much the amount that the usage would have cost if it was accrued at the On-Demand rate.
    */
  var OnDemandCostEquivalent: js.UndefOr[GenericString] = js.undefined
}
object SavingsPlansSavings {
  
  @scala.inline
  def apply(): SavingsPlansSavings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsPlansSavings]
  }
  
  @scala.inline
  implicit class SavingsPlansSavingsMutableBuilder[Self <: SavingsPlansSavings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNetSavings(value: GenericString): Self = StObject.set(x, "NetSavings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetSavingsUndefined: Self = StObject.set(x, "NetSavings", js.undefined)
    
    @scala.inline
    def setOnDemandCostEquivalent(value: GenericString): Self = StObject.set(x, "OnDemandCostEquivalent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDemandCostEquivalentUndefined: Self = StObject.set(x, "OnDemandCostEquivalent", js.undefined)
  }
}
