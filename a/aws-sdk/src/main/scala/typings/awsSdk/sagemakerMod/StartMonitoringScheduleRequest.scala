package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartMonitoringScheduleRequest extends StObject {
  
  /**
    * The name of the schedule to start.
    */
  var MonitoringScheduleName: typings.awsSdk.sagemakerMod.MonitoringScheduleName = js.native
}
object StartMonitoringScheduleRequest {
  
  @scala.inline
  def apply(MonitoringScheduleName: MonitoringScheduleName): StartMonitoringScheduleRequest = {
    val __obj = js.Dynamic.literal(MonitoringScheduleName = MonitoringScheduleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartMonitoringScheduleRequest]
  }
  
  @scala.inline
  implicit class StartMonitoringScheduleRequestMutableBuilder[Self <: StartMonitoringScheduleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMonitoringScheduleName(value: MonitoringScheduleName): Self = StObject.set(x, "MonitoringScheduleName", value.asInstanceOf[js.Any])
  }
}
