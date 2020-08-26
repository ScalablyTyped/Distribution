package typings.browserSync.mod

import typings.node.NodeJS.ErrnoException
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProxyOptions extends js.Object {
  var error: js.UndefOr[
    js.Function3[/* err */ ErrnoException, /* req */ IncomingMessage, /* res */ ServerResponse, Unit]
  ] = js.native
  var middleware: js.UndefOr[MiddlewareHandler] = js.native
  var proxyReq: js.UndefOr[
    (js.Array[js.Function1[/* res */ IncomingMessage, Unit]]) | (js.Function1[/* res */ IncomingMessage, Unit])
  ] = js.native
  var proxyRes: js.UndefOr[ProxyResponseMiddleware | js.Array[ProxyResponseMiddleware]] = js.native
  var reqHeaders: js.UndefOr[js.Function1[/* config */ js.Object, Hash[js.Object]]] = js.native
  var target: js.UndefOr[String] = js.native
  var ws: js.UndefOr[Boolean] = js.native
}

object ProxyOptions {
  @scala.inline
  def apply(): ProxyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProxyOptions]
  }
  @scala.inline
  implicit class ProxyOptionsOps[Self <: ProxyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setError(value: (/* err */ ErrnoException, /* req */ IncomingMessage, /* res */ ServerResponse) => Unit): Self = this.set("error", js.Any.fromFunction3(value))
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setMiddleware(
      value: (/* req */ IncomingMessage, /* res */ ServerResponse, /* next */ js.Function0[Unit]) => js.Any
    ): Self = this.set("middleware", js.Any.fromFunction3(value))
    @scala.inline
    def deleteMiddleware: Self = this.set("middleware", js.undefined)
    @scala.inline
    def setProxyReqVarargs(value: (js.Function1[/* res */ IncomingMessage, Unit])*): Self = this.set("proxyReq", js.Array(value :_*))
    @scala.inline
    def setProxyReqFunction1(value: /* res */ IncomingMessage => Unit): Self = this.set("proxyReq", js.Any.fromFunction1(value))
    @scala.inline
    def setProxyReq(
      value: (js.Array[js.Function1[/* res */ IncomingMessage, Unit]]) | (js.Function1[/* res */ IncomingMessage, Unit])
    ): Self = this.set("proxyReq", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProxyReq: Self = this.set("proxyReq", js.undefined)
    @scala.inline
    def setProxyResVarargs(value: ProxyResponseMiddleware*): Self = this.set("proxyRes", js.Array(value :_*))
    @scala.inline
    def setProxyResFunction3(
      value: (/* proxyRes */ ServerResponse | IncomingMessage, /* res */ ServerResponse, /* req */ IncomingMessage) => Unit
    ): Self = this.set("proxyRes", js.Any.fromFunction3(value))
    @scala.inline
    def setProxyRes(value: ProxyResponseMiddleware | js.Array[ProxyResponseMiddleware]): Self = this.set("proxyRes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProxyRes: Self = this.set("proxyRes", js.undefined)
    @scala.inline
    def setReqHeaders(value: /* config */ js.Object => Hash[js.Object]): Self = this.set("reqHeaders", js.Any.fromFunction1(value))
    @scala.inline
    def deleteReqHeaders: Self = this.set("reqHeaders", js.undefined)
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setWs(value: Boolean): Self = this.set("ws", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWs: Self = this.set("ws", js.undefined)
  }
  
}

