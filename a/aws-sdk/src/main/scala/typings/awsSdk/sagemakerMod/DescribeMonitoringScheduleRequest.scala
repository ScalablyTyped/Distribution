package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeMonitoringScheduleRequest extends StObject {
  
  /**
    * Name of a previously created monitoring schedule.
    */
  var MonitoringScheduleName: typings.awsSdk.sagemakerMod.MonitoringScheduleName
}
object DescribeMonitoringScheduleRequest {
  
  inline def apply(MonitoringScheduleName: MonitoringScheduleName): DescribeMonitoringScheduleRequest = {
    val __obj = js.Dynamic.literal(MonitoringScheduleName = MonitoringScheduleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMonitoringScheduleRequest]
  }
  
  extension [Self <: DescribeMonitoringScheduleRequest](x: Self) {
    
    inline def setMonitoringScheduleName(value: MonitoringScheduleName): Self = StObject.set(x, "MonitoringScheduleName", value.asInstanceOf[js.Any])
  }
}
