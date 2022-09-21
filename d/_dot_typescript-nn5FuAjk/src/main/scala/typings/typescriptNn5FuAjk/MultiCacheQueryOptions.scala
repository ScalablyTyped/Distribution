package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiCacheQueryOptions
  extends StObject
     with CacheQueryOptions {
  
  var cacheName: js.UndefOr[java.lang.String] = js.undefined
}
object MultiCacheQueryOptions {
  
  inline def apply(): MultiCacheQueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiCacheQueryOptions]
  }
  
  extension [Self <: MultiCacheQueryOptions](x: Self) {
    
    inline def setCacheName(value: java.lang.String): Self = StObject.set(x, "cacheName", value.asInstanceOf[js.Any])
    
    inline def setCacheNameUndefined: Self = StObject.set(x, "cacheName", js.undefined)
  }
}
