package typings.chromeApps.chrome.webViewRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RedirectRequestParams extends js.Object {
  /** Destination to where the request is redirected. */
  var redirectUrl: String = js.native
}

object RedirectRequestParams {
  @scala.inline
  def apply(redirectUrl: String): RedirectRequestParams = {
    val __obj = js.Dynamic.literal(redirectUrl = redirectUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedirectRequestParams]
  }
  @scala.inline
  implicit class RedirectRequestParamsOps[Self <: RedirectRequestParams] (val x: Self) extends AnyVal {
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
    def setRedirectUrl(value: String): Self = this.set("redirectUrl", value.asInstanceOf[js.Any])
  }
  
}

