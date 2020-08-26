package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Organization extends js.Object {
  /**
    * The Autonomous System Number (ASN) of the internet provider of the remote IP address.
    */
  var Asn: js.UndefOr[String] = js.native
  /**
    * The organization that registered this ASN.
    */
  var AsnOrg: js.UndefOr[String] = js.native
  /**
    * The ISP information for the internet provider.
    */
  var Isp: js.UndefOr[String] = js.native
  /**
    * The name of the internet provider.
    */
  var Org: js.UndefOr[String] = js.native
}

object Organization {
  @scala.inline
  def apply(): Organization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Organization]
  }
  @scala.inline
  implicit class OrganizationOps[Self <: Organization] (val x: Self) extends AnyVal {
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
    def setAsn(value: String): Self = this.set("Asn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsn: Self = this.set("Asn", js.undefined)
    @scala.inline
    def setAsnOrg(value: String): Self = this.set("AsnOrg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsnOrg: Self = this.set("AsnOrg", js.undefined)
    @scala.inline
    def setIsp(value: String): Self = this.set("Isp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsp: Self = this.set("Isp", js.undefined)
    @scala.inline
    def setOrg(value: String): Self = this.set("Org", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrg: Self = this.set("Org", js.undefined)
  }
  
}

