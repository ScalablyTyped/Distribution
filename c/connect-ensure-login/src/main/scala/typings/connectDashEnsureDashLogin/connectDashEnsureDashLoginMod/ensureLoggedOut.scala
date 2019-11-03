package typings.connectDashEnsureDashLogin.connectDashEnsureDashLoginMod

import typings.express.expressMod.RequestHandler
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("connect-ensure-login", "ensureLoggedOut")
@js.native
object ensureLoggedOut extends js.Object {
  def apply(): RequestHandler[ParamsDictionary] = js.native
  def apply(options: String): RequestHandler[ParamsDictionary] = js.native
  def apply(options: LoggedOutOptions): RequestHandler[ParamsDictionary] = js.native
}

