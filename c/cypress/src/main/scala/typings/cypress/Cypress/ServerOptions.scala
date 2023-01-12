package typings.cypress.Cypress

import typings.std.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Setting default options for cy.server()
  * @see https://on.cypress.io/server
  */
trait ServerOptions extends StObject {
  
  var delay: Double
  
  var enable: Boolean
  
  var force404: Boolean
  
  var headers: js.Object
  
  def ignore(xhr: Request): Unit
  
  var method: HttpMethod
  
  def onAbort(args: Any*): Unit
  
  def onAnyAbort(route: RouteOptions, proxy: Any): Unit
  
  def onAnyRequest(route: RouteOptions, proxy: Any): Unit
  
  def onAnyResponse(route: RouteOptions, proxy: Any): Unit
  
  def onRequest(args: Any*): Unit
  
  def onResponse(args: Any*): Unit
  
  var response: Any
  
  var status: Double
  
  var urlMatchingOptions: js.Object
}
object ServerOptions {
  
  inline def apply(
    delay: Double,
    enable: Boolean,
    force404: Boolean,
    headers: js.Object,
    ignore: Request => Unit,
    method: HttpMethod,
    onAbort: /* repeated */ Any => Unit,
    onAnyAbort: (RouteOptions, Any) => Unit,
    onAnyRequest: (RouteOptions, Any) => Unit,
    onAnyResponse: (RouteOptions, Any) => Unit,
    onRequest: /* repeated */ Any => Unit,
    onResponse: /* repeated */ Any => Unit,
    response: Any,
    status: Double,
    urlMatchingOptions: js.Object
  ): ServerOptions = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any], force404 = force404.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], ignore = js.Any.fromFunction1(ignore), method = method.asInstanceOf[js.Any], onAbort = js.Any.fromFunction1(onAbort), onAnyAbort = js.Any.fromFunction2(onAnyAbort), onAnyRequest = js.Any.fromFunction2(onAnyRequest), onAnyResponse = js.Any.fromFunction2(onAnyResponse), onRequest = js.Any.fromFunction1(onRequest), onResponse = js.Any.fromFunction1(onResponse), response = response.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], urlMatchingOptions = urlMatchingOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServerOptions] (val x: Self) extends AnyVal {
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    inline def setForce404(value: Boolean): Self = StObject.set(x, "force404", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setIgnore(value: Request => Unit): Self = StObject.set(x, "ignore", js.Any.fromFunction1(value))
    
    inline def setMethod(value: HttpMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setOnAbort(value: /* repeated */ Any => Unit): Self = StObject.set(x, "onAbort", js.Any.fromFunction1(value))
    
    inline def setOnAnyAbort(value: (RouteOptions, Any) => Unit): Self = StObject.set(x, "onAnyAbort", js.Any.fromFunction2(value))
    
    inline def setOnAnyRequest(value: (RouteOptions, Any) => Unit): Self = StObject.set(x, "onAnyRequest", js.Any.fromFunction2(value))
    
    inline def setOnAnyResponse(value: (RouteOptions, Any) => Unit): Self = StObject.set(x, "onAnyResponse", js.Any.fromFunction2(value))
    
    inline def setOnRequest(value: /* repeated */ Any => Unit): Self = StObject.set(x, "onRequest", js.Any.fromFunction1(value))
    
    inline def setOnResponse(value: /* repeated */ Any => Unit): Self = StObject.set(x, "onResponse", js.Any.fromFunction1(value))
    
    inline def setResponse(value: Any): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setUrlMatchingOptions(value: js.Object): Self = StObject.set(x, "urlMatchingOptions", value.asInstanceOf[js.Any])
  }
}
