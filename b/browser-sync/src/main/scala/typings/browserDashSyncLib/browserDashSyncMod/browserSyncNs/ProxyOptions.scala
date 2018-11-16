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

