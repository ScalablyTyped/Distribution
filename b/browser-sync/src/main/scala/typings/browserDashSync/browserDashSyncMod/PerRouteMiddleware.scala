package typings.browserDashSync.browserDashSyncMod

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PerRouteMiddleware extends js.Object {
  @JSName("handle")
  var handle_Original: MiddlewareHandler = js.native
  var id: js.UndefOr[String] = js.native
  var route: String = js.native
  def handle(req: IncomingMessage, res: ServerResponse, next: js.Function0[Unit]): js.Any = js.native
}

