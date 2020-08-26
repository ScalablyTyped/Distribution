package typings.cookie.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CookieParseOptions extends js.Object {
  /**
    * Specifies a function that will be used to decode a cookie's value. Since
    * the value of a cookie has a limited character set (and must be a simple
    * string), this function can be used to decode a previously-encoded cookie
    * value into a JavaScript string or other object.
    *
    * The default function is the global `decodeURIComponent`, which will decode
    * any URL-encoded sequences into their byte representations.
    *
    * *Note* if an error is thrown from this function, the original, non-decoded
    * cookie value will be returned as the cookie's value.
    */
  var decode: js.UndefOr[js.Function1[/* value */ String, String]] = js.native
}

object CookieParseOptions {
  @scala.inline
  def apply(): CookieParseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CookieParseOptions]
  }
  @scala.inline
  implicit class CookieParseOptionsOps[Self <: CookieParseOptions] (val x: Self) extends AnyVal {
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
    def setDecode(value: /* value */ String => String): Self = this.set("decode", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDecode: Self = this.set("decode", js.undefined)
  }
  
}

