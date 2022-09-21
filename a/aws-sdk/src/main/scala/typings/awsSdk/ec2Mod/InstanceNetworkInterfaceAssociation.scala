package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceNetworkInterfaceAssociation extends StObject {
  
  /**
    * The carrier IP address associated with the network interface.
    */
  var CarrierIp: js.UndefOr[String] = js.undefined
  
  /**
    * The customer-owned IP address associated with the network interface.
    */
  var CustomerOwnedIp: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the owner of the Elastic IP address.
    */
  var IpOwnerId: js.UndefOr[String] = js.undefined
  
  /**
    * The public DNS name.
    */
  var PublicDnsName: js.UndefOr[String] = js.undefined
  
  /**
    * The public IP address or Elastic IP address bound to the network interface.
    */
  var PublicIp: js.UndefOr[String] = js.undefined
}
object InstanceNetworkInterfaceAssociation {
  
  inline def apply(): InstanceNetworkInterfaceAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceNetworkInterfaceAssociation]
  }
  
  extension [Self <: InstanceNetworkInterfaceAssociation](x: Self) {
    
    inline def setCarrierIp(value: String): Self = StObject.set(x, "CarrierIp", value.asInstanceOf[js.Any])
    
    inline def setCarrierIpUndefined: Self = StObject.set(x, "CarrierIp", js.undefined)
    
    inline def setCustomerOwnedIp(value: String): Self = StObject.set(x, "CustomerOwnedIp", value.asInstanceOf[js.Any])
    
    inline def setCustomerOwnedIpUndefined: Self = StObject.set(x, "CustomerOwnedIp", js.undefined)
    
    inline def setIpOwnerId(value: String): Self = StObject.set(x, "IpOwnerId", value.asInstanceOf[js.Any])
    
    inline def setIpOwnerIdUndefined: Self = StObject.set(x, "IpOwnerId", js.undefined)
    
    inline def setPublicDnsName(value: String): Self = StObject.set(x, "PublicDnsName", value.asInstanceOf[js.Any])
    
    inline def setPublicDnsNameUndefined: Self = StObject.set(x, "PublicDnsName", js.undefined)
    
    inline def setPublicIp(value: String): Self = StObject.set(x, "PublicIp", value.asInstanceOf[js.Any])
    
    inline def setPublicIpUndefined: Self = StObject.set(x, "PublicIp", js.undefined)
  }
}
