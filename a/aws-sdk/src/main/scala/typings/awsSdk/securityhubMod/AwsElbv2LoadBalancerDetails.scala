package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsElbv2LoadBalancerDetails extends js.Object {
  
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
  implicit class AwsElbv2LoadBalancerDetailsOps[Self <: AwsElbv2LoadBalancerDetails] (val x: Self) extends AnyVal {
    
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
    def setCanonicalHostedZoneId(value: NonEmptyString): Self = this.set("CanonicalHostedZoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanonicalHostedZoneId: Self = this.set("CanonicalHostedZoneId", js.undefined)
    
    @scala.inline
    def setCreatedTime(value: NonEmptyString): Self = this.set("CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedTime: Self = this.set("CreatedTime", js.undefined)
    
    @scala.inline
    def setDNSName(value: NonEmptyString): Self = this.set("DNSName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDNSName: Self = this.set("DNSName", js.undefined)
    
    @scala.inline
    def setIpAddressType(value: NonEmptyString): Self = this.set("IpAddressType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpAddressType: Self = this.set("IpAddressType", js.undefined)
    
    @scala.inline
    def setScheme(value: NonEmptyString): Self = this.set("Scheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheme: Self = this.set("Scheme", js.undefined)
    
    @scala.inline
    def setSecurityGroupsVarargs(value: NonEmptyString*): Self = this.set("SecurityGroups", js.Array(value :_*))
    
    @scala.inline
    def setSecurityGroups(value: SecurityGroups): Self = this.set("SecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityGroups: Self = this.set("SecurityGroups", js.undefined)
    
    @scala.inline
    def setState(value: LoadBalancerState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    
    @scala.inline
    def setType(value: NonEmptyString): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
    
    @scala.inline
    def setVpcId(value: NonEmptyString): Self = this.set("VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcId: Self = this.set("VpcId", js.undefined)
  }
}
