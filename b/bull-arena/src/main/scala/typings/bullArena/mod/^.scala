package typings.bullArena.mod

import typings.bullArena.mod.BullArena.MiddlewareListenOptions
import typings.bullArena.mod.BullArena.MiddlewareOptions
import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bull-arena", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(options: MiddlewareOptions): RequestHandler[ParamsDictionary] = js.native
  def apply(options: MiddlewareOptions, listenOptions: MiddlewareListenOptions): RequestHandler[ParamsDictionary] = js.native
}

