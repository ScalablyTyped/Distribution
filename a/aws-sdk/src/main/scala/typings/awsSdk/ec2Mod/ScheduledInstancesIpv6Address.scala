package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScheduledInstancesIpv6Address extends js.Object {
  
  /**
    * The IPv6 address.
    */
  var Ipv6Address: js.UndefOr[typings.awsSdk.ec2Mod.Ipv6Address] = js.native
}
object ScheduledInstancesIpv6Address {
  
  @scala.inline
  def apply(): ScheduledInstancesIpv6Address = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduledInstancesIpv6Address]
  }
  
  @scala.inline
  implicit class ScheduledInstancesIpv6AddressOps[Self <: ScheduledInstancesIpv6Address] (val x: Self) extends AnyVal {
    
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
    def setIpv6Address(value: Ipv6Address): Self = this.set("Ipv6Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpv6Address: Self = this.set("Ipv6Address", js.undefined)
  }
}
