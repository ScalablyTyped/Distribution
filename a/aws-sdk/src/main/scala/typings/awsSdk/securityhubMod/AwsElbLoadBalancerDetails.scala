package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsElbLoadBalancerDetails extends StObject {
  
  /**
    * The list of Availability Zones for the load balancer.
    */
  var AvailabilityZones: js.UndefOr[StringList] = js.native
  
  /**
    * Information about the configuration of the EC2 instances.
    */
  var BackendServerDescriptions: js.UndefOr[AwsElbLoadBalancerBackendServerDescriptions] = js.native
  
  /**
    * The name of the Amazon Route 53 hosted zone for the load balancer.
    */
  var CanonicalHostedZoneName: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The ID of the Amazon Route 53 hosted zone for the load balancer.
    */
  var CanonicalHostedZoneNameID: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Indicates when the load balancer was created. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var CreatedTime: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The DNS name of the load balancer.
    */
  var DnsName: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Information about the health checks that are conducted on the load balancer.
    */
  var HealthCheck: js.UndefOr[AwsElbLoadBalancerHealthCheck] = js.native
  
  /**
    * List of EC2 instances for the load balancer.
    */
  var Instances: js.UndefOr[AwsElbLoadBalancerInstances] = js.native
  
  /**
    * The policies that are enabled for the load balancer listeners.
    */
  var ListenerDescriptions: js.UndefOr[AwsElbLoadBalancerListenerDescriptions] = js.native
  
  /**
    * The attributes for a load balancer.
    */
  var LoadBalancerAttributes: js.UndefOr[AwsElbLoadBalancerAttributes] = js.native
  
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The policies for a load balancer.
    */
  var Policies: js.UndefOr[AwsElbLoadBalancerPolicies] = js.native
  
  /**
    * The type of load balancer. Only provided if the load balancer is in a VPC. If Scheme is internet-facing, the load balancer has a public DNS name that resolves to a public IP address. If Scheme is internal, the load balancer has a public DNS name that resolves to a private IP address.
    */
  var Scheme: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The security groups for the load balancer. Only provided if the load balancer is in a VPC.
    */
  var SecurityGroups: js.UndefOr[StringList] = js.native
  
  /**
    * Information about the security group for the load balancer. This is the security group that is used for inbound rules.
    */
  var SourceSecurityGroup: js.UndefOr[AwsElbLoadBalancerSourceSecurityGroup] = js.native
  
  /**
    * The list of subnet identifiers for the load balancer.
    */
  var Subnets: js.UndefOr[StringList] = js.native
  
  /**
    * The identifier of the VPC for the load balancer.
    */
  var VpcId: js.UndefOr[NonEmptyString] = js.native
}
object AwsElbLoadBalancerDetails {
  
