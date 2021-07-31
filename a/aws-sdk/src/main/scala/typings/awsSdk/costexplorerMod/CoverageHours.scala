package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoverageHours extends StObject {
  
  /**
    * The percentage of instance hours that a reservation covered.
    */
  var CoverageHoursPercentage: js.UndefOr[typings.awsSdk.costexplorerMod.CoverageHoursPercentage] = js.undefined
  
  /**
    * The number of instance running hours that On-Demand Instances covered.
    */
  var OnDemandHours: js.UndefOr[typings.awsSdk.costexplorerMod.OnDemandHours] = js.undefined
  
  /**
    * The number of instance running hours that reservations covered.
    */
  var ReservedHours: js.UndefOr[typings.awsSdk.costexplorerMod.ReservedHours] = js.undefined
  
  /**
    * The total instance usage, in hours.
    */
  var TotalRunningHours: js.UndefOr[typings.awsSdk.costexplorerMod.TotalRunningHours] = js.undefined
}
object CoverageHours {
  
  @scala.inline
  def apply(): CoverageHours = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoverageHours]
  }
  
  @scala.inline
  implicit class CoverageHoursMutableBuilder[Self <: CoverageHours] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoverageHoursPercentage(value: CoverageHoursPercentage): Self = StObject.set(x, "CoverageHoursPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoverageHoursPercentageUndefined: Self = StObject.set(x, "CoverageHoursPercentage", js.undefined)
    
    @scala.inline
    def setOnDemandHours(value: OnDemandHours): Self = StObject.set(x, "OnDemandHours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDemandHoursUndefined: Self = StObject.set(x, "OnDemandHours", js.undefined)
    
    @scala.inline
    def setReservedHours(value: ReservedHours): Self = StObject.set(x, "ReservedHours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedHoursUndefined: Self = StObject.set(x, "ReservedHours", js.undefined)
    
    @scala.inline
    def setTotalRunningHours(value: TotalRunningHours): Self = StObject.set(x, "TotalRunningHours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalRunningHoursUndefined: Self = StObject.set(x, "TotalRunningHours", js.undefined)
  }
}
