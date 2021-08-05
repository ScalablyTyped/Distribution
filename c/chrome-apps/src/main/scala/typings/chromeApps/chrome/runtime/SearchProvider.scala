package typings.chromeApps.chrome.runtime

import typings.chromeApps.chrome.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchProvider extends StObject {
  
  var alternate_urls: js.UndefOr[js.Array[String]] = js.undefined
  
  var encoding: js.UndefOr[String] = js.undefined
  
  var favicon_url: js.UndefOr[String] = js.undefined
  
  var image_url: js.UndefOr[String] = js.undefined
  
  var image_url_post_params: js.UndefOr[String] = js.undefined
  
  var instant_url: js.UndefOr[String] = js.undefined
  
  var instant_url_post_params: js.UndefOr[String] = js.undefined
  
  var is_default: js.UndefOr[Boolean] = js.undefined
  
  var keyword: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var prepopulated_id: js.UndefOr[integer] = js.undefined
  
  var search_url: String
  
  var search_url_post_params: js.UndefOr[String] = js.undefined
  
  var suggest_url: js.UndefOr[String] = js.undefined
  
  var suggest_url_post_params: js.UndefOr[String] = js.undefined
}
object SearchProvider {
  
  inline def apply(search_url: String): SearchProvider = {
    val __obj = js.Dynamic.literal(search_url = search_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchProvider]
  }
  
  extension [Self <: SearchProvider](x: Self) {
    
    inline def setAlternate_urls(value: js.Array[String]): Self = StObject.set(x, "alternate_urls", value.asInstanceOf[js.Any])
    
    inline def setAlternate_urlsUndefined: Self = StObject.set(x, "alternate_urls", js.undefined)
    
    inline def setAlternate_urlsVarargs(value: String*): Self = StObject.set(x, "alternate_urls", js.Array(value :_*))
    
    inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setFavicon_url(value: String): Self = StObject.set(x, "favicon_url", value.asInstanceOf[js.Any])
    
    inline def setFavicon_urlUndefined: Self = StObject.set(x, "favicon_url", js.undefined)
    
    inline def setImage_url(value: String): Self = StObject.set(x, "image_url", value.asInstanceOf[js.Any])
    
    inline def setImage_urlUndefined: Self = StObject.set(x, "image_url", js.undefined)
    
    inline def setImage_url_post_params(value: String): Self = StObject.set(x, "image_url_post_params", value.asInstanceOf[js.Any])
    
    inline def setImage_url_post_paramsUndefined: Self = StObject.set(x, "image_url_post_params", js.undefined)
    
    inline def setInstant_url(value: String): Self = StObject.set(x, "instant_url", value.asInstanceOf[js.Any])
    
    inline def setInstant_urlUndefined: Self = StObject.set(x, "instant_url", js.undefined)
    
    inline def setInstant_url_post_params(value: String): Self = StObject.set(x, "instant_url_post_params", value.asInstanceOf[js.Any])
    
    inline def setInstant_url_post_paramsUndefined: Self = StObject.set(x, "instant_url_post_params", js.undefined)
    
    inline def setIs_default(value: Boolean): Self = StObject.set(x, "is_default", value.asInstanceOf[js.Any])
    
    inline def setIs_defaultUndefined: Self = StObject.set(x, "is_default", js.undefined)
    
    inline def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
    
    inline def setKeywordUndefined: Self = StObject.set(x, "keyword", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPrepopulated_id(value: integer): Self = StObject.set(x, "prepopulated_id", value.asInstanceOf[js.Any])
    
    inline def setPrepopulated_idUndefined: Self = StObject.set(x, "prepopulated_id", js.undefined)
    
    inline def setSearch_url(value: String): Self = StObject.set(x, "search_url", value.asInstanceOf[js.Any])
    
    inline def setSearch_url_post_params(value: String): Self = StObject.set(x, "search_url_post_params", value.asInstanceOf[js.Any])
    
    inline def setSearch_url_post_paramsUndefined: Self = StObject.set(x, "search_url_post_params", js.undefined)
    
    inline def setSuggest_url(value: String): Self = StObject.set(x, "suggest_url", value.asInstanceOf[js.Any])
    
    inline def setSuggest_urlUndefined: Self = StObject.set(x, "suggest_url", js.undefined)
    
    inline def setSuggest_url_post_params(value: String): Self = StObject.set(x, "suggest_url_post_params", value.asInstanceOf[js.Any])
    
    inline def setSuggest_url_post_paramsUndefined: Self = StObject.set(x, "suggest_url_post_params", js.undefined)
  }
}
