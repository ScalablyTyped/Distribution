package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetManagedScalingPolicyInput extends js.Object {
  /**
    *  Specifies the ID of the cluster for which the managed scaling policy will be fetched. 
    */
  var ClusterId: typings.awsSdk.emrMod.ClusterId = js.native
}

object GetManagedScalingPolicyInput {
  @scala.inline
  def apply(ClusterId: ClusterId): GetManagedScalingPolicyInput = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetManagedScalingPolicyInput]
  }
}

