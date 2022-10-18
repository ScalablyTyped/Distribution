package typings.cacheManager

import typings.cacheManager.cacheManagerStrings.memory
import typings.cacheManager.distCachingMod.Cache
import typings.cacheManager.distCachingMod.FactoryConfig
import typings.cacheManager.distCachingMod.FactoryStore
import typings.cacheManager.distCachingMod.Store
import typings.cacheManager.distMultiCachingMod.MultiCache
import typings.cacheManager.distStoresMemoryMod.MemoryCache
import typings.cacheManager.distStoresMemoryMod.MemoryConfig
import typings.cacheManager.distStoresMemoryMod.MemoryStore_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cache-manager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def caching[S /* <: Store */](store: S): js.Promise[Cache[S]] = ^.asInstanceOf[js.Dynamic].applyDynamic("caching")(store.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Cache[S]]]
  inline def caching[S /* <: Store */, T /* <: js.Object */](factory: FactoryStore[S, T]): js.Promise[Cache[S]] = ^.asInstanceOf[js.Dynamic].applyDynamic("caching")(factory.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Cache[S]]]
  inline def caching[S /* <: Store */, T /* <: js.Object */](factory: FactoryStore[S, T], args: FactoryConfig[T]): js.Promise[Cache[S]] = (^.asInstanceOf[js.Dynamic].applyDynamic("caching")(factory.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Cache[S]]]
  
  inline def caching_memory(name: memory): js.Promise[MemoryCache] = ^.asInstanceOf[js.Dynamic].applyDynamic("caching")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MemoryCache]]
  inline def caching_memory(name: memory, args: MemoryConfig): js.Promise[MemoryCache] = (^.asInstanceOf[js.Dynamic].applyDynamic("caching")(name.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MemoryCache]]
  
  inline def memoryStore(): MemoryStore_ = ^.asInstanceOf[js.Dynamic].applyDynamic("memoryStore")().asInstanceOf[MemoryStore_]
  inline def memoryStore(args: MemoryConfig): MemoryStore_ = ^.asInstanceOf[js.Dynamic].applyDynamic("memoryStore")(args.asInstanceOf[js.Any]).asInstanceOf[MemoryStore_]
  
  inline def multiCaching[Caches /* <: js.Array[Cache[Store]] */](caches: Caches): MultiCache = ^.asInstanceOf[js.Dynamic].applyDynamic("multiCaching")(caches.asInstanceOf[js.Any]).asInstanceOf[MultiCache]
}
