package typings.datastoreCore

import typings.datastoreCore.distSrcBaseMod.BaseDatastore
import typings.datastoreCore.mod.KeyTransform
import typings.interfaceDatastore.mod.Datastore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcKeytransformMod {
  
  @JSImport("datastore-core/dist/src/keytransform", "KeyTransformDatastore")
  @js.native
  open class KeyTransformDatastore protected () extends BaseDatastore {
    def this(
      child: Datastore[
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
      transform: KeyTransform
    ) = this()
    
    /* private */ val child: Any = js.native
    
    var transform: KeyTransform = js.native
  }
}
