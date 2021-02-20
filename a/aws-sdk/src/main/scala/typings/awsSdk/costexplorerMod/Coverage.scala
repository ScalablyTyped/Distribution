package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Coverage extends StObject {
  
  /**
    * The amount of cost that the reservation covered.
    */
  var CoverageCost: js.UndefOr[typings.awsSdk.costexplorerMod.CoverageCost] = js.native
  
  /**
    * The amount of instance usage that the reservation covered, in hours.
    */
  var CoverageHours: js.UndefOr[typings.awsSdk.costexplorerMod.CoverageHours] = js.native
  
  /**
    * The amount of instance usage that the reservation covered, in normalized units.
    */
  var CoverageNormalizedUnits: js.UndefOr[typings.awsSdk.costexplorerMod.CoverageNormalizedUnits] = js.native
}
object Coverage {
  
  @scala.inline
  def apply(): Coverage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Coverage]
  }
  
  @scala.inline
  implicit class CoverageMutableBuilder[Self <: Coverage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoverageCost(value: CoverageCost): Self = StObject.set(x, "CoverageCost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoverageCostUndefined: Self = StObject.set(x, "CoverageCost", js.undefined)
    
    @scala.inline
    def setCoverageHours(value: CoverageHours): Self = StObject.set(x, "CoverageHours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoverageHoursUndefined: Self = StObject.set(x, "CoverageHours", js.undefined)
    
    @scala.inline
    def setCoverageNormalizedUnits(value: CoverageNormalizedUnits): Self = StObject.set(x, "CoverageNormalizedUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoverageNormalizedUnitsUndefined: Self = StObject.set(x, "CoverageNormalizedUnits", js.undefined)
  }
}
