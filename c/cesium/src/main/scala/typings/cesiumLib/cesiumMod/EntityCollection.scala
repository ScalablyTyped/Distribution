package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "EntityCollection")
@js.native
class EntityCollection protected () extends js.Object {
  def this(owner: CompositeEntityCollection) = this()
  def this(owner: DataSource) = this()
  val collectionChanged: Event[js.Array[_]] = js.native
  val id: java.lang.String = js.native
  val owner: DataSource | CompositeEntityCollection = js.native
  var show: scala.Boolean = js.native
  val values: js.Array[Entity] = js.native
  def add(entity: Entity): Entity = js.native
  def computeAvailability(): TimeInterval = js.native
  def contains(entity: Entity): scala.Boolean = js.native
  def getById(id: java.lang.String): Entity = js.native
  def getOrCreateEntity(id: java.lang.String): Entity = js.native
  def remove(entity: Entity): scala.Boolean = js.native
  def removeAll(): scala.Unit = js.native
  def removeById(id: java.lang.String): scala.Boolean = js.native
  def resumeEvents(): scala.Unit = js.native
  def suspendEvents(): scala.Unit = js.native
}

/* static members */
@JSImport("cesium", "EntityCollection")
@js.native
object EntityCollection extends js.Object {
  def collectionChangedEventCallback(
    collection: cesiumLib.cesiumMod.EntityCollection,
    added: js.Array[cesiumLib.cesiumMod.Entity],
    removed: js.Array[cesiumLib.cesiumMod.Entity],
    changed: js.Array[cesiumLib.cesiumMod.Entity]
  ): scala.Unit = js.native
}

