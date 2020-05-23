package typings.braintree.mod

import typings.braintree.anon.AbstractTransactable
import typings.braintree.anon.AccountNotAuthorizedContactUs
import typings.braintree.anon.AmexPayWithPoints
import typings.braintree.anon.Authorize
import typings.braintree.anon.IssuingBank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("braintree", "Test")
@js.native
class Test () extends js.Object {
  var CreditCardDefaults: IssuingBank = js.native
  var CreditCardNumbers: AmexPayWithPoints = js.native
  var MerchantAccountTest: AccountNotAuthorizedContactUs = js.native
  var Nonces: AbstractTransactable = js.native
  var TransactionAmounts: Authorize = js.native
}

