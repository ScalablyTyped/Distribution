package typings.braintree.mod

import typings.braintree.AnonAbstractTransactable
import typings.braintree.AnonAccountNotAuthorizedContactUs
import typings.braintree.AnonAmexPayWithPoints
import typings.braintree.AnonAuthorize
import typings.braintree.AnonIssuingBank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("braintree", "Test")
@js.native
class Test () extends js.Object {
  var CreditCardDefaults: AnonIssuingBank = js.native
  var CreditCardNumbers: AnonAmexPayWithPoints = js.native
  var MerchantAccountTest: AnonAccountNotAuthorizedContactUs = js.native
  var Nonces: AnonAbstractTransactable = js.native
  var TransactionAmounts: AnonAuthorize = js.native
}

