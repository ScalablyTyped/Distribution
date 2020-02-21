package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsRdsDbInstanceVpcSecurityGroup extends js.Object {
  /**
    * The status of the VPC security group.
    */
  var Status: js.UndefOr[NonEmptyString] = js.native
  /**
    * The name of the VPC security group.
    */
  var VpcSecurityGroupId: js.UndefOr[NonEmptyString] = js.native
}

object AwsRdsDbInstanceVpcSecurityGroup {
  @scala.inline
  def apply(Status: NonEmptyString = null, VpcSecurityGroupId: NonEmptyString = null): AwsRdsDbInstanceVpcSecurityGroup = {
    val __obj = js.Dynamic.literal()
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (VpcSecurityGroupId != null) __obj.updateDynamic("VpcSecurityGroupId")(VpcSecurityGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsRdsDbInstanceVpcSecurityGroup]
  }
}

