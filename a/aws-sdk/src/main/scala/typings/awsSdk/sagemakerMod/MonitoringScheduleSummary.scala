package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonitoringScheduleSummary extends js.Object {
  /**
    * The creation time of the monitoring schedule.
    */
  var CreationTime: Timestamp = js.native
  /**
    * The name of the endpoint using the monitoring schedule.
    */
  var EndpointName: js.UndefOr[typings.awsSdk.sagemakerMod.EndpointName] = js.native
  /**
    * The last time the monitoring schedule was modified.
    */
  var LastModifiedTime: Timestamp = js.native
  /**
    * The Amazon Resource Name (ARN) of the monitoring schedule.
    */
  var MonitoringScheduleArn: typings.awsSdk.sagemakerMod.MonitoringScheduleArn = js.native
  /**
    * The name of the monitoring schedule.
    */
  var MonitoringScheduleName: typings.awsSdk.sagemakerMod.MonitoringScheduleName = js.native
  /**
    * The status of the monitoring schedule.
    */
  var MonitoringScheduleStatus: ScheduleStatus = js.native
}

object MonitoringScheduleSummary {
  @scala.inline
  def apply(
    CreationTime: Timestamp,
    LastModifiedTime: Timestamp,
    MonitoringScheduleArn: MonitoringScheduleArn,
    MonitoringScheduleName: MonitoringScheduleName,
    MonitoringScheduleStatus: ScheduleStatus
  ): MonitoringScheduleSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any], MonitoringScheduleArn = MonitoringScheduleArn.asInstanceOf[js.Any], MonitoringScheduleName = MonitoringScheduleName.asInstanceOf[js.Any], MonitoringScheduleStatus = MonitoringScheduleStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitoringScheduleSummary]
  }
  @scala.inline
  implicit class MonitoringScheduleSummaryOps[Self <: MonitoringScheduleSummary] (val x: Self) extends AnyVal {
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
    def setCreationTime(value: Timestamp): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastModifiedTime(value: Timestamp): Self = this.set("LastModifiedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonitoringScheduleArn(value: MonitoringScheduleArn): Self = this.set("MonitoringScheduleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonitoringScheduleName(value: MonitoringScheduleName): Self = this.set("MonitoringScheduleName", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonitoringScheduleStatus(value: ScheduleStatus): Self = this.set("MonitoringScheduleStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndpointName(value: EndpointName): Self = this.set("EndpointName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpointName: Self = this.set("EndpointName", js.undefined)
  }
  
}

