package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceIpv6Address extends js.Object {
  
  /**
    * The IPv6 address.
    */
  var Ipv6Address: js.UndefOr[String] = js.native
}
object InstanceIpv6Address {
  
  @scala.inline
  def apply(): InstanceIpv6Address = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceIpv6Address]
  }
  
  @scala.inline
  implicit class InstanceIpv6AddressOps[Self <: InstanceIpv6Address] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIpv6Address(value: String): Self = this.set("Ipv6Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpv6Address: Self = this.set("Ipv6Address", js.undefined)
  }
}
