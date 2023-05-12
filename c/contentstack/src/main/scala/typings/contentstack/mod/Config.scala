package typings.contentstack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Config extends StObject {
  
  var api_key: String
  
  var branch: js.UndefOr[String] = js.undefined
  
  var delivery_token: String
  
  var environment: String
  
  var fetchOptions: js.UndefOr[FetchOptions] = js.undefined
  
  var live_preview: js.UndefOr[LivePreview] = js.undefined
  
  var plugins: js.UndefOr[js.Array[ContentstackPlugin]] = js.undefined
  
  var region: js.UndefOr[Region] = js.undefined
}
object Config {
  
  inline def apply(api_key: String, delivery_token: String, environment: String): Config = {
    val __obj = js.Dynamic.literal(api_key = api_key.asInstanceOf[js.Any], delivery_token = delivery_token.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
    
    inline def setApi_key(value: String): Self = StObject.set(x, "api_key", value.asInstanceOf[js.Any])
    
    inline def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    inline def setBranchUndefined: Self = StObject.set(x, "branch", js.undefined)
    
    inline def setDelivery_token(value: String): Self = StObject.set(x, "delivery_token", value.asInstanceOf[js.Any])
    
    inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setFetchOptions(value: FetchOptions): Self = StObject.set(x, "fetchOptions", value.asInstanceOf[js.Any])
    
    inline def setFetchOptionsUndefined: Self = StObject.set(x, "fetchOptions", js.undefined)
    
    inline def setLive_preview(value: LivePreview): Self = StObject.set(x, "live_preview", value.asInstanceOf[js.Any])
    
    inline def setLive_previewUndefined: Self = StObject.set(x, "live_preview", js.undefined)
    
    inline def setPlugins(value: js.Array[ContentstackPlugin]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    inline def setPluginsVarargs(value: ContentstackPlugin*): Self = StObject.set(x, "plugins", js.Array(value*))
    
    inline def setRegion(value: Region): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
  }
}
