package typings.connectDashTimeout.connectDashTimeoutMod

import typings.express.expressMod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("connect-timeout", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(timeout: String): RequestHandler = js.native
  def apply(timeout: String, options: TimeoutOptions): RequestHandler = js.native
}

