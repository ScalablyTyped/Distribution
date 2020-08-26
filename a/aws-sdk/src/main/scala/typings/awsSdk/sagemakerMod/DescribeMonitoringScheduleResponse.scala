package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeMonitoringScheduleResponse extends js.Object {
  /**
    * The time at which the monitoring job was created.
    */
  var CreationTime: Timestamp = js.native
  /**
    *  The name of the endpoint for the monitoring job.
    */
  var EndpointName: js.UndefOr[typings.awsSdk.sagemakerMod.EndpointName] = js.native
  /**
    * A string, up to one KB in size, that contains the reason a monitoring job failed, if it failed.
    */
  var FailureReason: js.UndefOr[typings.awsSdk.sagemakerMod.FailureReason] = js.native
  /**
    * The time at which the monitoring job was last modified.
    */
  var LastModifiedTime: Timestamp = js.native
  /**
    * Describes metadata on the last execution to run, if there was one.
    */
  var LastMonitoringExecutionSummary: js.UndefOr[MonitoringExecutionSummary] = js.native
  /**
    * The Amazon Resource Name (ARN) of the monitoring schedule.
    */
  var MonitoringScheduleArn: typings.awsSdk.sagemakerMod.MonitoringScheduleArn = js.native
  /**
    * The configuration object that specifies the monitoring schedule and defines the monitoring job.
    */
  var MonitoringScheduleConfig: typings.awsSdk.sagemakerMod.MonitoringScheduleConfig = js.native
  /**
    * Name of the monitoring schedule.
    */
  var MonitoringScheduleName: typings.awsSdk.sagemakerMod.MonitoringScheduleName = js.native
  /**
    * The status of an monitoring job.
    */
  var MonitoringScheduleStatus: ScheduleStatus = js.native
}

object DescribeMonitoringScheduleResponse {
  @scala.inline
  def apply(
    CreationTime: Timestamp,
    LastModifiedTime: Timestamp,
    MonitoringScheduleArn: MonitoringScheduleArn,
    MonitoringScheduleConfig: MonitoringScheduleConfig,
    MonitoringScheduleName: MonitoringScheduleName,
    MonitoringScheduleStatus: ScheduleStatus
  ): DescribeMonitoringScheduleResponse = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any], MonitoringScheduleArn = MonitoringScheduleArn.asInstanceOf[js.Any], MonitoringScheduleConfig = MonitoringScheduleConfig.asInstanceOf[js.Any], MonitoringScheduleName = MonitoringScheduleName.asInstanceOf[js.Any], MonitoringScheduleStatus = MonitoringScheduleStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMonitoringScheduleResponse]
  }
  @scala.inline
  implicit class DescribeMonitoringScheduleResponseOps[Self <: DescribeMonitoringScheduleResponse] (val x: Self) extends AnyVal {
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
    def setMonitoringScheduleConfig(value: MonitoringScheduleConfig): Self = this.set("MonitoringScheduleConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonitoringScheduleName(value: MonitoringScheduleName): Self = this.set("MonitoringScheduleName", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonitoringScheduleStatus(value: ScheduleStatus): Self = this.set("MonitoringScheduleStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndpointName(value: EndpointName): Self = this.set("EndpointName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpointName: Self = this.set("EndpointName", js.undefined)
    @scala.inline
    def setFailureReason(value: FailureReason): Self = this.set("FailureReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureReason: Self = this.set("FailureReason", js.undefined)
    @scala.inline
    def setLastMonitoringExecutionSummary(value: MonitoringExecutionSummary): Self = this.set("LastMonitoringExecutionSummary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastMonitoringExecutionSummary: Self = this.set("LastMonitoringExecutionSummary", js.undefined)
  }
  
}

