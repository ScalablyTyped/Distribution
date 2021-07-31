package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkInterfaceAssociation extends StObject {
  
  /**
    * The allocation ID.
    */
  var AllocationId: js.UndefOr[String] = js.undefined
  
  /**
    * The association ID.
    */
  var AssociationId: js.UndefOr[String] = js.undefined
  
  /**
    * The carrier IP address associated with the network interface. This option is only available when the network interface is in a subnet which is associated with a Wavelength Zone.
    */
  var CarrierIp: js.UndefOr[String] = js.undefined
  
  /**
    * The customer-owned IP address associated with the network interface.
    */
  var CustomerOwnedIp: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the Elastic IP address owner.
    */
  var IpOwnerId: js.UndefOr[String] = js.undefined
  
  /**
    * The public DNS name.
    */
  var PublicDnsName: js.UndefOr[String] = js.undefined
  
  /**
    * The address of the Elastic IP address bound to the network interface.
    */
  var PublicIp: js.UndefOr[String] = js.undefined
}
object NetworkInterfaceAssociation {
  
  @scala.inline
  def apply(): NetworkInterfaceAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkInterfaceAssociation]
  }
  
  @scala.inline
  implicit class NetworkInterfaceAssociationMutableBuilder[Self <: NetworkInterfaceAssociation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllocationId(value: String): Self = StObject.set(x, "AllocationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllocationIdUndefined: Self = StObject.set(x, "AllocationId", js.undefined)
    
    @scala.inline
    def setAssociationId(value: String): Self = StObject.set(x, "AssociationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationIdUndefined: Self = StObject.set(x, "AssociationId", js.undefined)
    
    @scala.inline
    def setCarrierIp(value: String): Self = StObject.set(x, "CarrierIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCarrierIpUndefined: Self = StObject.set(x, "CarrierIp", js.undefined)
    
    @scala.inline
    def setCustomerOwnedIp(value: String): Self = StObject.set(x, "CustomerOwnedIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerOwnedIpUndefined: Self = StObject.set(x, "CustomerOwnedIp", js.undefined)
    
    @scala.inline
    def setIpOwnerId(value: String): Self = StObject.set(x, "IpOwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpOwnerIdUndefined: Self = StObject.set(x, "IpOwnerId", js.undefined)
    
    @scala.inline
    def setPublicDnsName(value: String): Self = StObject.set(x, "PublicDnsName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicDnsNameUndefined: Self = StObject.set(x, "PublicDnsName", js.undefined)
    
    @scala.inline
    def setPublicIp(value: String): Self = StObject.set(x, "PublicIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicIpUndefined: Self = StObject.set(x, "PublicIp", js.undefined)
  }
}
