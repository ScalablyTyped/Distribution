package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShrinkPolicy extends js.Object {
  /**
    * The desired timeout for decommissioning an instance. Overrides the default YARN decommissioning timeout.
    */
  var DecommissionTimeout: js.UndefOr[Integer] = js.native
  /**
    * Custom policy for requesting termination protection or termination of specific instances when shrinking an instance group.
    */
  var InstanceResizePolicy: js.UndefOr[typings.awsSdk.emrMod.InstanceResizePolicy] = js.native
}

object ShrinkPolicy {
  @scala.inline
  def apply(
    DecommissionTimeout: js.UndefOr[Integer] = js.undefined,
    InstanceResizePolicy: InstanceResizePolicy = null
  ): ShrinkPolicy = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DecommissionTimeout)) __obj.updateDynamic("DecommissionTimeout")(DecommissionTimeout.get.asInstanceOf[js.Any])
    if (InstanceResizePolicy != null) __obj.updateDynamic("InstanceResizePolicy")(InstanceResizePolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShrinkPolicy]
  }
}

