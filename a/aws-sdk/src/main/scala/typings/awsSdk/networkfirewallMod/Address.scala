package typings.awsSdk.networkfirewallMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Address extends js.Object {
  
  /**
    * Specify an IP address or a block of IP addresses in Classless Inter-Domain Routing (CIDR) notation. Network Firewall supports all address ranges for IPv4.  Examples:    To configure Network Firewall to inspect for the IP address 192.0.2.44, specify 192.0.2.44/32.   To configure Network Firewall to inspect for IP addresses from 192.0.2.0 to 192.0.2.255, specify 192.0.2.0/24.   For more information about CIDR notation, see the Wikipedia entry Classless Inter-Domain Routing.
    */
  var AddressDefinition: typings.awsSdk.networkfirewallMod.AddressDefinition = js.native
}
object Address {
  
  @scala.inline
  def apply(AddressDefinition: AddressDefinition): Address = {
    val __obj = js.Dynamic.literal(AddressDefinition = AddressDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
  
  @scala.inline
  implicit class AddressOps[Self <: Address] (val x: Self) extends AnyVal {
    
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
    def setAddressDefinition(value: AddressDefinition): Self = this.set("AddressDefinition", value.asInstanceOf[js.Any])
  }
}
