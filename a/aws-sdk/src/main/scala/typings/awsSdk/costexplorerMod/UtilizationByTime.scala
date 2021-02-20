package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UtilizationByTime extends StObject {
  
  /**
    * The groups that this utilization result uses.
    */
  var Groups: js.UndefOr[ReservationUtilizationGroups] = js.native
  
  /**
    * The period of time that this utilization was used for.
    */
  var TimePeriod: js.UndefOr[DateInterval] = js.native
  
  /**
    * The total number of reservation hours that were used.
    */
  var Total: js.UndefOr[ReservationAggregates] = js.native
}
object UtilizationByTime {
  
  @scala.inline
  def apply(): UtilizationByTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UtilizationByTime]
  }
  
  @scala.inline
  implicit class UtilizationByTimeMutableBuilder[Self <: UtilizationByTime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroups(value: ReservationUtilizationGroups): Self = StObject.set(x, "Groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsUndefined: Self = StObject.set(x, "Groups", js.undefined)
    
    @scala.inline
    def setGroupsVarargs(value: ReservationUtilizationGroup*): Self = StObject.set(x, "Groups", js.Array(value :_*))
    
    @scala.inline
    def setTimePeriod(value: DateInterval): Self = StObject.set(x, "TimePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimePeriodUndefined: Self = StObject.set(x, "TimePeriod", js.undefined)
    
    @scala.inline
    def setTotal(value: ReservationAggregates): Self = StObject.set(x, "Total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalUndefined: Self = StObject.set(x, "Total", js.undefined)
  }
}
