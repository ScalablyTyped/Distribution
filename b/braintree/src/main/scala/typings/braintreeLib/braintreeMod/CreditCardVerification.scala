package typings
package braintreeLib.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("braintree", "CreditCardVerification")
@js.native
class CreditCardVerification () extends js.Object {
  var amount: java.lang.String = js.native
  var avsErrorResponseCode: js.UndefOr[java.lang.String] = js.native
  var avsPostalCodeResponseCode: js.UndefOr[java.lang.String] = js.native
  var avsScreetAddressResponseCode: js.UndefOr[java.lang.String] = js.native
  var billing: js.UndefOr[braintreeLib.Anon_CompanyCountryName] = js.native
  var createdAt: stdLib.Date = js.native
  var creditCard: js.UndefOr[braintreeLib.Anon_Bin] = js.native
  var currencyIsoCode: java.lang.String = js.native
  var cvvResponseCode: java.lang.String = js.native
  var gatewayRejectionReason: js.UndefOr[java.lang.String] = js.native
  var id: java.lang.String = js.native
  var merchantAccountId: java.lang.String = js.native
  var processorResponseCode: java.lang.String = js.native
  var processorResponseText: java.lang.String = js.native
  var processorResponseType: java.lang.String = js.native
  var riskData: js.UndefOr[TransactionRiskData] = js.native
  var status: java.lang.String = js.native
}

