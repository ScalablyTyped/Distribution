package typings.datastoreCore

import typings.datastoreCore.mod.Shard_
import typings.interfaceDatastore.mod.Datastore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object shardingMod {
  
  @JSImport("datastore-core/sharding", "ShardingDatastore")
  @js.native
  open class ShardingDatastore protected ()
    extends typings.datastoreCore.distSrcShardingMod.ShardingDatastore {
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
  }
  /* static members */
  object ShardingDatastore {
    
    @JSImport("datastore-core/sharding", "ShardingDatastore")
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
