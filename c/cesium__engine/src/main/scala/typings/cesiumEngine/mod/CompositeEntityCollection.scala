package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "CompositeEntityCollection")
@js.native
open class CompositeEntityCollection () extends StObject {
  def this(collections: js.Array[EntityCollection]) = this()
  def this(collections: js.Array[EntityCollection], owner: CompositeEntityCollection) = this()
  def this(collections: js.Array[EntityCollection], owner: DataSource) = this()
  def this(collections: Unit, owner: CompositeEntityCollection) = this()
  def this(collections: Unit, owner: DataSource) = this()
  
  /**
    * Adds a collection to the composite.
    * @param collection - the collection to add.
    * @param [index] - the index to add the collection at.  If omitted, the collection will
    *                         added on top of all existing collections.
    */
  def addCollection(collection: EntityCollection): Unit = js.native
  def addCollection(collection: EntityCollection, index: Double): Unit = js.native
  
  /**
    * Gets the event that is fired when entities are added or removed from the collection.
    * The generated event is a {@link EntityCollection.collectionChangedEventCallback}.
    */
  val collectionChanged: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Computes the maximum availability of the entities in the collection.
    * If the collection contains a mix of infinitely available data and non-infinite data,
    * It will return the interval pertaining to the non-infinite data only.  If all
    * data is infinite, an infinite interval will be returned.
    * @returns The availability of entities in the collection.
    */
  def computeAvailability(): TimeInterval = js.native
  
  /**
    * Returns true if the provided entity is in this collection, false otherwise.
    * @param entity - The entity.
    * @returns true if the provided entity is in this collection, false otherwise.
    */
  def contains(entity: Entity): Boolean = js.native
  
  /**
    * Checks to see if the composite contains a given collection.
    * @param collection - the collection to check for.
    * @returns true if the composite contains the collection, false otherwise.
    */
  def containsCollection(collection: EntityCollection): Boolean = js.native
  
  /**
    * Gets an entity with the specified id.
    * @param id - The id of the entity to retrieve.
    * @returns The entity with the provided id or undefined if the id did not exist in the collection.
    */
  def getById(id: String): js.UndefOr[Entity] = js.native
  
  /**
    * Gets a collection by index from the composite.
    * @param index - the index to retrieve.
    */
  def getCollection(index: Double): Unit = js.native
  
  /**
    * Gets the number of collections in this composite.
    */
  def getCollectionsLength(): Unit = js.native
  
  /**
    * Gets a globally unique identifier for this collection.
    */
  val id: String = js.native
  
  /**
    * Determines the index of a given collection in the composite.
    * @param collection - The collection to find the index of.
    * @returns The index of the collection in the composite, or -1 if the collection does not exist in the composite.
    */
  def indexOfCollection(collection: EntityCollection): Double = js.native
  
  /**
    * Lowers a collection down one position in the composite.
    * @param collection - the collection to move.
    */
  def lowerCollection(collection: EntityCollection): Unit = js.native
  
  /**
    * Lowers a collection to the bottom of the composite.
    * @param collection - the collection to move.
    */
  def lowerCollectionToBottom(collection: EntityCollection): Unit = js.native
  
  /**
    * Gets the owner of this composite entity collection, ie. the data source or composite entity collection which created it.
    */
  val owner: DataSource | CompositeEntityCollection = js.native
  
  /**
    * Raises a collection up one position in the composite.
    * @param collection - the collection to move.
    */
  def raiseCollection(collection: EntityCollection): Unit = js.native
  
  /**
    * Raises a collection to the top of the composite.
    * @param collection - the collection to move.
    */
  def raiseCollectionToTop(collection: EntityCollection): Unit = js.native
  
  /**
    * Removes all collections from this composite.
    */
  def removeAllCollections(): Unit = js.native
  
  /**
    * Removes a collection from this composite, if present.
    * @param collection - The collection to remove.
    * @returns true if the collection was in the composite and was removed,
    *                    false if the collection was not in the composite.
    */
  def removeCollection(collection: EntityCollection): Boolean = js.native
  
  /**
    * Resumes raising {@link EntityCollection#collectionChanged} events immediately
    * when an item is added or removed.  Any modifications made while while events were suspended
    * will be triggered as a single event when this function is called.  This function also ensures
    * the collection is recomposited if events are also resumed.
    * This function is reference counted and can safely be called multiple times as long as there
    * are corresponding calls to {@link EntityCollection#resumeEvents}.
    */
  def resumeEvents(): Unit = js.native
  
  /**
    * Prevents {@link EntityCollection#collectionChanged} events from being raised
    * until a corresponding call is made to {@link EntityCollection#resumeEvents}, at which
    * point a single event will be raised that covers all suspended operations.
    * This allows for many items to be added and removed efficiently.
    * While events are suspended, recompositing of the collections will
    * also be suspended, as this can be a costly operation.
    * This function can be safely called multiple times as long as there
    * are corresponding calls to {@link EntityCollection#resumeEvents}.
    */
  def suspendEvents(): Unit = js.native
  
  /**
    * Gets the array of Entity instances in the collection.
    * This array should not be modified directly.
    */
  val values: js.Array[Entity] = js.native
}
