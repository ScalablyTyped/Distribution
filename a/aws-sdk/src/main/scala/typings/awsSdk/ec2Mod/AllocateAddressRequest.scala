package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllocateAddressRequest extends StObject {
  
  /**
    * [EC2-VPC] The Elastic IP address to recover or an IPv4 address from an address pool.
    */
  var Address: js.UndefOr[PublicIpAddress] = js.undefined
  
  /**
    * The ID of a customer-owned address pool. Use this parameter to let Amazon EC2 select an address from the address pool. Alternatively, specify a specific address from the address pool.
    */
  var CustomerOwnedIpv4Pool: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether the Elastic IP address is for use with instances in a VPC or instances in EC2-Classic. Default: If the Region supports EC2-Classic, the default is standard. Otherwise, the default is vpc.
    */
  var Domain: js.UndefOr[DomainType] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  A unique set of Availability Zones, Local Zones, or Wavelength Zones from which AWS advertises IP addresses. Use this parameter to limit the IP address to this location. IP addresses cannot move between network border groups. Use DescribeAvailabilityZones to view the network border groups.  You cannot use a network border group with EC2 Classic. If you attempt this operation on EC2 classic, you will receive an InvalidParameterCombination error. For more information, see Error Codes. 
    */
  var NetworkBorderGroup: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of an address pool that you own. Use this parameter to let Amazon EC2 select an address from the address pool. To specify a specific address from the address pool, use the Address parameter instead.
    */
  var PublicIpv4Pool: js.UndefOr[Ipv4PoolEc2Id] = js.undefined
}
object AllocateAddressRequest {
  
  inline def apply(): AllocateAddressRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllocateAddressRequest]
  }
  
  extension [Self <: AllocateAddressRequest](x: Self) {
    
    inline def setAddress(value: PublicIpAddress): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "Address", js.undefined)
    
    inline def setCustomerOwnedIpv4Pool(value: String): Self = StObject.set(x, "CustomerOwnedIpv4Pool", value.asInstanceOf[js.Any])
    
    inline def setCustomerOwnedIpv4PoolUndefined: Self = StObject.set(x, "CustomerOwnedIpv4Pool", js.undefined)
    
    inline def setDomain(value: DomainType): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "Domain", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setNetworkBorderGroup(value: String): Self = StObject.set(x, "NetworkBorderGroup", value.asInstanceOf[js.Any])
    
    inline def setNetworkBorderGroupUndefined: Self = StObject.set(x, "NetworkBorderGroup", js.undefined)
    
    inline def setPublicIpv4Pool(value: Ipv4PoolEc2Id): Self = StObject.set(x, "PublicIpv4Pool", value.asInstanceOf[js.Any])
    
    inline def setPublicIpv4PoolUndefined: Self = StObject.set(x, "PublicIpv4Pool", js.undefined)
  }
}
