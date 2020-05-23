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
}

