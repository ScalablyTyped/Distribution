package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllocateAddressResult extends StObject {
  
  /**
    * [EC2-VPC] The ID that AWS assigns to represent the allocation of the Elastic IP address for use with instances in a VPC.
    */
  var AllocationId: js.UndefOr[String] = js.native
  
  /**
    * The carrier IP address. This option is only available for network interfaces which reside in a subnet in a Wavelength Zone (for example an EC2 instance). 
    */
  var CarrierIp: js.UndefOr[String] = js.native
  
  /**
    * The customer-owned IP address.
    */
  var CustomerOwnedIp: js.UndefOr[String] = js.native
  
  /**
    * The ID of the customer-owned address pool.
    */
  var CustomerOwnedIpv4Pool: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether the Elastic IP address is for use with instances in a VPC (vpc) or instances in EC2-Classic (standard).
    */
  var Domain: js.UndefOr[DomainType] = js.native
  
  /**
    * The set of Availability Zones, Local Zones, or Wavelength Zones from which AWS advertises IP addresses.
    */
  var NetworkBorderGroup: js.UndefOr[String] = js.native
  
  /**
    * The Elastic IP address.
    */
  var PublicIp: js.UndefOr[String] = js.native
  
  /**
    * The ID of an address pool.
    */
  var PublicIpv4Pool: js.UndefOr[String] = js.native
}
object AllocateAddressResult {
  
  @scala.inline
  def apply(): AllocateAddressResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllocateAddressResult]
  }
  
  @scala.inline
  implicit class AllocateAddressResultMutableBuilder[Self <: AllocateAddressResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllocationId(value: String): Self = StObject.set(x, "AllocationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllocationIdUndefined: Self = StObject.set(x, "AllocationId", js.undefined)
    
    @scala.inline
    def setCarrierIp(value: String): Self = StObject.set(x, "CarrierIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCarrierIpUndefined: Self = StObject.set(x, "CarrierIp", js.undefined)
    
    @scala.inline
    def setCustomerOwnedIp(value: String): Self = StObject.set(x, "CustomerOwnedIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerOwnedIpUndefined: Self = StObject.set(x, "CustomerOwnedIp", js.undefined)
    
    @scala.inline
    def setCustomerOwnedIpv4Pool(value: String): Self = StObject.set(x, "CustomerOwnedIpv4Pool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerOwnedIpv4PoolUndefined: Self = StObject.set(x, "CustomerOwnedIpv4Pool", js.undefined)
    
    @scala.inline
    def setDomain(value: DomainType): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "Domain", js.undefined)
    
    @scala.inline
    def setNetworkBorderGroup(value: String): Self = StObject.set(x, "NetworkBorderGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkBorderGroupUndefined: Self = StObject.set(x, "NetworkBorderGroup", js.undefined)
    
    @scala.inline
    def setPublicIp(value: String): Self = StObject.set(x, "PublicIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicIpUndefined: Self = StObject.set(x, "PublicIp", js.undefined)
    
    @scala.inline
    def setPublicIpv4Pool(value: String): Self = StObject.set(x, "PublicIpv4Pool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicIpv4PoolUndefined: Self = StObject.set(x, "PublicIpv4Pool", js.undefined)
  }
}
