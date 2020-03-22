package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalReplicationGroupMember extends js.Object {
  /**
    * Indicates whether automatic failover is enabled for the replication group.
    */
  var AutomaticFailover: js.UndefOr[AutomaticFailoverStatus] = js.native
  /**
    * The replication group id of the Global Datastore member.
    */
  var ReplicationGroupId: js.UndefOr[String] = js.native
  /**
    * The AWS region of the Global Datastore member.
    */
  var ReplicationGroupRegion: js.UndefOr[String] = js.native
  /**
    * Indicates the role of the replication group, primary or secondary.
    */
  var Role: js.UndefOr[String] = js.native
  /**
    * The status of the membership of the replication group.
    */
  var Status: js.UndefOr[String] = js.native
}

object GlobalReplicationGroupMember {
  @scala.inline
  def apply(
    AutomaticFailover: AutomaticFailoverStatus = null,
    ReplicationGroupId: String = null,
    ReplicationGroupRegion: String = null,
    Role: String = null,
    Status: String = null
  ): GlobalReplicationGroupMember = {
    val __obj = js.Dynamic.literal()
    if (AutomaticFailover != null) __obj.updateDynamic("AutomaticFailover")(AutomaticFailover.asInstanceOf[js.Any])
    if (ReplicationGroupId != null) __obj.updateDynamic("ReplicationGroupId")(ReplicationGroupId.asInstanceOf[js.Any])
    if (ReplicationGroupRegion != null) __obj.updateDynamic("ReplicationGroupRegion")(ReplicationGroupRegion.asInstanceOf[js.Any])
    if (Role != null) __obj.updateDynamic("Role")(Role.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalReplicationGroupMember]
  }
}

