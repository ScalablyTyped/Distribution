package typings
package cookieDashParserLib.cookieDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cookie-parser", JSImport.Namespace)
@js.native
object cookieDashParserModMembers extends js.Object {
  def apply(): expressLib.expressMod.eNs.RequestHandler = js.native
  def apply(secret: java.lang.String | js.Array[java.lang.String]): expressLib.expressMod.eNs.RequestHandler = js.native
  def apply(
    secret: java.lang.String | js.Array[java.lang.String],
    options: cookieDashParserLib.cookieDashParserMod.cookieParserNs.CookieParseOptions
  ): expressLib.expressMod.eNs.RequestHandler = js.native
  def JSONCookie(jsonCookie: java.lang.String): js.UndefOr[js.Object] = js.native
  def JSONCookies[T /* <: ScalablyTyped.runtime.StringDictionary[java.lang.String] */](jsonCookies: T): cookieDashParserLib.cookieDashParserLibStrings.JSONCookies with js.Any = js.native
  def signedCookie(cookie: java.lang.String, secret: java.lang.String): java.lang.String | cookieDashParserLib.cookieDashParserLibNumbers.`false` = js.native
  def signedCookie(cookie: java.lang.String, secret: js.Array[java.lang.String]): java.lang.String | cookieDashParserLib.cookieDashParserLibNumbers.`false` = js.native
  def signedCookies[T /* <: ScalablyTyped.runtime.StringDictionary[java.lang.String] */](cookies: T, secret: java.lang.String): cookieDashParserLib.cookieDashParserLibStrings.signedCookies with js.Any = js.native
  def signedCookies[T /* <: ScalablyTyped.runtime.StringDictionary[java.lang.String] */](cookies: T, secret: js.Array[java.lang.String]): cookieDashParserLib.cookieDashParserLibStrings.signedCookies with js.Any = js.native
}

