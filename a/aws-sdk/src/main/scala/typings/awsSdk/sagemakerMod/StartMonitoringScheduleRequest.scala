package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartMonitoringScheduleRequest extends js.Object {
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
  implicit class StartMonitoringScheduleRequestOps[Self <: StartMonitoringScheduleRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMonitoringScheduleName(value: MonitoringScheduleName): Self = this.set("MonitoringScheduleName", value.asInstanceOf[js.Any])
  }
  
}

