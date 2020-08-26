package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeSnapshot extends js.Object {
  /**
    * A unique identifier for the source cluster.
    */
  var CacheClusterId: js.UndefOr[String] = js.native
  /**
    * The date and time when the cache node was created in the source cluster.
    */
  var CacheNodeCreateTime: js.UndefOr[TStamp] = js.native
  /**
    * The cache node identifier for the node in the source cluster.
    */
  var CacheNodeId: js.UndefOr[String] = js.native
  /**
    * The size of the cache on the source cache node.
    */
  var CacheSize: js.UndefOr[String] = js.native
  /**
    * The configuration for the source node group (shard).
    */
  var NodeGroupConfiguration: js.UndefOr[typings.awsSdk.elasticacheMod.NodeGroupConfiguration] = js.native
  /**
    * A unique identifier for the source node group (shard).
    */
  var NodeGroupId: js.UndefOr[String] = js.native
  /**
    * The date and time when the source node's metadata and cache data set was obtained for the snapshot.
    */
  var SnapshotCreateTime: js.UndefOr[TStamp] = js.native
}

object NodeSnapshot {
  @scala.inline
  def apply(): NodeSnapshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeSnapshot]
  }
  @scala.inline
  implicit class NodeSnapshotOps[Self <: NodeSnapshot] (val x: Self) extends AnyVal {
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
    def setCacheNodeCreateTime(value: TStamp): Self = this.set("CacheNodeCreateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheNodeCreateTime: Self = this.set("CacheNodeCreateTime", js.undefined)
    @scala.inline
    def setCacheNodeId(value: String): Self = this.set("CacheNodeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheNodeId: Self = this.set("CacheNodeId", js.undefined)
    @scala.inline
    def setCacheSize(value: String): Self = this.set("CacheSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheSize: Self = this.set("CacheSize", js.undefined)
    @scala.inline
    def setNodeGroupConfiguration(value: NodeGroupConfiguration): Self = this.set("NodeGroupConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeGroupConfiguration: Self = this.set("NodeGroupConfiguration", js.undefined)
    @scala.inline
    def setNodeGroupId(value: String): Self = this.set("NodeGroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeGroupId: Self = this.set("NodeGroupId", js.undefined)
    @scala.inline
    def setSnapshotCreateTime(value: TStamp): Self = this.set("SnapshotCreateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapshotCreateTime: Self = this.set("SnapshotCreateTime", js.undefined)
  }
  
}

