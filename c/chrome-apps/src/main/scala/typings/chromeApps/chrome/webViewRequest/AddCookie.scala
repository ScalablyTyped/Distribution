package typings.chromeApps.chrome.webViewRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @private
  * @template T Type of cookie
  */
trait AddCookie[T] extends js.Object {
  /**
    * Cookie to be added to the request.
    * No field may be undefined.
    * The name and value need to be specified.
    */
  var cookie: T
}

object AddCookie {
  @scala.inline
  def apply[T](cookie: T): AddCookie[T] = {
    val __obj = js.Dynamic.literal(cookie = cookie.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddCookie[T]]
  }
}

