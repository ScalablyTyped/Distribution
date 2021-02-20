package typings.awsSdk.elbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadBalancerDescription extends StObject {
  
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
  implicit class LoadBalancerDescriptionMutableBuilder[Self <: LoadBalancerDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityZones(value: AvailabilityZones): Self = StObject.set(x, "AvailabilityZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZonesUndefined: Self = StObject.set(x, "AvailabilityZones", js.undefined)
    
    @scala.inline
    def setAvailabilityZonesVarargs(value: AvailabilityZone*): Self = StObject.set(x, "AvailabilityZones", js.Array(value :_*))
    
    @scala.inline
    def setBackendServerDescriptions(value: BackendServerDescriptions): Self = StObject.set(x, "BackendServerDescriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackendServerDescriptionsUndefined: Self = StObject.set(x, "BackendServerDescriptions", js.undefined)
    
    @scala.inline
    def setBackendServerDescriptionsVarargs(value: BackendServerDescription*): Self = StObject.set(x, "BackendServerDescriptions", js.Array(value :_*))
    
    @scala.inline
    def setCanonicalHostedZoneName(value: DNSName): Self = StObject.set(x, "CanonicalHostedZoneName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanonicalHostedZoneNameID(value: DNSName): Self = StObject.set(x, "CanonicalHostedZoneNameID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanonicalHostedZoneNameIDUndefined: Self = StObject.set(x, "CanonicalHostedZoneNameID", js.undefined)
    
    @scala.inline
    def setCanonicalHostedZoneNameUndefined: Self = StObject.set(x, "CanonicalHostedZoneName", js.undefined)
    
    @scala.inline
    def setCreatedTime(value: CreatedTime): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    @scala.inline
    def setDNSName(value: DNSName): Self = StObject.set(x, "DNSName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDNSNameUndefined: Self = StObject.set(x, "DNSName", js.undefined)
    
    @scala.inline
    def setHealthCheck(value: HealthCheck): Self = StObject.set(x, "HealthCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthCheckUndefined: Self = StObject.set(x, "HealthCheck", js.undefined)
    
    @scala.inline
    def setInstances(value: Instances): Self = StObject.set(x, "Instances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancesUndefined: Self = StObject.set(x, "Instances", js.undefined)
    
    @scala.inline
    def setInstancesVarargs(value: Instance*): Self = StObject.set(x, "Instances", js.Array(value :_*))
    
    @scala.inline
    def setListenerDescriptions(value: ListenerDescriptions): Self = StObject.set(x, "ListenerDescriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListenerDescriptionsUndefined: Self = StObject.set(x, "ListenerDescriptions", js.undefined)
    
    @scala.inline
    def setListenerDescriptionsVarargs(value: ListenerDescription*): Self = StObject.set(x, "ListenerDescriptions", js.Array(value :_*))
    
    @scala.inline
    def setLoadBalancerName(value: AccessPointName): Self = StObject.set(x, "LoadBalancerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadBalancerNameUndefined: Self = StObject.set(x, "LoadBalancerName", js.undefined)
    
    @scala.inline
    def setPolicies(value: Policies): Self = StObject.set(x, "Policies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoliciesUndefined: Self = StObject.set(x, "Policies", js.undefined)
    
    @scala.inline
    def setScheme(value: LoadBalancerScheme): Self = StObject.set(x, "Scheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemeUndefined: Self = StObject.set(x, "Scheme", js.undefined)
    
    @scala.inline
    def setSecurityGroups(value: SecurityGroups): Self = StObject.set(x, "SecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupsUndefined: Self = StObject.set(x, "SecurityGroups", js.undefined)
    
    @scala.inline
    def setSecurityGroupsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "SecurityGroups", js.Array(value :_*))
    
    @scala.inline
    def setSourceSecurityGroup(value: SourceSecurityGroup): Self = StObject.set(x, "SourceSecurityGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceSecurityGroupUndefined: Self = StObject.set(x, "SourceSecurityGroup", js.undefined)
    
    @scala.inline
    def setSubnets(value: Subnets): Self = StObject.set(x, "Subnets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetsUndefined: Self = StObject.set(x, "Subnets", js.undefined)
    
    @scala.inline
    def setSubnetsVarargs(value: SubnetId*): Self = StObject.set(x, "Subnets", js.Array(value :_*))
    
    @scala.inline
    def setVPCId(value: VPCId): Self = StObject.set(x, "VPCId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVPCIdUndefined: Self = StObject.set(x, "VPCId", js.undefined)
  }
}
