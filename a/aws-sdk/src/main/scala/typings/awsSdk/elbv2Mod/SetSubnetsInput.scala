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
  def apply(LoadBalancerArn: LoadBalancerArn, SubnetMappings: SubnetMappings = null, Subnets: Subnets = null): SetSubnetsInput = {
    val __obj = js.Dynamic.literal(LoadBalancerArn = LoadBalancerArn.asInstanceOf[js.Any])
    if (SubnetMappings != null) __obj.updateDynamic("SubnetMappings")(SubnetMappings.asInstanceOf[js.Any])
    if (Subnets != null) __obj.updateDynamic("Subnets")(Subnets.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetSubnetsInput]
  }
}

