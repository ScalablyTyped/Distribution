package typings
package ddDashTraceLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ReqRequest extends js.Object {
  /**
    * Hook to execute just before the request span finishes.
    */
  var request: js.UndefOr[
    js.Function3[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify opentracing.Span */ /* span */ js.UndefOr[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify opentracing.Span */ js.Any
      ], 
      /* req */ js.UndefOr[nodeLib.httpMod.ClientRequest], 
      /* res */ js.UndefOr[nodeLib.httpMod.IncomingMessage], 
      _
    ]
  ] = js.undefined
}

object Anon_ReqRequest {
  @scala.inline
  def apply(
    request: (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify opentracing.Span */ /* span */ js.UndefOr[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify opentracing.Span */ js.Any
    ], /* req */ js.UndefOr[nodeLib.httpMod.ClientRequest], /* res */ js.UndefOr[nodeLib.httpMod.IncomingMessage]) => _ = null
  ): Anon_ReqRequest = {
    val __obj = js.Dynamic.literal()
    if (request != null) __obj.updateDynamic("request")(js.Any.fromFunction3(request))
    __obj.asInstanceOf[Anon_ReqRequest]
  }
}

