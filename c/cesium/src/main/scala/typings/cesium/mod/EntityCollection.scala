package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "EntityCollection")
@js.native
class EntityCollection protected () extends js.Object {
  def this(owner: CompositeEntityCollection) = this()
  def this(owner: DataSource) = this()
  val collectionChanged: Event[js.Array[_]] = js.native
  val id: String = js.native
  val owner: DataSource | CompositeEntityCollection = js.native
  var show: Boolean = js.native
  val values: js.Array[Entity] = js.native
  def add(entity: Entity): Entity = js.native
  def computeAvailability(): TimeInterval = js.native
  def contains(entity: Entity): Boolean = js.native
  def getById(id: String): Entity = js.native
  def getOrCreateEntity(id: String): Entity = js.native
  def remove(entity: Entity): Boolean = js.native
  def removeAll(): Unit = js.native
  def removeById(id: String): Boolean = js.native
  def resumeEvents(): Unit = js.native
  def suspendEvents(): Unit = js.native
}

/* static members */
@JSImport("cesium", "EntityCollection")
@js.native
object EntityCollection extends js.Object {
  def collectionChangedEventCallback(
    collection: EntityCollection,
    added: js.Array[Entity],
    removed: js.Array[Entity],
    changed: js.Array[Entity]
  ): Unit = js.native
}

