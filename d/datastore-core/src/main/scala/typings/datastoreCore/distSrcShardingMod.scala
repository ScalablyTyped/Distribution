package typings.datastoreCore

import typings.datastoreCore.distSrcBaseMod.BaseDatastore
import typings.datastoreCore.distSrcKeytransformMod.KeyTransformDatastore
import typings.interfaceDatastore.mod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcShardingMod {
  
  @JSImport("datastore-core/dist/src/sharding", "ShardingDatastore")
  @js.native
  open class ShardingDatastore protected () extends BaseDatastore {
    /**
      * @param {Datastore} store
      * @param {Shard} shard
      */
    def this(store: Datastore, shard: Shard) = this()
    
    /**
      * @param {Key} key
      */
    def _convertKey(key: Key): Key = js.native
    
    /**
      * @param {Key} key
      */
    def _invertKey(key: Key): Key = js.native
    
    var child: KeyTransformDatastore = js.native
    
    var shard: typings.datastoreCore.distSrcTypesMod.Shard = js.native
  }
  /* static members */
  object ShardingDatastore {
    
    @JSImport("datastore-core/dist/src/sharding", "ShardingDatastore")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @param {Datastore} store
      * @param {Shard} shard
      */
    inline def create(store: Datastore, shard: Shard): js.Promise[typings.datastoreCore.distSrcTypesMod.Shard] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(store.asInstanceOf[js.Any], shard.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.datastoreCore.distSrcTypesMod.Shard]]
    
    /**
      * @deprecated
      * @param {Datastore} store
      * @param {Shard} shard
      */
    inline def createOrOpen(store: Datastore, shard: Shard): js.Promise[ShardingDatastore] = (^.asInstanceOf[js.Dynamic].applyDynamic("createOrOpen")(store.asInstanceOf[js.Any], shard.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ShardingDatastore]]
    
    /**
      * @deprecated
      * @param {Datastore} store
      */
    inline def open(store: Datastore): js.Promise[ShardingDatastore] = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(store.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ShardingDatastore]]
  }
  
  type Await[TValue] = typings.interfaceStore.mod.Await[TValue]
  
  type AwaitIterable[TEntry] = typings.interfaceStore.mod.AwaitIterable[TEntry]
  
  type Batch = typings.interfaceDatastore.mod.Batch
  
  type Datastore = typings.interfaceDatastore.mod.Datastore
  
  type KeyQuery = typings.interfaceDatastore.mod.KeyQuery
  
  type KeyQueryFilter = typings.interfaceDatastore.mod.KeyQueryFilter
  
  type KeyQueryOrder = typings.interfaceDatastore.mod.KeyQueryOrder
  
  type Options = typings.interfaceDatastore.mod.Options
  
  type Pair = typings.interfaceDatastore.mod.Pair
  
  type Query = typings.interfaceDatastore.mod.Query
  
  type QueryFilter = typings.interfaceDatastore.mod.QueryFilter
  
  type QueryOrder = typings.interfaceDatastore.mod.QueryOrder
  
  type Shard = typings.datastoreCore.distSrcTypesMod.Shard
}
