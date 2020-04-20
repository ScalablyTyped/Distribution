package typings.connectModrewrite

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("connect-modrewrite", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(rewrites: js.Array[String]): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}

