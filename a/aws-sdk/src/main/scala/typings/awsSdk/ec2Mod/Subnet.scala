package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Subnet extends StObject {
  
  /**
    * Indicates whether a network interface created in this subnet (including a network interface created by RunInstances) receives an IPv6 address.
    */
  var AssignIpv6AddressOnCreation: js.UndefOr[Boolean] = js.native
  
  /**
    * The Availability Zone of the subnet.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  
  /**
    * The AZ ID of the subnet.
    */
  var AvailabilityZoneId: js.UndefOr[String] = js.native
  
  /**
    * The number of unused private IPv4 addresses in the subnet. The IPv4 addresses for any stopped instances are considered unavailable.
    */
  var AvailableIpAddressCount: js.UndefOr[Integer] = js.native
  
  /**
    * The IPv4 CIDR block assigned to the subnet.
    */
  var CidrBlock: js.UndefOr[String] = js.native
  
  /**
    * The customer-owned IPv4 address pool associated with the subnet.
    */
  var CustomerOwnedIpv4Pool: js.UndefOr[CoipPoolId] = js.native
  
  /**
    * Indicates whether this is the default subnet for the Availability Zone.
    */
  var DefaultForAz: js.UndefOr[Boolean] = js.native
  
  /**
    * Information about the IPv6 CIDR blocks associated with the subnet.
    */
  var Ipv6CidrBlockAssociationSet: js.UndefOr[SubnetIpv6CidrBlockAssociationSet] = js.native
  
  /**
    * Indicates whether a network interface created in this subnet (including a network interface created by RunInstances) receives a customer-owned IPv4 address.
    */
  var MapCustomerOwnedIpOnLaunch: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether instances launched in this subnet receive a public IPv4 address.
    */
  var MapPublicIpOnLaunch: js.UndefOr[Boolean] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the Outpost.
    */
  var OutpostArn: js.UndefOr[String] = js.native
  
  /**
    * The ID of the AWS account that owns the subnet.
    */
  var OwnerId: js.UndefOr[String] = js.native
  
  /**
    * The current state of the subnet.
    */
  var State: js.UndefOr[SubnetState] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the subnet.
    */
  var SubnetArn: js.UndefOr[String] = js.native
  
  /**
    * The ID of the subnet.
    */
  var SubnetId: js.UndefOr[String] = js.native
  
  /**
    * Any tags assigned to the subnet.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * The ID of the VPC the subnet is in.
    */
  var VpcId: js.UndefOr[String] = js.native
}
object Subnet {
  
  @scala.inline
  def apply(): Subnet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Subnet]
  }
  
  @scala.inline
  implicit class SubnetMutableBuilder[Self <: Subnet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssignIpv6AddressOnCreation(value: Boolean): Self = StObject.set(x, "AssignIpv6AddressOnCreation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignIpv6AddressOnCreationUndefined: Self = StObject.set(x, "AssignIpv6AddressOnCreation", js.undefined)
    
    @scala.inline
    def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZoneId(value: String): Self = StObject.set(x, "AvailabilityZoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZoneIdUndefined: Self = StObject.set(x, "AvailabilityZoneId", js.undefined)
    
    @scala.inline
    def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    @scala.inline
    def setAvailableIpAddressCount(value: Integer): Self = StObject.set(x, "AvailableIpAddressCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailableIpAddressCountUndefined: Self = StObject.set(x, "AvailableIpAddressCount", js.undefined)
    
    @scala.inline
    def setCidrBlock(value: String): Self = StObject.set(x, "CidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCidrBlockUndefined: Self = StObject.set(x, "CidrBlock", js.undefined)
    
    @scala.inline
    def setCustomerOwnedIpv4Pool(value: CoipPoolId): Self = StObject.set(x, "CustomerOwnedIpv4Pool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerOwnedIpv4PoolUndefined: Self = StObject.set(x, "CustomerOwnedIpv4Pool", js.undefined)
    
    @scala.inline
    def setDefaultForAz(value: Boolean): Self = StObject.set(x, "DefaultForAz", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultForAzUndefined: Self = StObject.set(x, "DefaultForAz", js.undefined)
    
    @scala.inline
    def setIpv6CidrBlockAssociationSet(value: SubnetIpv6CidrBlockAssociationSet): Self = StObject.set(x, "Ipv6CidrBlockAssociationSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv6CidrBlockAssociationSetUndefined: Self = StObject.set(x, "Ipv6CidrBlockAssociationSet", js.undefined)
    
    @scala.inline
    def setIpv6CidrBlockAssociationSetVarargs(value: SubnetIpv6CidrBlockAssociation*): Self = StObject.set(x, "Ipv6CidrBlockAssociationSet", js.Array(value :_*))
    
    @scala.inline
    def setMapCustomerOwnedIpOnLaunch(value: Boolean): Self = StObject.set(x, "MapCustomerOwnedIpOnLaunch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapCustomerOwnedIpOnLaunchUndefined: Self = StObject.set(x, "MapCustomerOwnedIpOnLaunch", js.undefined)
    
    @scala.inline
    def setMapPublicIpOnLaunch(value: Boolean): Self = StObject.set(x, "MapPublicIpOnLaunch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapPublicIpOnLaunchUndefined: Self = StObject.set(x, "MapPublicIpOnLaunch", js.undefined)
    
    @scala.inline
    def setOutpostArn(value: String): Self = StObject.set(x, "OutpostArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutpostArnUndefined: Self = StObject.set(x, "OutpostArn", js.undefined)
    
    @scala.inline
    def setOwnerId(value: String): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    @scala.inline
    def setState(value: SubnetState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setSubnetArn(value: String): Self = StObject.set(x, "SubnetArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetArnUndefined: Self = StObject.set(x, "SubnetArn", js.undefined)
    
    @scala.inline
    def setSubnetId(value: String): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdUndefined: Self = StObject.set(x, "SubnetId", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setVpcId(value: String): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
