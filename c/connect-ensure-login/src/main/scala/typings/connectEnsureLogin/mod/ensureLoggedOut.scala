package typings.connectEnsureLogin.mod

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("connect-ensure-login", "ensureLoggedOut")
@js.native
object ensureLoggedOut extends js.Object {
  
  def apply(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(options: String): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(options: LoggedOutOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}
