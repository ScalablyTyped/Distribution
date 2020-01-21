package typings.cors.mod

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cors", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): RequestHandler[ParamsDictionary] = js.native
  def apply(options: CorsOptions): RequestHandler[ParamsDictionary] = js.native
  def apply(options: CorsOptionsDelegate): RequestHandler[ParamsDictionary] = js.native
}

