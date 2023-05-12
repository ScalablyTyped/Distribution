package typings.datastoreCore

import typings.datastoreCore.distSrcBaseMod.BaseDatastore
import typings.interfaceDatastore.mod.Datastore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTieredMod {
  
  @JSImport("datastore-core/dist/src/tiered", "TieredDatastore")
  @js.native
  open class TieredDatastore protected () extends BaseDatastore {
    def this(stores: js.Array[
            Datastore[
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
          ]) = this()
    
    /* private */ val stores: Any = js.native
  }
}
