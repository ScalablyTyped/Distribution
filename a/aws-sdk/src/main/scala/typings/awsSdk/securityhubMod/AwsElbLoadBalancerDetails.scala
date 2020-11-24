package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsElbLoadBalancerDetails extends js.Object {
  
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
  implicit class AwsElbLoadBalancerDetailsOps[Self <: AwsElbLoadBalancerDetails] (val x: Self) extends AnyVal {
    
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
    def setAvailabilityZonesVarargs(value: NonEmptyString*): Self = this.set("AvailabilityZones", js.Array(value :_*))
    
    @scala.inline
    def setAvailabilityZones(value: StringList): Self = this.set("AvailabilityZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityZones: Self = this.set("AvailabilityZones", js.undefined)
    
    @scala.inline
    def setBackendServerDescriptionsVarargs(value: AwsElbLoadBalancerBackendServerDescription*): Self = this.set("BackendServerDescriptions", js.Array(value :_*))
    
    @scala.inline
    def setBackendServerDescriptions(value: AwsElbLoadBalancerBackendServerDescriptions): Self = this.set("BackendServerDescriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackendServerDescriptions: Self = this.set("BackendServerDescriptions", js.undefined)
    
    @scala.inline
    def setCanonicalHostedZoneName(value: NonEmptyString): Self = this.set("CanonicalHostedZoneName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanonicalHostedZoneName: Self = this.set("CanonicalHostedZoneName", js.undefined)
    
    @scala.inline
    def setCanonicalHostedZoneNameID(value: NonEmptyString): Self = this.set("CanonicalHostedZoneNameID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanonicalHostedZoneNameID: Self = this.set("CanonicalHostedZoneNameID", js.undefined)
    
    @scala.inline
    def setCreatedTime(value: NonEmptyString): Self = this.set("CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedTime: Self = this.set("CreatedTime", js.undefined)
    
    @scala.inline
    def setDnsName(value: NonEmptyString): Self = this.set("DnsName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDnsName: Self = this.set("DnsName", js.undefined)
    
    @scala.inline
    def setHealthCheck(value: AwsElbLoadBalancerHealthCheck): Self = this.set("HealthCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthCheck: Self = this.set("HealthCheck", js.undefined)
    
    @scala.inline
    def setInstancesVarargs(value: AwsElbLoadBalancerInstance*): Self = this.set("Instances", js.Array(value :_*))
    
    @scala.inline
    def setInstances(value: AwsElbLoadBalancerInstances): Self = this.set("Instances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstances: Self = this.set("Instances", js.undefined)
    
    @scala.inline
    def setListenerDescriptionsVarargs(value: AwsElbLoadBalancerListenerDescription*): Self = this.set("ListenerDescriptions", js.Array(value :_*))
    
    @scala.inline
    def setListenerDescriptions(value: AwsElbLoadBalancerListenerDescriptions): Self = this.set("ListenerDescriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListenerDescriptions: Self = this.set("ListenerDescriptions", js.undefined)
    
    @scala.inline
    def setLoadBalancerAttributes(value: AwsElbLoadBalancerAttributes): Self = this.set("LoadBalancerAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadBalancerAttributes: Self = this.set("LoadBalancerAttributes", js.undefined)
    
    @scala.inline
    def setLoadBalancerName(value: NonEmptyString): Self = this.set("LoadBalancerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadBalancerName: Self = this.set("LoadBalancerName", js.undefined)
    
    @scala.inline
    def setPolicies(value: AwsElbLoadBalancerPolicies): Self = this.set("Policies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicies: Self = this.set("Policies", js.undefined)
    
    @scala.inline
    def setScheme(value: NonEmptyString): Self = this.set("Scheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheme: Self = this.set("Scheme", js.undefined)
    
    @scala.inline
    def setSecurityGroupsVarargs(value: NonEmptyString*): Self = this.set("SecurityGroups", js.Array(value :_*))
    
    @scala.inline
    def setSecurityGroups(value: StringList): Self = this.set("SecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityGroups: Self = this.set("SecurityGroups", js.undefined)
    
    @scala.inline
    def setSourceSecurityGroup(value: AwsElbLoadBalancerSourceSecurityGroup): Self = this.set("SourceSecurityGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceSecurityGroup: Self = this.set("SourceSecurityGroup", js.undefined)
    
    @scala.inline
    def setSubnetsVarargs(value: NonEmptyString*): Self = this.set("Subnets", js.Array(value :_*))
    
    @scala.inline
    def setSubnets(value: StringList): Self = this.set("Subnets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnets: Self = this.set("Subnets", js.undefined)
    
    @scala.inline
    def setVpcId(value: NonEmptyString): Self = this.set("VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcId: Self = this.set("VpcId", js.undefined)
  }
}
