package typings.ddTrace

import typings.node.httpMod.ClientRequest
import typings.node.httpMod.IncomingMessage
import typings.opentracing.mod.Span
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0 extends js.Object {
  /**
    * Hook to execute just before the request span finishes.
    */
  var request: js.UndefOr[
    js.Function3[
      /* span */ js.UndefOr[Span], 
      /* req */ js.UndefOr[ClientRequest], 
      /* res */ js.UndefOr[IncomingMessage], 
      _
    ]
  ] = js.undefined
}

object Anon0 {
  @scala.inline
  def apply(
    request: (/* span */ js.UndefOr[Span], /* req */ js.UndefOr[ClientRequest], /* res */ js.UndefOr[IncomingMessage]) => _ = null
  ): Anon0 = {
    val __obj = js.Dynamic.literal()
    if (request != null) __obj.updateDynamic("request")(js.Any.fromFunction3(request))
    __obj.asInstanceOf[Anon0]
  }
}

