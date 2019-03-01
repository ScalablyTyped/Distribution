package typings
package braintreeDashWebLib.braintreeDashWebMod.braintreeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @property {Function} close A handle to close the PayPal checkout flow.
  */
trait PayPalTokenizeReturn extends js.Object {
  def close(): js.Any
}

object PayPalTokenizeReturn {
  @scala.inline
  def apply(close: js.Function0[js.Any]): PayPalTokenizeReturn = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close)
    __obj.asInstanceOf[PayPalTokenizeReturn]
  }
}

