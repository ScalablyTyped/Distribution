package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadBalancer extends js.Object {
  /**
    * The Availability Zones for the load balancer.
    */
  var AvailabilityZones: js.UndefOr[typings.awsSdk.elbv2Mod.AvailabilityZones] = js.native
  /**
    * The ID of the Amazon Route 53 hosted zone associated with the load balancer.
    */
  var CanonicalHostedZoneId: js.UndefOr[typings.awsSdk.elbv2Mod.CanonicalHostedZoneId] = js.native
  /**
    * The date and time the load balancer was created.
    */
  var CreatedTime: js.UndefOr[typings.awsSdk.elbv2Mod.CreatedTime] = js.native
  /**
    * The public DNS name of the load balancer.
    */
  var DNSName: js.UndefOr[typings.awsSdk.elbv2Mod.DNSName] = js.native
  /**
    * The type of IP addresses used by the subnets for your load balancer. The possible values are ipv4 (for IPv4 addresses) and dualstack (for IPv4 and IPv6 addresses).
    */
  var IpAddressType: js.UndefOr[typings.awsSdk.elbv2Mod.IpAddressType] = js.native
  /**
    * The Amazon Resource Name (ARN) of the load balancer.
    */
  var LoadBalancerArn: js.UndefOr[typings.awsSdk.elbv2Mod.LoadBalancerArn] = js.native
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: js.UndefOr[typings.awsSdk.elbv2Mod.LoadBalancerName] = js.native
  /**
    * The nodes of an Internet-facing load balancer have public IP addresses. The DNS name of an Internet-facing load balancer is publicly resolvable to the public IP addresses of the nodes. Therefore, Internet-facing load balancers can route requests from clients over the internet. The nodes of an internal load balancer have only private IP addresses. The DNS name of an internal load balancer is publicly resolvable to the private IP addresses of the nodes. Therefore, internal load balancers can route requests only from clients with access to the VPC for the load balancer.
    */
  var Scheme: js.UndefOr[LoadBalancerSchemeEnum] = js.native
  /**
    * The IDs of the security groups for the load balancer.
    */
  var SecurityGroups: js.UndefOr[typings.awsSdk.elbv2Mod.SecurityGroups] = js.native
  /**
    * The state of the load balancer.
    */
  var State: js.UndefOr[LoadBalancerState] = js.native
  /**
    * The type of load balancer.
    */
  var Type: js.UndefOr[LoadBalancerTypeEnum] = js.native
  /**
    * The ID of the VPC for the load balancer.
    */
  var VpcId: js.UndefOr[typings.awsSdk.elbv2Mod.VpcId] = js.native
}

object LoadBalancer {
  @scala.inline
  def apply(): LoadBalancer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadBalancer]
  }
  @scala.inline
  implicit class LoadBalancerOps[Self <: LoadBalancer] (val x: Self) extends AnyVal {
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
    def setAvailabilityZonesVarargs(value: AvailabilityZone*): Self = this.set("AvailabilityZones", js.Array(value :_*))
    @scala.inline
    def setAvailabilityZones(value: AvailabilityZones): Self = this.set("AvailabilityZones", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZones: Self = this.set("AvailabilityZones", js.undefined)
    @scala.inline
    def setCanonicalHostedZoneId(value: CanonicalHostedZoneId): Self = this.set("CanonicalHostedZoneId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanonicalHostedZoneId: Self = this.set("CanonicalHostedZoneId", js.undefined)
    @scala.inline
    def setCreatedTime(value: CreatedTime): Self = this.set("CreatedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedTime: Self = this.set("CreatedTime", js.undefined)
    @scala.inline
    def setDNSName(value: DNSName): Self = this.set("DNSName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDNSName: Self = this.set("DNSName", js.undefined)
    @scala.inline
    def setIpAddressType(value: IpAddressType): Self = this.set("IpAddressType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpAddressType: Self = this.set("IpAddressType", js.undefined)
    @scala.inline
    def setLoadBalancerArn(value: LoadBalancerArn): Self = this.set("LoadBalancerArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadBalancerArn: Self = this.set("LoadBalancerArn", js.undefined)
    @scala.inline
    def setLoadBalancerName(value: LoadBalancerName): Self = this.set("LoadBalancerName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadBalancerName: Self = this.set("LoadBalancerName", js.undefined)
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
    def setState(value: LoadBalancerState): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    @scala.inline
    def setType(value: LoadBalancerTypeEnum): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
    @scala.inline
    def setVpcId(value: VpcId): Self = this.set("VpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcId: Self = this.set("VpcId", js.undefined)
  }
  
}

