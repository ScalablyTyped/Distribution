package typings.datastoreCore

import typings.interfaceDatastore.mod.Datastore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object tieredMod {
  
  @JSImport("datastore-core/tiered", "TieredDatastore")
  @js.native
  open class TieredDatastore protected ()
    extends typings.datastoreCore.distSrcTieredMod.TieredDatastore {
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
  }
}
