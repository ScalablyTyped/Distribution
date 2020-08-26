package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutManagedScalingPolicyInput extends js.Object {
  /**
    *  Specifies the ID of an EMR cluster where the managed scaling policy is attached. 
    */
  var ClusterId: typings.awsSdk.emrMod.ClusterId = js.native
  /**
    *  Specifies the constraints for the managed scaling policy. 
    */
  var ManagedScalingPolicy: typings.awsSdk.emrMod.ManagedScalingPolicy = js.native
}

object PutManagedScalingPolicyInput {
  @scala.inline
  def apply(ClusterId: ClusterId, ManagedScalingPolicy: ManagedScalingPolicy): PutManagedScalingPolicyInput = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any], ManagedScalingPolicy = ManagedScalingPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutManagedScalingPolicyInput]
  }
  @scala.inline
  implicit class PutManagedScalingPolicyInputOps[Self <: PutManagedScalingPolicyInput] (val x: Self) extends AnyVal {
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
    def setClusterId(value: ClusterId): Self = this.set("ClusterId", value.asInstanceOf[js.Any])
    @scala.inline
    def setManagedScalingPolicy(value: ManagedScalingPolicy): Self = this.set("ManagedScalingPolicy", value.asInstanceOf[js.Any])
  }
  
}

