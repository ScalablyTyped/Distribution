package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "DataSourceCollection")
@js.native
open class DataSourceCollection () extends StObject {
  
  def add(dataSource: js.Promise[DataSource]): js.Promise[DataSource] = js.native
  /**
    * Adds a data source to the collection.
    * @param dataSource - A data source or a promise to a data source to add to the collection.
    *                                        When passing a promise, the data source will not actually be added
    *                                        to the collection until the promise resolves successfully.
    * @returns A Promise that resolves once the data source has been added to the collection.
    */
  def add(dataSource: DataSource): js.Promise[DataSource] = js.native
  
  /**
    * Checks to see if the collection contains a given data source.
    * @param dataSource - The data source to check for.
    * @returns true if the collection contains the data source, false otherwise.
    */
  def contains(dataSource: DataSource): Boolean = js.native
  
  /**
    * An event that is raised when a data source is added to the collection.
    * Event handlers are passed the data source that was added.
    */
  val dataSourceAdded: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * An event that is raised when a data source changes position in the collection.  Event handlers are passed the data source
    * that was moved, its new index after the move, and its old index prior to the move.
    */
  val dataSourceMoved: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * An event that is raised when a data source is removed from the collection.
    * Event handlers are passed the data source that was removed.
    */
  val dataSourceRemoved: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Destroys the resources held by all data sources in this collection.  Explicitly destroying this
    * object allows for deterministic release of WebGL resources, instead of relying on the garbage
    * collector. Once this object is destroyed, it should not be used; calling any function other than
    * <code>isDestroyed</code> will result in a {@link DeveloperError} exception.  Therefore,
    * assign the return value (<code>undefined</code>) to the object as done in the example.
    * @example
    * dataSourceCollection = dataSourceCollection && dataSourceCollection.destroy();
    */
  def destroy(): Unit = js.native
  
  /**
    * Gets a data source by index from the collection.
    * @param index - the index to retrieve.
    * @returns The data source at the specified index.
    */
  def get(index: Double): DataSource = js.native
  
  /**
    * Gets a data source by name from the collection.
    * @param name - The name to retrieve.
    * @returns A list of all data sources matching the provided name.
    */
  def getByName(name: String): js.Array[DataSource] = js.native
  
  /**
    * Determines the index of a given data source in the collection.
    * @param dataSource - The data source to find the index of.
    * @returns The index of the data source in the collection, or -1 if the data source does not exist in the collection.
    */
  def indexOf(dataSource: DataSource): Double = js.native
  
  /**
    * Returns true if this object was destroyed; otherwise, false.
    * If this object was destroyed, it should not be used; calling any function other than
    * <code>isDestroyed</code> will result in a {@link DeveloperError} exception.
    * @returns true if this object was destroyed; otherwise, false.
    */
  def isDestroyed(): Boolean = js.native
  
  /**
    * Gets the number of data sources in this collection.
    */
  val length: Double = js.native
  
  /**
    * Lowers a data source down one position in the collection.
    * @param dataSource - The data source to move.
    */
  def lower(dataSource: DataSource): Unit = js.native
  
  /**
    * Lowers a data source to the bottom of the collection.
    * @param dataSource - The data source to move.
    */
  def lowerToBottom(dataSource: DataSource): Unit = js.native
  
  /**
    * Raises a data source up one position in the collection.
    * @param dataSource - The data source to move.
    */
  def raise(dataSource: DataSource): Unit = js.native
  
  /**
    * Raises a data source to the top of the collection.
    * @param dataSource - The data source to move.
    */
  def raiseToTop(dataSource: DataSource): Unit = js.native
  
  /**
    * Removes a data source from this collection, if present.
    * @param dataSource - The data source to remove.
    * @param [destroy = false] - Whether to destroy the data source in addition to removing it.
    * @returns true if the data source was in the collection and was removed,
    *                    false if the data source was not in the collection.
    */
  def remove(dataSource: DataSource): Boolean = js.native
  def remove(dataSource: DataSource, destroy: Boolean): Boolean = js.native
  
  /**
    * Removes all data sources from this collection.
    * @param [destroy = false] - whether to destroy the data sources in addition to removing them.
    */
  def removeAll(): Unit = js.native
  def removeAll(destroy: Boolean): Unit = js.native
}
