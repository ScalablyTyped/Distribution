package typings.braintree.mod

import typings.braintree.anon.Company
import typings.braintree.anon.MakeDefault
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentMethodCreateRequest extends js.Object {
  var billingAddress: js.UndefOr[Company] = js.undefined
  var billingAddressId: js.UndefOr[String] = js.undefined
  var cardholderName: js.UndefOr[String] = js.undefined
  var customerId: String
  var cvv: js.UndefOr[String] = js.undefined
  var deviceData: js.UndefOr[String] = js.undefined
  var expirationDate: js.UndefOr[String] = js.undefined
  var expirationMonth: js.UndefOr[String] = js.undefined
  var expirationYear: js.UndefOr[String] = js.undefined
  var number: js.UndefOr[String] = js.undefined
  var options: js.UndefOr[MakeDefault] = js.undefined
  var paymentMethodNonce: String
}

object PaymentMethodCreateRequest {
  @scala.inline
  def apply(
    customerId: String,
    paymentMethodNonce: String,
    billingAddress: Company = null,
    billingAddressId: String = null,
    cardholderName: String = null,
    cvv: String = null,
    deviceData: String = null,
    expirationDate: String = null,
    expirationMonth: String = null,
    expirationYear: String = null,
    number: String = null,
    options: MakeDefault = null
  ): PaymentMethodCreateRequest = {
    val __obj = js.Dynamic.literal(customerId = customerId.asInstanceOf[js.Any], paymentMethodNonce = paymentMethodNonce.asInstanceOf[js.Any])
    if (billingAddress != null) __obj.updateDynamic("billingAddress")(billingAddress.asInstanceOf[js.Any])
    if (billingAddressId != null) __obj.updateDynamic("billingAddressId")(billingAddressId.asInstanceOf[js.Any])
    if (cardholderName != null) __obj.updateDynamic("cardholderName")(cardholderName.asInstanceOf[js.Any])
    if (cvv != null) __obj.updateDynamic("cvv")(cvv.asInstanceOf[js.Any])
    if (deviceData != null) __obj.updateDynamic("deviceData")(deviceData.asInstanceOf[js.Any])
    if (expirationDate != null) __obj.updateDynamic("expirationDate")(expirationDate.asInstanceOf[js.Any])
    if (expirationMonth != null) __obj.updateDynamic("expirationMonth")(expirationMonth.asInstanceOf[js.Any])
    if (expirationYear != null) __obj.updateDynamic("expirationYear")(expirationYear.asInstanceOf[js.Any])
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodCreateRequest]
  }
}

