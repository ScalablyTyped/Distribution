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
  
  @scala.inline
  def apply(MonitoringScheduleName: MonitoringScheduleName): DeleteMonitoringScheduleRequest = {
    val __obj = js.Dynamic.literal(MonitoringScheduleName = MonitoringScheduleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMonitoringScheduleRequest]
  }
  
  @scala.inline
  implicit class DeleteMonitoringScheduleRequestMutableBuilder[Self <: DeleteMonitoringScheduleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMonitoringScheduleName(value: MonitoringScheduleName): Self = StObject.set(x, "MonitoringScheduleName", value.asInstanceOf[js.Any])
  }
}
