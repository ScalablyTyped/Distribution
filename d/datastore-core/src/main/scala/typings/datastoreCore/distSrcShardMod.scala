package typings.datastoreCore

import typings.datastoreCore.mod.Shard_
import typings.interfaceDatastore.mod.Datastore
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
    def this(suffixLen: Double) = this()
  }
  
  @JSImport("datastore-core/dist/src/shard", "PREFIX")
  @js.native
  val PREFIX_ : /* "/repo/flatfs/shard/" */ String = js.native
  
  @JSImport("datastore-core/dist/src/shard", "Prefix")
  @js.native
  open class Prefix protected () extends ShardBase {
    def this(prefixLen: Double) = this()
  }
  
  @JSImport("datastore-core/dist/src/shard", "SHARDING_FN")
  @js.native
  val SHARDING_FN: /* "SHARDING" */ String = js.native
  
  @JSImport("datastore-core/dist/src/shard", "ShardBase")
  @js.native
  open class ShardBase protected ()
    extends StObject
       with Shard_ {
    def this(param: Double) = this()
    
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
    def this(suffixLen: Double) = this()
  }
  
  inline def parseShardFun(str: String): Shard_ = ^.asInstanceOf[js.Dynamic].applyDynamic("parseShardFun")(str.asInstanceOf[js.Any]).asInstanceOf[Shard_]
  
  inline def readShardFun(
    path: String,
    store: Datastore[
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
  ): js.Promise[Shard_] = (^.asInstanceOf[js.Dynamic].applyDynamic("readShardFun")(path.asInstanceOf[js.Any], store.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Shard_]]
  inline def readShardFun(
    path: js.typedarray.Uint8Array,
    store: Datastore[
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
  ): js.Promise[Shard_] = (^.asInstanceOf[js.Dynamic].applyDynamic("readShardFun")(path.asInstanceOf[js.Any], store.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Shard_]]
}
