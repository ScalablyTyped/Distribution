package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResultByTime extends StObject {
  
  /**
    * Whether the result is estimated.
    */
  var Estimated: js.UndefOr[typings.awsSdk.costexplorerMod.Estimated] = js.native
  
  /**
    * The groups that this time period includes.
    */
  var Groups: js.UndefOr[typings.awsSdk.costexplorerMod.Groups] = js.native
  
  /**
    * The time period that the result covers.
    */
  var TimePeriod: js.UndefOr[DateInterval] = js.native
  
  /**
    * The total amount of cost or usage accrued during the time period.
    */
  var Total: js.UndefOr[Metrics] = js.native
}
object ResultByTime {
  
  @scala.inline
  def apply(): ResultByTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultByTime]
  }
  
  @scala.inline
  implicit class ResultByTimeMutableBuilder[Self <: ResultByTime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEstimated(value: Estimated): Self = StObject.set(x, "Estimated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedUndefined: Self = StObject.set(x, "Estimated", js.undefined)
    
    @scala.inline
    def setGroups(value: Groups): Self = StObject.set(x, "Groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsUndefined: Self = StObject.set(x, "Groups", js.undefined)
    
    @scala.inline
    def setGroupsVarargs(value: Group*): Self = StObject.set(x, "Groups", js.Array(value :_*))
    
    @scala.inline
    def setTimePeriod(value: DateInterval): Self = StObject.set(x, "TimePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimePeriodUndefined: Self = StObject.set(x, "TimePeriod", js.undefined)
    
    @scala.inline
    def setTotal(value: Metrics): Self = StObject.set(x, "Total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalUndefined: Self = StObject.set(x, "Total", js.undefined)
  }
}
