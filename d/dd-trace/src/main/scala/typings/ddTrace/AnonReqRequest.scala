package typings.ddTrace

import typings.node.httpMod.ClientRequest
import typings.node.httpMod.IncomingMessage
import typings.opentracing.mod.Span
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReqRequest extends js.Object {
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

object AnonReqRequest {
  @scala.inline
  def apply(
    request: (/* span */ js.UndefOr[Span], /* req */ js.UndefOr[ClientRequest], /* res */ js.UndefOr[IncomingMessage]) => _ = null
  ): AnonReqRequest = {
    val __obj = js.Dynamic.literal()
    if (request != null) __obj.updateDynamic("request")(js.Any.fromFunction3(request))
    __obj.asInstanceOf[AnonReqRequest]
  }
}

