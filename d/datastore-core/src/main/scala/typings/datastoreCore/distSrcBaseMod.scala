package typings.datastoreCore

import typings.interfaceStore.mod.Store
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcBaseMod {
  
  @JSImport("datastore-core/dist/src/base", "BaseDatastore")
  @js.native
  open class BaseDatastore ()
    extends StObject
       with Store[typings.interfaceDatastore.distSrcKeyMod.Key, js.typedarray.Uint8Array] {
    
    /**
      * Extending classes should override `query` or implement this method
      *
      * @param {Query} q
      * @param {Options} [options]
      * @returns {AsyncIterable<Pair>}
      */
    def _all(q: Query): AsyncIterable[Pair] = js.native
    def _all(q: Query, options: typings.interfaceStore.mod.Options): AsyncIterable[Pair] = js.native
    
    /**
      * Extending classes should override `queryKeys` or implement this method
      *
      * @param {KeyQuery} q
      * @param {Options} [options]
      * @returns {AsyncIterable<Key>}
      */
    def _allKeys(q: KeyQuery): AsyncIterable[Key] = js.native
    def _allKeys(q: KeyQuery, options: typings.interfaceStore.mod.Options): AsyncIterable[Key] = js.native
    
    /**
      * @param {Key} key
      * @param {Options} [options]
      * @returns {Promise<void>}
      */
    def delete(key: Key): js.Promise[Unit] = js.native
    def delete(key: Key, options: typings.interfaceStore.mod.Options): js.Promise[Unit] = js.native
    
    /**
      * @param {Key} key
      * @param {Options} [options]
      * @returns {Promise<Uint8Array>}
      */
    def get(key: Key): js.Promise[js.typedarray.Uint8Array] = js.native
    def get(key: Key, options: typings.interfaceStore.mod.Options): js.Promise[js.typedarray.Uint8Array] = js.native
    
    /**
      * @param {Key} key
      * @param {Options} [options]
      * @returns {Promise<boolean>}
      */
    def has(key: Key): js.Promise[Boolean] = js.native
    def has(key: Key, options: typings.interfaceStore.mod.Options): js.Promise[Boolean] = js.native
    
    /**
      * @param {Key} key
      * @param {Uint8Array} val
      * @param {Options} [options]
      * @returns {Promise<void>}
      */
    def put(key: Key, `val`: js.typedarray.Uint8Array): js.Promise[Unit] = js.native
    def put(key: Key, `val`: js.typedarray.Uint8Array, options: typings.interfaceStore.mod.Options): js.Promise[Unit] = js.native
  }
  
  type AwaitIterable[O] = typings.interfaceStore.mod.AwaitIterable[O]
  
  type Batch = typings.interfaceDatastore.mod.Batch
  
  type Datastore = typings.interfaceDatastore.mod.Datastore
  
  type Key = typings.interfaceDatastore.mod.Key
  
  type KeyQuery = typings.interfaceDatastore.mod.KeyQuery
  
  type Options = typings.interfaceStore.mod.Options
  
  type Pair = typings.interfaceDatastore.mod.Pair
  
  type Query = typings.interfaceDatastore.mod.Query
}
