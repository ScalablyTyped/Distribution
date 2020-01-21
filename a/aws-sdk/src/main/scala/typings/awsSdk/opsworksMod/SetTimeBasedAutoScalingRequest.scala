package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetTimeBasedAutoScalingRequest extends js.Object {
  /**
    * An AutoScalingSchedule with the instance schedule.
    */
  var AutoScalingSchedule: js.UndefOr[WeeklyAutoScalingSchedule] = js.native
  /**
    * The instance ID.
    */
  var InstanceId: String = js.native
}

object SetTimeBasedAutoScalingRequest {
  @scala.inline
  def apply(InstanceId: String, AutoScalingSchedule: WeeklyAutoScalingSchedule = null): SetTimeBasedAutoScalingRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
    if (AutoScalingSchedule != null) __obj.updateDynamic("AutoScalingSchedule")(AutoScalingSchedule.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetTimeBasedAutoScalingRequest]
  }
}

