package typings
package ddDashTraceLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ReqRequestRes extends js.Object {
  /**
    * Hook to execute just before the request span finishes.
    */
  var request: js.UndefOr[
    js.Function3[
      /* span */ js.UndefOr[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify opentracing.Span */ js.Any
      ], 
      /* req */ js.UndefOr[nodeLib.httpMod.IncomingMessage | nodeLib.httpMod.ClientRequest], 
      /* res */ js.UndefOr[nodeLib.httpMod.ServerResponse | nodeLib.httpMod.IncomingMessage], 
      _
    ]
  ] = js.undefined
}

object Anon_ReqRequestRes {
  @scala.inline
  def apply(
    request: (/* span */ js.UndefOr[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify opentracing.Span */ js.Any
    ], /* req */ js.UndefOr[nodeLib.httpMod.IncomingMessage | nodeLib.httpMod.ClientRequest], /* res */ js.UndefOr[nodeLib.httpMod.ServerResponse | nodeLib.httpMod.IncomingMessage]) => _ = null
  ): Anon_ReqRequestRes = {
    val __obj = js.Dynamic.literal()
    if (request != null) __obj.updateDynamic("request")(js.Any.fromFunction3(request))
    __obj.asInstanceOf[Anon_ReqRequestRes]
  }
}

