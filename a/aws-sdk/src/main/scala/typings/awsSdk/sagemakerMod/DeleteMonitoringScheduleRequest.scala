package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMonitoringScheduleRequest extends StObject {
  
  /**
    * The name of the monitoring schedule to delete.
    */
  var MonitoringScheduleName: typings.awsSdk.sagemakerMod.MonitoringScheduleName
}
object DeleteMonitoringScheduleRequest {
  
  inline def apply(MonitoringScheduleName: MonitoringScheduleName): DeleteMonitoringScheduleRequest = {
    val __obj = js.Dynamic.literal(MonitoringScheduleName = MonitoringScheduleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMonitoringScheduleRequest]
  }
  
  extension [Self <: DeleteMonitoringScheduleRequest](x: Self) {
    
    inline def setMonitoringScheduleName(value: MonitoringScheduleName): Self = StObject.set(x, "MonitoringScheduleName", value.asInstanceOf[js.Any])
  }
}
