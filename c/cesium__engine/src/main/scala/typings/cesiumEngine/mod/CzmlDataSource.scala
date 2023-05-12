package typings.cesiumEngine.mod

import typings.cesiumEngine.mod.CzmlDataSource.LoadOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "CzmlDataSource")
@js.native
open class CzmlDataSource () extends StObject {
  def this(name: String) = this()
  
  /**
    * Gets an event that will be raised when the underlying data changes.
    */
  var changedEvent: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Gets the clock settings defined by the loaded CZML.  If no clock is explicitly
    * defined in the CZML, the combined availability of all objects is returned.  If
    * only static data exists, this value is undefined.
    */
  var clock: DataSourceClock = js.native
  
  /**
    * Gets or sets the clustering options for this data source. This object can be shared between multiple data sources.
    */
  var clustering: EntityCluster = js.native
  
  /**
    * Gets the credit that will be displayed for the data source
    */
  var credit: Credit = js.native
  
  /**
    * Gets the collection of {@link Entity} instances.
    */
  var entities: EntityCollection = js.native
  
  /**
    * Gets an event that will be raised if an error is encountered during processing.
    */
  var errorEvent: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Gets a value indicating if the data source is currently loading data.
    */
  var isLoading: Boolean = js.native
  
  def load(czml: String): js.Promise[CzmlDataSource] = js.native
  def load(czml: String, options: LoadOptions): js.Promise[CzmlDataSource] = js.native
  def load(czml: Any): js.Promise[CzmlDataSource] = js.native
  def load(czml: Any, options: LoadOptions): js.Promise[CzmlDataSource] = js.native
  /**
    * Loads the provided url or CZML object, replacing any existing data.
    * @param czml - A url or CZML object to be processed.
    * @param [options] - An object specifying configuration options
    * @returns A promise that resolves to this instances once the data is processed.
    */
  def load(czml: Resource): js.Promise[CzmlDataSource] = js.native
  def load(czml: Resource, options: LoadOptions): js.Promise[CzmlDataSource] = js.native
  
  /**
    * Gets an event that will be raised when the data source either starts or stops loading.
    */
  var loadingEvent: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Gets a human-readable name for this instance.
    */
  var name: String = js.native
  
  def process(czml: String): js.Promise[CzmlDataSource] = js.native
  def process(czml: String, options: LoadOptions): js.Promise[CzmlDataSource] = js.native
  def process(czml: Any): js.Promise[CzmlDataSource] = js.native
  def process(czml: Any, options: LoadOptions): js.Promise[CzmlDataSource] = js.native
  /**
    * Processes the provided url or CZML object without clearing any existing data.
    * @param czml - A url or CZML object to be processed.
    * @param [options] - An object specifying configuration options
    * @returns A promise that resolves to this instances once the data is processed.
    */
  def process(czml: Resource): js.Promise[CzmlDataSource] = js.native
  def process(czml: Resource, options: LoadOptions): js.Promise[CzmlDataSource] = js.native
  
  /**
    * Gets whether or not this data source should be displayed.
    */
  var show: Boolean = js.native
  
  /**
    * Updates the data source to the provided time.  This function is optional and
    * is not required to be implemented.  It is provided for data sources which
    * retrieve data based on the current animation time or scene state.
    * If implemented, update will be called by {@link DataSourceDisplay} once a frame.
    * @param time - The simulation time.
    * @returns True if this data source is ready to be displayed at the provided time, false otherwise.
    */
  def update(time: JulianDate): Boolean = js.native
}
/* static members */
object CzmlDataSource {
  
  @JSImport("@cesium/engine", "CzmlDataSource")
  @js.native
  val ^ : js.Any = js.native
  
  inline def load(czml: String): js.Promise[CzmlDataSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(czml.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CzmlDataSource]]
  inline def load(czml: String, options: LoadOptions): js.Promise[CzmlDataSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(czml.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CzmlDataSource]]
  inline def load(czml: Any): js.Promise[CzmlDataSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(czml.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CzmlDataSource]]
  inline def load(czml: Any, options: LoadOptions): js.Promise[CzmlDataSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(czml.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CzmlDataSource]]
  /**
    * Creates a Promise to a new instance loaded with the provided CZML data.
    * @param czml - A url or CZML object to be processed.
    * @param [options] - An object specifying configuration options
    * @returns A promise that resolves to the new instance once the data is processed.
    */
  inline def load(czml: Resource): js.Promise[CzmlDataSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(czml.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CzmlDataSource]]
  inline def load(czml: Resource, options: LoadOptions): js.Promise[CzmlDataSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(czml.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CzmlDataSource]]
  
