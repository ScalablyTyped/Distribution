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
  def apply(): AwsCodeBuildProjectVpcConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCodeBuildProjectVpcConfig]
  }
  @scala.inline
  implicit class AwsCodeBuildProjectVpcConfigOps[Self <: AwsCodeBuildProjectVpcConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSecurityGroupIdsVarargs(value: NonEmptyString*): Self = this.set("SecurityGroupIds", js.Array(value :_*))
    @scala.inline
    def setSecurityGroupIds(value: NonEmptyStringList): Self = this.set("SecurityGroupIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityGroupIds: Self = this.set("SecurityGroupIds", js.undefined)
    @scala.inline
    def setSubnetsVarargs(value: NonEmptyString*): Self = this.set("Subnets", js.Array(value :_*))
    @scala.inline
    def setSubnets(value: NonEmptyStringList): Self = this.set("Subnets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnets: Self = this.set("Subnets", js.undefined)
    @scala.inline
    def setVpcId(value: NonEmptyString): Self = this.set("VpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcId: Self = this.set("VpcId", js.undefined)
  }
  
}

