package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Subnet extends js.Object {
  
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
  implicit class SubnetOps[Self <: Subnet] (val x: Self) extends AnyVal {
    
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
    def setAssignIpv6AddressOnCreation(value: Boolean): Self = this.set("AssignIpv6AddressOnCreation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssignIpv6AddressOnCreation: Self = this.set("AssignIpv6AddressOnCreation", js.undefined)
    
    @scala.inline
    def setAvailabilityZone(value: String): Self = this.set("AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("AvailabilityZone", js.undefined)
    
    @scala.inline
    def setAvailabilityZoneId(value: String): Self = this.set("AvailabilityZoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityZoneId: Self = this.set("AvailabilityZoneId", js.undefined)
    
    @scala.inline
    def setAvailableIpAddressCount(value: Integer): Self = this.set("AvailableIpAddressCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailableIpAddressCount: Self = this.set("AvailableIpAddressCount", js.undefined)
    
    @scala.inline
    def setCidrBlock(value: String): Self = this.set("CidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCidrBlock: Self = this.set("CidrBlock", js.undefined)
    
    @scala.inline
    def setCustomerOwnedIpv4Pool(value: CoipPoolId): Self = this.set("CustomerOwnedIpv4Pool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomerOwnedIpv4Pool: Self = this.set("CustomerOwnedIpv4Pool", js.undefined)
    
    @scala.inline
    def setDefaultForAz(value: Boolean): Self = this.set("DefaultForAz", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultForAz: Self = this.set("DefaultForAz", js.undefined)
    
    @scala.inline
    def setIpv6CidrBlockAssociationSetVarargs(value: SubnetIpv6CidrBlockAssociation*): Self = this.set("Ipv6CidrBlockAssociationSet", js.Array(value :_*))
    
    @scala.inline
    def setIpv6CidrBlockAssociationSet(value: SubnetIpv6CidrBlockAssociationSet): Self = this.set("Ipv6CidrBlockAssociationSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpv6CidrBlockAssociationSet: Self = this.set("Ipv6CidrBlockAssociationSet", js.undefined)
    
    @scala.inline
    def setMapCustomerOwnedIpOnLaunch(value: Boolean): Self = this.set("MapCustomerOwnedIpOnLaunch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMapCustomerOwnedIpOnLaunch: Self = this.set("MapCustomerOwnedIpOnLaunch", js.undefined)
    
    @scala.inline
    def setMapPublicIpOnLaunch(value: Boolean): Self = this.set("MapPublicIpOnLaunch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMapPublicIpOnLaunch: Self = this.set("MapPublicIpOnLaunch", js.undefined)
    
    @scala.inline
    def setOutpostArn(value: String): Self = this.set("OutpostArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutpostArn: Self = this.set("OutpostArn", js.undefined)
    
    @scala.inline
    def setOwnerId(value: String): Self = this.set("OwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerId: Self = this.set("OwnerId", js.undefined)
    
    @scala.inline
    def setState(value: SubnetState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    
    @scala.inline
    def setSubnetArn(value: String): Self = this.set("SubnetArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetArn: Self = this.set("SubnetArn", js.undefined)
    
    @scala.inline
    def setSubnetId(value: String): Self = this.set("SubnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetId: Self = this.set("SubnetId", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    
    @scala.inline
    def setVpcId(value: String): Self = this.set("VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcId: Self = this.set("VpcId", js.undefined)
  }
}
