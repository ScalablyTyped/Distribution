package typings.ddDashTrace

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.opentracing.opentracingMod.Span
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Req extends js.Object {
  /**
    * Hook to execute just before the request span finishes.
    */
  var request: js.UndefOr[
    js.Function3[
      /* span */ js.UndefOr[Span], 
      /* req */ js.UndefOr[IncomingMessage], 
      /* res */ js.UndefOr[ServerResponse], 
      _
    ]
  ] = js.undefined
}

object Anon_Req {
  @scala.inline
  def apply(
    request: (/* span */ js.UndefOr[Span], /* req */ js.UndefOr[IncomingMessage], /* res */ js.UndefOr[ServerResponse]) => _ = null
  ): Anon_Req = {
    val __obj = js.Dynamic.literal()
    if (request != null) __obj.updateDynamic("request")(js.Any.fromFunction3(request))
    __obj.asInstanceOf[Anon_Req]
  }
}

