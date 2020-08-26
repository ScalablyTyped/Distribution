package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchApplyUpdateActionMessage extends js.Object {
  /**
    * The cache cluster IDs
    */
  var CacheClusterIds: js.UndefOr[CacheClusterIdList] = js.native
  /**
    * The replication group IDs
    */
  var ReplicationGroupIds: js.UndefOr[ReplicationGroupIdList] = js.native
  /**
    * The unique ID of the service update
    */
  var ServiceUpdateName: String = js.native
}

object BatchApplyUpdateActionMessage {
  @scala.inline
  def apply(ServiceUpdateName: String): BatchApplyUpdateActionMessage = {
    val __obj = js.Dynamic.literal(ServiceUpdateName = ServiceUpdateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchApplyUpdateActionMessage]
  }
  @scala.inline
  implicit class BatchApplyUpdateActionMessageOps[Self <: BatchApplyUpdateActionMessage] (val x: Self) extends AnyVal {
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
    def setServiceUpdateName(value: String): Self = this.set("ServiceUpdateName", value.asInstanceOf[js.Any])
    @scala.inline
    def setCacheClusterIdsVarargs(value: String*): Self = this.set("CacheClusterIds", js.Array(value :_*))
    @scala.inline
    def setCacheClusterIds(value: CacheClusterIdList): Self = this.set("CacheClusterIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheClusterIds: Self = this.set("CacheClusterIds", js.undefined)
    @scala.inline
    def setReplicationGroupIdsVarargs(value: String*): Self = this.set("ReplicationGroupIds", js.Array(value :_*))
    @scala.inline
    def setReplicationGroupIds(value: ReplicationGroupIdList): Self = this.set("ReplicationGroupIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicationGroupIds: Self = this.set("ReplicationGroupIds", js.undefined)
  }
  
}

