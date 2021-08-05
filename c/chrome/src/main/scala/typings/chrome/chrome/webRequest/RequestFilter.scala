package typings.chrome.chrome.webRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestFilter extends StObject {
  
  /** Optional. */
  var tabId: js.UndefOr[Double] = js.undefined
  
  /**
    * A list of request types. Requests that cannot match any of the types will be filtered out.
    */
  var types: js.UndefOr[js.Array[ResourceType]] = js.undefined
  
  /** A list of URLs or URL patterns. Requests that cannot match any of the URLs will be filtered out. */
  var urls: js.Array[String]
  
  /** Optional. */
  var windowId: js.UndefOr[Double] = js.undefined
}
object RequestFilter {
  
  inline def apply(urls: js.Array[String]): RequestFilter = {
    val __obj = js.Dynamic.literal(urls = urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestFilter]
  }
  
  extension [Self <: RequestFilter](x: Self) {
    
    inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    
    inline def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
    
    inline def setTypes(value: js.Array[ResourceType]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    inline def setTypesVarargs(value: ResourceType*): Self = StObject.set(x, "types", js.Array(value :_*))
    
    inline def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    inline def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value :_*))
    
    inline def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
    
    inline def setWindowIdUndefined: Self = StObject.set(x, "windowId", js.undefined)
  }
}
