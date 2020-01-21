package typings.cookieParser.mod

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cookie-parser", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): RequestHandler[ParamsDictionary] = js.native
  def apply(secret: String): RequestHandler[ParamsDictionary] = js.native
  def apply(secret: String, options: CookieParseOptions): RequestHandler[ParamsDictionary] = js.native
  def apply(secret: js.Array[String]): RequestHandler[ParamsDictionary] = js.native
  def apply(secret: js.Array[String], options: CookieParseOptions): RequestHandler[ParamsDictionary] = js.native
}

