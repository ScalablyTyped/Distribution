package typings.cesium.mod

import typings.cesium.anon.ClampToGround
import typings.std.Blob
import typings.std.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "GpxDataSource")
@js.native
open class GpxDataSource () extends StObject {
  
  /**
    * Gets an event that will be raised when the underlying data changes.
    */
  var changedEvent: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Gets the clock settings defined by the loaded GPX. This represents the total
    * availability interval for all time-dynamic data. If the GPX does not contain
    * time-dynamic data, this value is undefined.
    */
  var clock: DataSourceClock = js.native
  
  /**
    * Gets or sets the clustering options for this data source. This object can be shared between multiple data sources.
    */
  var clustering: EntityCluster = js.native
  
  /**
    * Gets the creator of the GPX document.
    */
  var creator: String = js.native
  
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
  
  /**
    * Asynchronously loads the provided GPX data, replacing any existing data.
    * @param data - A url, parsed GPX document, or Blob containing binary GPX data or a parsed GPX document.
    * @param [options] - An object with the following properties:
    * @param [options.clampToGround] - True if the symbols should be rendered at the same height as the terrain
    * @param [options.waypointImage] - Image to use for waypoint billboards.
    * @param [options.trackImage] - Image to use for track billboards.
    * @param [options.trackColor] - Color to use for track lines.
    * @param [options.routeColor] - Color to use for route lines.
    * @returns A promise that will resolve to this instances once the GPX is loaded.
    */
  def load(data: String): js.Promise[GpxDataSource] = js.native
  def load(data: String, options: ClampToGround): js.Promise[GpxDataSource] = js.native
  def load(data: Blob): js.Promise[GpxDataSource] = js.native
  def load(data: Blob, options: ClampToGround): js.Promise[GpxDataSource] = js.native
  def load(data: Document): js.Promise[GpxDataSource] = js.native
  def load(data: Document, options: ClampToGround): js.Promise[GpxDataSource] = js.native
  
  /**
    * Gets an event that will be raised when the data source either starts or stops loading.
    */
  var loadingEvent: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Gets an object containing metadata about the GPX file.
    */
  var metadata: Any = js.native
  
  /**
    * Gets a human-readable name for this instance.
    * This will be automatically be set to the GPX document name on load.
    */
  var name: String = js.native
  
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
  
  /**
    * Gets the version of the GPX Schema in use.
    */
  var version: String = js.native
}
/* static members */
object GpxDataSource {
  
  @JSImport("cesium", "GpxDataSource")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a Promise to a new instance loaded with the provided GPX data.
    * @param data - A url, parsed GPX document, or Blob containing binary GPX data.
    * @param [options] - An object with the following properties:
    * @param [options.clampToGround] - True if the symbols should be rendered at the same height as the terrain
    * @param [options.waypointImage] - Image to use for waypoint billboards.
    * @param [options.trackImage] - Image to use for track billboards.
    * @param [options.trackColor] - Color to use for track lines.
    * @param [options.routeColor] - Color to use for route lines.
    * @returns A promise that will resolve to a new GpxDataSource instance once the gpx is loaded.
    */
  inline def load(data: String): js.Promise[GpxDataSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GpxDataSource]]
  inline def load(data: String, options: ClampToGround): js.Promise[GpxDataSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GpxDataSource]]
  inline def load(data: Blob): js.Promise[GpxDataSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GpxDataSource]]
  inline def load(data: Blob, options: ClampToGround): js.Promise[GpxDataSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GpxDataSource]]
  inline def load(data: Document): js.Promise[GpxDataSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GpxDataSource]]
  inline def load(data: Document, options: ClampToGround): js.Promise[GpxDataSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GpxDataSource]]
}
