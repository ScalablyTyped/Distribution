package typings
package browserDashSyncLib.browserDashSyncMod.browserSyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxyOptions extends js.Object {
  var error: js.UndefOr[
    js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* req */ nodeLib.httpMod.IncomingMessage, 
      /* res */ nodeLib.httpMod.ServerResponse, 
      scala.Unit
    ]
  ] = js.undefined
  var middleware: js.UndefOr[MiddlewareHandler] = js.undefined
  var proxyReq: js.UndefOr[
    (js.Array[js.Function1[/* res */ nodeLib.httpMod.IncomingMessage, scala.Unit]]) | (js.Function1[/* res */ nodeLib.httpMod.IncomingMessage, scala.Unit])
  ] = js.undefined
  var proxyRes: js.UndefOr[ProxyResponseMiddleware | js.Array[ProxyResponseMiddleware]] = js.undefined
  var reqHeaders: js.UndefOr[js.Function1[/* config */ js.Object, Hash[js.Object]]] = js.undefined
  var target: js.UndefOr[java.lang.String] = js.undefined
  var ws: js.UndefOr[scala.Boolean] = js.undefined
}

object ProxyOptions {
  @scala.inline
  def apply(
    error: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* req */ nodeLib.httpMod.IncomingMessage, 
      /* res */ nodeLib.httpMod.ServerResponse, 
      scala.Unit
    ] = null,
    middleware: MiddlewareHandler = null,
    proxyReq: (js.Array[js.Function1[/* res */ nodeLib.httpMod.IncomingMessage, scala.Unit]]) | (js.Function1[/* res */ nodeLib.httpMod.IncomingMessage, scala.Unit]) = null,
    proxyRes: ProxyResponseMiddleware | js.Array[ProxyResponseMiddleware] = null,
    reqHeaders: js.Function1[/* config */ js.Object, Hash[js.Object]] = null,
    target: java.lang.String = null,
    ws: js.UndefOr[scala.Boolean] = js.undefined
  ): ProxyOptions = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (middleware != null) __obj.updateDynamic("middleware")(middleware)
    if (proxyReq != null) __obj.updateDynamic("proxyReq")(proxyReq.asInstanceOf[js.Any])
    if (proxyRes != null) __obj.updateDynamic("proxyRes")(proxyRes.asInstanceOf[js.Any])
    if (reqHeaders != null) __obj.updateDynamic("reqHeaders")(reqHeaders)
    if (target != null) __obj.updateDynamic("target")(target)
    if (!js.isUndefined(ws)) __obj.updateDynamic("ws")(ws)
    __obj.asInstanceOf[ProxyOptions]
  }
}

