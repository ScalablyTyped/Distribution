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
    val __obj = js.Dynamic.literal(addressDetails = addressDetails.asInstanceOf[js.Any], dateOfBirth = dateOfBirth.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], firstName = firstName.asInstanceOf[js.Any], lastName = lastName.asInstanceOf[js.Any])
    if (phone != null) __obj.updateDynamic("phone")(phone.asInstanceOf[js.Any])
    if (ssn != null) __obj.updateDynamic("ssn")(ssn.asInstanceOf[js.Any])
    if (ssnLast4 != null) __obj.updateDynamic("ssnLast4")(ssnLast4.asInstanceOf[js.Any])
    __obj.asInstanceOf[MerchantIndividual]
  }
}

