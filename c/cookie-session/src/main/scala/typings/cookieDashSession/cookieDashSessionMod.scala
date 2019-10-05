package typings.cookieDashSession

import typings.cookieDashSession.CookieSessionInterfaces.CookieSessionOptions
import typings.express.expressMod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cookie-session", JSImport.Namespace)
@js.native
object cookieDashSessionMod extends js.Object {
  def apply(): RequestHandler = js.native
  def apply(options: CookieSessionOptions): RequestHandler = js.native
}

