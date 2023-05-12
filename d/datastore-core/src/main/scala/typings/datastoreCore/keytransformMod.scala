package typings.datastoreCore

import typings.datastoreCore.mod.KeyTransform
import typings.interfaceDatastore.mod.Datastore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object keytransformMod {
  
  @JSImport("datastore-core/keytransform", "KeyTransformDatastore")
  @js.native
  open class KeyTransformDatastore protected ()
    extends typings.datastoreCore.distSrcKeytransformMod.KeyTransformDatastore {
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
  }
}
