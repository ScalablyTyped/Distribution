package typings.chromeApps.chrome.webViewRequest

import typings.chromeApps.chrome.events.UrlFilter
import typings.chromeApps.chrome.webRequest.ResourceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestMatcherFields extends StObject {
  
  /**
    * Matches if the MIME media type of a response
    * (from the HTTP Content-Type header)
    * is contained in the list. */
  var contentType: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Matches if the MIME media type of a response
    * (from the HTTP Content-Type header) is not contained in the list.
    */
  var excludeContentType: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Matches if none of the request headers is matched by any of the HeaderFilters.
    */
  var excludeRequestHeaders: js.UndefOr[js.Array[HeaderFilter]] = js.undefined
  
  /**
    * Matches if none of the response headers is matched by any of the HeaderFilters.
    */
  var excludeResponseHeaders: js.UndefOr[js.Array[HeaderFilter]] = js.undefined
  
  /**
    * Matches if the conditions of the UrlFilter are fulfilled for the
    * 'first party' URL of the request. The 'first party' URL of a request,
    * when present, can be different from the request's target URL, and
    * describes what is considered 'first party' for the sake of third-party
    * checks for cookies.
    */
  var firstPartyForCookiesUrl: js.UndefOr[UrlFilter] = js.undefined
  
  /**
    * Matches if some of the request headers is matched by one of the HeaderFilters.
    */
  var requestHeaders: js.UndefOr[js.Array[HeaderFilter]] = js.undefined
  
  /**
    * Matches if the request type of a request is contained in the list.
    * Requests that cannot match any of the types will be filtered out. */
  var resourceType: js.UndefOr[js.Array[ResourceType]] = js.undefined
  
  /**
    * Matches if some of the response headers is matched by one of the HeaderFilters.
    */
  var responseHeaders: js.UndefOr[js.Array[HeaderFilter]] = js.undefined
  
  /**
    * Contains a list of strings describing stages.
    * If this attribute is present, then it limits the applicable stages to those listed.
    * Note that the whole condition is only applicable in stages compatible with all attributes. */
  var stages: js.UndefOr[js.Array[Stage]] = js.undefined
  
  /**
    * If set to true, matches requests that are subject to third-party cookie policies.
    * If set to false, matches all other requests.
    */
  var thirdPartyForCookies: js.UndefOr[Boolean] = js.undefined
  
  /** Matches if the conditions of the UrlFilter are fulfilled for the URL of the request. */
  var url: js.UndefOr[UrlFilter] = js.undefined
}
object RequestMatcherFields {
  
  inline def apply(): RequestMatcherFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestMatcherFields]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestMatcherFields] (val x: Self) extends AnyVal {
    
    inline def setContentType(value: js.Array[String]): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setContentTypeVarargs(value: String*): Self = StObject.set(x, "contentType", js.Array(value*))
    
    inline def setExcludeContentType(value: js.Array[String]): Self = StObject.set(x, "excludeContentType", value.asInstanceOf[js.Any])
    
    inline def setExcludeContentTypeUndefined: Self = StObject.set(x, "excludeContentType", js.undefined)
    
    inline def setExcludeContentTypeVarargs(value: String*): Self = StObject.set(x, "excludeContentType", js.Array(value*))
    
    inline def setExcludeRequestHeaders(value: js.Array[HeaderFilter]): Self = StObject.set(x, "excludeRequestHeaders", value.asInstanceOf[js.Any])
    
    inline def setExcludeRequestHeadersUndefined: Self = StObject.set(x, "excludeRequestHeaders", js.undefined)
    
    inline def setExcludeRequestHeadersVarargs(value: HeaderFilter*): Self = StObject.set(x, "excludeRequestHeaders", js.Array(value*))
    
    inline def setExcludeResponseHeaders(value: js.Array[HeaderFilter]): Self = StObject.set(x, "excludeResponseHeaders", value.asInstanceOf[js.Any])
    
    inline def setExcludeResponseHeadersUndefined: Self = StObject.set(x, "excludeResponseHeaders", js.undefined)
    
    inline def setExcludeResponseHeadersVarargs(value: HeaderFilter*): Self = StObject.set(x, "excludeResponseHeaders", js.Array(value*))
    
    inline def setFirstPartyForCookiesUrl(value: UrlFilter): Self = StObject.set(x, "firstPartyForCookiesUrl", value.asInstanceOf[js.Any])
    
    inline def setFirstPartyForCookiesUrlUndefined: Self = StObject.set(x, "firstPartyForCookiesUrl", js.undefined)
    
    inline def setRequestHeaders(value: js.Array[HeaderFilter]): Self = StObject.set(x, "requestHeaders", value.asInstanceOf[js.Any])
    
    inline def setRequestHeadersUndefined: Self = StObject.set(x, "requestHeaders", js.undefined)
    
    inline def setRequestHeadersVarargs(value: HeaderFilter*): Self = StObject.set(x, "requestHeaders", js.Array(value*))
    
    inline def setResourceType(value: js.Array[ResourceType]): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    inline def setResourceTypeVarargs(value: ResourceType*): Self = StObject.set(x, "resourceType", js.Array(value*))
    
    inline def setResponseHeaders(value: js.Array[HeaderFilter]): Self = StObject.set(x, "responseHeaders", value.asInstanceOf[js.Any])
    
    inline def setResponseHeadersUndefined: Self = StObject.set(x, "responseHeaders", js.undefined)
    
    inline def setResponseHeadersVarargs(value: HeaderFilter*): Self = StObject.set(x, "responseHeaders", js.Array(value*))
    
    inline def setStages(value: js.Array[Stage]): Self = StObject.set(x, "stages", value.asInstanceOf[js.Any])
    
    inline def setStagesUndefined: Self = StObject.set(x, "stages", js.undefined)
    
    inline def setStagesVarargs(value: Stage*): Self = StObject.set(x, "stages", js.Array(value*))
    
    inline def setThirdPartyForCookies(value: Boolean): Self = StObject.set(x, "thirdPartyForCookies", value.asInstanceOf[js.Any])
    
    inline def setThirdPartyForCookiesUndefined: Self = StObject.set(x, "thirdPartyForCookies", js.undefined)
    
    inline def setUrl(value: UrlFilter): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
