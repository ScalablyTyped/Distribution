package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoverageByTime extends StObject {
  
  /**
    * The groups of instances that the reservation covered.
    */
  var Groups: js.UndefOr[ReservationCoverageGroups] = js.undefined
  
  /**
    * The period that this coverage was used over.
    */
  var TimePeriod: js.UndefOr[DateInterval] = js.undefined
  
  /**
    * The total reservation coverage, in hours.
    */
  var Total: js.UndefOr[Coverage] = js.undefined
}
object CoverageByTime {
  
  inline def apply(): CoverageByTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoverageByTime]
  }
  
  extension [Self <: CoverageByTime](x: Self) {
    
    inline def setGroups(value: ReservationCoverageGroups): Self = StObject.set(x, "Groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "Groups", js.undefined)
    
    inline def setGroupsVarargs(value: ReservationCoverageGroup*): Self = StObject.set(x, "Groups", js.Array(value*))
    
    inline def setTimePeriod(value: DateInterval): Self = StObject.set(x, "TimePeriod", value.asInstanceOf[js.Any])
    
    inline def setTimePeriodUndefined: Self = StObject.set(x, "TimePeriod", js.undefined)
    
    inline def setTotal(value: Coverage): Self = StObject.set(x, "Total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "Total", js.undefined)
  }
}
