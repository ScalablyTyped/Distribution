package typings.datastoreCore

import typings.datastoreCore.distSrcBaseMod.BaseDatastore
import typings.datastoreCore.mod.Shard_
import typings.interfaceDatastore.mod.Datastore
import typings.interfaceDatastore.mod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcShardingMod {
  
  @JSImport("datastore-core/dist/src/sharding", "ShardingDatastore")
  @js.native
  open class ShardingDatastore protected () extends BaseDatastore {
    def this(
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
          ],
      shard: Shard_
    ) = this()
    
    def _convertKey(key: Key): Key = js.native
    
    def _invertKey(key: Key): Key = js.native
    
    /* private */ val child: Any = js.native
    
    def open(): js.Promise[Unit] = js.native
    
    /* private */ var shard: Any = js.native
  }
  /* static members */
  object ShardingDatastore {
    
    @JSImport("datastore-core/dist/src/sharding", "ShardingDatastore")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(
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
    ): js.Promise[Shard_] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(store.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Shard_]]
    inline def create(
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
        ],
      shard: Shard_
    ): js.Promise[Shard_] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(store.asInstanceOf[js.Any], shard.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Shard_]]
  }
}
