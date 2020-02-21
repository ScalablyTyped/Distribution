package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsCodeBuildProjectVpcConfig extends js.Object {
  /**
    * A list of one or more security group IDs in your Amazon VPC.
    */
  var SecurityGroupIds: js.UndefOr[NonEmptyStringList] = js.native
  /**
    * A list of one or more subnet IDs in your Amazon VPC.
    */
  var Subnets: js.UndefOr[NonEmptyStringList] = js.native
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[NonEmptyString] = js.native
}

object AwsCodeBuildProjectVpcConfig {
  @scala.inline
  def apply(
    SecurityGroupIds: NonEmptyStringList = null,
    Subnets: NonEmptyStringList = null,
    VpcId: NonEmptyString = null
  ): AwsCodeBuildProjectVpcConfig = {
    val __obj = js.Dynamic.literal()
    if (SecurityGroupIds != null) __obj.updateDynamic("SecurityGroupIds")(SecurityGroupIds.asInstanceOf[js.Any])
    if (Subnets != null) __obj.updateDynamic("Subnets")(Subnets.asInstanceOf[js.Any])
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsCodeBuildProjectVpcConfig]
  }
}

