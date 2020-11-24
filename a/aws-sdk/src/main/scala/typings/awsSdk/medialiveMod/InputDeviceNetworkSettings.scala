package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputDeviceNetworkSettings extends js.Object {
  
  /**
    * The DNS addresses of the input device.
    */
  var DnsAddresses: js.UndefOr[listOfString] = js.native
  
  /**
    * The network gateway IP address.
    */
  var Gateway: js.UndefOr[string] = js.native
  
  /**
    * The IP address of the input device.
    */
  var IpAddress: js.UndefOr[string] = js.native
  
  /**
    * Specifies whether the input device has been configured (outside of MediaLive) to use a dynamic IP address assignment (DHCP) or a static IP address.
    */
  var IpScheme: js.UndefOr[InputDeviceIpScheme] = js.native
  
  /**
    * The subnet mask of the input device.
    */
  var SubnetMask: js.UndefOr[string] = js.native
}
object InputDeviceNetworkSettings {
  
  @scala.inline
  def apply(): InputDeviceNetworkSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputDeviceNetworkSettings]
  }
  
  @scala.inline
  implicit class InputDeviceNetworkSettingsOps[Self <: InputDeviceNetworkSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDnsAddressesVarargs(value: string*): Self = this.set("DnsAddresses", js.Array(value :_*))
    
    @scala.inline
    def setDnsAddresses(value: listOfString): Self = this.set("DnsAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDnsAddresses: Self = this.set("DnsAddresses", js.undefined)
    
    @scala.inline
    def setGateway(value: string): Self = this.set("Gateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGateway: Self = this.set("Gateway", js.undefined)
    
    @scala.inline
    def setIpAddress(value: string): Self = this.set("IpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpAddress: Self = this.set("IpAddress", js.undefined)
    
    @scala.inline
    def setIpScheme(value: InputDeviceIpScheme): Self = this.set("IpScheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpScheme: Self = this.set("IpScheme", js.undefined)
    
    @scala.inline
    def setSubnetMask(value: string): Self = this.set("SubnetMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetMask: Self = this.set("SubnetMask", js.undefined)
  }
}
