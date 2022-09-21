package typings.awsSdk.ioteventsdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAlarmResponse extends StObject {
  
  /**
    * Contains information about an alarm.
    */
  var alarm: js.UndefOr[Alarm] = js.undefined
}
object DescribeAlarmResponse {
  
  inline def apply(): DescribeAlarmResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAlarmResponse]
  }
  
  extension [Self <: DescribeAlarmResponse](x: Self) {
    
    inline def setAlarm(value: Alarm): Self = StObject.set(x, "alarm", value.asInstanceOf[js.Any])
    
    inline def setAlarmUndefined: Self = StObject.set(x, "alarm", js.undefined)
  }
}
