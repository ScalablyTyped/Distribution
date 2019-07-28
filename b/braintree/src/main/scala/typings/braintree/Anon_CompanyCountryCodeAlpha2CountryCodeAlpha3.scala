package typings.braintree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CompanyCountryCodeAlpha2CountryCodeAlpha3 extends js.Object {
  var company: js.UndefOr[String] = js.undefined
  var countryCodeAlpha2: js.UndefOr[String] = js.undefined
  var countryCodeAlpha3: js.UndefOr[String] = js.undefined
  var countryCodeNumeric: js.UndefOr[String] = js.undefined
  var countryName: js.UndefOr[String] = js.undefined
  var extendedAddress: js.UndefOr[String] = js.undefined
  var firstName: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var lastName: js.UndefOr[String] = js.undefined
  var locality: js.UndefOr[String] = js.undefined
  var postalCode: js.UndefOr[String] = js.undefined
  var region: js.UndefOr[String] = js.undefined
  var streetAddress: js.UndefOr[String] = js.undefined
}

object Anon_CompanyCountryCodeAlpha2CountryCodeAlpha3 {
  @scala.inline
  def apply(
    company: String = null,
    countryCodeAlpha2: String = null,
    countryCodeAlpha3: String = null,
    countryCodeNumeric: String = null,
    countryName: String = null,
    extendedAddress: String = null,
    firstName: String = null,
    id: String = null,
    lastName: String = null,
    locality: String = null,
    postalCode: String = null,
    region: String = null,
    streetAddress: String = null
  ): Anon_CompanyCountryCodeAlpha2CountryCodeAlpha3 = {
    val __obj = js.Dynamic.literal()
    if (company != null) __obj.updateDynamic("company")(company)
    if (countryCodeAlpha2 != null) __obj.updateDynamic("countryCodeAlpha2")(countryCodeAlpha2)
    if (countryCodeAlpha3 != null) __obj.updateDynamic("countryCodeAlpha3")(countryCodeAlpha3)
    if (countryCodeNumeric != null) __obj.updateDynamic("countryCodeNumeric")(countryCodeNumeric)
    if (countryName != null) __obj.updateDynamic("countryName")(countryName)
    if (extendedAddress != null) __obj.updateDynamic("extendedAddress")(extendedAddress)
    if (firstName != null) __obj.updateDynamic("firstName")(firstName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (lastName != null) __obj.updateDynamic("lastName")(lastName)
    if (locality != null) __obj.updateDynamic("locality")(locality)
    if (postalCode != null) __obj.updateDynamic("postalCode")(postalCode)
    if (region != null) __obj.updateDynamic("region")(region)
    if (streetAddress != null) __obj.updateDynamic("streetAddress")(streetAddress)
    __obj.asInstanceOf[Anon_CompanyCountryCodeAlpha2CountryCodeAlpha3]
  }
}

