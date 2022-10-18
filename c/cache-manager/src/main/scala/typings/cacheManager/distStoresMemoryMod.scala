package typings.cacheManager

import typings.cacheManager.anon.Max
import typings.cacheManager.distCachingMod.Cache
import typings.cacheManager.distCachingMod.Config
import typings.cacheManager.distCachingMod.Store
import typings.lruCache.mod.Entry
import typings.lruCache.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distStoresMemoryMod {
  
  @JSImport("cache-manager/dist/stores/memory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def memoryStore(): MemoryStore_ = ^.asInstanceOf[js.Dynamic].applyDynamic("memoryStore")().asInstanceOf[MemoryStore_]
  inline def memoryStore(args: MemoryConfig): MemoryStore_ = ^.asInstanceOf[js.Dynamic].applyDynamic("memoryStore")(args.asInstanceOf[js.Any]).asInstanceOf[MemoryStore_]
  
  type Lru = typings.lruCache.mod.^[String, Any]
  
  type MemoryCache = Cache[MemoryStore_]
  
  type MemoryConfig = Max & (Options[String, Any]) & Config
  
  @js.native
  trait MemoryStore_
    extends StObject
       with Store {
    
    def dump(): js.Array[js.Tuple2[String, Entry[Any]]] = js.native
    @JSName("dump")
    var dump_Original: js.Function0[js.Array[js.Tuple2[String, Entry[Any]]]] = js.native
    
    def keyCount(): Double = js.native
    
    def load(cacheEntries: js.Array[js.Tuple2[String, Entry[Any]]]): Unit = js.native
    @JSName("load")
    var load_Original: js.Function1[/* cacheEntries */ js.Array[js.Tuple2[String, Entry[Any]]], Unit] = js.native
  }
}
