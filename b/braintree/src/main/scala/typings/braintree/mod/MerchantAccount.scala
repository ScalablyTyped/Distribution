package typings.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("braintree", "MerchantAccount")
@js.native
class MerchantAccount () extends js.Object {
  var business: js.UndefOr[MerchantBusinessResponse] = js.native
  var currencyIsoCode: String = js.native
  var default: Boolean = js.native
  var funding: MerchantFunding = js.native
  var id: String = js.native
  var individual: MerchantIndividualResponse = js.native
  var masterMerchantAccount: js.UndefOr[MerchantAccount] = js.native
  var status: MerchantAccountStatus = js.native
}

