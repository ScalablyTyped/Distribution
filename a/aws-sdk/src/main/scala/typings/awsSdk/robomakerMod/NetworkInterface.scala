package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkInterface extends StObject {
  
  /**
    * The ID of the network interface.
    */
  var networkInterfaceId: js.UndefOr[GenericString] = js.native
  
  /**
    * The IPv4 address of the network interface within the subnet.
    */
  var privateIpAddress: js.UndefOr[GenericString] = js.native
  
  /**
    * The IPv4 public address of the network interface.
    */
  var publicIpAddress: js.UndefOr[GenericString] = js.native
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
    def setNetworkInterfaceId(value: GenericString): Self = StObject.set(x, "networkInterfaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "networkInterfaceId", js.undefined)
    
    @scala.inline
    def setPrivateIpAddress(value: GenericString): Self = StObject.set(x, "privateIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateIpAddressUndefined: Self = StObject.set(x, "privateIpAddress", js.undefined)
    
    @scala.inline
    def setPublicIpAddress(value: GenericString): Self = StObject.set(x, "publicIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicIpAddressUndefined: Self = StObject.set(x, "publicIpAddress", js.undefined)
  }
}
