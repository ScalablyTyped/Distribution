package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadBalancerDescription extends js.Object {
  
  /**
    * The Availability Zones for the load balancer.
    */
  var AvailabilityZones: js.UndefOr[typings.awsSdk.elbMod.AvailabilityZones] = js.native
  
  /**
    * Information about your EC2 instances.
    */
  var BackendServerDescriptions: js.UndefOr[typings.awsSdk.elbMod.BackendServerDescriptions] = js.native
  
  /**
    * The DNS name of the load balancer. For more information, see Configure a Custom Domain Name in the Classic Load Balancers Guide.
    */
  var CanonicalHostedZoneName: js.UndefOr[DNSName] = js.native
  
  /**
    * The ID of the Amazon Route 53 hosted zone for the load balancer.
    */
  var CanonicalHostedZoneNameID: js.UndefOr[DNSName] = js.native
  
  /**
    * The date and time the load balancer was created.
    */
  var CreatedTime: js.UndefOr[typings.awsSdk.elbMod.CreatedTime] = js.native
  
  /**
    * The DNS name of the load balancer.
    */
  var DNSName: js.UndefOr[typings.awsSdk.elbMod.DNSName] = js.native
  
  /**
    * Information about the health checks conducted on the load balancer.
    */
  var HealthCheck: js.UndefOr[typings.awsSdk.elbMod.HealthCheck] = js.native
  
  /**
    * The IDs of the instances for the load balancer.
    */
  var Instances: js.UndefOr[typings.awsSdk.elbMod.Instances] = js.native
  
  /**
    * The listeners for the load balancer.
    */
  var ListenerDescriptions: js.UndefOr[typings.awsSdk.elbMod.ListenerDescriptions] = js.native
  
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: js.UndefOr[AccessPointName] = js.native
  
  /**
    * The policies defined for the load balancer.
    */
  var Policies: js.UndefOr[typings.awsSdk.elbMod.Policies] = js.native
  
  /**
    * The type of load balancer. Valid only for load balancers in a VPC. If Scheme is internet-facing, the load balancer has a public DNS name that resolves to a public IP address. If Scheme is internal, the load balancer has a public DNS name that resolves to a private IP address.
    */
  var Scheme: js.UndefOr[LoadBalancerScheme] = js.native
  
  /**
    * The security groups for the load balancer. Valid only for load balancers in a VPC.
    */
  var SecurityGroups: js.UndefOr[typings.awsSdk.elbMod.SecurityGroups] = js.native
  
  /**
    * The security group for the load balancer, which you can use as part of your inbound rules for your registered instances. To only allow traffic from load balancers, add a security group rule that specifies this source security group as the inbound source.
    */
  var SourceSecurityGroup: js.UndefOr[typings.awsSdk.elbMod.SourceSecurityGroup] = js.native
  
  /**
    * The IDs of the subnets for the load balancer.
    */
  var Subnets: js.UndefOr[typings.awsSdk.elbMod.Subnets] = js.native
  
  /**
    * The ID of the VPC for the load balancer.
    */
  var VPCId: js.UndefOr[typings.awsSdk.elbMod.VPCId] = js.native
}
object LoadBalancerDescription {
  
  @scala.inline
  def apply(): LoadBalancerDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadBalancerDescription]
  }
  
  @scala.inline
  implicit class LoadBalancerDescriptionOps[Self <: LoadBalancerDescription] (val x: Self) extends AnyVal {
    
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
    def setAvailabilityZonesVarargs(value: AvailabilityZone*): Self = this.set("AvailabilityZones", js.Array(value :_*))
    
    @scala.inline
    def setAvailabilityZones(value: AvailabilityZones): Self = this.set("AvailabilityZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityZones: Self = this.set("AvailabilityZones", js.undefined)
    
    @scala.inline
    def setBackendServerDescriptionsVarargs(value: BackendServerDescription*): Self = this.set("BackendServerDescriptions", js.Array(value :_*))
    
    @scala.inline
    def setBackendServerDescriptions(value: BackendServerDescriptions): Self = this.set("BackendServerDescriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackendServerDescriptions: Self = this.set("BackendServerDescriptions", js.undefined)
    
    @scala.inline
    def setCanonicalHostedZoneName(value: DNSName): Self = this.set("CanonicalHostedZoneName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanonicalHostedZoneName: Self = this.set("CanonicalHostedZoneName", js.undefined)
    
    @scala.inline
    def setCanonicalHostedZoneNameID(value: DNSName): Self = this.set("CanonicalHostedZoneNameID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanonicalHostedZoneNameID: Self = this.set("CanonicalHostedZoneNameID", js.undefined)
    
    @scala.inline
    def setCreatedTime(value: CreatedTime): Self = this.set("CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedTime: Self = this.set("CreatedTime", js.undefined)
    
    @scala.inline
    def setDNSName(value: DNSName): Self = this.set("DNSName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDNSName: Self = this.set("DNSName", js.undefined)
    
    @scala.inline
    def setHealthCheck(value: HealthCheck): Self = this.set("HealthCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthCheck: Self = this.set("HealthCheck", js.undefined)
    
    @scala.inline
    def setInstancesVarargs(value: Instance*): Self = this.set("Instances", js.Array(value :_*))
    
    @scala.inline
    def setInstances(value: Instances): Self = this.set("Instances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstances: Self = this.set("Instances", js.undefined)
    
    @scala.inline
    def setListenerDescriptionsVarargs(value: ListenerDescription*): Self = this.set("ListenerDescriptions", js.Array(value :_*))
    
    @scala.inline
    def setListenerDescriptions(value: ListenerDescriptions): Self = this.set("ListenerDescriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListenerDescriptions: Self = this.set("ListenerDescriptions", js.undefined)
    
    @scala.inline
    def setLoadBalancerName(value: AccessPointName): Self = this.set("LoadBalancerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadBalancerName: Self = this.set("LoadBalancerName", js.undefined)
    
    @scala.inline
    def setPolicies(value: Policies): Self = this.set("Policies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicies: Self = this.set("Policies", js.undefined)
    
    @scala.inline
    def setScheme(value: LoadBalancerScheme): Self = this.set("Scheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheme: Self = this.set("Scheme", js.undefined)
    
    @scala.inline
    def setSecurityGroupsVarargs(value: SecurityGroupId*): Self = this.set("SecurityGroups", js.Array(value :_*))
    
    @scala.inline
    def setSecurityGroups(value: SecurityGroups): Self = this.set("SecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityGroups: Self = this.set("SecurityGroups", js.undefined)
    
    @scala.inline
    def setSourceSecurityGroup(value: SourceSecurityGroup): Self = this.set("SourceSecurityGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceSecurityGroup: Self = this.set("SourceSecurityGroup", js.undefined)
    
    @scala.inline
    def setSubnetsVarargs(value: SubnetId*): Self = this.set("Subnets", js.Array(value :_*))
    
    @scala.inline
    def setSubnets(value: Subnets): Self = this.set("Subnets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnets: Self = this.set("Subnets", js.undefined)
    
    @scala.inline
    def setVPCId(value: VPCId): Self = this.set("VPCId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVPCId: Self = this.set("VPCId", js.undefined)
  }
}
