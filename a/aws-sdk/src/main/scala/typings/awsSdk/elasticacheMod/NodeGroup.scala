package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeGroup extends js.Object {
  /**
    * The identifier for the node group (shard). A Redis (cluster mode disabled) replication group contains only 1 node group; therefore, the node group ID is 0001. A Redis (cluster mode enabled) replication group contains 1 to 90 node groups numbered 0001 to 0090. Optionally, the user can provide the id for a node group. 
    */
  var NodeGroupId: js.UndefOr[String] = js.native
  /**
    * A list containing information about individual nodes within the node group (shard).
    */
  var NodeGroupMembers: js.UndefOr[NodeGroupMemberList] = js.native
  /**
    * The endpoint of the primary node in this node group (shard).
    */
  var PrimaryEndpoint: js.UndefOr[Endpoint] = js.native
  /**
    * The endpoint of the replica nodes in this node group (shard).
    */
  var ReaderEndpoint: js.UndefOr[Endpoint] = js.native
  /**
    * The keyspace for this node group (shard).
    */
  var Slots: js.UndefOr[String] = js.native
  /**
    * The current state of this replication group - creating, available, modifying, deleting.
    */
  var Status: js.UndefOr[String] = js.native
}

object NodeGroup {
  @scala.inline
  def apply(
    NodeGroupId: String = null,
    NodeGroupMembers: NodeGroupMemberList = null,
    PrimaryEndpoint: Endpoint = null,
    ReaderEndpoint: Endpoint = null,
    Slots: String = null,
    Status: String = null
  ): NodeGroup = {
    val __obj = js.Dynamic.literal()
    if (NodeGroupId != null) __obj.updateDynamic("NodeGroupId")(NodeGroupId.asInstanceOf[js.Any])
    if (NodeGroupMembers != null) __obj.updateDynamic("NodeGroupMembers")(NodeGroupMembers.asInstanceOf[js.Any])
    if (PrimaryEndpoint != null) __obj.updateDynamic("PrimaryEndpoint")(PrimaryEndpoint.asInstanceOf[js.Any])
    if (ReaderEndpoint != null) __obj.updateDynamic("ReaderEndpoint")(ReaderEndpoint.asInstanceOf[js.Any])
    if (Slots != null) __obj.updateDynamic("Slots")(Slots.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeGroup]
  }
}

