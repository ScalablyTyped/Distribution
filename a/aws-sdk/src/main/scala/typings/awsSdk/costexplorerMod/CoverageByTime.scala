package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoverageByTime extends StObject {
  
  /**
    * The groups of instances that the reservation covered.
    */
  var Groups: js.UndefOr[ReservationCoverageGroups] = js.native
  
  /**
    * The period that this coverage was used over.
    */
  var TimePeriod: js.UndefOr[DateInterval] = js.native
  
  /**
    * The total reservation coverage, in hours.
    */
  var Total: js.UndefOr[Coverage] = js.native
}
object CoverageByTime {
  
  @scala.inline
  def apply(): CoverageByTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoverageByTime]
  }
  
  @scala.inline
  implicit class CoverageByTimeMutableBuilder[Self <: CoverageByTime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroups(value: ReservationCoverageGroups): Self = StObject.set(x, "Groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsUndefined: Self = StObject.set(x, "Groups", js.undefined)
    
    @scala.inline
    def setGroupsVarargs(value: ReservationCoverageGroup*): Self = StObject.set(x, "Groups", js.Array(value :_*))
    
    @scala.inline
    def setTimePeriod(value: DateInterval): Self = StObject.set(x, "TimePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimePeriodUndefined: Self = StObject.set(x, "TimePeriod", js.undefined)
    
    @scala.inline
    def setTotal(value: Coverage): Self = StObject.set(x, "Total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalUndefined: Self = StObject.set(x, "Total", js.undefined)
  }
}
