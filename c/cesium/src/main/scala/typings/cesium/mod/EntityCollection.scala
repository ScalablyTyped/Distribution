package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "EntityCollection")
@js.native
class EntityCollection protected () extends StObject {
  def this(owner: CompositeEntityCollection) = this()
  def this(owner: DataSource) = this()
  
  def add(entity: Entity): Entity = js.native
  
  val collectionChanged: Event[js.Array[_]] = js.native
  
  def computeAvailability(): TimeInterval = js.native
  
  def contains(entity: Entity): Boolean = js.native
  
  def getById(id: String): Entity = js.native
  
  def getOrCreateEntity(id: String): Entity = js.native
  
  val id: String = js.native
  
  val owner: DataSource | CompositeEntityCollection = js.native
  
  def remove(entity: Entity): Boolean = js.native
  
  def removeAll(): Unit = js.native
  
  def removeById(id: String): Boolean = js.native
  
  def resumeEvents(): Unit = js.native
  
  var show: Boolean = js.native
  
  def suspendEvents(): Unit = js.native
  
  val values: js.Array[Entity] = js.native
}
object EntityCollection {
  
  /* static member */
  @JSImport("cesium", "EntityCollection.collectionChangedEventCallback")
  @js.native
  def collectionChangedEventCallback(
    collection: EntityCollection,
    added: js.Array[Entity],
    removed: js.Array[Entity],
    changed: js.Array[Entity]
  ): Unit = js.native
}
