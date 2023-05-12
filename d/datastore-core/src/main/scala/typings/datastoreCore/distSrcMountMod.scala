package typings.datastoreCore

import typings.datastoreCore.anon.Datastore
import typings.datastoreCore.distSrcBaseMod.BaseDatastore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMountMod {
  
  @JSImport("datastore-core/dist/src/mount", "MountDatastore")
  @js.native
  open class MountDatastore protected () extends BaseDatastore {
    def this(mounts: js.Array[Datastore]) = this()
    
    /**
      * Lookup the matching datastore for the given key
      */
    /* private */ var _lookup: Any = js.native
    
    /* private */ val mounts: Any = js.native
  }
}
