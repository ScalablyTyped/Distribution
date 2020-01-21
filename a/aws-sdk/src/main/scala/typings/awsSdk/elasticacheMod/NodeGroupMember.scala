package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeGroupMember extends js.Object {
  /**
    * The ID of the cluster to which the node belongs.
    */
  var CacheClusterId: js.UndefOr[String] = js.native
  /**
    * The ID of the node within its cluster. A node ID is a numeric identifier (0001, 0002, etc.).
    */
  var CacheNodeId: js.UndefOr[String] = js.native
  /**
    * The role that is currently assigned to the node - primary or replica. This member is only applicable for Redis (cluster mode disabled) replication groups.
    */
  var CurrentRole: js.UndefOr[String] = js.native
  /**
    * The name of the Availability Zone in which the node is located.
    */
  var PreferredAvailabilityZone: js.UndefOr[String] = js.native
  /**
    * The information required for client programs to connect to a node for read operations. The read endpoint is only applicable on Redis (cluster mode disabled) clusters.
    */
  var ReadEndpoint: js.UndefOr[Endpoint] = js.native
}

object NodeGroupMember {
  @scala.inline
  def apply(
    CacheClusterId: String = null,
    CacheNodeId: String = null,
    CurrentRole: String = null,
    PreferredAvailabilityZone: String = null,
    ReadEndpoint: Endpoint = null
  ): NodeGroupMember = {
    val __obj = js.Dynamic.literal()
    if (CacheClusterId != null) __obj.updateDynamic("CacheClusterId")(CacheClusterId.asInstanceOf[js.Any])
    if (CacheNodeId != null) __obj.updateDynamic("CacheNodeId")(CacheNodeId.asInstanceOf[js.Any])
    if (CurrentRole != null) __obj.updateDynamic("CurrentRole")(CurrentRole.asInstanceOf[js.Any])
    if (PreferredAvailabilityZone != null) __obj.updateDynamic("PreferredAvailabilityZone")(PreferredAvailabilityZone.asInstanceOf[js.Any])
    if (ReadEndpoint != null) __obj.updateDynamic("ReadEndpoint")(ReadEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeGroupMember]
  }
}

