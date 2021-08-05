package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVpcRequest extends StObject {
  
  /**
    * Requests an Amazon-provided IPv6 CIDR block with a /56 prefix length for the VPC. You cannot specify the range of IP addresses, or the size of the CIDR block.
    */
  var AmazonProvidedIpv6CidrBlock: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The IPv4 network range for the VPC, in CIDR notation. For example, 10.0.0.0/16. We modify the specified CIDR block to its canonical form; for example, if you specify 100.68.0.18/18, we modify it to 100.68.0.0/18.
    */
  var CidrBlock: String
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The tenancy options for instances launched into the VPC. For default, instances are launched with shared tenancy by default. You can launch instances with any tenancy into a shared tenancy VPC. For dedicated, instances are launched as dedicated tenancy instances by default. You can only launch instances with a tenancy of dedicated or host into a dedicated tenancy VPC.   Important: The host value cannot be used with this parameter. Use the default or dedicated values only. Default: default 
    */
  var InstanceTenancy: js.UndefOr[Tenancy] = js.undefined
  
  /**
    * The IPv6 CIDR block from the IPv6 address pool. You must also specify Ipv6Pool in the request. To let Amazon choose the IPv6 CIDR block for you, omit this parameter.
    */
  var Ipv6CidrBlock: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the location from which we advertise the IPV6 CIDR block. Use this parameter to limit the address to this location.  You must set AmazonProvidedIpv6CidrBlock to true to use this parameter.
    */
  var Ipv6CidrBlockNetworkBorderGroup: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of an IPv6 address pool from which to allocate the IPv6 CIDR block.
    */
  var Ipv6Pool: js.UndefOr[Ipv6PoolEc2Id] = js.undefined
  
  /**
    * The tags to assign to the VPC.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.undefined
}
object CreateVpcRequest {
  
  inline def apply(CidrBlock: String): CreateVpcRequest = {
    val __obj = js.Dynamic.literal(CidrBlock = CidrBlock.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVpcRequest]
  }
  
  extension [Self <: CreateVpcRequest](x: Self) {
    
    inline def setAmazonProvidedIpv6CidrBlock(value: Boolean): Self = StObject.set(x, "AmazonProvidedIpv6CidrBlock", value.asInstanceOf[js.Any])
    
    inline def setAmazonProvidedIpv6CidrBlockUndefined: Self = StObject.set(x, "AmazonProvidedIpv6CidrBlock", js.undefined)
    
    inline def setCidrBlock(value: String): Self = StObject.set(x, "CidrBlock", value.asInstanceOf[js.Any])
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setInstanceTenancy(value: Tenancy): Self = StObject.set(x, "InstanceTenancy", value.asInstanceOf[js.Any])
    
    inline def setInstanceTenancyUndefined: Self = StObject.set(x, "InstanceTenancy", js.undefined)
    
    inline def setIpv6CidrBlock(value: String): Self = StObject.set(x, "Ipv6CidrBlock", value.asInstanceOf[js.Any])
    
    inline def setIpv6CidrBlockNetworkBorderGroup(value: String): Self = StObject.set(x, "Ipv6CidrBlockNetworkBorderGroup", value.asInstanceOf[js.Any])
    
    inline def setIpv6CidrBlockNetworkBorderGroupUndefined: Self = StObject.set(x, "Ipv6CidrBlockNetworkBorderGroup", js.undefined)
    
    inline def setIpv6CidrBlockUndefined: Self = StObject.set(x, "Ipv6CidrBlock", js.undefined)
    
    inline def setIpv6Pool(value: Ipv6PoolEc2Id): Self = StObject.set(x, "Ipv6Pool", value.asInstanceOf[js.Any])
    
    inline def setIpv6PoolUndefined: Self = StObject.set(x, "Ipv6Pool", js.undefined)
    
    inline def setTagSpecifications(value: TagSpecificationList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    inline def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    inline def setTagSpecificationsVarargs(value: TagSpecification*): Self = StObject.set(x, "TagSpecifications", js.Array(value :_*))
  }
}
