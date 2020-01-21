package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBSecurityGroup extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the DB security group.
    */
  var DBSecurityGroupArn: js.UndefOr[String] = js.native
  /**
    * Provides the description of the DB security group.
    */
  var DBSecurityGroupDescription: js.UndefOr[String] = js.native
  /**
    * Specifies the name of the DB security group.
    */
  var DBSecurityGroupName: js.UndefOr[String] = js.native
  /**
    *  Contains a list of EC2SecurityGroup elements. 
    */
  var EC2SecurityGroups: js.UndefOr[EC2SecurityGroupList] = js.native
  /**
    *  Contains a list of IPRange elements. 
    */
  var IPRanges: js.UndefOr[IPRangeList] = js.native
  /**
    * Provides the AWS ID of the owner of a specific DB security group.
    */
  var OwnerId: js.UndefOr[String] = js.native
  /**
    * Provides the VpcId of the DB security group.
    */
  var VpcId: js.UndefOr[String] = js.native
}

object DBSecurityGroup {
  @scala.inline
  def apply(
    DBSecurityGroupArn: String = null,
    DBSecurityGroupDescription: String = null,
    DBSecurityGroupName: String = null,
    EC2SecurityGroups: EC2SecurityGroupList = null,
    IPRanges: IPRangeList = null,
    OwnerId: String = null,
    VpcId: String = null
  ): DBSecurityGroup = {
    val __obj = js.Dynamic.literal()
    if (DBSecurityGroupArn != null) __obj.updateDynamic("DBSecurityGroupArn")(DBSecurityGroupArn.asInstanceOf[js.Any])
    if (DBSecurityGroupDescription != null) __obj.updateDynamic("DBSecurityGroupDescription")(DBSecurityGroupDescription.asInstanceOf[js.Any])
    if (DBSecurityGroupName != null) __obj.updateDynamic("DBSecurityGroupName")(DBSecurityGroupName.asInstanceOf[js.Any])
    if (EC2SecurityGroups != null) __obj.updateDynamic("EC2SecurityGroups")(EC2SecurityGroups.asInstanceOf[js.Any])
    if (IPRanges != null) __obj.updateDynamic("IPRanges")(IPRanges.asInstanceOf[js.Any])
    if (OwnerId != null) __obj.updateDynamic("OwnerId")(OwnerId.asInstanceOf[js.Any])
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBSecurityGroup]
  }
}

