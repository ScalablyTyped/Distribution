package typings.chrome.anon

import typings.chrome.chrome.runtime.SearchProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Homepage extends StObject {
  
  var homepage: js.UndefOr[String] = js.undefined
  
  var search_provider: js.UndefOr[SearchProvider] = js.undefined
  
  var startup_pages: js.UndefOr[js.Array[String]] = js.undefined
}
object Homepage {
  
  inline def apply(): Homepage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Homepage]
  }
  
  extension [Self <: Homepage](x: Self) {
    
    inline def setHomepage(value: String): Self = StObject.set(x, "homepage", value.asInstanceOf[js.Any])
    
    inline def setHomepageUndefined: Self = StObject.set(x, "homepage", js.undefined)
    
    inline def setSearch_provider(value: SearchProvider): Self = StObject.set(x, "search_provider", value.asInstanceOf[js.Any])
    
    inline def setSearch_providerUndefined: Self = StObject.set(x, "search_provider", js.undefined)
    
    inline def setStartup_pages(value: js.Array[String]): Self = StObject.set(x, "startup_pages", value.asInstanceOf[js.Any])
    
    inline def setStartup_pagesUndefined: Self = StObject.set(x, "startup_pages", js.undefined)
    
    inline def setStartup_pagesVarargs(value: String*): Self = StObject.set(x, "startup_pages", js.Array(value*))
  }
}
