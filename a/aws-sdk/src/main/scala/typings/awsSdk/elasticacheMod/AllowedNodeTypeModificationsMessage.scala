package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllowedNodeTypeModificationsMessage extends js.Object {
  /**
    * A string list, each element of which specifies a cache node type which you can use to scale your cluster or replication group. When scaling down a Redis cluster or replication group using ModifyCacheCluster or ModifyReplicationGroup, use a value from this list for the CacheNodeType parameter. 
    */
  var ScaleDownModifications: js.UndefOr[NodeTypeList] = js.native
  /**
    * A string list, each element of which specifies a cache node type which you can use to scale your cluster or replication group. When scaling up a Redis cluster or replication group using ModifyCacheCluster or ModifyReplicationGroup, use a value from this list for the CacheNodeType parameter.
    */
  var ScaleUpModifications: js.UndefOr[NodeTypeList] = js.native
}

object AllowedNodeTypeModificationsMessage {
  @scala.inline
  def apply(ScaleDownModifications: NodeTypeList = null, ScaleUpModifications: NodeTypeList = null): AllowedNodeTypeModificationsMessage = {
    val __obj = js.Dynamic.literal()
    if (ScaleDownModifications != null) __obj.updateDynamic("ScaleDownModifications")(ScaleDownModifications.asInstanceOf[js.Any])
    if (ScaleUpModifications != null) __obj.updateDynamic("ScaleUpModifications")(ScaleUpModifications.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowedNodeTypeModificationsMessage]
  }
}

