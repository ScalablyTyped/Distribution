package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessedUpdateAction extends js.Object {
  /**
    * The ID of the cache cluster
    */
  var CacheClusterId: js.UndefOr[String] = js.native
  /**
    * The ID of the replication group
    */
  var ReplicationGroupId: js.UndefOr[String] = js.native
  /**
    * The unique ID of the service update
    */
  var ServiceUpdateName: js.UndefOr[String] = js.native
  /**
    * The status of the update action on the Redis cluster
    */
  var UpdateActionStatus: js.UndefOr[typings.awsSdk.elasticacheMod.UpdateActionStatus] = js.native
}

object ProcessedUpdateAction {
  @scala.inline
  def apply(
    CacheClusterId: String = null,
    ReplicationGroupId: String = null,
    ServiceUpdateName: String = null,
    UpdateActionStatus: UpdateActionStatus = null
  ): ProcessedUpdateAction = {
    val __obj = js.Dynamic.literal()
    if (CacheClusterId != null) __obj.updateDynamic("CacheClusterId")(CacheClusterId.asInstanceOf[js.Any])
    if (ReplicationGroupId != null) __obj.updateDynamic("ReplicationGroupId")(ReplicationGroupId.asInstanceOf[js.Any])
    if (ServiceUpdateName != null) __obj.updateDynamic("ServiceUpdateName")(ServiceUpdateName.asInstanceOf[js.Any])
    if (UpdateActionStatus != null) __obj.updateDynamic("UpdateActionStatus")(UpdateActionStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessedUpdateAction]
  }
}

