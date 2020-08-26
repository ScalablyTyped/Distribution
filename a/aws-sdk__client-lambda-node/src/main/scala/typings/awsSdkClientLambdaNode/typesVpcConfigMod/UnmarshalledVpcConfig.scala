package typings.awsSdkClientLambdaNode.typesVpcConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledVpcConfig extends VpcConfig {
  /**
    * <p>A list of VPC security groups IDs.</p>
    */
  @JSName("SecurityGroupIds")
  var SecurityGroupIds_UnmarshalledVpcConfig: js.UndefOr[js.Array[String]] = js.native
  /**
    * <p>A list of VPC subnet IDs.</p>
    */
  @JSName("SubnetIds")
  var SubnetIds_UnmarshalledVpcConfig: js.UndefOr[js.Array[String]] = js.native
}

object UnmarshalledVpcConfig {
  @scala.inline
  def apply(): UnmarshalledVpcConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledVpcConfig]
  }
  @scala.inline
  implicit class UnmarshalledVpcConfigOps[Self <: UnmarshalledVpcConfig] (val x: Self) extends AnyVal {
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
    def setSecurityGroupIdsVarargs(value: String*): Self = this.set("SecurityGroupIds", js.Array(value :_*))
    @scala.inline
    def setSecurityGroupIds(value: js.Array[String]): Self = this.set("SecurityGroupIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityGroupIds: Self = this.set("SecurityGroupIds", js.undefined)
    @scala.inline
    def setSubnetIdsVarargs(value: String*): Self = this.set("SubnetIds", js.Array(value :_*))
    @scala.inline
    def setSubnetIds(value: js.Array[String]): Self = this.set("SubnetIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnetIds: Self = this.set("SubnetIds", js.undefined)
  }
  
}

