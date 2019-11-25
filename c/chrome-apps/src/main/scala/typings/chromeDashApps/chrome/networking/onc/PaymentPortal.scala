package typings.chromeDashApps.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentPortal extends js.Object {
  /** The HTTP method to use for the payment portal. */
  var Method: String
  /** The payment portal URL. */
  var Url: js.UndefOr[String] = js.undefined
}

object PaymentPortal {
  @scala.inline
  def apply(Method: String, Url: String = null): PaymentPortal = {
    val __obj = js.Dynamic.literal(Method = Method.asInstanceOf[js.Any])
    if (Url != null) __obj.updateDynamic("Url")(Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentPortal]
  }
}

