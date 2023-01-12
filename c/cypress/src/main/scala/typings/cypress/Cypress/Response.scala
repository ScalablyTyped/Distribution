package typings.cypress.Cypress

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Response[T] extends StObject {
  
  var allRequestResponses: js.Array[Any]
  
  var body: T
  
  var duration: Double
  
  var headers: StringDictionary[String | js.Array[String]]
  
  var isOkStatusCode: Boolean
  
  var redirectedToUrl: js.UndefOr[String] = js.undefined
  
  var redirects: js.UndefOr[js.Array[String]] = js.undefined
  
  var requestHeaders: StringDictionary[String]
  
  var status: Double
  
  var statusText: String
}
object Response {
  
  inline def apply[T](
    allRequestResponses: js.Array[Any],
    body: T,
    duration: Double,
    headers: StringDictionary[String | js.Array[String]],
    isOkStatusCode: Boolean,
    requestHeaders: StringDictionary[String],
    status: Double,
    statusText: String
  ): Response[T] = {
    val __obj = js.Dynamic.literal(allRequestResponses = allRequestResponses.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], isOkStatusCode = isOkStatusCode.asInstanceOf[js.Any], requestHeaders = requestHeaders.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Response[?], T] (val x: Self & Response[T]) extends AnyVal {
    
    inline def setAllRequestResponses(value: js.Array[Any]): Self = StObject.set(x, "allRequestResponses", value.asInstanceOf[js.Any])
    
    inline def setAllRequestResponsesVarargs(value: Any*): Self = StObject.set(x, "allRequestResponses", js.Array(value*))
    
    inline def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: StringDictionary[String | js.Array[String]]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setIsOkStatusCode(value: Boolean): Self = StObject.set(x, "isOkStatusCode", value.asInstanceOf[js.Any])
    
    inline def setRedirectedToUrl(value: String): Self = StObject.set(x, "redirectedToUrl", value.asInstanceOf[js.Any])
    
    inline def setRedirectedToUrlUndefined: Self = StObject.set(x, "redirectedToUrl", js.undefined)
    
    inline def setRedirects(value: js.Array[String]): Self = StObject.set(x, "redirects", value.asInstanceOf[js.Any])
    
    inline def setRedirectsUndefined: Self = StObject.set(x, "redirects", js.undefined)
    
    inline def setRedirectsVarargs(value: String*): Self = StObject.set(x, "redirects", js.Array(value*))
    
    inline def setRequestHeaders(value: StringDictionary[String]): Self = StObject.set(x, "requestHeaders", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
  }
}
