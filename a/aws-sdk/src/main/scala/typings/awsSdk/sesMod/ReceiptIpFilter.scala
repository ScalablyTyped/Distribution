package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReceiptIpFilter extends js.Object {
  
  /**
    * A single IP address or a range of IP addresses that you want to block or allow, specified in Classless Inter-Domain Routing (CIDR) notation. An example of a single email address is 10.0.0.1. An example of a range of IP addresses is 10.0.0.1/24. For more information about CIDR notation, see RFC 2317.
    */
  var Cidr: typings.awsSdk.sesMod.Cidr = js.native
  
  /**
    * Indicates whether to block or allow incoming mail from the specified IP addresses.
    */
  var Policy: ReceiptFilterPolicy = js.native
}
object ReceiptIpFilter {
  
  @scala.inline
  def apply(Cidr: Cidr, Policy: ReceiptFilterPolicy): ReceiptIpFilter = {
    val __obj = js.Dynamic.literal(Cidr = Cidr.asInstanceOf[js.Any], Policy = Policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceiptIpFilter]
  }
  
  @scala.inline
  implicit class ReceiptIpFilterOps[Self <: ReceiptIpFilter] (val x: Self) extends AnyVal {
    
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
    def setCidr(value: Cidr): Self = this.set("Cidr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicy(value: ReceiptFilterPolicy): Self = this.set("Policy", value.asInstanceOf[js.Any])
  }
}
