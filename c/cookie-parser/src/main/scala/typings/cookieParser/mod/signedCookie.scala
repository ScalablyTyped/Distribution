package typings.cookieParser.mod

import typings.cookieParser.cookieParserBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cookie-parser", "signedCookie")
@js.native
object signedCookie extends js.Object {
  
  def apply(cookie: String, secret: String): String | `false` = js.native
  def apply(cookie: String, secret: js.Array[String]): String | `false` = js.native
}
