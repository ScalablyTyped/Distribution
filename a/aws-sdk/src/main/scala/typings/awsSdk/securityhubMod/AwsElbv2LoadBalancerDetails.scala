package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsElbv2LoadBalancerDetails extends StObject {
  
  /**
    * The Availability Zones for the load balancer.
    */
  var AvailabilityZones: js.UndefOr[typings.awsSdk.securityhubMod.AvailabilityZones] = js.native
  
  /**
    * The ID of the Amazon Route 53 hosted zone associated with the load balancer.
    */
  var CanonicalHostedZoneId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Indicates when the load balancer was created. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var CreatedTime: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The public DNS name of the load balancer.
    */
  var DNSName: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The type of IP addresses used by the subnets for your load balancer. The possible values are ipv4 (for IPv4 addresses) and dualstack (for IPv4 and IPv6 addresses).
    */
  var IpAddressType: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The nodes of an Internet-facing load balancer have public IP addresses.
    */
  var Scheme: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The IDs of the security groups for the load balancer.
    */
  var SecurityGroups: js.UndefOr[typings.awsSdk.securityhubMod.SecurityGroups] = js.native
  
  /**
    * The state of the load balancer.
    */
  var State: js.UndefOr[LoadBalancerState] = js.native
  
  /**
    * The type of load balancer.
    */
  var Type: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The ID of the VPC for the load balancer.
    */
  var VpcId: js.UndefOr[NonEmptyString] = js.native
}
object AwsElbv2LoadBalancerDetails {
  
  @scala.inline
  def apply(): AwsElbv2LoadBalancerDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsElbv2LoadBalancerDetails]
  }
  
  @scala.inline
  implicit class AwsElbv2LoadBalancerDetailsMutableBuilder[Self <: AwsElbv2LoadBalancerDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityZones(value: AvailabilityZones): Self = StObject.set(x, "AvailabilityZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZonesUndefined: Self = StObject.set(x, "AvailabilityZones", js.undefined)
    
    @scala.inline
    def setAvailabilityZonesVarargs(value: AvailabilityZone*): Self = StObject.set(x, "AvailabilityZones", js.Array(value :_*))
    
    @scala.inline
    def setCanonicalHostedZoneId(value: NonEmptyString): Self = StObject.set(x, "CanonicalHostedZoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanonicalHostedZoneIdUndefined: Self = StObject.set(x, "CanonicalHostedZoneId", js.undefined)
    
    @scala.inline
    def setCreatedTime(value: NonEmptyString): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    @scala.inline
    def setDNSName(value: NonEmptyString): Self = StObject.set(x, "DNSName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDNSNameUndefined: Self = StObject.set(x, "DNSName", js.undefined)
    
    @scala.inline
    def setIpAddressType(value: NonEmptyString): Self = StObject.set(x, "IpAddressType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpAddressTypeUndefined: Self = StObject.set(x, "IpAddressType", js.undefined)
    
    @scala.inline
    def setScheme(value: NonEmptyString): Self = StObject.set(x, "Scheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemeUndefined: Self = StObject.set(x, "Scheme", js.undefined)
    
    @scala.inline
    def setSecurityGroups(value: SecurityGroups): Self = StObject.set(x, "SecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupsUndefined: Self = StObject.set(x, "SecurityGroups", js.undefined)
    
    @scala.inline
    def setSecurityGroupsVarargs(value: NonEmptyString*): Self = StObject.set(x, "SecurityGroups", js.Array(value :_*))
    
    @scala.inline
    def setState(value: LoadBalancerState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setType(value: NonEmptyString): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    @scala.inline
    def setVpcId(value: NonEmptyString): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
