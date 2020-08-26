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
  def apply(): AllowedNodeTypeModificationsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowedNodeTypeModificationsMessage]
  }
  @scala.inline
  implicit class AllowedNodeTypeModificationsMessageOps[Self <: AllowedNodeTypeModificationsMessage] (val x: Self) extends AnyVal {
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
    def setScaleDownModificationsVarargs(value: String*): Self = this.set("ScaleDownModifications", js.Array(value :_*))
    @scala.inline
    def setScaleDownModifications(value: NodeTypeList): Self = this.set("ScaleDownModifications", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleDownModifications: Self = this.set("ScaleDownModifications", js.undefined)
    @scala.inline
    def setScaleUpModificationsVarargs(value: String*): Self = this.set("ScaleUpModifications", js.Array(value :_*))
    @scala.inline
    def setScaleUpModifications(value: NodeTypeList): Self = this.set("ScaleUpModifications", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleUpModifications: Self = this.set("ScaleUpModifications", js.undefined)
  }
  
}

