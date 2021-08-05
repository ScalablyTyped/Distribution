package typings.chrome.chrome.tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReloadProperties extends StObject {
  
  /** Optional. Whether using any local cache. Default is false. */
  var bypassCache: js.UndefOr[Boolean] = js.undefined
}
object ReloadProperties {
  
  inline def apply(): ReloadProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReloadProperties]
  }
  
  extension [Self <: ReloadProperties](x: Self) {
    
    inline def setBypassCache(value: Boolean): Self = StObject.set(x, "bypassCache", value.asInstanceOf[js.Any])
    
    inline def setBypassCacheUndefined: Self = StObject.set(x, "bypassCache", js.undefined)
  }
}
