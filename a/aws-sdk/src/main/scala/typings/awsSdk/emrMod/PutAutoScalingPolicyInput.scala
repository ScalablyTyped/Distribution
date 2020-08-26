package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutAutoScalingPolicyInput extends js.Object {
  /**
    * Specifies the definition of the automatic scaling policy.
    */
  var AutoScalingPolicy: typings.awsSdk.emrMod.AutoScalingPolicy = js.native
  /**
    * Specifies the ID of a cluster. The instance group to which the automatic scaling policy is applied is within this cluster.
    */
  var ClusterId: typings.awsSdk.emrMod.ClusterId = js.native
  /**
    * Specifies the ID of the instance group to which the automatic scaling policy is applied.
    */
  var InstanceGroupId: typings.awsSdk.emrMod.InstanceGroupId = js.native
}

object PutAutoScalingPolicyInput {
  @scala.inline
  def apply(AutoScalingPolicy: AutoScalingPolicy, ClusterId: ClusterId, InstanceGroupId: InstanceGroupId): PutAutoScalingPolicyInput = {
    val __obj = js.Dynamic.literal(AutoScalingPolicy = AutoScalingPolicy.asInstanceOf[js.Any], ClusterId = ClusterId.asInstanceOf[js.Any], InstanceGroupId = InstanceGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutAutoScalingPolicyInput]
  }
  @scala.inline
  implicit class PutAutoScalingPolicyInputOps[Self <: PutAutoScalingPolicyInput] (val x: Self) extends AnyVal {
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
    def setAutoScalingPolicy(value: AutoScalingPolicy): Self = this.set("AutoScalingPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def setClusterId(value: ClusterId): Self = this.set("ClusterId", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstanceGroupId(value: InstanceGroupId): Self = this.set("InstanceGroupId", value.asInstanceOf[js.Any])
  }
  
}

