package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IpOwner extends js.Object {
  
  /**
    * The autonomous system number (ASN) for the autonomous system that included the IP address.
    */
  var asn: js.UndefOr[string] = js.native
  
  /**
    * The organization identifier that's associated with the autonomous system number (ASN) for the autonomous system that included the IP address.
    */
  var asnOrg: js.UndefOr[string] = js.native
  
  /**
    * The name of the internet service provider (ISP) that owned the IP address.
    */
  var isp: js.UndefOr[string] = js.native
  
  /**
    * The name of the organization that owned the IP address.
    */
  @JSName("org")
  var org_ : js.UndefOr[string] = js.native
}
object IpOwner {
  
  @scala.inline
  def apply(): IpOwner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IpOwner]
  }
  
  @scala.inline
  implicit class IpOwnerOps[Self <: IpOwner] (val x: Self) extends AnyVal {
    
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
    def setAsn(value: string): Self = this.set("asn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsn: Self = this.set("asn", js.undefined)
    
    @scala.inline
    def setAsnOrg(value: string): Self = this.set("asnOrg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsnOrg: Self = this.set("asnOrg", js.undefined)
    
    @scala.inline
    def setIsp(value: string): Self = this.set("isp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsp: Self = this.set("isp", js.undefined)
    
    @scala.inline
    def setOrg_(value: string): Self = this.set("org", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrg_ : Self = this.set("org", js.undefined)
  }
}
