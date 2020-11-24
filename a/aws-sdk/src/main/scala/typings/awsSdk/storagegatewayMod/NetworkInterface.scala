package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkInterface extends js.Object {
  
  /**
    * The Internet Protocol version 4 (IPv4) address of the interface.
    */
  var Ipv4Address: js.UndefOr[String] = js.native
  
  /**
    * The Internet Protocol version 6 (IPv6) address of the interface. Currently not supported.
    */
  var Ipv6Address: js.UndefOr[String] = js.native
  
  /**
    * The Media Access Control (MAC) address of the interface.  This is currently unsupported and will not be returned in output. 
    */
  var MacAddress: js.UndefOr[String] = js.native
}
object NetworkInterface {
  
  @scala.inline
  def apply(): NetworkInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkInterface]
  }
  
  @scala.inline
  implicit class NetworkInterfaceOps[Self <: NetworkInterface] (val x: Self) extends AnyVal {
    
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
    def setIpv4Address(value: String): Self = this.set("Ipv4Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpv4Address: Self = this.set("Ipv4Address", js.undefined)
    
    @scala.inline
    def setIpv6Address(value: String): Self = this.set("Ipv6Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpv6Address: Self = this.set("Ipv6Address", js.undefined)
    
    @scala.inline
    def setMacAddress(value: String): Self = this.set("MacAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMacAddress: Self = this.set("MacAddress", js.undefined)
  }
}
