package typings.datastoreCore

import typings.datastoreCore.distSrcBaseMod.BaseDatastore
import typings.interfaceDatastore.keyMod.Key
import typings.interfaceDatastore.mod.Pair
import typings.interfaceStore.mod.Await
import typings.interfaceStore.mod.AwaitIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMemoryMod {
  
  @JSImport("datastore-core/dist/src/memory", "MemoryDatastore")
  @js.native
  open class MemoryDatastore () extends BaseDatastore {
    
    def _all(): AwaitIterable[Pair] = js.native
    
    def _allKeys(): AwaitIterable[Key] = js.native
    
    /* private */ val data: Any = js.native
    
    def delete(key: Key): Await[Unit] = js.native
    
    def get(key: Key): Await[js.typedarray.Uint8Array] = js.native
    
    def has(key: Key): Await[Boolean] = js.native
    
    def put(key: Key, `val`: js.typedarray.Uint8Array): Await[Key] = js.native
  }
}
