package typings.chromeApps.chrome.runtime

import typings.chromeApps.chrome.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchProvider extends StObject {
  
  var alternate_urls: js.UndefOr[js.Array[String]] = js.native
  
  var encoding: js.UndefOr[String] = js.native
  
  var favicon_url: js.UndefOr[String] = js.native
  
  var image_url: js.UndefOr[String] = js.native
  
  var image_url_post_params: js.UndefOr[String] = js.native
  
  var instant_url: js.UndefOr[String] = js.native
  
  var instant_url_post_params: js.UndefOr[String] = js.native
  
  var is_default: js.UndefOr[Boolean] = js.native
  
  var keyword: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var prepopulated_id: js.UndefOr[integer] = js.native
  
  var search_url: String = js.native
  
  var search_url_post_params: js.UndefOr[String] = js.native
  
  var suggest_url: js.UndefOr[String] = js.native
  
  var suggest_url_post_params: js.UndefOr[String] = js.native
}
object SearchProvider {
  
  @scala.inline
  def apply(search_url: String): SearchProvider = {
    val __obj = js.Dynamic.literal(search_url = search_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchProvider]
  }
  
  @scala.inline
  implicit class SearchProviderMutableBuilder[Self <: SearchProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlternate_urls(value: js.Array[String]): Self = StObject.set(x, "alternate_urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternate_urlsUndefined: Self = StObject.set(x, "alternate_urls", js.undefined)
    
    @scala.inline
    def setAlternate_urlsVarargs(value: String*): Self = StObject.set(x, "alternate_urls", js.Array(value :_*))
    
    @scala.inline
    def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    @scala.inline
    def setFavicon_url(value: String): Self = StObject.set(x, "favicon_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFavicon_urlUndefined: Self = StObject.set(x, "favicon_url", js.undefined)
    
    @scala.inline
    def setImage_url(value: String): Self = StObject.set(x, "image_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage_urlUndefined: Self = StObject.set(x, "image_url", js.undefined)
    
    @scala.inline
    def setImage_url_post_params(value: String): Self = StObject.set(x, "image_url_post_params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage_url_post_paramsUndefined: Self = StObject.set(x, "image_url_post_params", js.undefined)
    
    @scala.inline
    def setInstant_url(value: String): Self = StObject.set(x, "instant_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstant_urlUndefined: Self = StObject.set(x, "instant_url", js.undefined)
    
    @scala.inline
    def setInstant_url_post_params(value: String): Self = StObject.set(x, "instant_url_post_params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstant_url_post_paramsUndefined: Self = StObject.set(x, "instant_url_post_params", js.undefined)
    
    @scala.inline
    def setIs_default(value: Boolean): Self = StObject.set(x, "is_default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_defaultUndefined: Self = StObject.set(x, "is_default", js.undefined)
    
    @scala.inline
    def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeywordUndefined: Self = StObject.set(x, "keyword", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPrepopulated_id(value: integer): Self = StObject.set(x, "prepopulated_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrepopulated_idUndefined: Self = StObject.set(x, "prepopulated_id", js.undefined)
    
    @scala.inline
    def setSearch_url(value: String): Self = StObject.set(x, "search_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearch_url_post_params(value: String): Self = StObject.set(x, "search_url_post_params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearch_url_post_paramsUndefined: Self = StObject.set(x, "search_url_post_params", js.undefined)
    
    @scala.inline
    def setSuggest_url(value: String): Self = StObject.set(x, "suggest_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggest_urlUndefined: Self = StObject.set(x, "suggest_url", js.undefined)
    
    @scala.inline
    def setSuggest_url_post_params(value: String): Self = StObject.set(x, "suggest_url_post_params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggest_url_post_paramsUndefined: Self = StObject.set(x, "suggest_url_post_params", js.undefined)
  }
}
