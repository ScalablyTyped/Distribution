package typings.datastoreCore

import typings.datastoreCore.distSrcBaseMod.BaseDatastore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcKeytransformMod {
  
  @JSImport("datastore-core/dist/src/keytransform", "KeyTransformDatastore")
  @js.native
  open class KeyTransformDatastore protected () extends BaseDatastore {
    /**
      * @param {Datastore} child
      * @param {KeyTransform} transform
      */
    def this(child: Datastore, transform: KeyTransform) = this()
    
    var child: typings.interfaceDatastore.mod.Datastore = js.native
    
    var transform: typings.datastoreCore.distSrcTypesMod.KeyTransform = js.native
  }
  
  type AwaitIterable[TEntry] = typings.interfaceStore.mod.AwaitIterable[TEntry]
  
  type Batch = typings.interfaceDatastore.mod.Batch
  
  type Datastore = typings.interfaceDatastore.mod.Datastore
  
  type Key = typings.interfaceDatastore.mod.Key
  
  type KeyQuery = typings.interfaceDatastore.mod.KeyQuery
  
  type KeyTransform = typings.datastoreCore.distSrcTypesMod.KeyTransform
  
  type Options = typings.interfaceDatastore.mod.Options
  
  type Pair = typings.interfaceDatastore.mod.Pair
  
  type Query = typings.interfaceDatastore.mod.Query
}
