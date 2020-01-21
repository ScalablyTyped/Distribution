package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicationSubnetGroup extends js.Object {
  /**
    * A description for the replication subnet group.
    */
  var ReplicationSubnetGroupDescription: js.UndefOr[String] = js.native
  /**
    * The identifier of the replication instance subnet group.
    */
  var ReplicationSubnetGroupIdentifier: js.UndefOr[String] = js.native
  /**
    * The status of the subnet group.
    */
  var SubnetGroupStatus: js.UndefOr[String] = js.native
  /**
    * The subnets that are in the subnet group.
    */
  var Subnets: js.UndefOr[SubnetList] = js.native
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[String] = js.native
}

object ReplicationSubnetGroup {
  @scala.inline
  def apply(
    ReplicationSubnetGroupDescription: String = null,
    ReplicationSubnetGroupIdentifier: String = null,
    SubnetGroupStatus: String = null,
    Subnets: SubnetList = null,
    VpcId: String = null
  ): ReplicationSubnetGroup = {
    val __obj = js.Dynamic.literal()
    if (ReplicationSubnetGroupDescription != null) __obj.updateDynamic("ReplicationSubnetGroupDescription")(ReplicationSubnetGroupDescription.asInstanceOf[js.Any])
    if (ReplicationSubnetGroupIdentifier != null) __obj.updateDynamic("ReplicationSubnetGroupIdentifier")(ReplicationSubnetGroupIdentifier.asInstanceOf[js.Any])
    if (SubnetGroupStatus != null) __obj.updateDynamic("SubnetGroupStatus")(SubnetGroupStatus.asInstanceOf[js.Any])
    if (Subnets != null) __obj.updateDynamic("Subnets")(Subnets.asInstanceOf[js.Any])
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationSubnetGroup]
  }
}

