package typings.cypress.anon

import typings.cypress.Cypress.Encodings
import typings.cypress.Cypress.HttpMethod
import typings.cypress.Cypress.RequestBody
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<cypress.Cypress.RequestOptions> */
trait PartialRequestOptions extends StObject {
  
  var auth: js.UndefOr[js.Object] = js.undefined
  
  var body: js.UndefOr[RequestBody] = js.undefined
  
  var encoding: js.UndefOr[Encodings] = js.undefined
  
  var failOnStatusCode: js.UndefOr[Boolean] = js.undefined
  
  var followRedirect: js.UndefOr[Boolean] = js.undefined
  
  var form: js.UndefOr[Boolean] = js.undefined
  
  var gzip: js.UndefOr[Boolean] = js.undefined
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  var log: js.UndefOr[Boolean] = js.undefined
  
  var method: js.UndefOr[HttpMethod] = js.undefined
  
  var qs: js.UndefOr[js.Object] = js.undefined
  
  var retryOnNetworkFailure: js.UndefOr[Boolean] = js.undefined
  
  var retryOnStatusCodeFailure: js.UndefOr[Boolean] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object PartialRequestOptions {
  
  inline def apply(): PartialRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRequestOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialRequestOptions] (val x: Self) extends AnyVal {
    
    inline def setAuth(value: js.Object): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setBody(value: RequestBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setEncoding(value: Encodings): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setFailOnStatusCode(value: Boolean): Self = StObject.set(x, "failOnStatusCode", value.asInstanceOf[js.Any])
    
    inline def setFailOnStatusCodeUndefined: Self = StObject.set(x, "failOnStatusCode", js.undefined)
    
    inline def setFollowRedirect(value: Boolean): Self = StObject.set(x, "followRedirect", value.asInstanceOf[js.Any])
    
    inline def setFollowRedirectUndefined: Self = StObject.set(x, "followRedirect", js.undefined)
    
    inline def setForm(value: Boolean): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setGzip(value: Boolean): Self = StObject.set(x, "gzip", value.asInstanceOf[js.Any])
    
    inline def setGzipUndefined: Self = StObject.set(x, "gzip", js.undefined)
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setLog(value: Boolean): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
    
    inline def setMethod(value: HttpMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
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
