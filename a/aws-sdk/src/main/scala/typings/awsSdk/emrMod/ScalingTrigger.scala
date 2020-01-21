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
}

