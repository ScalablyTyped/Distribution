package typings.cacheManager

import typings.cacheManager.anon.Max
import typings.cacheManager.anon.PartialPickPrettlAutopurg
import typings.cacheManager.cacheManagerStrings.ttlAutopurge
import typings.cacheManager.distCachingMod.Cache
import typings.cacheManager.distCachingMod.Config
import typings.cacheManager.distCachingMod.Store
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distStoresMemoryMod {
  
  @JSImport("cache-manager/dist/stores/memory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def memoryStore(): MemoryStore_ = ^.asInstanceOf[js.Dynamic].applyDynamic("memoryStore")().asInstanceOf[MemoryStore_]
  inline def memoryStore(args: MemoryConfig): MemoryStore_ = ^.asInstanceOf[js.Dynamic].applyDynamic("memoryStore")(args.asInstanceOf[js.Any]).asInstanceOf[MemoryStore_]
  
  type LRU = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LRUCache<string, any, unknown> */ Any
  
  type MemoryCache = Cache[MemoryStore_]
  
  type MemoryConfig = Max & Options & Config
  
  @js.native
  trait MemoryStore_
    extends StObject
       with Store {
    
    var dump: /* import warning: importer.ImportType#apply Failed type conversion: cache-manager.cache-manager/dist/stores/memory.LRU['dump'] */ js.Any = js.native
    
    var load: /* import warning: importer.ImportType#apply Failed type conversion: cache-manager.cache-manager/dist/stores/memory.LRU['load'] */ js.Any = js.native
    
    def size: Double = js.native
  }
  
  type Options = (Omit[Pre, ttlAutopurge]) & PartialPickPrettlAutopurg
  
  type Pre = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LRUCache.OptionsTTLLimit<string, any, unknown> */ Any
}
