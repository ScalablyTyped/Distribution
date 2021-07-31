package typings.browserSync.mod

import typings.node.NodeJS.ErrnoException
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProxyOptions extends StObject {
  
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
  def apply(): ProxyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProxyOptions]
  }
  
  @scala.inline
  implicit class ProxyOptionsMutableBuilder[Self <: ProxyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: (/* err */ ErrnoException, /* req */ IncomingMessage, /* res */ ServerResponse) => Unit): Self = StObject.set(x, "error", js.Any.fromFunction3(value))
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setMiddleware(
      value: (/* req */ IncomingMessage, /* res */ ServerResponse, /* next */ js.Function0[Unit]) => js.Any
    ): Self = StObject.set(x, "middleware", js.Any.fromFunction3(value))
    
    @scala.inline
    def setMiddlewareUndefined: Self = StObject.set(x, "middleware", js.undefined)
    
    @scala.inline
    def setProxyReq(
      value: (js.Array[js.Function1[/* res */ IncomingMessage, Unit]]) | (js.Function1[/* res */ IncomingMessage, Unit])
    ): Self = StObject.set(x, "proxyReq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyReqFunction1(value: /* res */ IncomingMessage => Unit): Self = StObject.set(x, "proxyReq", js.Any.fromFunction1(value))
    
    @scala.inline
    def setProxyReqUndefined: Self = StObject.set(x, "proxyReq", js.undefined)
    
    @scala.inline
    def setProxyReqVarargs(value: (js.Function1[/* res */ IncomingMessage, Unit])*): Self = StObject.set(x, "proxyReq", js.Array(value :_*))
    
    @scala.inline
    def setProxyRes(value: ProxyResponseMiddleware | js.Array[ProxyResponseMiddleware]): Self = StObject.set(x, "proxyRes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyResFunction3(
      value: (/* proxyRes */ ServerResponse | IncomingMessage, /* res */ ServerResponse, /* req */ IncomingMessage) => Unit
    ): Self = StObject.set(x, "proxyRes", js.Any.fromFunction3(value))
    
    @scala.inline
    def setProxyResUndefined: Self = StObject.set(x, "proxyRes", js.undefined)
    
    @scala.inline
    def setProxyResVarargs(value: ProxyResponseMiddleware*): Self = StObject.set(x, "proxyRes", js.Array(value :_*))
    
    @scala.inline
    def setReqHeaders(value: /* config */ js.Object => Hash[js.Object]): Self = StObject.set(x, "reqHeaders", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReqHeadersUndefined: Self = StObject.set(x, "reqHeaders", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setWs(value: Boolean): Self = StObject.set(x, "ws", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWsUndefined: Self = StObject.set(x, "ws", js.undefined)
  }
}
