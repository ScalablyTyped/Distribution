package typings
package cookieDashParserLib.cookieDashParserMod.cookieParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CookieParseOptions extends js.Object {
  var decode: js.UndefOr[js.Function1[/* val */ java.lang.String, java.lang.String]] = js.undefined
}

object CookieParseOptions {
  @scala.inline
  def apply(decode: js.Function1[/* val */ java.lang.String, java.lang.String] = null): CookieParseOptions = {
    val __obj = js.Dynamic.literal()
    if (decode != null) __obj.updateDynamic("decode")(decode)
    __obj.asInstanceOf[CookieParseOptions]
  }
}

