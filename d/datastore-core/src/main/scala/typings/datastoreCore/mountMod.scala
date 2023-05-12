package typings.datastoreCore

import typings.datastoreCore.anon.Datastore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object mountMod {
  
  @JSImport("datastore-core/mount", "MountDatastore")
  @js.native
  open class MountDatastore protected ()
    extends typings.datastoreCore.distSrcMountMod.MountDatastore {
    def this(mounts: js.Array[Datastore]) = this()
  }
}
