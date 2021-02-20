package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstancePrivateIpAddress extends StObject {
  
  /**
    * The association information for an Elastic IP address for the network interface.
    */
  var Association: js.UndefOr[InstanceNetworkInterfaceAssociation] = js.native
  
  /**
    * Indicates whether this IPv4 address is the primary private IP address of the network interface.
    */
  var Primary: js.UndefOr[Boolean] = js.native
  
  /**
    * The private IPv4 DNS name.
    */
  var PrivateDnsName: js.UndefOr[String] = js.native
  
  /**
    * The private IPv4 address of the network interface.
    */
  var PrivateIpAddress: js.UndefOr[String] = js.native
}
object InstancePrivateIpAddress {
  
  @scala.inline
  def apply(): InstancePrivateIpAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstancePrivateIpAddress]
  }
  
  @scala.inline
  implicit class InstancePrivateIpAddressMutableBuilder[Self <: InstancePrivateIpAddress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociation(value: InstanceNetworkInterfaceAssociation): Self = StObject.set(x, "Association", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationUndefined: Self = StObject.set(x, "Association", js.undefined)
    
    @scala.inline
    def setPrimary(value: Boolean): Self = StObject.set(x, "Primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryUndefined: Self = StObject.set(x, "Primary", js.undefined)
    
    @scala.inline
    def setPrivateDnsName(value: String): Self = StObject.set(x, "PrivateDnsName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateDnsNameUndefined: Self = StObject.set(x, "PrivateDnsName", js.undefined)
    
    @scala.inline
    def setPrivateIpAddress(value: String): Self = StObject.set(x, "PrivateIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateIpAddressUndefined: Self = StObject.set(x, "PrivateIpAddress", js.undefined)
  }
}
