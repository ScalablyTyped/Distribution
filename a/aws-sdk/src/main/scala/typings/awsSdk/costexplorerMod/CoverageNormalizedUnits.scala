package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoverageNormalizedUnits extends StObject {
  
  /**
    * The percentage of your used instance normalized units that a reservation covers.
    */
  var CoverageNormalizedUnitsPercentage: js.UndefOr[typings.awsSdk.costexplorerMod.CoverageNormalizedUnitsPercentage] = js.undefined
  
  /**
    * The number of normalized units that are covered by On-Demand Instances instead of a reservation.
    */
  var OnDemandNormalizedUnits: js.UndefOr[typings.awsSdk.costexplorerMod.OnDemandNormalizedUnits] = js.undefined
  
  /**
    * The number of normalized units that a reservation covers.
    */
  var ReservedNormalizedUnits: js.UndefOr[typings.awsSdk.costexplorerMod.ReservedNormalizedUnits] = js.undefined
  
  /**
    * The total number of normalized units that you used.
    */
  var TotalRunningNormalizedUnits: js.UndefOr[typings.awsSdk.costexplorerMod.TotalRunningNormalizedUnits] = js.undefined
}
object CoverageNormalizedUnits {
  
  inline def apply(): CoverageNormalizedUnits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoverageNormalizedUnits]
  }
  
  extension [Self <: CoverageNormalizedUnits](x: Self) {
    
    inline def setCoverageNormalizedUnitsPercentage(value: CoverageNormalizedUnitsPercentage): Self = StObject.set(x, "CoverageNormalizedUnitsPercentage", value.asInstanceOf[js.Any])
    
    inline def setCoverageNormalizedUnitsPercentageUndefined: Self = StObject.set(x, "CoverageNormalizedUnitsPercentage", js.undefined)
    
    inline def setOnDemandNormalizedUnits(value: OnDemandNormalizedUnits): Self = StObject.set(x, "OnDemandNormalizedUnits", value.asInstanceOf[js.Any])
    
    inline def setOnDemandNormalizedUnitsUndefined: Self = StObject.set(x, "OnDemandNormalizedUnits", js.undefined)
    
    inline def setReservedNormalizedUnits(value: ReservedNormalizedUnits): Self = StObject.set(x, "ReservedNormalizedUnits", value.asInstanceOf[js.Any])
    
    inline def setReservedNormalizedUnitsUndefined: Self = StObject.set(x, "ReservedNormalizedUnits", js.undefined)
    
    inline def setTotalRunningNormalizedUnits(value: TotalRunningNormalizedUnits): Self = StObject.set(x, "TotalRunningNormalizedUnits", value.asInstanceOf[js.Any])
    
    inline def setTotalRunningNormalizedUnitsUndefined: Self = StObject.set(x, "TotalRunningNormalizedUnits", js.undefined)
  }
}
