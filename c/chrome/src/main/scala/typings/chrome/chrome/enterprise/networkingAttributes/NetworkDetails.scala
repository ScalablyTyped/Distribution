package typings.chrome.chrome.enterprise.networkingAttributes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkDetails extends js.Object {
  
  /** Optional. The device's local IPv4 address (undefined if not configured). */
  var ipv4: js.UndefOr[String] = js.native
  
  /** Optional. The device's local IPv6 address (undefined if not configured). */
  var ipv6: js.UndefOr[String] = js.native
  
  /** The device's MAC address. */
  var macAddress: String = js.native
}
object NetworkDetails {
  
  @scala.inline
  def apply(macAddress: String): NetworkDetails = {
    val __obj = js.Dynamic.literal(macAddress = macAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkDetails]
  }
  
  @scala.inline
  implicit class NetworkDetailsOps[Self <: NetworkDetails] (val x: Self) extends AnyVal {
    
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
    def setMacAddress(value: String): Self = this.set("macAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv4(value: String): Self = this.set("ipv4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpv4: Self = this.set("ipv4", js.undefined)
    
    @scala.inline
    def setIpv6(value: String): Self = this.set("ipv6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpv6: Self = this.set("ipv6", js.undefined)
  }
}
