package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetSubnetsInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the load balancer.
    */
  var LoadBalancerArn: typings.awsSdk.elbv2Mod.LoadBalancerArn = js.native
  /**
    * The IDs of the public subnets. You can specify only one subnet per Availability Zone. You must specify either subnets or subnet mappings. [Application Load Balancers] You must specify subnets from at least two Availability Zones. You cannot specify Elastic IP addresses for your subnets. [Network Load Balancers] You can specify subnets from one or more Availability Zones. If you need static IP addresses for your internet-facing load balancer, you can specify one Elastic IP address per subnet. For internal load balancers, you can specify one private IP address per subnet from the IPv4 range of the subnet.
    */
  var SubnetMappings: js.UndefOr[typings.awsSdk.elbv2Mod.SubnetMappings] = js.native
  /**
    * The IDs of the public subnets. You must specify subnets from at least two Availability Zones. You can specify only one subnet per Availability Zone. You must specify either subnets or subnet mappings.
    */
  var Subnets: js.UndefOr[typings.awsSdk.elbv2Mod.Subnets] = js.native
}

object SetSubnetsInput {
  @scala.inline
  def apply(LoadBalancerArn: LoadBalancerArn): SetSubnetsInput = {
    val __obj = js.Dynamic.literal(LoadBalancerArn = LoadBalancerArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetSubnetsInput]
  }
  @scala.inline
  implicit class SetSubnetsInputOps[Self <: SetSubnetsInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLoadBalancerArn(value: LoadBalancerArn): Self = this.set("LoadBalancerArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubnetMappingsVarargs(value: SubnetMapping*): Self = this.set("SubnetMappings", js.Array(value :_*))
    @scala.inline
    def setSubnetMappings(value: SubnetMappings): Self = this.set("SubnetMappings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnetMappings: Self = this.set("SubnetMappings", js.undefined)
    @scala.inline
    def setSubnetsVarargs(value: SubnetId*): Self = this.set("Subnets", js.Array(value :_*))
    @scala.inline
    def setSubnets(value: Subnets): Self = this.set("Subnets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnets: Self = this.set("Subnets", js.undefined)
  }
  
}

