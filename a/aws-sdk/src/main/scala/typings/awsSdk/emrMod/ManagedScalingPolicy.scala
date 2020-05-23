package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedScalingPolicy extends js.Object {
  /**
    *  The EC2 unit limits for a managed scaling policy. The managed scaling activity of a cluster is not allowed to go above or below these limits. The limit only applies to the core and task nodes. The master node cannot be scaled after initial configuration. 
    */
  var ComputeLimits: js.UndefOr[typings.awsSdk.emrMod.ComputeLimits] = js.native
}

object ManagedScalingPolicy {
  @scala.inline
  def apply(ComputeLimits: ComputeLimits = null): ManagedScalingPolicy = {
    val __obj = js.Dynamic.literal()
    if (ComputeLimits != null) __obj.updateDynamic("ComputeLimits")(ComputeLimits.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagedScalingPolicy]
  }
}

