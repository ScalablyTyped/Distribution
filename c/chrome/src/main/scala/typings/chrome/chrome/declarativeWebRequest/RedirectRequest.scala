package typings.chrome.chrome.declarativeWebRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RedirectRequest extends js.Object {
  var redirectUrl: String = js.native
}

object RedirectRequest {
  @scala.inline
  def apply(redirectUrl: String): RedirectRequest = {
    val __obj = js.Dynamic.literal(redirectUrl = redirectUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedirectRequest]
  }
  @scala.inline
  implicit class RedirectRequestOps[Self <: RedirectRequest] (val x: Self) extends AnyVal {
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

