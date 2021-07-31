package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkInterfacePrivateIpAddress extends StObject {
  
  /**
    * The association information for an Elastic IP address (IPv4) associated with the network interface.
    */
  var Association: js.UndefOr[NetworkInterfaceAssociation] = js.undefined
  
  /**
    * Indicates whether this IPv4 address is the primary private IPv4 address of the network interface.
    */
  var Primary: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The private DNS name.
    */
  var PrivateDnsName: js.UndefOr[String] = js.undefined
  
  /**
    * The private IPv4 address.
    */
  var PrivateIpAddress: js.UndefOr[String] = js.undefined
}
object NetworkInterfacePrivateIpAddress {
  
  @scala.inline
  def apply(): NetworkInterfacePrivateIpAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkInterfacePrivateIpAddress]
  }
  
  @scala.inline
  implicit class NetworkInterfacePrivateIpAddressMutableBuilder[Self <: NetworkInterfacePrivateIpAddress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociation(value: NetworkInterfaceAssociation): Self = StObject.set(x, "Association", value.asInstanceOf[js.Any])
    
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
