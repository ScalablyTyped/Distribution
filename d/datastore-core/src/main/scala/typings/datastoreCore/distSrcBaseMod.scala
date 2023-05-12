package typings.datastoreCore

import typings.interfaceDatastore.mod.Datastore
import typings.interfaceDatastore.mod.Key
import typings.interfaceDatastore.mod.KeyQuery
import typings.interfaceDatastore.mod.Pair
import typings.interfaceDatastore.mod.Query
import typings.interfaceStore.mod.AbortOptions
import typings.interfaceStore.mod.Await
import typings.interfaceStore.mod.AwaitIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcBaseMod {
  
  @JSImport("datastore-core/dist/src/base", "BaseDatastore")
  @js.native
  open class BaseDatastore ()
    extends StObject
       with Datastore[
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object
        ] {
    
    /**
      * Extending classes should override `query` or implement this method
      */
    def _all(q: Query): AwaitIterable[Pair] = js.native
    def _all(q: Query, options: AbortOptions): AwaitIterable[Pair] = js.native
    
    /**
      * Extending classes should override `queryKeys` or implement this method
      */
    def _allKeys(q: KeyQuery): AwaitIterable[Key] = js.native
    def _allKeys(q: KeyQuery, options: AbortOptions): AwaitIterable[Key] = js.native
    
    def delete(key: Key): Await[Unit] = js.native
    def delete(key: Key, options: AbortOptions): Await[Unit] = js.native
    
    def deleteMany(source: AwaitIterable[Key], options: AbortOptions): AwaitIterable[Key] = js.native
    
    def get(key: Key): Await[js.typedarray.Uint8Array] = js.native
    def get(key: Key, options: AbortOptions): Await[js.typedarray.Uint8Array] = js.native
    
    def getMany(source: AwaitIterable[Key], options: AbortOptions): AwaitIterable[Pair] = js.native
    
    def has(key: Key): Await[Boolean] = js.native
    def has(key: Key, options: AbortOptions): Await[Boolean] = js.native
    
    def put(key: Key, `val`: js.typedarray.Uint8Array): Await[Key] = js.native
    def put(key: Key, `val`: js.typedarray.Uint8Array, options: AbortOptions): Await[Key] = js.native
    
    def putMany(source: AwaitIterable[Pair], options: AbortOptions): AwaitIterable[Key] = js.native
    
    def query(q: Query, options: AbortOptions): AwaitIterable[Pair] = js.native
    
    def queryKeys(q: KeyQuery, options: AbortOptions): AwaitIterable[Key] = js.native
  }
}
