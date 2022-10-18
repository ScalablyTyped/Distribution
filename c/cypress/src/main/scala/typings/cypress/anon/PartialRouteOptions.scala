package typings.cypress.anon

import typings.cypress.Cypress.HttpMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<cypress.Cypress.RouteOptions> */
trait PartialRouteOptions extends StObject {
  
  var delay: js.UndefOr[Double] = js.undefined
  
  var force404: js.UndefOr[Boolean] = js.undefined
  
  var headers: js.UndefOr[js.Object | Null] = js.undefined
  
  var method: js.UndefOr[HttpMethod] = js.undefined
  
  var onAbort: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
  
  var onRequest: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
  
  var onResponse: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
  
  var response: js.UndefOr[Any] = js.undefined
  
  var status: js.UndefOr[Double] = js.undefined
  
  var url: js.UndefOr[String | js.RegExp] = js.undefined
}
object PartialRouteOptions {
  
  inline def apply(): PartialRouteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRouteOptions]
  }
  
  extension [Self <: PartialRouteOptions](x: Self) {
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setForce404(value: Boolean): Self = StObject.set(x, "force404", value.asInstanceOf[js.Any])
    
    inline def setForce404Undefined: Self = StObject.set(x, "force404", js.undefined)
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersNull: Self = StObject.set(x, "headers", null)
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setMethod(value: HttpMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setOnAbort(value: /* repeated */ Any => Unit): Self = StObject.set(x, "onAbort", js.Any.fromFunction1(value))
    
    inline def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
    
    inline def setOnRequest(value: /* repeated */ Any => Unit): Self = StObject.set(x, "onRequest", js.Any.fromFunction1(value))
    
    inline def setOnRequestUndefined: Self = StObject.set(x, "onRequest", js.undefined)
    
    inline def setOnResponse(value: /* repeated */ Any => Unit): Self = StObject.set(x, "onResponse", js.Any.fromFunction1(value))
    
    inline def setOnResponseUndefined: Self = StObject.set(x, "onResponse", js.undefined)
    
    inline def setResponse(value: Any): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setUrl(value: String | js.RegExp): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
