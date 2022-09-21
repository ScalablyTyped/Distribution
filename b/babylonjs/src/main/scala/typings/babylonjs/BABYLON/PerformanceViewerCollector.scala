package typings.babylonjs.BABYLON

import typings.babylonjs.babylonjsStrings.category
import typings.babylonjs.babylonjsStrings.color
import typings.babylonjs.babylonjsStrings.hidden
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PerformanceViewerCollector extends StObject {
  
  /**
    * Collects data for every dataset by using the appropriate strategy. This is called every frame.
    * This method will then notify all observers with the latest slice.
    */
  /* private */ var _collectDataAtFrame: Any = js.native
  
  /* private */ val _customEventObservable: Any = js.native
  
  /* private */ var _datasetMeta: Any = js.native
  
  /* private */ val _eventRestoreSet: Any = js.native
  
  /**
    * Gets a 6 character hexcode representing the colour from a passed in string.
    * @param id the string to get a hex code for.
    * @returns a hexcode hashed from the id.
    */
  /* private */ var _getHexColorFromId: Any = js.native
  
  /* private */ var _hasLoadedData: Any = js.native
  
  /* private */ var _isStarted: Any = js.native
  
  /**
    * This event restores all custom string events if necessary.
    */
  /* private */ var _restoreStringEvents: Any = js.native
  
  /* private */ var _scene: Any = js.native
  
  /* private */ var _startingTimestamp: Any = js.native
  
  /* private */ var _strategies: Any = js.native
  
  /**
    * This method adds additional collection strategies for data collection purposes.
    * @param strategyCallbacks the list of data to collect with callbacks.
    */
  def addCollectionStrategies(strategyCallbacks: IPerformanceViewerStrategyParameter*): Unit = js.native
  
  /**
    * Completely clear, data, ids, and strategies saved to this performance collector.
    * @param preserveStringEventsRestore if it should preserve the string events, by default will clear string events registered when called.
    */
  def clear(): Unit = js.native
  def clear(preserveStringEventsRestore: Boolean): Unit = js.native
  
  /**
    * An observable you can attach to get deltas in the dataset. Subscribing to this will increase memory consumption slightly, and may hurt performance due to increased garbage collection needed.
    * Updates of slices will be of the form [timestamp, numberOfPoints, value1, value2...].
    */
  val datasetObservable: Observable[js.Array[Double]] = js.native
  
  /**
    * Datastructure containing the collected datasets. Warning: you should not modify the values in here, data will be of the form [timestamp, numberOfPoints, value1, value2..., timestamp, etc...]
    */
  val datasets: IPerfDatasets = js.native
  
  /**
    * Disposes of the object
    */
  def dispose(): Unit = js.native
  
  /**
    * Exports the datasets inside of the collector to a csv.
    */
  def exportDataToCsv(): Unit = js.native
  
  /**
    * Collects and then sends the latest slice to any observers by using the appropriate strategy when the user wants.
    * The slice will be of the form [timestamp, numberOfPoints, value1, value2...]
    * This method does not add onto the collected data accessible via the datasets variable.
    */
  def getCurrentSlice(): Unit = js.native
  
  /**
    * Accessor which lets the caller know if the performance collector has data loaded from a file or not!
    * Call clear() to reset this value.
    * @returns true if the data is loaded from a file, false otherwise.
    */
  def hasLoadedData: Boolean = js.native
  
  /**
    * Returns if the perf collector has been started or not.
    */
  def isStarted: Boolean = js.native
  
  /**
    * Given a string containing file data, this function parses the file data into the datasets object.
    * It returns a boolean to indicate if this object was successfully loaded with the data.
    * @param data string content representing the file data.
    * @param keepDatasetMeta if it should use reuse the existing dataset metadata
    * @returns true if the data was successfully loaded, false otherwise.
    */
  def loadFromFileData(data: String): Boolean = js.native
  def loadFromFileData(data: String, keepDatasetMeta: Boolean): Boolean = js.native
  
  /**
    * An observable you can attach to get the most updated map of metadatas.
    */
  val metadataObservable: Observable[Map[String, IPerfMetadata]] = js.native
  
  /**
    * Registers a custom string event which will be callable via sendEvent. This method returns an event object which will contain the id of the event.
    * The user can set a value optionally, which will be used in the sendEvent method. If the value is set, we will record this value at the end of each frame,
    * if not we will increment our counter and record the value of the counter at the end of each frame. The value recorded is 0 if no sendEvent method is called, within a frame.
    * @param name The name of the event to register
    * @param forceUpdate if the code should force add an event, and replace the last one.
    * @param category the category for that event
    * @returns The event registered, used in sendEvent
    */
  def registerEvent(name: String): js.UndefOr[IPerfCustomEvent] = js.native
  def registerEvent(name: String, forceUpdate: Boolean): js.UndefOr[IPerfCustomEvent] = js.native
  def registerEvent(name: String, forceUpdate: Boolean, category: String): js.UndefOr[IPerfCustomEvent] = js.native
  def registerEvent(name: String, forceUpdate: Unit, category: String): js.UndefOr[IPerfCustomEvent] = js.native
  
  /**
    * Lets the perf collector handle an event, occurences or event value depending on if the event.value params is set.
    * @param event the event to handle an occurence for
    */
  def sendEvent(event: IPerfCustomEvent): Unit = js.native
  
  /**
    * Starts the realtime collection of data.
    * @param shouldPreserve optional boolean param, if set will preserve the dataset between calls of start.
    */
  def start(): Unit = js.native
  def start(shouldPreserve: Boolean): Unit = js.native
  
  /**
    * Stops the collection of data.
    */
  def stop(): Unit = js.native
  
  @JSName("updateMetadata")
  def updateMetadata_category(id: String, prop: category): Unit = js.native
  @JSName("updateMetadata")
  def updateMetadata_category(id: String, prop: category, value: String): Unit = js.native
  /**
    * Updates a property for a dataset's metadata with the value provided.
    * @param id the id of the dataset which needs its metadata updated.
    * @param prop the property to update.
    * @param value the value to update the property with.
    */
  @JSName("updateMetadata")
  def updateMetadata_color(id: String, prop: color): Unit = js.native
  @JSName("updateMetadata")
  def updateMetadata_color(id: String, prop: color, value: String): Unit = js.native
  @JSName("updateMetadata")
  def updateMetadata_hidden(id: String, prop: hidden): Unit = js.native
  @JSName("updateMetadata")
  def updateMetadata_hidden(id: String, prop: hidden, value: Boolean): Unit = js.native
}
