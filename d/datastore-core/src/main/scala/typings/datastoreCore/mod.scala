package typings.datastoreCore

import typings.datastoreCore.datastoreCoreStrings.SHARDING
import typings.datastoreCore.datastoreCoreStrings.SlashrepoSlashflatfsSlashshardSlash
import typings.datastoreCore.datastoreCoreStrings._README
import typings.datastoreCore.distSrcKeytransformMod.Datastore
import typings.datastoreCore.distSrcShardingMod.Shard
import typings.errCode.mod.Extensions
import typings.interfaceDatastore.mod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("datastore-core", "BaseDatastore")
  @js.native
  open class BaseDatastore ()
    extends typings.datastoreCore.distSrcBaseMod.BaseDatastore
  
  object Errors {
    
    @JSImport("datastore-core", "Errors")
    @js.native
    val ^ : js.Any = js.native
    
    inline def abortedError(): js.Error & Extensions = ^.asInstanceOf[js.Dynamic].applyDynamic("abortedError")().asInstanceOf[js.Error & Extensions]
    inline def abortedError(err: js.Error): js.Error & Extensions = ^.asInstanceOf[js.Dynamic].applyDynamic("abortedError")(err.asInstanceOf[js.Any]).asInstanceOf[js.Error & Extensions]
    
    inline def dbDeleteFailedError(): js.Error & Extensions = ^.asInstanceOf[js.Dynamic].applyDynamic("dbDeleteFailedError")().asInstanceOf[js.Error & Extensions]
    inline def dbDeleteFailedError(err: js.Error): js.Error & Extensions = ^.asInstanceOf[js.Dynamic].applyDynamic("dbDeleteFailedError")(err.asInstanceOf[js.Any]).asInstanceOf[js.Error & Extensions]
    
    inline def dbOpenFailedError(): js.Error & Extensions = ^.asInstanceOf[js.Dynamic].applyDynamic("dbOpenFailedError")().asInstanceOf[js.Error & Extensions]
    inline def dbOpenFailedError(err: js.Error): js.Error & Extensions = ^.asInstanceOf[js.Dynamic].applyDynamic("dbOpenFailedError")(err.asInstanceOf[js.Any]).asInstanceOf[js.Error & Extensions]
    
    inline def dbWriteFailedError(): js.Error & Extensions = ^.asInstanceOf[js.Dynamic].applyDynamic("dbWriteFailedError")().asInstanceOf[js.Error & Extensions]
    inline def dbWriteFailedError(err: js.Error): js.Error & Extensions = ^.asInstanceOf[js.Dynamic].applyDynamic("dbWriteFailedError")(err.asInstanceOf[js.Any]).asInstanceOf[js.Error & Extensions]
    
    inline def notFoundError(): js.Error & Extensions = ^.asInstanceOf[js.Dynamic].applyDynamic("notFoundError")().asInstanceOf[js.Error & Extensions]
    inline def notFoundError(err: js.Error): js.Error & Extensions = ^.asInstanceOf[js.Dynamic].applyDynamic("notFoundError")(err.asInstanceOf[js.Any]).asInstanceOf[js.Error & Extensions]
  }
  
  @JSImport("datastore-core", "KeyTransformDatastore")
  @js.native
  open class KeyTransformDatastore protected ()
    extends typings.datastoreCore.distSrcKeytransformMod.KeyTransformDatastore {
    /**
      * @param {Datastore} child
      * @param {KeyTransform} transform
      */
    def this(child: Datastore, transform: typings.datastoreCore.distSrcKeytransformMod.KeyTransform) = this()
  }
  
  @JSImport("datastore-core", "MemoryDatastore")
  @js.native
  open class MemoryDatastore ()
    extends typings.datastoreCore.distSrcMemoryMod.MemoryDatastore
  
  @JSImport("datastore-core", "MountDatastore")
  @js.native
  open class MountDatastore protected ()
    extends typings.datastoreCore.distSrcMountMod.MountDatastore {
    /**
      * @param {Array<{prefix: Key, datastore: Datastore}>} mounts
      */
    def this(mounts: js.Array[typings.datastoreCore.anon.Datastore]) = this()
  }
  
  @JSImport("datastore-core", "NamespaceDatastore")
  @js.native
  open class NamespaceDatastore protected ()
    extends typings.datastoreCore.distSrcNamespaceMod.NamespaceDatastore {
    /**
      * @param {Datastore} child
      * @param {Key} prefix
      */
    def this(child: typings.datastoreCore.distSrcNamespaceMod.Datastore, prefix: Key) = this()
  }
  
  @JSImport("datastore-core", "ShardingDatastore")
  @js.native
  open class ShardingDatastore protected ()
    extends typings.datastoreCore.distSrcShardingMod.ShardingDatastore {
    /**
      * @param {Datastore} store
      * @param {Shard} shard
      */
    def this(store: typings.datastoreCore.distSrcShardingMod.Datastore, shard: Shard) = this()
  }
  /* static members */
  object ShardingDatastore {
    
    @JSImport("datastore-core", "ShardingDatastore")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @param {Datastore} store
      * @param {Shard} shard
      */
    inline def create(store: typings.datastoreCore.distSrcShardingMod.Datastore, shard: Shard): js.Promise[typings.datastoreCore.distSrcTypesMod.Shard] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(store.asInstanceOf[js.Any], shard.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.datastoreCore.distSrcTypesMod.Shard]]
    
    /**
      * @deprecated
      * @param {Datastore} store
      * @param {Shard} shard
      */
    inline def createOrOpen(store: typings.datastoreCore.distSrcShardingMod.Datastore, shard: Shard): js.Promise[typings.datastoreCore.distSrcShardingMod.ShardingDatastore] = (^.asInstanceOf[js.Dynamic].applyDynamic("createOrOpen")(store.asInstanceOf[js.Any], shard.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.datastoreCore.distSrcShardingMod.ShardingDatastore]]
    
    /**
      * @deprecated
      * @param {Datastore} store
      */
    inline def open(store: typings.datastoreCore.distSrcShardingMod.Datastore): js.Promise[typings.datastoreCore.distSrcShardingMod.ShardingDatastore] = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(store.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.datastoreCore.distSrcShardingMod.ShardingDatastore]]
  }
  
  @JSImport("datastore-core", "TieredDatastore")
  @js.native
  open class TieredDatastore protected ()
    extends typings.datastoreCore.distSrcTieredMod.TieredDatastore {
    /**
      * @param {Datastore[]} stores
      */
    def this(stores: js.Array[typings.datastoreCore.distSrcTieredMod.Datastore]) = this()
  }
  
  object shard {
    
    @JSImport("datastore-core", "shard")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("datastore-core", "shard.NextToLast")
    @js.native
    open class NextToLast protected ()
      extends typings.datastoreCore.distSrcShardMod.NextToLast {
      /**
        * @param {number} suffixLen
        */
      def this(suffixLen: Double) = this()
    }
    
    @JSImport("datastore-core", "shard.PREFIX")
    @js.native
    val PREFIX_ : SlashrepoSlashflatfsSlashshardSlash = js.native
    
    @JSImport("datastore-core", "shard.Prefix")
    @js.native
    open class Prefix protected ()
      extends typings.datastoreCore.distSrcShardMod.Prefix {
      /**
        * @param {number} prefixLen
        */
      def this(prefixLen: Double) = this()
    }
    
    @JSImport("datastore-core", "shard.README_FN")
    @js.native
    val README_FN: _README = js.native
    
    @JSImport("datastore-core", "shard.SHARDING_FN")
    @js.native
    val SHARDING_FN: SHARDING = js.native
    
    @JSImport("datastore-core", "shard.ShardBase")
    @js.native
    open class ShardBase protected ()
      extends typings.datastoreCore.distSrcShardMod.ShardBase {
      /**
        * @param {any} param
        */
      def this(param: Any) = this()
    }
    
    @JSImport("datastore-core", "shard.Suffix")
    @js.native
    open class Suffix protected ()
      extends typings.datastoreCore.distSrcShardMod.Suffix {
      /**
        * @param {number} suffixLen
        */
      def this(suffixLen: Double) = this()
    }
    
    inline def parseShardFun(str: String): typings.datastoreCore.distSrcShardMod.Shard = ^.asInstanceOf[js.Dynamic].applyDynamic("parseShardFun")(str.asInstanceOf[js.Any]).asInstanceOf[typings.datastoreCore.distSrcShardMod.Shard]
    
    inline def readShardFun(path: String, store: typings.datastoreCore.distSrcShardMod.Datastore): js.Promise[typings.datastoreCore.distSrcTypesMod.Shard] = (^.asInstanceOf[js.Dynamic].applyDynamic("readShardFun")(path.asInstanceOf[js.Any], store.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.datastoreCore.distSrcTypesMod.Shard]]
    inline def readShardFun(path: js.typedarray.Uint8Array, store: typings.datastoreCore.distSrcShardMod.Datastore): js.Promise[typings.datastoreCore.distSrcTypesMod.Shard] = (^.asInstanceOf[js.Dynamic].applyDynamic("readShardFun")(path.asInstanceOf[js.Any], store.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.datastoreCore.distSrcTypesMod.Shard]]
    
    @JSImport("datastore-core", "shard.readme")
    @js.native
    val readme: /* This is a repository of IPLD objects. Each IPLD object is in a single file,
    named <base32 encoding of cid>.data. Where <base32 encoding of cid> is the
    "base32" encoding of the CID (as specified in
    https://github.com/multiformats/multibase) without the 'B' prefix.
    All the object files are placed in a tree of directories, based on a
    function of the CID. This is a form of sharding similar to
    the objects directory in git repositories. Previously, we used
    prefixes, we now use the next-to-last two charters.
      func NextToLast(base32cid string) {
      nextToLastLen := 2
      offset := len(base32cid) - nextToLastLen - 1
      return str[offset : offset+nextToLastLen]
      }
    For example, an object with a base58 CIDv1 of
      zb2rhYSxw4ZjuzgCnWSt19Q94ERaeFhu9uSqRgjSdx9bsgM6f
    has a base32 CIDv1 of
      BAFKREIA22FLID5AJ2KU7URG47MDLROZIH6YF2KALU2PWEFPVI37YLKRSCA
    and will be placed at
      SC/AFKREIA22FLID5AJ2KU7URG47MDLROZIH6YF2KALU2PWEFPVI37YLKRSCA.data
    with 'SC' being the last-to-next two characters and the 'B' at the
    beginning of the CIDv1 string is the multibase prefix that is not
    stored in the filename.
      */ String = js.native
  }
  
  type KeyTransform = typings.datastoreCore.distSrcTypesMod.KeyTransform
  
  type Shard_ = typings.datastoreCore.distSrcTypesMod.Shard
}
