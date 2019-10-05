package typings.cookieDashParser.cookieDashParserMod

import typings.express.expressMod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cookie-parser", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): RequestHandler = js.native
  def apply(secret: String): RequestHandler = js.native
  def apply(secret: String, options: CookieParseOptions): RequestHandler = js.native
  def apply(secret: js.Array[String]): RequestHandler = js.native
  def apply(secret: js.Array[String], options: CookieParseOptions): RequestHandler = js.native
}