  /**
    * A helper function used by custom CZML updater functions
    * which creates or updates a {@link MaterialProperty} from a CZML packet.
    * @param object - The object on which the property will be added or updated.
    * @param propertyName - The name of the property on the object.
    * @param packetData - The CZML packet being processed.
    * @param interval - A constraining interval for which the data is valid.
    * @param sourceUri - The originating uri of the data being processed.
    * @param entityCollection - The collection being processsed.
    */
  inline def processMaterialPacketData(
    `object`: Any,
    propertyName: String,
    packetData: Any,
    interval: TimeInterval,
    sourceUri: String,
    entityCollection: EntityCollection
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("processMaterialPacketData")(`object`.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any], packetData.asInstanceOf[js.Any], interval.asInstanceOf[js.Any], sourceUri.asInstanceOf[js.Any], entityCollection.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * A helper function used by custom CZML updater functions
    * which creates or updates a {@link Property} from a CZML packet.
    * @param type - The constructor function for the property being processed.
    * @param object - The object on which the property will be added or updated.
    * @param propertyName - The name of the property on the object.
    * @param packetData - The CZML packet being processed.
    * @param interval - A constraining interval for which the data is valid.
    * @param sourceUri - The originating uri of the data being processed.
    * @param entityCollection - The collection being processsed.
    */
  inline def processPacketData(
    `type`: js.Function1[/* repeated */ Any, Any],
    `object`: Any,
    propertyName: String,
    packetData: Any,
    interval: TimeInterval,
    sourceUri: String,
    entityCollection: EntityCollection
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("processPacketData")(`type`.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any], packetData.asInstanceOf[js.Any], interval.asInstanceOf[js.Any], sourceUri.asInstanceOf[js.Any], entityCollection.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * A helper function used by custom CZML updater functions
    * which creates or updates a {@link PositionProperty} from a CZML packet.
    * @param object - The object on which the property will be added or updated.
    * @param propertyName - The name of the property on the object.
    * @param packetData - The CZML packet being processed.
    * @param interval - A constraining interval for which the data is valid.
    * @param sourceUri - The originating uri of the data being processed.
    * @param entityCollection - The collection being processsed.
    */
  inline def processPositionPacketData(
    `object`: Any,
    propertyName: String,
    packetData: Any,
    interval: TimeInterval,
    sourceUri: String,
    entityCollection: EntityCollection
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("processPositionPacketData")(`object`.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any], packetData.asInstanceOf[js.Any], interval.asInstanceOf[js.Any], sourceUri.asInstanceOf[js.Any], entityCollection.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Gets the array of CZML processing functions.
    */
  @JSImport("@cesium/engine", "CzmlDataSource.updaters")
  @js.native
  def updaters: js.Array[UpdaterFunction] = js.native
  inline def updaters_=(x: js.Array[UpdaterFunction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("updaters")(x.asInstanceOf[js.Any])
  
  /**
    * Initialization options for the <code>load</code> method.
    * @property [sourceUri] - Overrides the url to use for resolving relative links.
    * @property [credit] - A credit for the data source, which is displayed on the canvas.
    */
  trait LoadOptions extends StObject {
    
    var credit: js.UndefOr[Credit | String] = js.undefined
    
    var sourceUri: js.UndefOr[Resource | String] = js.undefined
  }
  object LoadOptions {
    
    inline def apply(): LoadOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LoadOptions] (val x: Self) extends AnyVal {
      
      inline def setCredit(value: Credit | String): Self = StObject.set(x, "credit", value.asInstanceOf[js.Any])
      
      inline def setCreditUndefined: Self = StObject.set(x, "credit", js.undefined)
      
      inline def setSourceUri(value: Resource | String): Self = StObject.set(x, "sourceUri", value.asInstanceOf[js.Any])
      
      inline def setSourceUriUndefined: Self = StObject.set(x, "sourceUri", js.undefined)
    }
  }
  
  type UpdaterFunction = js.Function4[
    /* entity */ Entity, 
    /* packet */ Any, 
    /* entityCollection */ EntityCollection, 
    /* sourceUri */ String, 
    Unit
  ]
}
