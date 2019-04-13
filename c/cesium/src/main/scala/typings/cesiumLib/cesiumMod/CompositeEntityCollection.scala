package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "CompositeEntityCollection")
@js.native
class CompositeEntityCollection () extends js.Object {
  def this(collections: js.Array[EntityCollection]) = this()
  var collectionChanged: Event[js.Array[_]] = js.native
  var id: java.lang.String = js.native
  var values: js.Array[Entity] = js.native
  def addCollection(collection: EntityCollection): scala.Unit = js.native
  def addCollection(collection: EntityCollection, index: scala.Double): scala.Unit = js.native
  def computeAvailability(): TimeInterval = js.native
  def contains(entity: Entity): scala.Boolean = js.native
  def containsCollection(collection: EntityCollection): scala.Boolean = js.native
  def getById(id: js.Any): Entity = js.native
  def getCollection(index: scala.Double): EntityCollection = js.native
  def getCollectionsLength(): scala.Double = js.native
  def indexOfCollection(collection: EntityCollection): scala.Double = js.native
  def lowerCollection(collection: EntityCollection): scala.Unit = js.native
  def lowerCollectionToBottom(collection: EntityCollection): scala.Unit = js.native
  def raiseCollection(collection: EntityCollection): scala.Unit = js.native
  def raiseCollectionToTop(collection: EntityCollection): scala.Unit = js.native
  def removeAllCollections(): scala.Unit = js.native
  def removeCollection(collection: EntityCollection): scala.Boolean = js.native
  def resumeEvents(): scala.Unit = js.native
  def suspendEvents(): scala.Unit = js.native
}

