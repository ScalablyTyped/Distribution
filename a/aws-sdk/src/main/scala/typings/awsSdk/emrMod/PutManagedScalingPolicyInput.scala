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
}

