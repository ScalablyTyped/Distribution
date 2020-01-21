package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonitoringScheduleConfig extends js.Object {
  /**
    * Defines the monitoring job.
    */
  var MonitoringJobDefinition: typings.awsSdk.sagemakerMod.MonitoringJobDefinition = js.native
  /**
    * Configures the monitoring schedule.
    */
  var ScheduleConfig: js.UndefOr[typings.awsSdk.sagemakerMod.ScheduleConfig] = js.native
}

object MonitoringScheduleConfig {
  @scala.inline
  def apply(MonitoringJobDefinition: MonitoringJobDefinition, ScheduleConfig: ScheduleConfig = null): MonitoringScheduleConfig = {
    val __obj = js.Dynamic.literal(MonitoringJobDefinition = MonitoringJobDefinition.asInstanceOf[js.Any])
    if (ScheduleConfig != null) __obj.updateDynamic("ScheduleConfig")(ScheduleConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitoringScheduleConfig]
  }
}

