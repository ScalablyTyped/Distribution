package typings.chrome.chrome.declarativeWebRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddRequestCookie extends js.Object {
  var cookie: RequestCookie
}

object AddRequestCookie {
  @scala.inline
  def apply(cookie: RequestCookie): AddRequestCookie = {
    val __obj = js.Dynamic.literal(cookie = cookie)
  
    __obj.asInstanceOf[AddRequestCookie]
  }
}

