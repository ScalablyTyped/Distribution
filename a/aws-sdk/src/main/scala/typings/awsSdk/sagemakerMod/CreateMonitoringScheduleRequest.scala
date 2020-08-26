package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateMonitoringScheduleRequest extends js.Object {
  /**
    * The configuration object that specifies the monitoring schedule and defines the monitoring job.
    */
  var MonitoringScheduleConfig: typings.awsSdk.sagemakerMod.MonitoringScheduleConfig = js.native
  /**
    * The name of the monitoring schedule. The name must be unique within an AWS Region within an AWS account.
    */
  var MonitoringScheduleName: typings.awsSdk.sagemakerMod.MonitoringScheduleName = js.native
  /**
    * (Optional) An array of key-value pairs. For more information, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateMonitoringScheduleRequest {
  @scala.inline
  def apply(MonitoringScheduleConfig: MonitoringScheduleConfig, MonitoringScheduleName: MonitoringScheduleName): CreateMonitoringScheduleRequest = {
    val __obj = js.Dynamic.literal(MonitoringScheduleConfig = MonitoringScheduleConfig.asInstanceOf[js.Any], MonitoringScheduleName = MonitoringScheduleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMonitoringScheduleRequest]
  }
  @scala.inline
  implicit class CreateMonitoringScheduleRequestOps[Self <: CreateMonitoringScheduleRequest] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

