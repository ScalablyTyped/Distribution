package typings.braintree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCountryCodeAlpha3 extends js.Object {
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

object AnonCountryCodeAlpha3 {
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
  ): AnonCountryCodeAlpha3 = {
    val __obj = js.Dynamic.literal()
    if (company != null) __obj.updateDynamic("company")(company.asInstanceOf[js.Any])
    if (countryCodeAlpha2 != null) __obj.updateDynamic("countryCodeAlpha2")(countryCodeAlpha2.asInstanceOf[js.Any])
    if (countryCodeAlpha3 != null) __obj.updateDynamic("countryCodeAlpha3")(countryCodeAlpha3.asInstanceOf[js.Any])
    if (countryCodeNumeric != null) __obj.updateDynamic("countryCodeNumeric")(countryCodeNumeric.asInstanceOf[js.Any])
    if (countryName != null) __obj.updateDynamic("countryName")(countryName.asInstanceOf[js.Any])
    if (extendedAddress != null) __obj.updateDynamic("extendedAddress")(extendedAddress.asInstanceOf[js.Any])
    if (firstName != null) __obj.updateDynamic("firstName")(firstName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lastName != null) __obj.updateDynamic("lastName")(lastName.asInstanceOf[js.Any])
    if (locality != null) __obj.updateDynamic("locality")(locality.asInstanceOf[js.Any])
    if (postalCode != null) __obj.updateDynamic("postalCode")(postalCode.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (streetAddress != null) __obj.updateDynamic("streetAddress")(streetAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCountryCodeAlpha3]
  }
}

