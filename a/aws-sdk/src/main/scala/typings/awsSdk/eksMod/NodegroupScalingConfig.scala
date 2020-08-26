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
  def apply(): NodegroupScalingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodegroupScalingConfig]
  }
  @scala.inline
  implicit class NodegroupScalingConfigOps[Self <: NodegroupScalingConfig] (val x: Self) extends AnyVal {
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
    def setDesiredSize(value: Capacity): Self = this.set("desiredSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesiredSize: Self = this.set("desiredSize", js.undefined)
    @scala.inline
    def setMaxSize(value: Capacity): Self = this.set("maxSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxSize: Self = this.set("maxSize", js.undefined)
    @scala.inline
    def setMinSize(value: Capacity): Self = this.set("minSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinSize: Self = this.set("minSize", js.undefined)
  }
  
}

