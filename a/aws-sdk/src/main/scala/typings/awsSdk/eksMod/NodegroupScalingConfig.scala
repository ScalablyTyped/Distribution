package typings.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodegroupScalingConfig extends js.Object {
  /**
    * The current number of worker nodes that the managed node group should maintain.
    */
  var desiredSize: js.UndefOr[Capacity] = js.native
  /**
    * The maximum number of worker nodes that the managed node group can scale out to. Managed node groups can support up to 100 nodes by default.
    */
  var maxSize: js.UndefOr[Capacity] = js.native
  /**
    * The minimum number of worker nodes that the managed node group can scale in to. This number must be greater than zero.
    */
  var minSize: js.UndefOr[Capacity] = js.native
}

object NodegroupScalingConfig {
  @scala.inline
  def apply(
    desiredSize: js.UndefOr[Capacity] = js.undefined,
    maxSize: js.UndefOr[Capacity] = js.undefined,
    minSize: js.UndefOr[Capacity] = js.undefined
  ): NodegroupScalingConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(desiredSize)) __obj.updateDynamic("desiredSize")(desiredSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxSize)) __obj.updateDynamic("maxSize")(maxSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minSize)) __obj.updateDynamic("minSize")(minSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodegroupScalingConfig]
  }
}

