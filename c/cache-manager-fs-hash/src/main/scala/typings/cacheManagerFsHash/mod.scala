package typings.cacheManagerFsHash

import org.scalablytyped.runtime.Shortcut
import typings.cacheManager.mod.Cache
import typings.cacheManager.mod.CacheOptions
import typings.cacheManager.mod.Store
import typings.cacheManager.mod.StoreConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("cache-manager-fs-hash", JSImport.Namespace)
  @js.native
  val ^ : FsHashStoreConstructor = js.native
  
  /* augmented module */
  object cacheManagerAugmentingMod {
    
    @JSImport("cache-manager", JSImport.Namespace)
    @js.native
    val ^ : js.Any = js.native
    
    inline def caching(IConfig: FsHashStoreConfig | (StoreConfig & CacheOptions)): Cache = ^.asInstanceOf[js.Dynamic].applyDynamic("caching")(IConfig.asInstanceOf[js.Any]).asInstanceOf[Cache]
  }
  
  trait FsHashStoreConfig extends StObject {
    
    var options: js.UndefOr[FsHashStoreOptions] = js.undefined
    
    var store: FsHashStoreConstructor
  }
  object FsHashStoreConfig {
    
    inline def apply(store: FsHashStoreConstructor): FsHashStoreConfig = {
      val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any])
      __obj.asInstanceOf[FsHashStoreConfig]
    }
    
    extension [Self <: FsHashStoreConfig](x: Self) {
      
      inline def setOptions(value: FsHashStoreOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setStore(value: FsHashStoreConstructor): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    }
  }
  
  trait FsHashStoreConstructor extends StObject {
    
    def create(config: FsHashStoreConfig): Store
  }
  object FsHashStoreConstructor {
    
    inline def apply(create: FsHashStoreConfig => Store): FsHashStoreConstructor = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
      __obj.asInstanceOf[FsHashStoreConstructor]
    }
    
    extension [Self <: FsHashStoreConstructor](x: Self) {
      
      inline def setCreate(value: FsHashStoreConfig => Store): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    }
  }
  
  trait FsHashStoreOptions extends StObject {
    
    var maxsize: js.UndefOr[Double] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var subdirs: js.UndefOr[Boolean] = js.undefined
    
    var ttl: js.UndefOr[Double] = js.undefined
    
    var zip: js.UndefOr[Boolean] = js.undefined
  }
  object FsHashStoreOptions {
    
    inline def apply(): FsHashStoreOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FsHashStoreOptions]
    }
    
    extension [Self <: FsHashStoreOptions](x: Self) {
      
      inline def setMaxsize(value: Double): Self = StObject.set(x, "maxsize", value.asInstanceOf[js.Any])
      
      inline def setMaxsizeUndefined: Self = StObject.set(x, "maxsize", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setSubdirs(value: Boolean): Self = StObject.set(x, "subdirs", value.asInstanceOf[js.Any])
      
      inline def setSubdirsUndefined: Self = StObject.set(x, "subdirs", js.undefined)
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
      
      inline def setZip(value: Boolean): Self = StObject.set(x, "zip", value.asInstanceOf[js.Any])
      
      inline def setZipUndefined: Self = StObject.set(x, "zip", js.undefined)
    }
  }
  
  type _To = FsHashStoreConstructor
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: FsHashStoreConstructor = ^
}
