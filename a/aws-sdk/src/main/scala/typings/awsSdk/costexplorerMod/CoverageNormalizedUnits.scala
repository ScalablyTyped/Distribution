package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoverageNormalizedUnits extends js.Object {
  
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
  implicit class CoverageNormalizedUnitsOps[Self <: CoverageNormalizedUnits] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCoverageNormalizedUnitsPercentage(value: CoverageNormalizedUnitsPercentage): Self = this.set("CoverageNormalizedUnitsPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoverageNormalizedUnitsPercentage: Self = this.set("CoverageNormalizedUnitsPercentage", js.undefined)
    
    @scala.inline
    def setOnDemandNormalizedUnits(value: OnDemandNormalizedUnits): Self = this.set("OnDemandNormalizedUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDemandNormalizedUnits: Self = this.set("OnDemandNormalizedUnits", js.undefined)
    
    @scala.inline
    def setReservedNormalizedUnits(value: ReservedNormalizedUnits): Self = this.set("ReservedNormalizedUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservedNormalizedUnits: Self = this.set("ReservedNormalizedUnits", js.undefined)
    
    @scala.inline
    def setTotalRunningNormalizedUnits(value: TotalRunningNormalizedUnits): Self = this.set("TotalRunningNormalizedUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalRunningNormalizedUnits: Self = this.set("TotalRunningNormalizedUnits", js.undefined)
  }
}
