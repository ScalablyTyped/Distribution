package typings.chromeApps.chrome.networking.onc

import typings.chromeApps.chromeAppsStrings.POST
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentPortalPost extends js.Object {
  /** The HTTP method to use for the payment portal. */
  var Method: POST
  /** The post data to send to the payment portal. */
  var PostData: js.UndefOr[String] = js.undefined
  /** The payment portal URL. */
  var Url: js.UndefOr[String] = js.undefined
}

object PaymentPortalPost {
  @scala.inline
  def apply(Method: POST, PostData: String = null, Url: String = null): PaymentPortalPost = {
    val __obj = js.Dynamic.literal(Method = Method.asInstanceOf[js.Any])
    if (PostData != null) __obj.updateDynamic("PostData")(PostData.asInstanceOf[js.Any])
    if (Url != null) __obj.updateDynamic("Url")(Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentPortalPost]
  }
}

