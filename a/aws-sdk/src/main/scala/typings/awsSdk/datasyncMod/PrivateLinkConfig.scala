package typings.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrivateLinkConfig extends js.Object {
  /**
    * The private endpoint that is configured for an agent that has access to IP addresses in a PrivateLink. An agent that is configured with this endpoint will not be accessible over the public internet.
    */
  var PrivateLinkEndpoint: js.UndefOr[Endpoint] = js.native
  /**
    * The Amazon Resource Names (ARNs) of the security groups that are configured for the EC2 resource that hosts an agent activated in a VPC or an agent that has access to a VPC endpoint.
    */
  var SecurityGroupArns: js.UndefOr[PLSecurityGroupArnList] = js.native
  /**
    * The Amazon Resource Names (ARNs) of the subnets that are configured for an agent activated in a VPC or an agent that has access to a VPC endpoint.
    */
  var SubnetArns: js.UndefOr[PLSubnetArnList] = js.native
  /**
    * The ID of the VPC endpoint that is configured for an agent. An agent that is configured with a VPC endpoint will not be accessible over the public internet.
    */
  var VpcEndpointId: js.UndefOr[typings.awsSdk.datasyncMod.VpcEndpointId] = js.native
}

object PrivateLinkConfig {
  @scala.inline
  def apply(): PrivateLinkConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrivateLinkConfig]
  }
  @scala.inline
  implicit class PrivateLinkConfigOps[Self <: PrivateLinkConfig] (val x: Self) extends AnyVal {
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
    def setPrivateLinkEndpoint(value: Endpoint): Self = this.set("PrivateLinkEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateLinkEndpoint: Self = this.set("PrivateLinkEndpoint", js.undefined)
    @scala.inline
    def setSecurityGroupArnsVarargs(value: Ec2SecurityGroupArn*): Self = this.set("SecurityGroupArns", js.Array(value :_*))
    @scala.inline
    def setSecurityGroupArns(value: PLSecurityGroupArnList): Self = this.set("SecurityGroupArns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityGroupArns: Self = this.set("SecurityGroupArns", js.undefined)
    @scala.inline
    def setSubnetArnsVarargs(value: Ec2SubnetArn*): Self = this.set("SubnetArns", js.Array(value :_*))
    @scala.inline
    def setSubnetArns(value: PLSubnetArnList): Self = this.set("SubnetArns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnetArns: Self = this.set("SubnetArns", js.undefined)
    @scala.inline
    def setVpcEndpointId(value: VpcEndpointId): Self = this.set("VpcEndpointId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcEndpointId: Self = this.set("VpcEndpointId", js.undefined)
  }
  
}

