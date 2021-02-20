package typings.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("braintree", "PaymentMethodNonce")
@js.native
class PaymentMethodNonce () extends StObject {
  
  var default: js.UndefOr[Boolean] = js.native
  
  var binData: js.UndefOr[BinData] = js.native
  
  var details: js.UndefOr[NonceDetails] = js.native
  
  var nonce: String = js.native
  
  var threeDSecureInfo: js.UndefOr[TransactionThreeDSecureInfo] = js.native
  
  var `type`: js.UndefOr[PaymentMethodType] = js.native
}
