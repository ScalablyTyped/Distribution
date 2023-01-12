package typings.cypress.Cypress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Full set of possible options for cy.request call
  */
trait RequestOptions
  extends StObject
     with Loggable
     with Timeoutable
     with Failable {
  
  var auth: js.Object
  
  var body: RequestBody
  
  var encoding: Encodings
  
  var followRedirect: Boolean
  
  var form: Boolean
  
  var gzip: Boolean
  
  var headers: js.Object
  
  var method: HttpMethod
  
  var qs: js.Object
  
  var url: String
}
object RequestOptions {
  
  inline def apply(
    auth: js.Object,
    body: RequestBody,
    failOnStatusCode: Boolean,
    followRedirect: Boolean,
    form: Boolean,
    gzip: Boolean,
    headers: js.Object,
    log: Boolean,
    method: HttpMethod,
    qs: js.Object,
    retryOnNetworkFailure: Boolean,
    retryOnStatusCodeFailure: Boolean,
    timeout: Double,
    url: String
  ): RequestOptions = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], failOnStatusCode = failOnStatusCode.asInstanceOf[js.Any], followRedirect = followRedirect.asInstanceOf[js.Any], form = form.asInstanceOf[js.Any], gzip = gzip.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], qs = qs.asInstanceOf[js.Any], retryOnNetworkFailure = retryOnNetworkFailure.asInstanceOf[js.Any], retryOnStatusCodeFailure = retryOnStatusCodeFailure.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], encoding = null)
    __obj.asInstanceOf[RequestOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestOptions] (val x: Self) extends AnyVal {
    
    inline def setAuth(value: js.Object): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setBody(value: RequestBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setEncoding(value: Encodings): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
    
    inline def setFollowRedirect(value: Boolean): Self = StObject.set(x, "followRedirect", value.asInstanceOf[js.Any])
    
    inline def setForm(value: Boolean): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setGzip(value: Boolean): Self = StObject.set(x, "gzip", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: HttpMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setQs(value: js.Object): Self = StObject.set(x, "qs", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
