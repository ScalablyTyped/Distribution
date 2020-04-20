package typings.cookieSession

import typings.cookieSession.CookieSessionInterfaces.CookieSessionOptions
import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cookie-session", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(options: CookieSessionOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}

