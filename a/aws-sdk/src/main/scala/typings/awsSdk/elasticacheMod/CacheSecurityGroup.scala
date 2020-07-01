package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheSecurityGroup extends js.Object {
  /**
    * The ARN (Amazon Resource Name) of the cache security group.
    */
  var ARN: js.UndefOr[String] = js.native
  /**
    * The name of the cache security group.
    */
  var CacheSecurityGroupName: js.UndefOr[String] = js.native
  /**
    * The description of the cache security group.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * A list of Amazon EC2 security groups that are associated with this cache security group.
    */
  var EC2SecurityGroups: js.UndefOr[EC2SecurityGroupList] = js.native
  /**
    * The AWS account ID of the cache security group owner.
    */
  var OwnerId: js.UndefOr[String] = js.native
}

object CacheSecurityGroup {
  @scala.inline
  def apply(
    ARN: String = null,
    CacheSecurityGroupName: String = null,
    Description: String = null,
    EC2SecurityGroups: EC2SecurityGroupList = null,
    OwnerId: String = null
  ): CacheSecurityGroup = {
    val __obj = js.Dynamic.literal()
    if (ARN != null) __obj.updateDynamic("ARN")(ARN.asInstanceOf[js.Any])
    if (CacheSecurityGroupName != null) __obj.updateDynamic("CacheSecurityGroupName")(CacheSecurityGroupName.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (EC2SecurityGroups != null) __obj.updateDynamic("EC2SecurityGroups")(EC2SecurityGroups.asInstanceOf[js.Any])
    if (OwnerId != null) __obj.updateDynamic("OwnerId")(OwnerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheSecurityGroup]
  }
}

