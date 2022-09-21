package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateVpcCidrBlockRequest extends StObject {
  
  /**
    * Requests an Amazon-provided IPv6 CIDR block with a /56 prefix length for the VPC. You cannot specify the range of IPv6 addresses, or the size of the CIDR block.
    */
  var AmazonProvidedIpv6CidrBlock: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An IPv4 CIDR block to associate with the VPC.
    */
  var CidrBlock: js.UndefOr[String] = js.undefined
  
  /**
    * Associate a CIDR allocated from an IPv4 IPAM pool to a VPC. For more information about Amazon VPC IP Address Manager (IPAM), see What is IPAM? in the Amazon VPC IPAM User Guide.
    */
  var Ipv4IpamPoolId: js.UndefOr[IpamPoolId] = js.undefined
  
  /**
    * The netmask length of the IPv4 CIDR you would like to associate from an Amazon VPC IP Address Manager (IPAM) pool. For more information about IPAM, see What is IPAM? in the Amazon VPC IPAM User Guide. 
    */
  var Ipv4NetmaskLength: js.UndefOr[NetmaskLength] = js.undefined
  
  /**
    * An IPv6 CIDR block from the IPv6 address pool. You must also specify Ipv6Pool in the request. To let Amazon choose the IPv6 CIDR block for you, omit this parameter.
    */
  var Ipv6CidrBlock: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the location from which we advertise the IPV6 CIDR block. Use this parameter to limit the CIDR block to this location.  You must set AmazonProvidedIpv6CidrBlock to true to use this parameter.  You can have one IPv6 CIDR block association per network border group.
    */
  var Ipv6CidrBlockNetworkBorderGroup: js.UndefOr[String] = js.undefined
  
  /**
    * Associates a CIDR allocated from an IPv6 IPAM pool to a VPC. For more information about Amazon VPC IP Address Manager (IPAM), see What is IPAM? in the Amazon VPC IPAM User Guide.
    */
  var Ipv6IpamPoolId: js.UndefOr[IpamPoolId] = js.undefined
  
  /**
    * The netmask length of the IPv6 CIDR you would like to associate from an Amazon VPC IP Address Manager (IPAM) pool. For more information about IPAM, see What is IPAM? in the Amazon VPC IPAM User Guide. 
    */
  var Ipv6NetmaskLength: js.UndefOr[NetmaskLength] = js.undefined
  
  /**
    * The ID of an IPv6 address pool from which to allocate the IPv6 CIDR block.
    */
  var Ipv6Pool: js.UndefOr[Ipv6PoolEc2Id] = js.undefined
  
  /**
    * The ID of the VPC.
    */
  var VpcId: typings.awsSdk.ec2Mod.VpcId
}
object AssociateVpcCidrBlockRequest {
  
  inline def apply(VpcId: VpcId): AssociateVpcCidrBlockRequest = {
    val __obj = js.Dynamic.literal(VpcId = VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateVpcCidrBlockRequest]
  }
  
  extension [Self <: AssociateVpcCidrBlockRequest](x: Self) {
    
    inline def setAmazonProvidedIpv6CidrBlock(value: Boolean): Self = StObject.set(x, "AmazonProvidedIpv6CidrBlock", value.asInstanceOf[js.Any])
    
    inline def setAmazonProvidedIpv6CidrBlockUndefined: Self = StObject.set(x, "AmazonProvidedIpv6CidrBlock", js.undefined)
    
    inline def setCidrBlock(value: String): Self = StObject.set(x, "CidrBlock", value.asInstanceOf[js.Any])
    
    inline def setCidrBlockUndefined: Self = StObject.set(x, "CidrBlock", js.undefined)
    
    inline def setIpv4IpamPoolId(value: IpamPoolId): Self = StObject.set(x, "Ipv4IpamPoolId", value.asInstanceOf[js.Any])
    
    inline def setIpv4IpamPoolIdUndefined: Self = StObject.set(x, "Ipv4IpamPoolId", js.undefined)
    
    inline def setIpv4NetmaskLength(value: NetmaskLength): Self = StObject.set(x, "Ipv4NetmaskLength", value.asInstanceOf[js.Any])
    
    inline def setIpv4NetmaskLengthUndefined: Self = StObject.set(x, "Ipv4NetmaskLength", js.undefined)
    
    inline def setIpv6CidrBlock(value: String): Self = StObject.set(x, "Ipv6CidrBlock", value.asInstanceOf[js.Any])
    
    inline def setIpv6CidrBlockNetworkBorderGroup(value: String): Self = StObject.set(x, "Ipv6CidrBlockNetworkBorderGroup", value.asInstanceOf[js.Any])
    
    inline def setIpv6CidrBlockNetworkBorderGroupUndefined: Self = StObject.set(x, "Ipv6CidrBlockNetworkBorderGroup", js.undefined)
    
    inline def setIpv6CidrBlockUndefined: Self = StObject.set(x, "Ipv6CidrBlock", js.undefined)
    
    inline def setIpv6IpamPoolId(value: IpamPoolId): Self = StObject.set(x, "Ipv6IpamPoolId", value.asInstanceOf[js.Any])
    
    inline def setIpv6IpamPoolIdUndefined: Self = StObject.set(x, "Ipv6IpamPoolId", js.undefined)
    
    inline def setIpv6NetmaskLength(value: NetmaskLength): Self = StObject.set(x, "Ipv6NetmaskLength", value.asInstanceOf[js.Any])
    
    inline def setIpv6NetmaskLengthUndefined: Self = StObject.set(x, "Ipv6NetmaskLength", js.undefined)
    
    inline def setIpv6Pool(value: Ipv6PoolEc2Id): Self = StObject.set(x, "Ipv6Pool", value.asInstanceOf[js.Any])
    
    inline def setIpv6PoolUndefined: Self = StObject.set(x, "Ipv6Pool", js.undefined)
    
    inline def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
  }
}
