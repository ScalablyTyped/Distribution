package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllocateAddressResult extends StObject {
  
  /**
    * [EC2-VPC] The ID that AWS assigns to represent the allocation of the Elastic IP address for use with instances in a VPC.
    */
  var AllocationId: js.UndefOr[String] = js.undefined
  
  /**
    * The carrier IP address. This option is only available for network interfaces which reside in a subnet in a Wavelength Zone (for example an EC2 instance). 
    */
  var CarrierIp: js.UndefOr[String] = js.undefined
  
  /**
    * The customer-owned IP address.
    */
  var CustomerOwnedIp: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the customer-owned address pool.
    */
  var CustomerOwnedIpv4Pool: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether the Elastic IP address is for use with instances in a VPC (vpc) or instances in EC2-Classic (standard).
    */
  var Domain: js.UndefOr[DomainType] = js.undefined
  
  /**
    * The set of Availability Zones, Local Zones, or Wavelength Zones from which AWS advertises IP addresses.
    */
  var NetworkBorderGroup: js.UndefOr[String] = js.undefined
  
  /**
    * The Elastic IP address.
    */
  var PublicIp: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of an address pool.
    */
  var PublicIpv4Pool: js.UndefOr[String] = js.undefined
}
object AllocateAddressResult {
  
  inline def apply(): AllocateAddressResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllocateAddressResult]
  }
  
  extension [Self <: AllocateAddressResult](x: Self) {
    
    inline def setAllocationId(value: String): Self = StObject.set(x, "AllocationId", value.asInstanceOf[js.Any])
    
    inline def setAllocationIdUndefined: Self = StObject.set(x, "AllocationId", js.undefined)
    
    inline def setCarrierIp(value: String): Self = StObject.set(x, "CarrierIp", value.asInstanceOf[js.Any])
    
    inline def setCarrierIpUndefined: Self = StObject.set(x, "CarrierIp", js.undefined)
    
    inline def setCustomerOwnedIp(value: String): Self = StObject.set(x, "CustomerOwnedIp", value.asInstanceOf[js.Any])
    
    inline def setCustomerOwnedIpUndefined: Self = StObject.set(x, "CustomerOwnedIp", js.undefined)
    
    inline def setCustomerOwnedIpv4Pool(value: String): Self = StObject.set(x, "CustomerOwnedIpv4Pool", value.asInstanceOf[js.Any])
    
    inline def setCustomerOwnedIpv4PoolUndefined: Self = StObject.set(x, "CustomerOwnedIpv4Pool", js.undefined)
    
    inline def setDomain(value: DomainType): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "Domain", js.undefined)
    
    inline def setNetworkBorderGroup(value: String): Self = StObject.set(x, "NetworkBorderGroup", value.asInstanceOf[js.Any])
    
    inline def setNetworkBorderGroupUndefined: Self = StObject.set(x, "NetworkBorderGroup", js.undefined)
    
    inline def setPublicIp(value: String): Self = StObject.set(x, "PublicIp", value.asInstanceOf[js.Any])
    
    inline def setPublicIpUndefined: Self = StObject.set(x, "PublicIp", js.undefined)
    
    inline def setPublicIpv4Pool(value: String): Self = StObject.set(x, "PublicIpv4Pool", value.asInstanceOf[js.Any])
    
    inline def setPublicIpv4PoolUndefined: Self = StObject.set(x, "PublicIpv4Pool", js.undefined)
  }
}
