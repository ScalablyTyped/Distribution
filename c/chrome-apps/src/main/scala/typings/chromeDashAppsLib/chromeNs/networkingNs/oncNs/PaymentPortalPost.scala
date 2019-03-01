package typings
package chromeDashAppsLib.chromeNs.networkingNs.oncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentPortalPost extends js.Object {
  /** The HTTP method to use for the payment portal. */
  var Method: chromeDashAppsLib.chromeDashAppsLibStrings.POST
  /** The post data to send to the payment portal. */
  var PostData: js.UndefOr[java.lang.String] = js.undefined
  /** The payment portal URL. */
  var Url: js.UndefOr[java.lang.String] = js.undefined
}

object PaymentPortalPost {
  @scala.inline
  def apply(
    Method: chromeDashAppsLib.chromeDashAppsLibStrings.POST,
    PostData: java.lang.String = null,
    Url: java.lang.String = null
  ): PaymentPortalPost = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Method")(Method)
    if (PostData != null) __obj.updateDynamic("PostData")(PostData)
    if (Url != null) __obj.updateDynamic("Url")(Url)
    __obj.asInstanceOf[PaymentPortalPost]
  }
}

