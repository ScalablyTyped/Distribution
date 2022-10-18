package typings.datastoreCore

import typings.datastoreCore.datastoreCoreStrings.SHARDING
import typings.datastoreCore.datastoreCoreStrings.SlashrepoSlashflatfsSlashshardSlash
import typings.datastoreCore.datastoreCoreStrings._README
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcShardMod {
  
  @JSImport("datastore-core/dist/src/shard", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("datastore-core/dist/src/shard", "NextToLast")
  @js.native
  open class NextToLast protected () extends ShardBase {
    /**
      * @param {number} suffixLen
      */
    def this(suffixLen: Double) = this()
  }
  
  @JSImport("datastore-core/dist/src/shard", "PREFIX")
  @js.native
  val PREFIX_ : SlashrepoSlashflatfsSlashshardSlash = js.native
  
  @JSImport("datastore-core/dist/src/shard", "Prefix")
  @js.native
  open class Prefix protected () extends ShardBase {
    /**
      * @param {number} prefixLen
      */
    def this(prefixLen: Double) = this()
  }
  
  @JSImport("datastore-core/dist/src/shard", "README_FN")
  @js.native
  val README_FN: _README = js.native
  
  @JSImport("datastore-core/dist/src/shard", "SHARDING_FN")
  @js.native
  val SHARDING_FN: SHARDING = js.native
  
  @JSImport("datastore-core/dist/src/shard", "ShardBase")
  @js.native
  open class ShardBase protected ()
    extends StObject
       with typings.datastoreCore.distSrcTypesMod.Shard {
    /**
      * @param {any} param
      */
    def this(param: Any) = this()
    
    /* CompleteClass */
    override val _padding: String = js.native
    
    /* CompleteClass */
    override def fun(s: String): String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var param: Double = js.native
  }
  
  @JSImport("datastore-core/dist/src/shard", "Suffix")
  @js.native
  open class Suffix protected () extends ShardBase {
    /**
      * @param {number} suffixLen
      */
    def this(suffixLen: Double) = this()
  }
  
  inline def parseShardFun(str: String): Shard = ^.asInstanceOf[js.Dynamic].applyDynamic("parseShardFun")(str.asInstanceOf[js.Any]).asInstanceOf[Shard]
  
  inline def readShardFun(path: String, store: Datastore): js.Promise[typings.datastoreCore.distSrcTypesMod.Shard] = (^.asInstanceOf[js.Dynamic].applyDynamic("readShardFun")(path.asInstanceOf[js.Any], store.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.datastoreCore.distSrcTypesMod.Shard]]
  inline def readShardFun(path: js.typedarray.Uint8Array, store: Datastore): js.Promise[typings.datastoreCore.distSrcTypesMod.Shard] = (^.asInstanceOf[js.Dynamic].applyDynamic("readShardFun")(path.asInstanceOf[js.Any], store.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.datastoreCore.distSrcTypesMod.Shard]]
  
  @JSImport("datastore-core/dist/src/shard", "readme")
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
  
  type Datastore = typings.interfaceDatastore.mod.Datastore
  
  type Shard = typings.datastoreCore.distSrcTypesMod.Shard
}
