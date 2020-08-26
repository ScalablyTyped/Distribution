package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveManagedScalingPolicyInput extends js.Object {
  /**
    *  Specifies the ID of the cluster from which the managed scaling policy will be removed. 
    */
  var ClusterId: typings.awsSdk.emrMod.ClusterId = js.native
}

object RemoveManagedScalingPolicyInput {
  @scala.inline
  def apply(ClusterId: ClusterId): RemoveManagedScalingPolicyInput = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveManagedScalingPolicyInput]
  }
  @scala.inline
  implicit class RemoveManagedScalingPolicyInputOps[Self <: RemoveManagedScalingPolicyInput] (val x: Self) extends AnyVal {
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
  }
  
}

