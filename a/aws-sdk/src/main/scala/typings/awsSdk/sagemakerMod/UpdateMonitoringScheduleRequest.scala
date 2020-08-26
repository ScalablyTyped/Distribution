package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateMonitoringScheduleRequest extends js.Object {
  /**
    * The configuration object that specifies the monitoring schedule and defines the monitoring job.
    */
  var MonitoringScheduleConfig: typings.awsSdk.sagemakerMod.MonitoringScheduleConfig = js.native
  /**
    * The name of the monitoring schedule. The name must be unique within an AWS Region within an AWS account.
    */
  var MonitoringScheduleName: typings.awsSdk.sagemakerMod.MonitoringScheduleName = js.native
}

object UpdateMonitoringScheduleRequest {
  @scala.inline
  def apply(MonitoringScheduleConfig: MonitoringScheduleConfig, MonitoringScheduleName: MonitoringScheduleName): UpdateMonitoringScheduleRequest = {
    val __obj = js.Dynamic.literal(MonitoringScheduleConfig = MonitoringScheduleConfig.asInstanceOf[js.Any], MonitoringScheduleName = MonitoringScheduleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMonitoringScheduleRequest]
  }
  @scala.inline
  implicit class UpdateMonitoringScheduleRequestOps[Self <: UpdateMonitoringScheduleRequest] (val x: Self) extends AnyVal {
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
    def setMonitoringScheduleConfig(value: MonitoringScheduleConfig): Self = this.set("MonitoringScheduleConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonitoringScheduleName(value: MonitoringScheduleName): Self = this.set("MonitoringScheduleName", value.asInstanceOf[js.Any])
  }
  
}

