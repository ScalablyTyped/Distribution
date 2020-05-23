package typings.browserSync.mod

import typings.node.NodeJS.ErrnoException
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxyOptions extends js.Object {
  var error: js.UndefOr[
    js.Function3[/* err */ ErrnoException, /* req */ IncomingMessage, /* res */ ServerResponse, Unit]
  ] = js.undefined
  var middleware: js.UndefOr[MiddlewareHandler] = js.undefined
  var proxyReq: js.UndefOr[
    (js.Array[js.Function1[/* res */ IncomingMessage, Unit]]) | (js.Function1[/* res */ IncomingMessage, Unit])
  ] = js.undefined
  var proxyRes: js.UndefOr[ProxyResponseMiddleware | js.Array[ProxyResponseMiddleware]] = js.undefined
  var reqHeaders: js.UndefOr[js.Function1[/* config */ js.Object, Hash[js.Object]]] = js.undefined
  var target: js.UndefOr[String] = js.undefined
  var ws: js.UndefOr[Boolean] = js.undefined
}

object ProxyOptions {
  @scala.inline
  def apply(
    error: (/* err */ ErrnoException, /* req */ IncomingMessage, /* res */ ServerResponse) => Unit = null,
    middleware: (/* req */ IncomingMessage, /* res */ ServerResponse, /* next */ js.Function0[Unit]) => js.Any = null,
    proxyReq: (js.Array[js.Function1[/* res */ IncomingMessage, Unit]]) | (js.Function1[/* res */ IncomingMessage, Unit]) = null,
    proxyRes: ProxyResponseMiddleware | js.Array[ProxyResponseMiddleware] = null,
    reqHeaders: /* config */ js.Object => Hash[js.Object] = null,
    target: String = null,
    ws: js.UndefOr[Boolean] = js.undefined
  ): ProxyOptions = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction3(error))
    if (middleware != null) __obj.updateDynamic("middleware")(js.Any.fromFunction3(middleware))
    if (proxyReq != null) __obj.updateDynamic("proxyReq")(proxyReq.asInstanceOf[js.Any])
    if (proxyRes != null) __obj.updateDynamic("proxyRes")(proxyRes.asInstanceOf[js.Any])
    if (reqHeaders != null) __obj.updateDynamic("reqHeaders")(js.Any.fromFunction1(reqHeaders))
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (!js.isUndefined(ws)) __obj.updateDynamic("ws")(ws.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxyOptions]
  }
}

