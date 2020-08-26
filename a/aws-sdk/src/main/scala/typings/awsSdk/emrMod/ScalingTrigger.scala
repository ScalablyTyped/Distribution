package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScalingTrigger extends js.Object {
  /**
    * The definition of a CloudWatch metric alarm. When the defined alarm conditions are met along with other trigger parameters, scaling activity begins.
    */
  var CloudWatchAlarmDefinition: typings.awsSdk.emrMod.CloudWatchAlarmDefinition = js.native
}

object ScalingTrigger {
  @scala.inline
  def apply(CloudWatchAlarmDefinition: CloudWatchAlarmDefinition): ScalingTrigger = {
    val __obj = js.Dynamic.literal(CloudWatchAlarmDefinition = CloudWatchAlarmDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalingTrigger]
  }
  @scala.inline
  implicit class ScalingTriggerOps[Self <: ScalingTrigger] (val x: Self) extends AnyVal {
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
    def setCloudWatchAlarmDefinition(value: CloudWatchAlarmDefinition): Self = this.set("CloudWatchAlarmDefinition", value.asInstanceOf[js.Any])
  }
  
}

