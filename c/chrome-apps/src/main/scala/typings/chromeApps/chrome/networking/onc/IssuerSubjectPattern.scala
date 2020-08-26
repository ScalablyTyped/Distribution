package typings.chromeApps.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IssuerSubjectPattern extends js.Object {
  /** If set, the value against which to match the certificate subject's common name. */
  var CommonName: js.UndefOr[String] = js.native
  /** If set, the value against which to match the certificate subject's common location. */
  var Locality: js.UndefOr[String] = js.native
  /**
    * If set, the value against which to match the certificate subject's organizations.
    * At least one organization should match the value.
    */
  var Organization: js.UndefOr[String] = js.native
  /**
    * If set, the value against which to match the certificate subject's organizational units.
    * At least one organizational unit should match the value.
    */
  var OrganizationalUnit: js.UndefOr[String] = js.native
}

object IssuerSubjectPattern {
  @scala.inline
  def apply(): IssuerSubjectPattern = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IssuerSubjectPattern]
  }
  @scala.inline
  implicit class IssuerSubjectPatternOps[Self <: IssuerSubjectPattern] (val x: Self) extends AnyVal {
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
    def setCommonName(value: String): Self = this.set("CommonName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommonName: Self = this.set("CommonName", js.undefined)
    @scala.inline
    def setLocality(value: String): Self = this.set("Locality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocality: Self = this.set("Locality", js.undefined)
    @scala.inline
    def setOrganization(value: String): Self = this.set("Organization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrganization: Self = this.set("Organization", js.undefined)
    @scala.inline
    def setOrganizationalUnit(value: String): Self = this.set("OrganizationalUnit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrganizationalUnit: Self = this.set("OrganizationalUnit", js.undefined)
  }
  
}

