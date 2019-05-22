package typings
package braintreeLib.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomerCreateRequest extends js.Object {
  var company: js.UndefOr[java.lang.String] = js.undefined
  var creditCard: js.UndefOr[CreditCardCreateRequest] = js.undefined
  var customFields: js.UndefOr[js.Any] = js.undefined
  var deviceData: js.UndefOr[java.lang.String] = js.undefined
  var email: js.UndefOr[java.lang.String] = js.undefined
  var fax: js.UndefOr[java.lang.String] = js.undefined
  var firstName: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var lastName: js.UndefOr[java.lang.String] = js.undefined
  var paymentMethodNonce: js.UndefOr[java.lang.String] = js.undefined
  var phone: js.UndefOr[java.lang.String] = js.undefined
  var riskData: js.UndefOr[CustomerRiskData] = js.undefined
  var website: js.UndefOr[java.lang.String] = js.undefined
}

object CustomerCreateRequest {
  @scala.inline
  def apply(
    company: java.lang.String = null,
    creditCard: CreditCardCreateRequest = null,
    customFields: js.Any = null,
    deviceData: java.lang.String = null,
    email: java.lang.String = null,
    fax: java.lang.String = null,
    firstName: java.lang.String = null,
    id: java.lang.String = null,
    lastName: java.lang.String = null,
    paymentMethodNonce: java.lang.String = null,
    phone: java.lang.String = null,
    riskData: CustomerRiskData = null,
    website: java.lang.String = null
  ): CustomerCreateRequest = {
    val __obj = js.Dynamic.literal()
    if (company != null) __obj.updateDynamic("company")(company)
    if (creditCard != null) __obj.updateDynamic("creditCard")(creditCard)
    if (customFields != null) __obj.updateDynamic("customFields")(customFields)
    if (deviceData != null) __obj.updateDynamic("deviceData")(deviceData)
    if (email != null) __obj.updateDynamic("email")(email)
    if (fax != null) __obj.updateDynamic("fax")(fax)
    if (firstName != null) __obj.updateDynamic("firstName")(firstName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (lastName != null) __obj.updateDynamic("lastName")(lastName)
    if (paymentMethodNonce != null) __obj.updateDynamic("paymentMethodNonce")(paymentMethodNonce)
    if (phone != null) __obj.updateDynamic("phone")(phone)
    if (riskData != null) __obj.updateDynamic("riskData")(riskData)
    if (website != null) __obj.updateDynamic("website")(website)
    __obj.asInstanceOf[CustomerCreateRequest]
  }
}

