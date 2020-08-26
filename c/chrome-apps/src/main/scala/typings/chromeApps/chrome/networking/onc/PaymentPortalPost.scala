package typings.chromeApps.chrome.networking.onc

import typings.chromeApps.chromeAppsStrings.POST
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaymentPortalPost extends js.Object {
  /** The HTTP method to use for the payment portal. */
  var Method: POST = js.native
  /** The post data to send to the payment portal. */
  var PostData: js.UndefOr[String] = js.native
  /** The payment portal URL. */
  var Url: js.UndefOr[String] = js.native
}

object PaymentPortalPost {
  @scala.inline
  def apply(Method: POST): PaymentPortalPost = {
    val __obj = js.Dynamic.literal(Method = Method.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentPortalPost]
  }
  @scala.inline
  implicit class PaymentPortalPostOps[Self <: PaymentPortalPost] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMethod(value: POST): Self = this.set("Method", value.asInstanceOf[js.Any])
    @scala.inline
    def setPostData(value: String): Self = this.set("PostData", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostData: Self = this.set("PostData", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("Url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("Url", js.undefined)
  }
  
}

