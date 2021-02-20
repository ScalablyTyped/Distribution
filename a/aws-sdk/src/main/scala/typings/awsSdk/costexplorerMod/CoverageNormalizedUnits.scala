package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoverageNormalizedUnits extends StObject {
  
  /**
    * The percentage of your used instance normalized units that a reservation covers.
    */
  var CoverageNormalizedUnitsPercentage: js.UndefOr[typings.awsSdk.costexplorerMod.CoverageNormalizedUnitsPercentage] = js.native
  
  /**
    * The number of normalized units that are covered by On-Demand Instances instead of a reservation.
    */
  var OnDemandNormalizedUnits: js.UndefOr[typings.awsSdk.costexplorerMod.OnDemandNormalizedUnits] = js.native
  
  /**
    * The number of normalized units that a reservation covers.
    */
  var ReservedNormalizedUnits: js.UndefOr[typings.awsSdk.costexplorerMod.ReservedNormalizedUnits] = js.native
  
  /**
    * The total number of normalized units that you used.
    */
  var TotalRunningNormalizedUnits: js.UndefOr[typings.awsSdk.costexplorerMod.TotalRunningNormalizedUnits] = js.native
}
object CoverageNormalizedUnits {
  
  @scala.inline
  def apply(): CoverageNormalizedUnits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoverageNormalizedUnits]
  }
  
  @scala.inline
  implicit class CoverageNormalizedUnitsMutableBuilder[Self <: CoverageNormalizedUnits] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoverageNormalizedUnitsPercentage(value: CoverageNormalizedUnitsPercentage): Self = StObject.set(x, "CoverageNormalizedUnitsPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoverageNormalizedUnitsPercentageUndefined: Self = StObject.set(x, "CoverageNormalizedUnitsPercentage", js.undefined)
    
    @scala.inline
    def setOnDemandNormalizedUnits(value: OnDemandNormalizedUnits): Self = StObject.set(x, "OnDemandNormalizedUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDemandNormalizedUnitsUndefined: Self = StObject.set(x, "OnDemandNormalizedUnits", js.undefined)
    
    @scala.inline
    def setReservedNormalizedUnits(value: ReservedNormalizedUnits): Self = StObject.set(x, "ReservedNormalizedUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedNormalizedUnitsUndefined: Self = StObject.set(x, "ReservedNormalizedUnits", js.undefined)
    
    @scala.inline
    def setTotalRunningNormalizedUnits(value: TotalRunningNormalizedUnits): Self = StObject.set(x, "TotalRunningNormalizedUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalRunningNormalizedUnitsUndefined: Self = StObject.set(x, "TotalRunningNormalizedUnits", js.undefined)
  }
}
