package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalIpDetails extends js.Object {
  
  /**
    * The IPv4 local address of the connection.
    */
  var IpAddressV4: js.UndefOr[String] = js.native
}
object LocalIpDetails {
  
  @scala.inline
  def apply(): LocalIpDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalIpDetails]
  }
  
  @scala.inline
  implicit class LocalIpDetailsOps[Self <: LocalIpDetails] (val x: Self) extends AnyVal {
    
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
    def setIpAddressV4(value: String): Self = this.set("IpAddressV4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpAddressV4: Self = this.set("IpAddressV4", js.undefined)
  }
}
