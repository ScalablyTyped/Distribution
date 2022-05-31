package typings.cesium.global.Cesium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.EntityCollection")
@js.native
class EntityCollection protected ()
  extends typings.cesium.mod.EntityCollection {
  def this(owner: typings.cesium.mod.CompositeEntityCollection) = this()
  def this(owner: typings.cesium.mod.DataSource) = this()
}
object EntityCollection {
  
  @JSGlobal("Cesium.EntityCollection")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def collectionChangedEventCallback(
    collection: typings.cesium.mod.EntityCollection,
    added: js.Array[typings.cesium.mod.Entity],
    removed: js.Array[typings.cesium.mod.Entity],
    changed: js.Array[typings.cesium.mod.Entity]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("collectionChangedEventCallback")(collection.asInstanceOf[js.Any], added.asInstanceOf[js.Any], removed.asInstanceOf[js.Any], changed.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
