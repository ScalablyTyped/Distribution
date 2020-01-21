package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateMonitoringScheduleResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the monitoring schedule.
    */
  var MonitoringScheduleArn: typings.awsSdk.sagemakerMod.MonitoringScheduleArn = js.native
}

object CreateMonitoringScheduleResponse {
  @scala.inline
  def apply(MonitoringScheduleArn: MonitoringScheduleArn): CreateMonitoringScheduleResponse = {
    val __obj = js.Dynamic.literal(MonitoringScheduleArn = MonitoringScheduleArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateMonitoringScheduleResponse]
  }
}

