package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "EntityCollection")
@js.native
class EntityCollection protected ()
  extends cesiumLib.cesiumMod.CesiumNs.EntityCollection {
  def this(owner: cesiumLib.cesiumMod.CesiumNs.CompositeEntityCollection) = this()
  def this(owner: cesiumLib.cesiumMod.CesiumNs.DataSource) = this()
  /* CompleteClass */
  override val collectionChanged: cesiumLib.cesiumMod.CesiumNs.Event = js.native
  /* CompleteClass */
  override val id: java.lang.String = js.native
  /* CompleteClass */
  override val owner: cesiumLib.cesiumMod.CesiumNs.DataSource | cesiumLib.cesiumMod.CesiumNs.CompositeEntityCollection = js.native
  /* CompleteClass */
  override var show: scala.Boolean = js.native
  /* CompleteClass */
  override val values: js.Array[cesiumLib.cesiumMod.CesiumNs.Entity] = js.native
  /* CompleteClass */
  override def add(entity: cesiumLib.cesiumMod.CesiumNs.Entity): cesiumLib.cesiumMod.CesiumNs.Entity = js.native
  /* CompleteClass */
  override def computeAvailability(): cesiumLib.cesiumMod.CesiumNs.TimeInterval = js.native
  /* CompleteClass */
  override def contains(entity: cesiumLib.cesiumMod.CesiumNs.Entity): scala.Boolean = js.native
  /* CompleteClass */
  override def getById(id: java.lang.String): cesiumLib.cesiumMod.CesiumNs.Entity = js.native
  /* CompleteClass */
  override def getOrCreateEntity(id: java.lang.String): cesiumLib.cesiumMod.CesiumNs.Entity = js.native
  /* CompleteClass */
  override def remove(entity: cesiumLib.cesiumMod.CesiumNs.Entity): scala.Boolean = js.native
  /* CompleteClass */
  override def removeAll(): scala.Unit = js.native
  /* CompleteClass */
  override def removeById(id: java.lang.String): scala.Boolean = js.native
  /* CompleteClass */
  override def resumeEvents(): scala.Unit = js.native
  /* CompleteClass */
  override def suspendEvents(): scala.Unit = js.native
}

@JSImport("cesium", "EntityCollection")
@js.native
object EntityCollection extends js.Object {
  def collectionChangedEventCallback(
    collection: cesiumLib.cesiumMod.CesiumNs.EntityCollection,
    added: js.Array[cesiumLib.cesiumMod.CesiumNs.Entity],
    removed: js.Array[cesiumLib.cesiumMod.CesiumNs.Entity],
    changed: js.Array[cesiumLib.cesiumMod.CesiumNs.Entity]
  ): scala.Unit = js.native
}

