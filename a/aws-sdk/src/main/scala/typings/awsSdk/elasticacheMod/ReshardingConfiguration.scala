package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReshardingConfiguration extends js.Object {
  /**
    * Either the ElastiCache for Redis supplied 4-digit id or a user supplied id for the node group these configuration values apply to.
    */
  var NodeGroupId: js.UndefOr[AllowedNodeGroupId] = js.native
  /**
    * A list of preferred availability zones for the nodes in this cluster.
    */
  var PreferredAvailabilityZones: js.UndefOr[AvailabilityZonesList] = js.native
}

object ReshardingConfiguration {
  @scala.inline
  def apply(): ReshardingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReshardingConfiguration]
  }
  @scala.inline
  implicit class ReshardingConfigurationOps[Self <: ReshardingConfiguration] (val x: Self) extends AnyVal {
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
    def setNodeGroupId(value: AllowedNodeGroupId): Self = this.set("NodeGroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeGroupId: Self = this.set("NodeGroupId", js.undefined)
    @scala.inline
    def setPreferredAvailabilityZonesVarargs(value: String*): Self = this.set("PreferredAvailabilityZones", js.Array(value :_*))
    @scala.inline
    def setPreferredAvailabilityZones(value: AvailabilityZonesList): Self = this.set("PreferredAvailabilityZones", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferredAvailabilityZones: Self = this.set("PreferredAvailabilityZones", js.undefined)
  }
  
}

