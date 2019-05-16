package typings
package braintreeLib.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MerchantIndividual extends js.Object {
  var addressDetails: MerchantAddressDetails
  var dateOfBirth: java.lang.String
  var email: java.lang.String
  var firstName: java.lang.String
  var lastName: java.lang.String
  var phone: js.UndefOr[java.lang.String] = js.undefined
  var ssn: js.UndefOr[java.lang.String] = js.undefined
  var ssnLast4: js.UndefOr[java.lang.String] = js.undefined
}

object MerchantIndividual {
  @scala.inline
  def apply(
    addressDetails: MerchantAddressDetails,
    dateOfBirth: java.lang.String,
    email: java.lang.String,
    firstName: java.lang.String,
    lastName: java.lang.String,
    phone: java.lang.String = null,
    ssn: java.lang.String = null,
    ssnLast4: java.lang.String = null
  ): MerchantIndividual = {
    val __obj = js.Dynamic.literal(addressDetails = addressDetails, dateOfBirth = dateOfBirth, email = email, firstName = firstName, lastName = lastName)
    if (phone != null) __obj.updateDynamic("phone")(phone)
    if (ssn != null) __obj.updateDynamic("ssn")(ssn)
    if (ssnLast4 != null) __obj.updateDynamic("ssnLast4")(ssnLast4)
    __obj.asInstanceOf[MerchantIndividual]
  }
}

