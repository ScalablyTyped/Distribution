package typings.connectTimeout.mod

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("connect-timeout", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(timeout: String): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(timeout: String, options: TimeoutOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}
