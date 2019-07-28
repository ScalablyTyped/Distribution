package typings.chromeDashApps.chromeNs.networkingNs.oncNs

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
    val __obj = js.Dynamic.literal(Method = Method)
    if (Url != null) __obj.updateDynamic("Url")(Url)
    __obj.asInstanceOf[PaymentPortal]
  }
}

