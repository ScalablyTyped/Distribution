package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopMonitoringScheduleRequest extends js.Object {
  /**
    * The name of the schedule to stop.
    */
  var MonitoringScheduleName: typings.awsSdk.sagemakerMod.MonitoringScheduleName = js.native
}

object StopMonitoringScheduleRequest {
  @scala.inline
  def apply(MonitoringScheduleName: MonitoringScheduleName): StopMonitoringScheduleRequest = {
    val __obj = js.Dynamic.literal(MonitoringScheduleName = MonitoringScheduleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopMonitoringScheduleRequest]
  }
  @scala.inline
  implicit class StopMonitoringScheduleRequestOps[Self <: StopMonitoringScheduleRequest] (val x: Self) extends AnyVal {
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