  @scala.inline
  def apply(): AwsElbLoadBalancerDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsElbLoadBalancerDetails]
  }
  
  @scala.inline
  implicit class AwsElbLoadBalancerDetailsMutableBuilder[Self <: AwsElbLoadBalancerDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityZones(value: StringList): Self = StObject.set(x, "AvailabilityZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZonesUndefined: Self = StObject.set(x, "AvailabilityZones", js.undefined)
    
    @scala.inline
    def setAvailabilityZonesVarargs(value: NonEmptyString*): Self = StObject.set(x, "AvailabilityZones", js.Array(value :_*))
    
    @scala.inline
    def setBackendServerDescriptions(value: AwsElbLoadBalancerBackendServerDescriptions): Self = StObject.set(x, "BackendServerDescriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackendServerDescriptionsUndefined: Self = StObject.set(x, "BackendServerDescriptions", js.undefined)
    
    @scala.inline
    def setBackendServerDescriptionsVarargs(value: AwsElbLoadBalancerBackendServerDescription*): Self = StObject.set(x, "BackendServerDescriptions", js.Array(value :_*))
    
    @scala.inline
    def setCanonicalHostedZoneName(value: NonEmptyString): Self = StObject.set(x, "CanonicalHostedZoneName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanonicalHostedZoneNameID(value: NonEmptyString): Self = StObject.set(x, "CanonicalHostedZoneNameID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanonicalHostedZoneNameIDUndefined: Self = StObject.set(x, "CanonicalHostedZoneNameID", js.undefined)
    
    @scala.inline
    def setCanonicalHostedZoneNameUndefined: Self = StObject.set(x, "CanonicalHostedZoneName", js.undefined)
    
    @scala.inline
    def setCreatedTime(value: NonEmptyString): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    @scala.inline
    def setDnsName(value: NonEmptyString): Self = StObject.set(x, "DnsName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsNameUndefined: Self = StObject.set(x, "DnsName", js.undefined)
    
    @scala.inline
    def setHealthCheck(value: AwsElbLoadBalancerHealthCheck): Self = StObject.set(x, "HealthCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthCheckUndefined: Self = StObject.set(x, "HealthCheck", js.undefined)
    
    @scala.inline
    def setInstances(value: AwsElbLoadBalancerInstances): Self = StObject.set(x, "Instances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancesUndefined: Self = StObject.set(x, "Instances", js.undefined)
    
    @scala.inline
    def setInstancesVarargs(value: AwsElbLoadBalancerInstance*): Self = StObject.set(x, "Instances", js.Array(value :_*))
    
    @scala.inline
    def setListenerDescriptions(value: AwsElbLoadBalancerListenerDescriptions): Self = StObject.set(x, "ListenerDescriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListenerDescriptionsUndefined: Self = StObject.set(x, "ListenerDescriptions", js.undefined)
    
    @scala.inline
    def setListenerDescriptionsVarargs(value: AwsElbLoadBalancerListenerDescription*): Self = StObject.set(x, "ListenerDescriptions", js.Array(value :_*))
    
    @scala.inline
    def setLoadBalancerAttributes(value: AwsElbLoadBalancerAttributes): Self = StObject.set(x, "LoadBalancerAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadBalancerAttributesUndefined: Self = StObject.set(x, "LoadBalancerAttributes", js.undefined)
    
    @scala.inline
    def setLoadBalancerName(value: NonEmptyString): Self = StObject.set(x, "LoadBalancerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadBalancerNameUndefined: Self = StObject.set(x, "LoadBalancerName", js.undefined)
    
    @scala.inline
    def setPolicies(value: AwsElbLoadBalancerPolicies): Self = StObject.set(x, "Policies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoliciesUndefined: Self = StObject.set(x, "Policies", js.undefined)
    
    @scala.inline
    def setScheme(value: NonEmptyString): Self = StObject.set(x, "Scheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemeUndefined: Self = StObject.set(x, "Scheme", js.undefined)
    
    @scala.inline
    def setSecurityGroups(value: StringList): Self = StObject.set(x, "SecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupsUndefined: Self = StObject.set(x, "SecurityGroups", js.undefined)
    
    @scala.inline
    def setSecurityGroupsVarargs(value: NonEmptyString*): Self = StObject.set(x, "SecurityGroups", js.Array(value :_*))
    
    @scala.inline
    def setSourceSecurityGroup(value: AwsElbLoadBalancerSourceSecurityGroup): Self = StObject.set(x, "SourceSecurityGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceSecurityGroupUndefined: Self = StObject.set(x, "SourceSecurityGroup", js.undefined)
    
    @scala.inline
    def setSubnets(value: StringList): Self = StObject.set(x, "Subnets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetsUndefined: Self = StObject.set(x, "Subnets", js.undefined)
    
    @scala.inline
    def setSubnetsVarargs(value: NonEmptyString*): Self = StObject.set(x, "Subnets", js.Array(value :_*))
    
    @scala.inline
    def setVpcId(value: NonEmptyString): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
