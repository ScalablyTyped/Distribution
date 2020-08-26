package typings.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddressUpdateRequest extends js.Object {
  var company: js.UndefOr[String] = js.native
  var countryCodeAlpha2: js.UndefOr[String] = js.native
  var countryCodeAlpha3: js.UndefOr[String] = js.native
  var countryCodeNumeric: js.UndefOr[String] = js.native
  var countryName: js.UndefOr[String] = js.native
  var extendedAddress: js.UndefOr[String] = js.native
  var firstName: js.UndefOr[String] = js.native
  var lastName: js.UndefOr[String] = js.native
  var locality: js.UndefOr[String] = js.native
  var postalCode: js.UndefOr[String] = js.native
  var region: js.UndefOr[String] = js.native
  var streetAddress: js.UndefOr[String] = js.native
}

object AddressUpdateRequest {
  @scala.inline
  def apply(): AddressUpdateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddressUpdateRequest]
  }
  @scala.inline
  implicit class AddressUpdateRequestOps[Self <: AddressUpdateRequest] (val x: Self) extends AnyVal {
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
    def setCompany(value: String): Self = this.set("company", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompany: Self = this.set("company", js.undefined)
    @scala.inline
    def setCountryCodeAlpha2(value: String): Self = this.set("countryCodeAlpha2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountryCodeAlpha2: Self = this.set("countryCodeAlpha2", js.undefined)
    @scala.inline
    def setCountryCodeAlpha3(value: String): Self = this.set("countryCodeAlpha3", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountryCodeAlpha3: Self = this.set("countryCodeAlpha3", js.undefined)
    @scala.inline
    def setCountryCodeNumeric(value: String): Self = this.set("countryCodeNumeric", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountryCodeNumeric: Self = this.set("countryCodeNumeric", js.undefined)
    @scala.inline
    def setCountryName(value: String): Self = this.set("countryName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountryName: Self = this.set("countryName", js.undefined)
    @scala.inline
    def setExtendedAddress(value: String): Self = this.set("extendedAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtendedAddress: Self = this.set("extendedAddress", js.undefined)
    @scala.inline
    def setFirstName(value: String): Self = this.set("firstName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstName: Self = this.set("firstName", js.undefined)
    @scala.inline
    def setLastName(value: String): Self = this.set("lastName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastName: Self = this.set("lastName", js.undefined)
    @scala.inline
    def setLocality(value: String): Self = this.set("locality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocality: Self = this.set("locality", js.undefined)
    @scala.inline
    def setPostalCode(value: String): Self = this.set("postalCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostalCode: Self = this.set("postalCode", js.undefined)
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    @scala.inline
    def setStreetAddress(value: String): Self = this.set("streetAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreetAddress: Self = this.set("streetAddress", js.undefined)
  }
  
}

