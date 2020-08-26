package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteMonitoringScheduleRequest extends js.Object {
  /**
    * The name of the monitoring schedule to delete.
    */
  var MonitoringScheduleName: typings.awsSdk.sagemakerMod.MonitoringScheduleName = js.native
}

object DeleteMonitoringScheduleRequest {
  @scala.inline
  def apply(MonitoringScheduleName: MonitoringScheduleName): DeleteMonitoringScheduleRequest = {
    val __obj = js.Dynamic.literal(MonitoringScheduleName = MonitoringScheduleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMonitoringScheduleRequest]
  }
  @scala.inline
  implicit class DeleteMonitoringScheduleRequestOps[Self <: DeleteMonitoringScheduleRequest] (val x: Self) extends AnyVal {
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

