package typings.blockstoreDatastoreAdapter

import typings.blockstoreCore.baseMod.BaseBlockstore
import typings.blockstoreDatastoreAdapter.anon.Key
import typings.itPushable.mod.Pushable_
import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.std.AsyncGenerator
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("blockstore-datastore-adapter", "BlockstoreDatastoreAdapter")
  @js.native
  open class BlockstoreDatastoreAdapter protected () extends BaseBlockstore {
    /**
      * @param {Datastore} datastore
      */
    def this(datastore: Datastore) = this()
    
    var child: typings.interfaceDatastore.mod.Datastore[
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
      ] = js.native
    
    def deleteMany(cids: js.Iterable[CID[Any, Double, Double, Version]]): Pushable_[Any, Unit, Any] = js.native
    def deleteMany(
      cids: js.Iterable[CID[Any, Double, Double, Version]],
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interface-blockstore.Options */ Any
    ): Pushable_[Any, Unit, Any] = js.native
    /**
      * @param {AsyncIterable<CID> | Iterable<CID>} cids
      * @param {Options} [options]
      */
    def deleteMany(cids: AsyncIterable[CID[Any, Double, Double, Version]]): Pushable_[Any, Unit, Any] = js.native
    def deleteMany(
      cids: AsyncIterable[CID[Any, Double, Double, Version]],
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interface-blockstore.Options */ Any
    ): Pushable_[Any, Unit, Any] = js.native
    
    def getMany(cids: js.Iterable[CID[Any, Double, Double, Version]]): AsyncGenerator[js.typedarray.Uint8Array, Unit, Any] = js.native
    def getMany(
      cids: js.Iterable[CID[Any, Double, Double, Version]],
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interface-blockstore.Options */ Any
    ): AsyncGenerator[js.typedarray.Uint8Array, Unit, Any] = js.native
    /**
      * @param {AsyncIterable<CID> | Iterable<CID>} cids
      * @param {Options} [options]
      */
    def getMany(cids: AsyncIterable[CID[Any, Double, Double, Version]]): AsyncGenerator[js.typedarray.Uint8Array, Unit, Any] = js.native
    def getMany(
      cids: AsyncIterable[CID[Any, Double, Double, Version]],
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interface-blockstore.Options */ Any
    ): AsyncGenerator[js.typedarray.Uint8Array, Unit, Any] = js.native
    
    def putMany(blocks: js.Iterable[Pair]): AsyncGenerator[Any, Unit, Unit] = js.native
    def putMany(
      blocks: js.Iterable[Pair],
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interface-blockstore.Options */ Any
    ): AsyncGenerator[Any, Unit, Unit] = js.native
    /**
      * @param {AsyncIterable<Pair> | Iterable<Pair>} blocks
      * @param {Options} [options]
      */
    def putMany(blocks: AsyncIterable[Pair]): AsyncGenerator[Any, Unit, Unit] = js.native
    def putMany(
      blocks: AsyncIterable[Pair],
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interface-blockstore.Options */ Any
    ): AsyncGenerator[Any, Unit, Unit] = js.native
    
    /**
      * @param {Query} query
      * @param {Options} [options]
      */
    def query(query: Query): AsyncGenerator[Key, Unit, Any] = js.native
    def query(
      query: Query,
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interface-blockstore.Options */ Any
    ): AsyncGenerator[Key, Unit, Any] = js.native
    
    /**
      * @param {KeyQuery} query
      * @param {Options} [options]
      */
    def queryKeys(query: KeyQuery): AsyncGenerator[CID[Any, Double, Double, Version], Unit, Any] = js.native
    def queryKeys(
      query: KeyQuery,
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interface-blockstore.Options */ Any
    ): AsyncGenerator[CID[Any, Double, Double, Version], Unit, Any] = js.native
  }
  
  type Blockstore = typings.interfaceBlockstore.mod.Blockstore[js.Object, js.Object, js.Object, js.Object, js.Object, js.Object, js.Object, js.Object]
  
  type Datastore = typings.interfaceDatastore.mod.Datastore[
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
  ]
  
  type KeyQuery = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interface-blockstore.KeyQuery */ Any
  
  type Options = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interface-blockstore.Options */ Any
  
  type Pair = typings.interfaceBlockstore.mod.Pair
  
  type Query = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interface-blockstore.Query */ Any
}
