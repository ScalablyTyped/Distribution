package typings.datastoreCore

import typings.datastoreCore.distSrcKeytransformMod.KeyTransformDatastore
import typings.interfaceDatastore.mod.Datastore
import typings.interfaceDatastore.mod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcNamespaceMod {
  
  @JSImport("datastore-core/dist/src/namespace", "NamespaceDatastore")
  @js.native
  open class NamespaceDatastore protected () extends KeyTransformDatastore {
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
      prefix: Key
    ) = this()
  }
}
