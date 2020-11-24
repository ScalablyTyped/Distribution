package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllocateAddressResult extends js.Object {
  
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
  implicit class AllocateAddressResultOps[Self <: AllocateAddressResult] (val x: Self) extends AnyVal {
    
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
    def setAllocationId(value: String): Self = this.set("AllocationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllocationId: Self = this.set("AllocationId", js.undefined)
    
    @scala.inline
    def setCarrierIp(value: String): Self = this.set("CarrierIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCarrierIp: Self = this.set("CarrierIp", js.undefined)
    
    @scala.inline
    def setCustomerOwnedIp(value: String): Self = this.set("CustomerOwnedIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomerOwnedIp: Self = this.set("CustomerOwnedIp", js.undefined)
    
    @scala.inline
    def setCustomerOwnedIpv4Pool(value: String): Self = this.set("CustomerOwnedIpv4Pool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomerOwnedIpv4Pool: Self = this.set("CustomerOwnedIpv4Pool", js.undefined)
    
    @scala.inline
    def setDomain(value: DomainType): Self = this.set("Domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain: Self = this.set("Domain", js.undefined)
    
    @scala.inline
    def setNetworkBorderGroup(value: String): Self = this.set("NetworkBorderGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkBorderGroup: Self = this.set("NetworkBorderGroup", js.undefined)
    
    @scala.inline
    def setPublicIp(value: String): Self = this.set("PublicIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicIp: Self = this.set("PublicIp", js.undefined)
    
    @scala.inline
    def setPublicIpv4Pool(value: String): Self = this.set("PublicIpv4Pool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicIpv4Pool: Self = this.set("PublicIpv4Pool", js.undefined)
  }
}
