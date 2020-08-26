package typings.chromeApps.chrome.webViewRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @private
  * @template T Type of cookie
  */
@js.native
trait AddCookie[T] extends js.Object {
  /**
    * Cookie to be added to the request.
    * No field may be undefined.
    * The name and value need to be specified.
    */
  var cookie: T = js.native
}

object AddCookie {
  @scala.inline
  def apply[T](cookie: T): AddCookie[T] = {
    val __obj = js.Dynamic.literal(cookie = cookie.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddCookie[T]]
  }
  @scala.inline
  implicit class AddCookieOps[Self <: AddCookie[_], T] (val x: Self with AddCookie[T]) extends AnyVal {
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
    def setCookie(value: T): Self = this.set("cookie", value.asInstanceOf[js.Any])
  }
  
}

