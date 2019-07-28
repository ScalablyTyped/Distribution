package typings.braintree.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MerchantIndividual extends js.Object {
  var addressDetails: MerchantAddressDetails
  var dateOfBirth: String
  var email: String
  var firstName: String
  var lastName: String
  var phone: js.UndefOr[String] = js.undefined
  var ssn: js.UndefOr[String] = js.undefined
  var ssnLast4: js.UndefOr[String] = js.undefined
}

object MerchantIndividual {
  @scala.inline
  def apply(
    addressDetails: MerchantAddressDetails,
    dateOfBirth: String,
    email: String,
    firstName: String,
    lastName: String,
    phone: String = null,
    ssn: String = null,
    ssnLast4: String = null
  ): MerchantIndividual = {
    val __obj = js.Dynamic.literal(addressDetails = addressDetails, dateOfBirth = dateOfBirth, email = email, firstName = firstName, lastName = lastName)
    if (phone != null) __obj.updateDynamic("phone")(phone)
    if (ssn != null) __obj.updateDynamic("ssn")(ssn)
    if (ssnLast4 != null) __obj.updateDynamic("ssnLast4")(ssnLast4)
    __obj.asInstanceOf[MerchantIndividual]
  }
}

