package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAllowedNodeTypeModificationsMessage extends js.Object {
  /**
    * The name of the cluster you want to scale up to a larger node instanced type. ElastiCache uses the cluster id to identify the current node type of this cluster and from that to create a list of node types you can scale up to.  You must provide a value for either the CacheClusterId or the ReplicationGroupId. 
    */
  var CacheClusterId: js.UndefOr[String] = js.native
  /**
    * The name of the replication group want to scale up to a larger node type. ElastiCache uses the replication group id to identify the current node type being used by this replication group, and from that to create a list of node types you can scale up to.  You must provide a value for either the CacheClusterId or the ReplicationGroupId. 
    */
  var ReplicationGroupId: js.UndefOr[String] = js.native
}

object ListAllowedNodeTypeModificationsMessage {
  @scala.inline
  def apply(): ListAllowedNodeTypeModificationsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAllowedNodeTypeModificationsMessage]
  }
  @scala.inline
  implicit class ListAllowedNodeTypeModificationsMessageOps[Self <: ListAllowedNodeTypeModificationsMessage] (val x: Self) extends AnyVal {
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
    def setReplicationGroupId(value: String): Self = this.set("ReplicationGroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicationGroupId: Self = this.set("ReplicationGroupId", js.undefined)
  }
  
}

