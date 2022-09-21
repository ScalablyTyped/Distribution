package typings.awsSdk.devopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAccountOverviewRequest extends StObject {
  
  /**
    *  The start of the time range passed in. The start time granularity is at the day level. The floor of the start time is used. Returned information occurred after this day. 
    */
  var FromTime: js.Date
  
  /**
    *  The end of the time range passed in. The start time granularity is at the day level. The floor of the start time is used. Returned information occurred before this day. If this is not specified, then the current day is used. 
    */
  var ToTime: js.UndefOr[js.Date] = js.undefined
}
object DescribeAccountOverviewRequest {
  
  inline def apply(FromTime: js.Date): DescribeAccountOverviewRequest = {
    val __obj = js.Dynamic.literal(FromTime = FromTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAccountOverviewRequest]
  }
  
  extension [Self <: DescribeAccountOverviewRequest](x: Self) {
    
    inline def setFromTime(value: js.Date): Self = StObject.set(x, "FromTime", value.asInstanceOf[js.Any])
    
    inline def setToTime(value: js.Date): Self = StObject.set(x, "ToTime", value.asInstanceOf[js.Any])
    
    inline def setToTimeUndefined: Self = StObject.set(x, "ToTime", js.undefined)
  }
}
