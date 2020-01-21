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
  def apply(
    CacheClusterId: String = null,
    CacheNodeCreateTime: TStamp = null,
    CacheNodeId: String = null,
    CacheSize: String = null,
    NodeGroupConfiguration: NodeGroupConfiguration = null,
    NodeGroupId: String = null,
    SnapshotCreateTime: TStamp = null
  ): NodeSnapshot = {
    val __obj = js.Dynamic.literal()
    if (CacheClusterId != null) __obj.updateDynamic("CacheClusterId")(CacheClusterId.asInstanceOf[js.Any])
    if (CacheNodeCreateTime != null) __obj.updateDynamic("CacheNodeCreateTime")(CacheNodeCreateTime.asInstanceOf[js.Any])
    if (CacheNodeId != null) __obj.updateDynamic("CacheNodeId")(CacheNodeId.asInstanceOf[js.Any])
    if (CacheSize != null) __obj.updateDynamic("CacheSize")(CacheSize.asInstanceOf[js.Any])
    if (NodeGroupConfiguration != null) __obj.updateDynamic("NodeGroupConfiguration")(NodeGroupConfiguration.asInstanceOf[js.Any])
    if (NodeGroupId != null) __obj.updateDynamic("NodeGroupId")(NodeGroupId.asInstanceOf[js.Any])
    if (SnapshotCreateTime != null) __obj.updateDynamic("SnapshotCreateTime")(SnapshotCreateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeSnapshot]
  }
}

