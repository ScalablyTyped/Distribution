package typings.connectDashEnsureDashLogin.connectDashEnsureDashLoginMod

import typings.express.expressMod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("connect-ensure-login", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def ensureLoggedIn(): RequestHandler = js.native
  def ensureLoggedIn(options: String): RequestHandler = js.native
  def ensureLoggedIn(options: LoggedInOptions): RequestHandler = js.native
  def ensureLoggedOut(): RequestHandler = js.native
  def ensureLoggedOut(options: String): RequestHandler = js.native
  def ensureLoggedOut(options: LoggedOutOptions): RequestHandler = js.native
}

