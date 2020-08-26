package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLoadBalancerInput extends js.Object {
  /**
    * [Application Load Balancers] The type of IP addresses used by the subnets for your load balancer. The possible values are ipv4 (for IPv4 addresses) and dualstack (for IPv4 and IPv6 addresses). Internal load balancers must use ipv4.
    */
  var IpAddressType: js.UndefOr[typings.awsSdk.elbv2Mod.IpAddressType] = js.native
  /**
    * The name of the load balancer. This name must be unique per region per account, can have a maximum of 32 characters, must contain only alphanumeric characters or hyphens, must not begin or end with a hyphen, and must not begin with "internal-".
    */
  var Name: LoadBalancerName = js.native
  /**
    * The nodes of an Internet-facing load balancer have public IP addresses. The DNS name of an Internet-facing load balancer is publicly resolvable to the public IP addresses of the nodes. Therefore, Internet-facing load balancers can route requests from clients over the internet. The nodes of an internal load balancer have only private IP addresses. The DNS name of an internal load balancer is publicly resolvable to the private IP addresses of the nodes. Therefore, internal load balancers can route requests only from clients with access to the VPC for the load balancer. The default is an Internet-facing load balancer.
    */
  var Scheme: js.UndefOr[LoadBalancerSchemeEnum] = js.native
  /**
    * [Application Load Balancers] The IDs of the security groups for the load balancer.
    */
  var SecurityGroups: js.UndefOr[typings.awsSdk.elbv2Mod.SecurityGroups] = js.native
  /**
    * The IDs of the public subnets. You can specify only one subnet per Availability Zone. You must specify either subnets or subnet mappings. [Application Load Balancers] You must specify subnets from at least two Availability Zones. You cannot specify Elastic IP addresses for your subnets. [Network Load Balancers] You can specify subnets from one or more Availability Zones. You can specify one Elastic IP address per subnet if you need static IP addresses for your internet-facing load balancer. For internal load balancers, you can specify one private IP address per subnet from the IPv4 range of the subnet.
    */
  var SubnetMappings: js.UndefOr[typings.awsSdk.elbv2Mod.SubnetMappings] = js.native
  /**
    * The IDs of the public subnets. You can specify only one subnet per Availability Zone. You must specify either subnets or subnet mappings. [Application Load Balancers] You must specify subnets from at least two Availability Zones. [Network Load Balancers] You can specify subnets from one or more Availability Zones.
    */
  var Subnets: js.UndefOr[typings.awsSdk.elbv2Mod.Subnets] = js.native
  /**
    * One or more tags to assign to the load balancer.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The type of load balancer. The default is application.
    */
  var Type: js.UndefOr[LoadBalancerTypeEnum] = js.native
}

object CreateLoadBalancerInput {
  @scala.inline
  def apply(Name: LoadBalancerName): CreateLoadBalancerInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLoadBalancerInput]
  }
  @scala.inline
  implicit class CreateLoadBalancerInputOps[Self <: CreateLoadBalancerInput] (val x: Self) extends AnyVal {
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
    def setName(value: LoadBalancerName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setIpAddressType(value: IpAddressType): Self = this.set("IpAddressType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpAddressType: Self = this.set("IpAddressType", js.undefined)
    @scala.inline
    def setScheme(value: LoadBalancerSchemeEnum): Self = this.set("Scheme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheme: Self = this.set("Scheme", js.undefined)
    @scala.inline
    def setSecurityGroupsVarargs(value: SecurityGroupId*): Self = this.set("SecurityGroups", js.Array(value :_*))
    @scala.inline
    def setSecurityGroups(value: SecurityGroups): Self = this.set("SecurityGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityGroups: Self = this.set("SecurityGroups", js.undefined)
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
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    @scala.inline
    def setType(value: LoadBalancerTypeEnum): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
  
}

