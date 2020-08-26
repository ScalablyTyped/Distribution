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
  def apply(): NodeGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeGroup]
  }
  @scala.inline
  implicit class NodeGroupOps[Self <: NodeGroup] (val x: Self) extends AnyVal {
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
    def setNodeGroupId(value: String): Self = this.set("NodeGroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeGroupId: Self = this.set("NodeGroupId", js.undefined)
    @scala.inline
    def setNodeGroupMembersVarargs(value: NodeGroupMember*): Self = this.set("NodeGroupMembers", js.Array(value :_*))
    @scala.inline
    def setNodeGroupMembers(value: NodeGroupMemberList): Self = this.set("NodeGroupMembers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeGroupMembers: Self = this.set("NodeGroupMembers", js.undefined)
    @scala.inline
    def setPrimaryEndpoint(value: Endpoint): Self = this.set("PrimaryEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryEndpoint: Self = this.set("PrimaryEndpoint", js.undefined)
    @scala.inline
    def setReaderEndpoint(value: Endpoint): Self = this.set("ReaderEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReaderEndpoint: Self = this.set("ReaderEndpoint", js.undefined)
    @scala.inline
    def setSlots(value: String): Self = this.set("Slots", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlots: Self = this.set("Slots", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

