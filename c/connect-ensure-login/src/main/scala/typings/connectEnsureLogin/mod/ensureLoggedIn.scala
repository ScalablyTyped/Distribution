package typings.connectEnsureLogin.mod

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("connect-ensure-login", "ensureLoggedIn")
@js.native
object ensureLoggedIn extends js.Object {
  def apply(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(options: String): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(options: LoggedInOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}

