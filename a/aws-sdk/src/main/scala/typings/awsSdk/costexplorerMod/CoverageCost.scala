package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoverageCost extends StObject {
  
  /**
    * How much an On-Demand Instance costs.
    */
  var OnDemandCost: js.UndefOr[typings.awsSdk.costexplorerMod.OnDemandCost] = js.native
}
object CoverageCost {
  
  @scala.inline
  def apply(): CoverageCost = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoverageCost]
  }
  
  @scala.inline
  implicit class CoverageCostMutableBuilder[Self <: CoverageCost] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnDemandCost(value: OnDemandCost): Self = StObject.set(x, "OnDemandCost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDemandCostUndefined: Self = StObject.set(x, "OnDemandCost", js.undefined)
  }
}
