package typings.blockstoreCore

import typings.interfaceStore.mod.Store
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcBaseMod {
  
  @JSImport("blockstore-core/dist/src/base", "BaseBlockstore")
  @js.native
  open class BaseBlockstore ()
    extends StObject
       with Store[
          typings.multiformats.mod.CID[Any, Double, Double, Version], 
          js.typedarray.Uint8Array
        ] {
    
    /**
      * Extending classes should override `query` or implement this method
      *
      * @param {Query} q
      * @param {Options} [options]
      * @returns {AsyncIterable<Pair>}
      */
    def _all(q: Query): AsyncIterable[Pair] = js.native
    def _all(q: Query, options: typings.interfaceBlockstore.mod.Options): AsyncIterable[Pair] = js.native
    
    /**
      * Extending classes should override `queryKeys` or implement this method
      *
      * @param {KeyQuery} q
      * @param {Options} [options]
      * @returns {AsyncIterable<CID>}
      */
    def _allKeys(q: KeyQuery): AsyncIterable[CID] = js.native
    def _allKeys(q: KeyQuery, options: typings.interfaceBlockstore.mod.Options): AsyncIterable[CID] = js.native
  }
  
  type AwaitIterable[O] = typings.interfaceStore.mod.AwaitIterable[O]
  
  type Batch = typings.interfaceBlockstore.mod.Batch
  
  type Blockstore = typings.interfaceBlockstore.mod.Blockstore
  
  type CID = typings.multiformats.mod.CID[Any, Double, Double, Version]
  
  type KeyQuery = typings.interfaceBlockstore.mod.KeyQuery
  
  type Options = typings.interfaceBlockstore.mod.Options
  
  type Pair = typings.interfaceBlockstore.mod.Pair
  
  type Query = typings.interfaceBlockstore.mod.Query
}
