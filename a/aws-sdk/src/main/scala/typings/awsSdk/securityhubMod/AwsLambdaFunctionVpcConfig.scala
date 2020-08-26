package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsLambdaFunctionVpcConfig extends js.Object {
  /**
    * A list of VPC security groups IDs.
    */
  var SecurityGroupIds: js.UndefOr[NonEmptyStringList] = js.native
  /**
    * A list of VPC subnet IDs.
    */
  var SubnetIds: js.UndefOr[NonEmptyStringList] = js.native
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[NonEmptyString] = js.native
}

object AwsLambdaFunctionVpcConfig {
  @scala.inline
  def apply(): AwsLambdaFunctionVpcConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsLambdaFunctionVpcConfig]
  }
  @scala.inline
  implicit class AwsLambdaFunctionVpcConfigOps[Self <: AwsLambdaFunctionVpcConfig] (val x: Self) extends AnyVal {
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
    def setSubnetIdsVarargs(value: NonEmptyString*): Self = this.set("SubnetIds", js.Array(value :_*))
    @scala.inline
    def setSubnetIds(value: NonEmptyStringList): Self = this.set("SubnetIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnetIds: Self = this.set("SubnetIds", js.undefined)
    @scala.inline
    def setVpcId(value: NonEmptyString): Self = this.set("VpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcId: Self = this.set("VpcId", js.undefined)
  }
  
}

