package typings.datastoreCore

import typings.datastoreCore.distSrcBaseMod.BaseDatastore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTieredMod {
  
  @JSImport("datastore-core/dist/src/tiered", "TieredDatastore")
  @js.native
  open class TieredDatastore protected () extends BaseDatastore {
    /**
      * @param {Datastore[]} stores
      */
    def this(stores: js.Array[Datastore]) = this()
    
    var stores: js.Array[typings.interfaceDatastore.mod.Datastore] = js.native
  }
  
  type AwaitIterable[TEntry] = typings.interfaceStore.mod.AwaitIterable[TEntry]
  
  type Batch = typings.interfaceDatastore.mod.Batch
  
  type Datastore = typings.interfaceDatastore.mod.Datastore
  
  type Key = typings.interfaceDatastore.mod.Key
  
  type KeyQuery = typings.interfaceDatastore.mod.KeyQuery
  
  type Options = typings.interfaceDatastore.mod.Options
  
  type Pair = typings.interfaceDatastore.mod.Pair
  
  type Query = typings.interfaceDatastore.mod.Query
}
