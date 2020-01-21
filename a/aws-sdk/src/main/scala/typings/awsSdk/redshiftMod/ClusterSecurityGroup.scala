package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterSecurityGroup extends js.Object {
  /**
    * The name of the cluster security group to which the operation was applied.
    */
  var ClusterSecurityGroupName: js.UndefOr[String] = js.native
  /**
    * A description of the security group.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * A list of EC2 security groups that are permitted to access clusters associated with this cluster security group.
    */
  var EC2SecurityGroups: js.UndefOr[EC2SecurityGroupList] = js.native
  /**
    * A list of IP ranges (CIDR blocks) that are permitted to access clusters associated with this cluster security group.
    */
  var IPRanges: js.UndefOr[IPRangeList] = js.native
  /**
    * The list of tags for the cluster security group.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object ClusterSecurityGroup {
  @scala.inline
  def apply(
    ClusterSecurityGroupName: String = null,
    Description: String = null,
    EC2SecurityGroups: EC2SecurityGroupList = null,
    IPRanges: IPRangeList = null,
    Tags: TagList = null
  ): ClusterSecurityGroup = {
    val __obj = js.Dynamic.literal()
    if (ClusterSecurityGroupName != null) __obj.updateDynamic("ClusterSecurityGroupName")(ClusterSecurityGroupName.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (EC2SecurityGroups != null) __obj.updateDynamic("EC2SecurityGroups")(EC2SecurityGroups.asInstanceOf[js.Any])
    if (IPRanges != null) __obj.updateDynamic("IPRanges")(IPRanges.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterSecurityGroup]
  }
}

