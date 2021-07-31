package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMonitoringScheduleResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the monitoring schedule.
    */
  var MonitoringScheduleArn: typings.awsSdk.sagemakerMod.MonitoringScheduleArn
}
object CreateMonitoringScheduleResponse {
  
  @scala.inline
  def apply(MonitoringScheduleArn: MonitoringScheduleArn): CreateMonitoringScheduleResponse = {
    val __obj = js.Dynamic.literal(MonitoringScheduleArn = MonitoringScheduleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMonitoringScheduleResponse]
  }
  
  @scala.inline
  implicit class CreateMonitoringScheduleResponseMutableBuilder[Self <: CreateMonitoringScheduleResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMonitoringScheduleArn(value: MonitoringScheduleArn): Self = StObject.set(x, "MonitoringScheduleArn", value.asInstanceOf[js.Any])
  }
}
