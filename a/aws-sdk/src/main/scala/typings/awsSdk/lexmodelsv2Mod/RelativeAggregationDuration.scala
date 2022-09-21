package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelativeAggregationDuration extends StObject {
  
  /**
    * The type of time period that the timeValue field represents. 
    */
  var timeDimension: TimeDimension
  
  /**
    * The period of the time window to gather statistics for. The valid value depends on the setting of the timeDimension field.    Hours - 1/3/6/12/24    Days - 3    Weeks - 1/2  
    */
  var timeValue: TimeValue
}
object RelativeAggregationDuration {
  
  inline def apply(timeDimension: TimeDimension, timeValue: TimeValue): RelativeAggregationDuration = {
    val __obj = js.Dynamic.literal(timeDimension = timeDimension.asInstanceOf[js.Any], timeValue = timeValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelativeAggregationDuration]
  }
  
  extension [Self <: RelativeAggregationDuration](x: Self) {
    
    inline def setTimeDimension(value: TimeDimension): Self = StObject.set(x, "timeDimension", value.asInstanceOf[js.Any])
    
    inline def setTimeValue(value: TimeValue): Self = StObject.set(x, "timeValue", value.asInstanceOf[js.Any])
  }
}
