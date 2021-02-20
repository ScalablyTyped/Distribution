package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkInterface extends StObject {
  
  /**
    * The attachment ID for the network interface.
    */
  var attachmentId: js.UndefOr[String] = js.native
  
  /**
    * The private IPv6 address for the network interface.
    */
  var ipv6Address: js.UndefOr[String] = js.native
  
  /**
    * The private IPv4 address for the network interface.
    */
  var privateIpv4Address: js.UndefOr[String] = js.native
}
object NetworkInterface {
  
  @scala.inline
  def apply(): NetworkInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkInterface]
  }
  
  @scala.inline
  implicit class NetworkInterfaceMutableBuilder[Self <: NetworkInterface] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachmentId(value: String): Self = StObject.set(x, "attachmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentIdUndefined: Self = StObject.set(x, "attachmentId", js.undefined)
    
    @scala.inline
    def setIpv6Address(value: String): Self = StObject.set(x, "ipv6Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv6AddressUndefined: Self = StObject.set(x, "ipv6Address", js.undefined)
    
    @scala.inline
    def setPrivateIpv4Address(value: String): Self = StObject.set(x, "privateIpv4Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateIpv4AddressUndefined: Self = StObject.set(x, "privateIpv4Address", js.undefined)
  }
}
