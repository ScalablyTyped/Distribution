package typings
package braintreeLib.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddressUpdateRequest extends js.Object {
  var company: js.UndefOr[java.lang.String] = js.undefined
  var countryCodeAlpha2: js.UndefOr[java.lang.String] = js.undefined
  var countryCodeAlpha3: js.UndefOr[java.lang.String] = js.undefined
  var countryCodeNumeric: js.UndefOr[java.lang.String] = js.undefined
  var countryName: js.UndefOr[java.lang.String] = js.undefined
  var extendedAddress: js.UndefOr[java.lang.String] = js.undefined
  var firstName: js.UndefOr[java.lang.String] = js.undefined
  var lastName: js.UndefOr[java.lang.String] = js.undefined
  var locality: js.UndefOr[java.lang.String] = js.undefined
  var postalCode: js.UndefOr[java.lang.String] = js.undefined
  var region: js.UndefOr[java.lang.String] = js.undefined
  var streetAddress: js.UndefOr[java.lang.String] = js.undefined
}

object AddressUpdateRequest {
  @scala.inline
  def apply(
    company: java.lang.String = null,
    countryCodeAlpha2: java.lang.String = null,
    countryCodeAlpha3: java.lang.String = null,
    countryCodeNumeric: java.lang.String = null,
    countryName: java.lang.String = null,
    extendedAddress: java.lang.String = null,
    firstName: java.lang.String = null,
    lastName: java.lang.String = null,
    locality: java.lang.String = null,
    postalCode: java.lang.String = null,
    region: java.lang.String = null,
    streetAddress: java.lang.String = null
  ): AddressUpdateRequest = {
    val __obj = js.Dynamic.literal()
    if (company != null) __obj.updateDynamic("company")(company)
    if (countryCodeAlpha2 != null) __obj.updateDynamic("countryCodeAlpha2")(countryCodeAlpha2)
    if (countryCodeAlpha3 != null) __obj.updateDynamic("countryCodeAlpha3")(countryCodeAlpha3)
    if (countryCodeNumeric != null) __obj.updateDynamic("countryCodeNumeric")(countryCodeNumeric)
    if (countryName != null) __obj.updateDynamic("countryName")(countryName)
    if (extendedAddress != null) __obj.updateDynamic("extendedAddress")(extendedAddress)
    if (firstName != null) __obj.updateDynamic("firstName")(firstName)
    if (lastName != null) __obj.updateDynamic("lastName")(lastName)
    if (locality != null) __obj.updateDynamic("locality")(locality)
    if (postalCode != null) __obj.updateDynamic("postalCode")(postalCode)
    if (region != null) __obj.updateDynamic("region")(region)
    if (streetAddress != null) __obj.updateDynamic("streetAddress")(streetAddress)
    __obj.asInstanceOf[AddressUpdateRequest]
  }
}

