package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyReplicationSubnetGroupMessage extends js.Object {
  /**
    * A description for the replication instance subnet group.
    */
  var ReplicationSubnetGroupDescription: js.UndefOr[String] = js.native
  /**
    * The name of the replication instance subnet group.
    */
  var ReplicationSubnetGroupIdentifier: String = js.native
  /**
    * A list of subnet IDs.
    */
  var SubnetIds: SubnetIdentifierList = js.native
}

object ModifyReplicationSubnetGroupMessage {
  @scala.inline
  def apply(
    ReplicationSubnetGroupIdentifier: String,
    SubnetIds: SubnetIdentifierList,
    ReplicationSubnetGroupDescription: String = null
  ): ModifyReplicationSubnetGroupMessage = {
    val __obj = js.Dynamic.literal(ReplicationSubnetGroupIdentifier = ReplicationSubnetGroupIdentifier.asInstanceOf[js.Any], SubnetIds = SubnetIds.asInstanceOf[js.Any])
    if (ReplicationSubnetGroupDescription != null) __obj.updateDynamic("ReplicationSubnetGroupDescription")(ReplicationSubnetGroupDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyReplicationSubnetGroupMessage]
  }
}

