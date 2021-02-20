package typings.chrome.anon

import typings.chrome.chrome.runtime.SearchProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Homepage extends StObject {
  
  var homepage: js.UndefOr[String] = js.native
  
  var search_provider: js.UndefOr[SearchProvider] = js.native
  
  var startup_pages: js.UndefOr[js.Array[String]] = js.native
}
object Homepage {
  
  @scala.inline
  def apply(): Homepage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Homepage]
  }
  
  @scala.inline
  implicit class HomepageMutableBuilder[Self <: Homepage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHomepage(value: String): Self = StObject.set(x, "homepage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomepageUndefined: Self = StObject.set(x, "homepage", js.undefined)
    
    @scala.inline
    def setSearch_provider(value: SearchProvider): Self = StObject.set(x, "search_provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearch_providerUndefined: Self = StObject.set(x, "search_provider", js.undefined)
    
    @scala.inline
    def setStartup_pages(value: js.Array[String]): Self = StObject.set(x, "startup_pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartup_pagesUndefined: Self = StObject.set(x, "startup_pages", js.undefined)
    
    @scala.inline
    def setStartup_pagesVarargs(value: String*): Self = StObject.set(x, "startup_pages", js.Array(value :_*))
  }
}
