package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Vpc extends StObject {
  
  /**
    * The primary IPv4 CIDR block for the VPC.
    */
  var CidrBlock: js.UndefOr[String] = js.native
  
  /**
    * Information about the IPv4 CIDR blocks associated with the VPC.
    */
  var CidrBlockAssociationSet: js.UndefOr[VpcCidrBlockAssociationSet] = js.native
  
  /**
    * The ID of the set of DHCP options you've associated with the VPC.
    */
  var DhcpOptionsId: js.UndefOr[String] = js.native
  
  /**
    * The allowed tenancy of instances launched into the VPC.
    */
  var InstanceTenancy: js.UndefOr[Tenancy] = js.native
  
  /**
    * Information about the IPv6 CIDR blocks associated with the VPC.
    */
  var Ipv6CidrBlockAssociationSet: js.UndefOr[VpcIpv6CidrBlockAssociationSet] = js.native
  
  /**
    * Indicates whether the VPC is the default VPC.
    */
  var IsDefault: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of the AWS account that owns the VPC.
    */
  var OwnerId: js.UndefOr[String] = js.native
  
  /**
    * The current state of the VPC.
    */
  var State: js.UndefOr[VpcState] = js.native
  
  /**
    * Any tags assigned to the VPC.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[String] = js.native
}
object Vpc {
  
  @scala.inline
  def apply(): Vpc = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Vpc]
  }
  
  @scala.inline
  implicit class VpcMutableBuilder[Self <: Vpc] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCidrBlock(value: String): Self = StObject.set(x, "CidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCidrBlockAssociationSet(value: VpcCidrBlockAssociationSet): Self = StObject.set(x, "CidrBlockAssociationSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCidrBlockAssociationSetUndefined: Self = StObject.set(x, "CidrBlockAssociationSet", js.undefined)
    
    @scala.inline
    def setCidrBlockAssociationSetVarargs(value: VpcCidrBlockAssociation*): Self = StObject.set(x, "CidrBlockAssociationSet", js.Array(value :_*))
    
    @scala.inline
    def setCidrBlockUndefined: Self = StObject.set(x, "CidrBlock", js.undefined)
    
    @scala.inline
    def setDhcpOptionsId(value: String): Self = StObject.set(x, "DhcpOptionsId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDhcpOptionsIdUndefined: Self = StObject.set(x, "DhcpOptionsId", js.undefined)
    
    @scala.inline
    def setInstanceTenancy(value: Tenancy): Self = StObject.set(x, "InstanceTenancy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTenancyUndefined: Self = StObject.set(x, "InstanceTenancy", js.undefined)
    
    @scala.inline
    def setIpv6CidrBlockAssociationSet(value: VpcIpv6CidrBlockAssociationSet): Self = StObject.set(x, "Ipv6CidrBlockAssociationSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv6CidrBlockAssociationSetUndefined: Self = StObject.set(x, "Ipv6CidrBlockAssociationSet", js.undefined)
    
    @scala.inline
    def setIpv6CidrBlockAssociationSetVarargs(value: VpcIpv6CidrBlockAssociation*): Self = StObject.set(x, "Ipv6CidrBlockAssociationSet", js.Array(value :_*))
    
    @scala.inline
    def setIsDefault(value: Boolean): Self = StObject.set(x, "IsDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDefaultUndefined: Self = StObject.set(x, "IsDefault", js.undefined)
    
    @scala.inline
    def setOwnerId(value: String): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    @scala.inline
    def setState(value: VpcState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
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
