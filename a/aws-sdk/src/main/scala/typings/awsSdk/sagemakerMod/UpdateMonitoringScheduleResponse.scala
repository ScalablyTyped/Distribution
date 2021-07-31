package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateMonitoringScheduleResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the monitoring schedule.
    */
  var MonitoringScheduleArn: typings.awsSdk.sagemakerMod.MonitoringScheduleArn
}
object UpdateMonitoringScheduleResponse {
  
  @scala.inline
  def apply(MonitoringScheduleArn: MonitoringScheduleArn): UpdateMonitoringScheduleResponse = {
    val __obj = js.Dynamic.literal(MonitoringScheduleArn = MonitoringScheduleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMonitoringScheduleResponse]
  }
  
  @scala.inline
  implicit class UpdateMonitoringScheduleResponseMutableBuilder[Self <: UpdateMonitoringScheduleResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMonitoringScheduleArn(value: MonitoringScheduleArn): Self = StObject.set(x, "MonitoringScheduleArn", value.asInstanceOf[js.Any])
  }
}
