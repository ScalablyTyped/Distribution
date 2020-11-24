package typings.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IpSet extends js.Object {
  
  /**
    * The array of IP addresses in the IP address set. An IP address set can have a maximum of two IP addresses.
    */
  var IpAddresses: js.UndefOr[typings.awsSdk.globalacceleratorMod.IpAddresses] = js.native
  
  /**
    * The types of IP addresses included in this IP set.
    */
  var IpFamily: js.UndefOr[GenericString] = js.native
}
object IpSet {
  
  @scala.inline
  def apply(): IpSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IpSet]
  }
  
  @scala.inline
  implicit class IpSetOps[Self <: IpSet] (val x: Self) extends AnyVal {
    
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
    def setIpAddressesVarargs(value: IpAddress*): Self = this.set("IpAddresses", js.Array(value :_*))
    
    @scala.inline
    def setIpAddresses(value: IpAddresses): Self = this.set("IpAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpAddresses: Self = this.set("IpAddresses", js.undefined)
    
    @scala.inline
    def setIpFamily(value: GenericString): Self = this.set("IpFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpFamily: Self = this.set("IpFamily", js.undefined)
  }
}
