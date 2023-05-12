package typings.datastoreCore

import typings.interfaceDatastore.mod.Datastore
import typings.interfaceDatastore.mod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object namespaceMod {
  
  @JSImport("datastore-core/namespace", "NamespaceDatastore")
  @js.native
  open class NamespaceDatastore protected ()
    extends typings.datastoreCore.distSrcNamespaceMod.NamespaceDatastore {
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
