package typings.cypress.anon

import org.scalablytyped.runtime.StringDictionary
import typings.cypress.Cypress.AUTWindow
import typings.cypress.Cypress.Auth
import typings.cypress.Cypress.RequestBody
import typings.cypress.cypressStrings.GET
import typings.cypress.cypressStrings.POST
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<cypress.Cypress.VisitOptions> */
trait PartialVisitOptions extends StObject {
  
  var auth: js.UndefOr[Auth] = js.undefined
  
  var body: js.UndefOr[RequestBody] = js.undefined
  
  var failOnStatusCode: js.UndefOr[Boolean] = js.undefined
  
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var log: js.UndefOr[Boolean] = js.undefined
  
  var method: js.UndefOr[GET | POST] = js.undefined
  
  var onBeforeLoad: js.UndefOr[js.Function1[/* win */ AUTWindow, Unit]] = js.undefined
  
  var onLoad: js.UndefOr[js.Function1[/* win */ AUTWindow, Unit]] = js.undefined
  
  var qs: js.UndefOr[js.Object] = js.undefined
  
  var retryOnNetworkFailure: js.UndefOr[Boolean] = js.undefined
  
  var retryOnStatusCodeFailure: js.UndefOr[Boolean] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object PartialVisitOptions {
  
  inline def apply(): PartialVisitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialVisitOptions]
  }
  
  extension [Self <: PartialVisitOptions](x: Self) {
    
    inline def setAuth(value: Auth): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setBody(value: RequestBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setFailOnStatusCode(value: Boolean): Self = StObject.set(x, "failOnStatusCode", value.asInstanceOf[js.Any])
    
    inline def setFailOnStatusCodeUndefined: Self = StObject.set(x, "failOnStatusCode", js.undefined)
    
    inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setLog(value: Boolean): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
    
    inline def setMethod(value: GET | POST): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setOnBeforeLoad(value: /* win */ AUTWindow => Unit): Self = StObject.set(x, "onBeforeLoad", js.Any.fromFunction1(value))
    
    inline def setOnBeforeLoadUndefined: Self = StObject.set(x, "onBeforeLoad", js.undefined)
    
    inline def setOnLoad(value: /* win */ AUTWindow => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
    
    inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    inline def setQs(value: js.Object): Self = StObject.set(x, "qs", value.asInstanceOf[js.Any])
    
    inline def setQsUndefined: Self = StObject.set(x, "qs", js.undefined)
    
    inline def setRetryOnNetworkFailure(value: Boolean): Self = StObject.set(x, "retryOnNetworkFailure", value.asInstanceOf[js.Any])
    
    inline def setRetryOnNetworkFailureUndefined: Self = StObject.set(x, "retryOnNetworkFailure", js.undefined)
    
    inline def setRetryOnStatusCodeFailure(value: Boolean): Self = StObject.set(x, "retryOnStatusCodeFailure", value.asInstanceOf[js.Any])
    
    inline def setRetryOnStatusCodeFailureUndefined: Self = StObject.set(x, "retryOnStatusCodeFailure", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
