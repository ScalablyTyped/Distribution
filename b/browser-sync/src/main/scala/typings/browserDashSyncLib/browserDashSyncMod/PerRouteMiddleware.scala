package typings
package browserDashSyncLib.browserDashSyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PerRouteMiddleware extends js.Object {
  @JSName("handle")
  var handle_Original: MiddlewareHandler = js.native
  var id: js.UndefOr[java.lang.String] = js.native
  var route: java.lang.String = js.native
  def handle(
    req: nodeLib.httpMod.IncomingMessage,
    res: nodeLib.httpMod.ServerResponse,
    next: js.Function0[scala.Unit]
  ): js.Any = js.native
}

