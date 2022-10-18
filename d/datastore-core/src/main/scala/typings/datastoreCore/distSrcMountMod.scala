package typings.datastoreCore

import typings.datastoreCore.distSrcBaseMod.BaseDatastore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMountMod {
  
  @JSImport("datastore-core/dist/src/mount", "MountDatastore")
  @js.native
  open class MountDatastore protected () extends BaseDatastore {
    /**
      * @param {Array<{prefix: Key, datastore: Datastore}>} mounts
      */
    def this(mounts: js.Array[typings.datastoreCore.anon.Datastore]) = this()
    
    /**
      * Lookup the matching datastore for the given key
      *
      * @private
      * @param {Key} key
      * @returns {{datastore: Datastore, mountpoint: Key} | undefined}
      */
    /* private */ var _lookup: Any = js.native
    
    var mounts: js.Array[typings.datastoreCore.anon.Datastore] = js.native
  }
  
  type Batch = typings.interfaceDatastore.mod.Batch
  
  type Datastore = typings.interfaceDatastore.mod.Datastore
  
  type Key = typings.interfaceDatastore.mod.Key
  
  type KeyQuery = typings.interfaceDatastore.mod.KeyQuery
  
  type KeyTransform = typings.datastoreCore.distSrcTypesMod.KeyTransform
  
  type Options = typings.interfaceDatastore.mod.Options
  
  type Query = typings.interfaceDatastore.mod.Query
}
