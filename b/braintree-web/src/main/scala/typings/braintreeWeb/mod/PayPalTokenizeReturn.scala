package typings.braintreeWeb.mod

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
  def apply(close: () => js.Any): PayPalTokenizeReturn = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close))
    __obj.asInstanceOf[PayPalTokenizeReturn]
  }
}

