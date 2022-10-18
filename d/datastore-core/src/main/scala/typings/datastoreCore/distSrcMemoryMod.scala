package typings.datastoreCore

import typings.datastoreCore.anon.Key
import typings.datastoreCore.distSrcBaseMod.BaseDatastore
import typings.std.AsyncGenerator
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMemoryMod {
  
  @JSImport("datastore-core/dist/src/memory", "MemoryDatastore")
  @js.native
  open class MemoryDatastore () extends BaseDatastore {
    
    def _all(): AsyncGenerator[Key, Unit, Unit] = js.native
    
    def _allKeys(): AsyncGenerator[typings.interfaceDatastore.keyMod.Key, Unit, Unit] = js.native
    
    /** @type {Record<string, Uint8Array>} */
    var data: Record[String, js.typedarray.Uint8Array] = js.native
    
    /**
      * @param {Key} key
      */
    def delete(key: typings.interfaceDatastore.keyMod.Key): js.Promise[Unit] = js.native
    
    /**
      * @param {Key} key
      */
    def get(key: typings.interfaceDatastore.keyMod.Key): js.Promise[js.typedarray.Uint8Array] = js.native
    
    /**
      * @param {Key} key
      */
    def has(key: typings.interfaceDatastore.keyMod.Key): js.Promise[Boolean] = js.native
    
    /**
      * @param {Key} key
      * @param {Uint8Array} val
      */
    def put(key: typings.interfaceDatastore.keyMod.Key, `val`: js.typedarray.Uint8Array): js.Promise[Unit] = js.native
  }
  
  type Datastore = typings.interfaceDatastore.mod.Datastore
  
  type Options = typings.interfaceStore.mod.Options
  
  type Pair = typings.interfaceDatastore.mod.Pair
}
