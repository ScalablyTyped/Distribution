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
  def apply(): NodeGroupMember = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeGroupMember]
  }
  @scala.inline
  implicit class NodeGroupMemberOps[Self <: NodeGroupMember] (val x: Self) extends AnyVal {
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
    def setCacheClusterId(value: String): Self = this.set("CacheClusterId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheClusterId: Self = this.set("CacheClusterId", js.undefined)
    @scala.inline
    def setCacheNodeId(value: String): Self = this.set("CacheNodeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheNodeId: Self = this.set("CacheNodeId", js.undefined)
    @scala.inline
    def setCurrentRole(value: String): Self = this.set("CurrentRole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentRole: Self = this.set("CurrentRole", js.undefined)
    @scala.inline
    def setPreferredAvailabilityZone(value: String): Self = this.set("PreferredAvailabilityZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferredAvailabilityZone: Self = this.set("PreferredAvailabilityZone", js.undefined)
    @scala.inline
    def setReadEndpoint(value: Endpoint): Self = this.set("ReadEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadEndpoint: Self = this.set("ReadEndpoint", js.undefined)
  }
  
}

