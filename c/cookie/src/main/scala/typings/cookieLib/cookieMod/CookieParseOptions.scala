package typings
package cookieLib.cookieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var decode: js.UndefOr[js.Function1[/* val */ java.lang.String, java.lang.String]] = js.undefined
}

object CookieParseOptions {
  @scala.inline
  def apply(decode: /* val */ java.lang.String => java.lang.String = null): CookieParseOptions = {
    val __obj = js.Dynamic.literal()
    if (decode != null) __obj.updateDynamic("decode")(js.Any.fromFunction1(decode))
    __obj.asInstanceOf[CookieParseOptions]
  }
}

