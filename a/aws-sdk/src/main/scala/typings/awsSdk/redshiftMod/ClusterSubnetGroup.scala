package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterSubnetGroup extends js.Object {
  /**
    * The name of the cluster subnet group.
    */
  var ClusterSubnetGroupName: js.UndefOr[String] = js.native
  /**
    * The description of the cluster subnet group.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The status of the cluster subnet group. Possible values are Complete, Incomplete and Invalid. 
    */
  var SubnetGroupStatus: js.UndefOr[String] = js.native
  /**
    * A list of the VPC Subnet elements. 
    */
  var Subnets: js.UndefOr[SubnetList] = js.native
  /**
    * The list of tags for the cluster subnet group.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The VPC ID of the cluster subnet group.
    */
  var VpcId: js.UndefOr[String] = js.native
}

object ClusterSubnetGroup {
  @scala.inline
  def apply(
    ClusterSubnetGroupName: String = null,
    Description: String = null,
    SubnetGroupStatus: String = null,
    Subnets: SubnetList = null,
    Tags: TagList = null,
    VpcId: String = null
  ): ClusterSubnetGroup = {
    val __obj = js.Dynamic.literal()
    if (ClusterSubnetGroupName != null) __obj.updateDynamic("ClusterSubnetGroupName")(ClusterSubnetGroupName.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (SubnetGroupStatus != null) __obj.updateDynamic("SubnetGroupStatus")(SubnetGroupStatus.asInstanceOf[js.Any])
    if (Subnets != null) __obj.updateDynamic("Subnets")(Subnets.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterSubnetGroup]
  }
}

