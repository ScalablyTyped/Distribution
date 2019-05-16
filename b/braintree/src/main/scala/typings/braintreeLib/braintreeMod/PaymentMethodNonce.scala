package typings
package braintreeLib.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("braintree", "PaymentMethodNonce")
@js.native
class PaymentMethodNonce () extends js.Object {
  var binData: js.UndefOr[BinData] = js.native
  var default: js.UndefOr[scala.Boolean] = js.native
  var details: js.UndefOr[NonceDetails] = js.native
  var nonce: java.lang.String = js.native
  var threeDSecureInfo: js.UndefOr[TransactionThreeDSecureInfo] = js.native
  var `type`: js.UndefOr[PaymentMethodType] = js.native
}

