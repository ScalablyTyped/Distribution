package typings.cookieDashParser.cookieDashParserMod

import typings.cookieDashParser.cookieDashParserNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cookie-parser", "signedCookie")
@js.native
object signedCookie extends js.Object {
  def apply(cookie: String, secret: String): String | `false` = js.native
  def apply(cookie: String, secret: js.Array[String]): String | `false` = js.native
}

