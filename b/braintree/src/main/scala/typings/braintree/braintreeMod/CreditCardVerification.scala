package typings.braintree.braintreeMod

import typings.braintree.Anon_Bin
import typings.braintree.Anon_CompanyCountryName
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("braintree", "CreditCardVerification")
@js.native
class CreditCardVerification () extends js.Object {
  var amount: String = js.native
  var avsErrorResponseCode: js.UndefOr[String] = js.native
  var avsPostalCodeResponseCode: js.UndefOr[String] = js.native
  var avsScreetAddressResponseCode: js.UndefOr[String] = js.native
  var billing: js.UndefOr[Anon_CompanyCountryName] = js.native
  var createdAt: Date = js.native
  var creditCard: js.UndefOr[Anon_Bin] = js.native
  var currencyIsoCode: String = js.native
  var cvvResponseCode: String = js.native
  var gatewayRejectionReason: js.UndefOr[String] = js.native
  var id: String = js.native
  var merchantAccountId: String = js.native
  var processorResponseCode: String = js.native
  var processorResponseText: String = js.native
  var processorResponseType: String = js.native
  var riskData: js.UndefOr[TransactionRiskData] = js.native
  var status: String = js.native
}

