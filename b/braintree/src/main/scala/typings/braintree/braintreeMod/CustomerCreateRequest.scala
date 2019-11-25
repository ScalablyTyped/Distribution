package typings.braintree.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomerCreateRequest extends js.Object {
  var company: js.UndefOr[String] = js.undefined
  var creditCard: js.UndefOr[CreditCardCreateRequest] = js.undefined
  var customFields: js.UndefOr[js.Any] = js.undefined
  var deviceData: js.UndefOr[String] = js.undefined
  var email: js.UndefOr[String] = js.undefined
  var fax: js.UndefOr[String] = js.undefined
  var firstName: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var lastName: js.UndefOr[String] = js.undefined
  var paymentMethodNonce: js.UndefOr[String] = js.undefined
  var phone: js.UndefOr[String] = js.undefined
  var riskData: js.UndefOr[CustomerRiskData] = js.undefined
  var website: js.UndefOr[String] = js.undefined
}

object CustomerCreateRequest {
  @scala.inline
  def apply(
    company: String = null,
    creditCard: CreditCardCreateRequest = null,
    customFields: js.Any = null,
    deviceData: String = null,
    email: String = null,
    fax: String = null,
    firstName: String = null,
    id: String = null,
    lastName: String = null,
    paymentMethodNonce: String = null,
    phone: String = null,
    riskData: CustomerRiskData = null,
    website: String = null
  ): CustomerCreateRequest = {
    val __obj = js.Dynamic.literal()
    if (company != null) __obj.updateDynamic("company")(company.asInstanceOf[js.Any])
    if (creditCard != null) __obj.updateDynamic("creditCard")(creditCard.asInstanceOf[js.Any])
    if (customFields != null) __obj.updateDynamic("customFields")(customFields.asInstanceOf[js.Any])
    if (deviceData != null) __obj.updateDynamic("deviceData")(deviceData.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (fax != null) __obj.updateDynamic("fax")(fax.asInstanceOf[js.Any])
    if (firstName != null) __obj.updateDynamic("firstName")(firstName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lastName != null) __obj.updateDynamic("lastName")(lastName.asInstanceOf[js.Any])
    if (paymentMethodNonce != null) __obj.updateDynamic("paymentMethodNonce")(paymentMethodNonce.asInstanceOf[js.Any])
    if (phone != null) __obj.updateDynamic("phone")(phone.asInstanceOf[js.Any])
    if (riskData != null) __obj.updateDynamic("riskData")(riskData.asInstanceOf[js.Any])
    if (website != null) __obj.updateDynamic("website")(website.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomerCreateRequest]
  }
}

