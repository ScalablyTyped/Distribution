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
  def apply(NodeGroupId: AllowedNodeGroupId = null, PreferredAvailabilityZones: AvailabilityZonesList = null): ReshardingConfiguration = {
    val __obj = js.Dynamic.literal()
    if (NodeGroupId != null) __obj.updateDynamic("NodeGroupId")(NodeGroupId.asInstanceOf[js.Any])
    if (PreferredAvailabilityZones != null) __obj.updateDynamic("PreferredAvailabilityZones")(PreferredAvailabilityZones.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReshardingConfiguration]
  }
}

