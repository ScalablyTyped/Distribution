package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceNetworkInterfaceAssociation extends StObject {
  
  /**
    * The carrier IP address associated with the network interface.
    */
  var CarrierIp: js.UndefOr[String] = js.native
  
  /**
    * The ID of the owner of the Elastic IP address.
    */
  var IpOwnerId: js.UndefOr[String] = js.native
  
  /**
    * The public DNS name.
    */
  var PublicDnsName: js.UndefOr[String] = js.native
  
  /**
    * The public IP address or Elastic IP address bound to the network interface.
    */
  var PublicIp: js.UndefOr[String] = js.native
}
object InstanceNetworkInterfaceAssociation {
  
  @scala.inline
  def apply(): InstanceNetworkInterfaceAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceNetworkInterfaceAssociation]
  }
  
  @scala.inline
  implicit class InstanceNetworkInterfaceAssociationMutableBuilder[Self <: InstanceNetworkInterfaceAssociation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCarrierIp(value: String): Self = StObject.set(x, "CarrierIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCarrierIpUndefined: Self = StObject.set(x, "CarrierIp", js.undefined)
    
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
