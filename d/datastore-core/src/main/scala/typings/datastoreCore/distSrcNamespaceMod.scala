package typings.datastoreCore

import typings.datastoreCore.distSrcKeytransformMod.KeyTransformDatastore
import typings.interfaceDatastore.mod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcNamespaceMod {
  
  @JSImport("datastore-core/dist/src/namespace", "NamespaceDatastore")
  @js.native
  open class NamespaceDatastore protected () extends KeyTransformDatastore {
    /**
      * @param {Datastore} child
      * @param {Key} prefix
      */
    def this(child: Datastore, prefix: Key) = this()
  }
  
  type Batch = typings.interfaceDatastore.mod.Batch
  
  type Datastore = typings.interfaceDatastore.mod.Datastore
  
  type KeyQuery = typings.interfaceDatastore.mod.KeyQuery
  
  type KeyTransform = typings.datastoreCore.distSrcTypesMod.KeyTransform
  
  type Options = typings.interfaceDatastore.mod.Options
  
  type Query = typings.interfaceDatastore.mod.Query
}
