package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalReplicationGroupInfo extends js.Object {
  /**
    * The name of the Global Datastore
    */
  var GlobalReplicationGroupId: js.UndefOr[String] = js.native
  /**
    * The role of the replication group in a Global Datastore. Can be primary or secondary.
    */
  var GlobalReplicationGroupMemberRole: js.UndefOr[String] = js.native
}

object GlobalReplicationGroupInfo {
  @scala.inline
  def apply(GlobalReplicationGroupId: String = null, GlobalReplicationGroupMemberRole: String = null): GlobalReplicationGroupInfo = {
    val __obj = js.Dynamic.literal()
    if (GlobalReplicationGroupId != null) __obj.updateDynamic("GlobalReplicationGroupId")(GlobalReplicationGroupId.asInstanceOf[js.Any])
    if (GlobalReplicationGroupMemberRole != null) __obj.updateDynamic("GlobalReplicationGroupMemberRole")(GlobalReplicationGroupMemberRole.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalReplicationGroupInfo]
  }
}

