package typings.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("braintree", "PaymentMethodNonce")
@js.native
class PaymentMethodNonce () extends js.Object {
  var binData: js.UndefOr[BinData] = js.native
  var default: js.UndefOr[Boolean] = js.native
  var details: js.UndefOr[NonceDetails] = js.native
  var nonce: String = js.native
  var threeDSecureInfo: js.UndefOr[TransactionThreeDSecureInfo] = js.native
  var `type`: js.UndefOr[PaymentMethodType] = js.native
}

