package typings
package chromeDashAppsLib.chromeNs.networkingNs.oncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentPortal extends js.Object {
  /** The HTTP method to use for the payment portal. */
  var Method: java.lang.String
  /** The payment portal URL. */
  var Url: js.UndefOr[java.lang.String] = js.undefined
}

object PaymentPortal {
  @scala.inline
  def apply(Method: java.lang.String, Url: java.lang.String = null): PaymentPortal = {
    val __obj = js.Dynamic.literal(Method = Method)
    if (Url != null) __obj.updateDynamic("Url")(Url)
    __obj.asInstanceOf[PaymentPortal]
  }
}

