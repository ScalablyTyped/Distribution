package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "CompositeEntityCollection")
@js.native
class CompositeEntityCollection () extends StObject {
  def this(collections: js.Array[EntityCollection]) = this()
  
  def addCollection(collection: EntityCollection): Unit = js.native
  def addCollection(collection: EntityCollection, index: Double): Unit = js.native
  
  var collectionChanged: Event[js.Array[_]] = js.native
  
  def computeAvailability(): TimeInterval = js.native
  
  def contains(entity: Entity): Boolean = js.native
  
  def containsCollection(collection: EntityCollection): Boolean = js.native
  
  def getById(id: js.Any): Entity = js.native
  
  def getCollection(index: Double): EntityCollection = js.native
  
  def getCollectionsLength(): Double = js.native
  
  var id: String = js.native
  
  def indexOfCollection(collection: EntityCollection): Double = js.native
  
  def lowerCollection(collection: EntityCollection): Unit = js.native
  
  def lowerCollectionToBottom(collection: EntityCollection): Unit = js.native
  
  def raiseCollection(collection: EntityCollection): Unit = js.native
  
  def raiseCollectionToTop(collection: EntityCollection): Unit = js.native
  
  def removeAllCollections(): Unit = js.native
  
  def removeCollection(collection: EntityCollection): Boolean = js.native
  
  def resumeEvents(): Unit = js.native
  
  def suspendEvents(): Unit = js.native
  
  var values: js.Array[Entity] = js.native
}
