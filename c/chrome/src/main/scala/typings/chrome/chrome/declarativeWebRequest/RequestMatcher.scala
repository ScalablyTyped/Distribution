package typings.chrome.chrome.declarativeWebRequest

import typings.chrome.chrome.events.UrlFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestMatcher extends StObject {
  
  var contentType: js.UndefOr[js.Array[String]] = js.undefined
  
  var excludeContentType: js.UndefOr[js.Array[String]] = js.undefined
  
  var excludeResponseHeader: js.UndefOr[js.Array[HeaderFilter]] = js.undefined
  
  var resourceType: js.UndefOr[String] = js.undefined
  
  var responseHeaders: js.UndefOr[js.Array[HeaderFilter]] = js.undefined
  
  var url: js.UndefOr[UrlFilter] = js.undefined
}
object RequestMatcher {
  
  inline def apply(): RequestMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestMatcher]
  }
  
  extension [Self <: RequestMatcher](x: Self) {
    
    inline def setContentType(value: js.Array[String]): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setContentTypeVarargs(value: String*): Self = StObject.set(x, "contentType", js.Array(value :_*))
    
    inline def setExcludeContentType(value: js.Array[String]): Self = StObject.set(x, "excludeContentType", value.asInstanceOf[js.Any])
    
    inline def setExcludeContentTypeUndefined: Self = StObject.set(x, "excludeContentType", js.undefined)
    
    inline def setExcludeContentTypeVarargs(value: String*): Self = StObject.set(x, "excludeContentType", js.Array(value :_*))
    
    inline def setExcludeResponseHeader(value: js.Array[HeaderFilter]): Self = StObject.set(x, "excludeResponseHeader", value.asInstanceOf[js.Any])
    
    inline def setExcludeResponseHeaderUndefined: Self = StObject.set(x, "excludeResponseHeader", js.undefined)
    
    inline def setExcludeResponseHeaderVarargs(value: HeaderFilter*): Self = StObject.set(x, "excludeResponseHeader", js.Array(value :_*))
    
    inline def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    inline def setResponseHeaders(value: js.Array[HeaderFilter]): Self = StObject.set(x, "responseHeaders", value.asInstanceOf[js.Any])
    
    inline def setResponseHeadersUndefined: Self = StObject.set(x, "responseHeaders", js.undefined)
    
    inline def setResponseHeadersVarargs(value: HeaderFilter*): Self = StObject.set(x, "responseHeaders", js.Array(value :_*))
    
    inline def setUrl(value: UrlFilter): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
