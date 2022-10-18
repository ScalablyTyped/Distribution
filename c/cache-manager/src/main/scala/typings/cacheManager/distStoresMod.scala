package typings.cacheManager

import typings.cacheManager.distStoresMemoryMod.MemoryConfig
import typings.cacheManager.distStoresMemoryMod.MemoryStore_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distStoresMod {
  
  @JSImport("cache-manager/dist/stores", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def memoryStore(): MemoryStore_ = ^.asInstanceOf[js.Dynamic].applyDynamic("memoryStore")().asInstanceOf[MemoryStore_]
  inline def memoryStore(args: MemoryConfig): MemoryStore_ = ^.asInstanceOf[js.Dynamic].applyDynamic("memoryStore")(args.asInstanceOf[js.Any]).asInstanceOf[MemoryStore_]
}
