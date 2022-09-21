package typings.blockstoreDatastoreAdapter

import typings.interfaceStore.mod.Store
import typings.itPushable.mod.Pushable_
import typings.multiformats.mod.CID
import typings.std.AsyncGenerator
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BaseBlockstore * / any */ @JSImport("blockstore-datastore-adapter", "BlockstoreDatastoreAdapter")
  @js.native
  open class BlockstoreDatastoreAdapter protected ()
    extends StObject
       with Store[CID, js.typedarray.Uint8Array] {
    /**
      * @param {Datastore} datastore
      */
    def this(datastore: Datastore) = this()
    
    var child: typings.interfaceDatastore.mod.Datastore = js.native
    
    def deleteMany(
      cids: js.Iterable[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any
        ]
    ): Pushable_[Any] = js.native
    def deleteMany(
      cids: js.Iterable[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any
        ],
      options: typings.interfaceBlockstore.mod.Options
    ): Pushable_[Any] = js.native
    /**
      * @param {AsyncIterable<CID> | Iterable<CID>} cids
      * @param {Options} [options]
      */
    def deleteMany(
      cids: AsyncIterable[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any
        ]
    ): Pushable_[Any] = js.native
    def deleteMany(
      cids: AsyncIterable[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any
        ],
      options: typings.interfaceBlockstore.mod.Options
    ): Pushable_[Any] = js.native
    
    def getMany(
      cids: js.Iterable[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any
        ]
    ): AsyncGenerator[js.typedarray.Uint8Array, Unit, Any] = js.native
    def getMany(
      cids: js.Iterable[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any
        ],
      options: typings.interfaceBlockstore.mod.Options
    ): AsyncGenerator[js.typedarray.Uint8Array, Unit, Any] = js.native
    /**
      * @param {AsyncIterable<CID> | Iterable<CID>} cids
      * @param {Options} [options]
      */
    def getMany(
      cids: AsyncIterable[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any
        ]
    ): AsyncGenerator[js.typedarray.Uint8Array, Unit, Any] = js.native
    def getMany(
      cids: AsyncIterable[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any
        ],
      options: typings.interfaceBlockstore.mod.Options
    ): AsyncGenerator[js.typedarray.Uint8Array, Unit, Any] = js.native
    
    def putMany(blocks: js.Iterable[Pair]): AsyncGenerator[Any, Unit, Unit] = js.native
    def putMany(blocks: js.Iterable[Pair], options: typings.interfaceBlockstore.mod.Options): AsyncGenerator[Any, Unit, Unit] = js.native
    /**
      * @param {AsyncIterable<Pair> | Iterable<Pair>} blocks
      * @param {Options} [options]
      */
    def putMany(blocks: AsyncIterable[Pair]): AsyncGenerator[Any, Unit, Unit] = js.native
    def putMany(blocks: AsyncIterable[Pair], options: typings.interfaceBlockstore.mod.Options): AsyncGenerator[Any, Unit, Unit] = js.native
  }
  
  type Blockstore = typings.interfaceBlockstore.mod.Blockstore
  
  type Datastore = typings.interfaceDatastore.mod.Datastore
  
  type KeyQuery = typings.interfaceBlockstore.mod.KeyQuery
  
  type Options = typings.interfaceBlockstore.mod.Options
  
  type Pair = typings.interfaceBlockstore.mod.Pair
  
  type Query = typings.interfaceBlockstore.mod.Query
}
