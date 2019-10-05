package typings.chrome.chrome.declarativeWebRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedirectRequest extends js.Object {
  var redirectUrl: String
}

object RedirectRequest {
  @scala.inline
  def apply(redirectUrl: String): RedirectRequest = {
    val __obj = js.Dynamic.literal(redirectUrl = redirectUrl)
  
    __obj.asInstanceOf[RedirectRequest]
  }
}

