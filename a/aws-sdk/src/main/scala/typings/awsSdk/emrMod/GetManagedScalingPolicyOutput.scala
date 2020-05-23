package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetManagedScalingPolicyOutput extends js.Object {
  /**
    *  Specifies the managed scaling policy that is attached to an Amazon EMR cluster. 
    */
  var ManagedScalingPolicy: js.UndefOr[typings.awsSdk.emrMod.ManagedScalingPolicy] = js.native
}

object GetManagedScalingPolicyOutput {
  @scala.inline
  def apply(ManagedScalingPolicy: ManagedScalingPolicy = null): GetManagedScalingPolicyOutput = {
    val __obj = js.Dynamic.literal()
    if (ManagedScalingPolicy != null) __obj.updateDynamic("ManagedScalingPolicy")(ManagedScalingPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetManagedScalingPolicyOutput]
  }
}

