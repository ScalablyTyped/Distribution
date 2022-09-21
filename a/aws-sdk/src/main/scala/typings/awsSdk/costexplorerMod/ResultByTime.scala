package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultByTime extends StObject {
  
  /**
    * Determines whether the result is estimated.
    */
  var Estimated: js.UndefOr[typings.awsSdk.costexplorerMod.Estimated] = js.undefined
  
  /**
    * The groups that this time period includes.
    */
  var Groups: js.UndefOr[typings.awsSdk.costexplorerMod.Groups] = js.undefined
  
  /**
    * The time period that the result covers.
    */
  var TimePeriod: js.UndefOr[DateInterval] = js.undefined
  
  /**
    * The total amount of cost or usage accrued during the time period.
    */
  var Total: js.UndefOr[Metrics] = js.undefined
}
object ResultByTime {
  
  inline def apply(): ResultByTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultByTime]
  }
  
  extension [Self <: ResultByTime](x: Self) {
    
    inline def setEstimated(value: Estimated): Self = StObject.set(x, "Estimated", value.asInstanceOf[js.Any])
    
    inline def setEstimatedUndefined: Self = StObject.set(x, "Estimated", js.undefined)
    
    inline def setGroups(value: Groups): Self = StObject.set(x, "Groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "Groups", js.undefined)
    
    inline def setGroupsVarargs(value: Group*): Self = StObject.set(x, "Groups", js.Array(value*))
    
    inline def setTimePeriod(value: DateInterval): Self = StObject.set(x, "TimePeriod", value.asInstanceOf[js.Any])
    
    inline def setTimePeriodUndefined: Self = StObject.set(x, "TimePeriod", js.undefined)
    
    inline def setTotal(value: Metrics): Self = StObject.set(x, "Total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "Total", js.undefined)
  }
}
