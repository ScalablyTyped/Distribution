package typings.cesiumEngine.mod

import typings.cesiumEngine.mod.KmlDataSource.ConstructorOptions
import typings.cesiumEngine.mod.KmlDataSource.LoadOptions
import typings.std.Blob
import typings.std.Document
import typings.std.Element
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "KmlDataSource")
@js.native
open class KmlDataSource () extends StObject {
  def this(options: ConstructorOptions) = this()
  
  /**
    * The position and orientation of this {@link Camera} will be used to
    * populate various camera parameters when making network requests.
    * Camera movement will determine when to trigger NetworkLink refresh if
    * <code>viewRefreshMode</code> is <code>onStop</code>.
    */
  var camera: js.UndefOr[Camera] = js.native
  
  /**
    * The current size of this Canvas will be used to populate the Link parameters
    * for client height and width.
    */
  var canvas: js.UndefOr[HTMLCanvasElement] = js.native
  
  /**
    * Gets an event that will be raised when the underlying data changes.
    */
  var changedEvent: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Gets the clock settings defined by the loaded KML. This represents the total
    * availability interval for all time-dynamic data. If the KML does not contain
    * time-dynamic data, this value is undefined.
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
    * Cleans up any non-entity elements created by the data source. Currently this only affects ScreenOverlay elements.
    */
  def destroy(): Unit = js.native
  
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
    * Gets the KML Tours that are used to guide the camera to specified destinations on given time intervals.
    */
  var kmlTours: js.Array[KmlTour] = js.native
  
  def load(data: String): js.Promise[KmlDataSource] = js.native
  def load(data: String, options: LoadOptions): js.Promise[KmlDataSource] = js.native
  /**
    * Asynchronously loads the provided KML data, replacing any existing data.
    * @param data - A url, parsed KML document, or Blob containing binary KMZ data or a parsed KML document.
    * @param [options] - An object specifying configuration options
    * @returns A promise that will resolve to this instances once the KML is loaded.
    */
  def load(data: Resource): js.Promise[KmlDataSource] = js.native
  def load(data: Resource, options: LoadOptions): js.Promise[KmlDataSource] = js.native
  def load(data: Blob): js.Promise[KmlDataSource] = js.native
  def load(data: Blob, options: LoadOptions): js.Promise[KmlDataSource] = js.native
  def load(data: Document): js.Promise[KmlDataSource] = js.native
  def load(data: Document, options: LoadOptions): js.Promise[KmlDataSource] = js.native
  
  /**
    * Gets an event that will be raised when the data source either starts or stops loading.
    */
  var loadingEvent: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Gets or sets a human-readable name for this instance.
    * This will be automatically be set to the KML document name on load.
    */
  var name: String = js.native
  
  /**
    * Gets an event that will be raised when the data source refreshes a network link.
    */
  var refreshEvent: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Gets whether or not this data source should be displayed.
    */
  var show: Boolean = js.native
  
  /**
    * Gets an event that will be raised when the data source finds an unsupported node type.
    */
  var unsupportedNodeEvent: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Updates any NetworkLink that require updating.
    * @param time - The simulation time.
    * @returns True if this data source is ready to be displayed at the provided time, false otherwise.
    */
  def update(time: JulianDate): Boolean = js.native
}
/* static members */
object KmlDataSource {
  
  @JSImport("@cesium/engine", "KmlDataSource")
  @js.native
  val ^ : js.Any = js.native
  
  inline def load(data: String): js.Promise[KmlDataSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[KmlDataSource]]
  inline def load(data: String, options: ConstructorOptions): js.Promise[KmlDataSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KmlDataSource]]
  /**
    * Creates a Promise to a new instance loaded with the provided KML data.
    * @param data - A url, parsed KML document, or Blob containing binary KMZ data or a parsed KML document.
    * @param [options] - An object specifying configuration options
    * @returns A promise that will resolve to a new KmlDataSource instance once the KML is loaded.
    */
  inline def load(data: Resource): js.Promise[KmlDataSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[KmlDataSource]]
  inline def load(data: Resource, options: ConstructorOptions): js.Promise[KmlDataSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KmlDataSource]]
  inline def load(data: Blob): js.Promise[KmlDataSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[KmlDataSource]]
  inline def load(data: Blob, options: ConstructorOptions): js.Promise[KmlDataSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KmlDataSource]]
  inline def load(data: Document): js.Promise[KmlDataSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[KmlDataSource]]
  inline def load(data: Document, options: ConstructorOptions): js.Promise[KmlDataSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KmlDataSource]]
  
  /**
    * Options for constructing a new KmlDataSource, or calling the static `load` method.
    * @property [camera] - The camera that is used for viewRefreshModes and sending camera properties to network links.
    * @property [canvas] - The canvas that is used for sending viewer properties to network links.
    * @property [credit] - A credit for the data source, which is displayed on the canvas.
    * @property [sourceUri] - Overrides the url to use for resolving relative links and other KML network features.
    * @property [clampToGround = false] - true if we want the geometry features (Polygons, LineStrings and LinearRings) clamped to the ground.
    * @property [ellipsoid = Ellipsoid.WGS84] - The global ellipsoid used for geographical calculations.
    * @property [screenOverlayContainer] - A container for ScreenOverlay images.
    */
  trait ConstructorOptions extends StObject {
    
    var camera: js.UndefOr[Camera] = js.undefined
    
    var canvas: js.UndefOr[HTMLCanvasElement] = js.undefined
    
    var clampToGround: js.UndefOr[Boolean] = js.undefined
    
    var credit: js.UndefOr[Credit | String] = js.undefined
    
    var ellipsoid: js.UndefOr[Ellipsoid] = js.undefined
    
    var screenOverlayContainer: js.UndefOr[Element | String] = js.undefined
    
    var sourceUri: js.UndefOr[String] = js.undefined
  }
  object ConstructorOptions {
    
    inline def apply(): ConstructorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConstructorOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConstructorOptions] (val x: Self) extends AnyVal {
      
      inline def setCamera(value: Camera): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
      
      inline def setCameraUndefined: Self = StObject.set(x, "camera", js.undefined)
      
      inline def setCanvas(value: HTMLCanvasElement): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
      
      inline def setCanvasUndefined: Self = StObject.set(x, "canvas", js.undefined)
      
      inline def setClampToGround(value: Boolean): Self = StObject.set(x, "clampToGround", value.asInstanceOf[js.Any])
      
      inline def setClampToGroundUndefined: Self = StObject.set(x, "clampToGround", js.undefined)
      
      inline def setCredit(value: Credit | String): Self = StObject.set(x, "credit", value.asInstanceOf[js.Any])
      
      inline def setCreditUndefined: Self = StObject.set(x, "credit", js.undefined)
      
      inline def setEllipsoid(value: Ellipsoid): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
      
      inline def setEllipsoidUndefined: Self = StObject.set(x, "ellipsoid", js.undefined)
      
      inline def setScreenOverlayContainer(value: Element | String): Self = StObject.set(x, "screenOverlayContainer", value.asInstanceOf[js.Any])
      
      inline def setScreenOverlayContainerUndefined: Self = StObject.set(x, "screenOverlayContainer", js.undefined)
      
      inline def setSourceUri(value: String): Self = StObject.set(x, "sourceUri", value.asInstanceOf[js.Any])
      
      inline def setSourceUriUndefined: Self = StObject.set(x, "sourceUri", js.undefined)
    }
  }
  
  /**
    * Initialization options for the `load` method.
    * @property [sourceUri] - Overrides the url to use for resolving relative links and other KML network features.
    * @property [clampToGround = false] - true if we want the geometry features (Polygons, LineStrings and LinearRings) clamped to the ground.
    * @property [ellipsoid = Ellipsoid.WGS84] - The global ellipsoid used for geographical calculations.
    * @property [screenOverlayContainer] - A container for ScreenOverlay images.
    */
  trait LoadOptions extends StObject {
    
    var clampToGround: js.UndefOr[Boolean] = js.undefined
    
    var ellipsoid: js.UndefOr[Ellipsoid] = js.undefined
    
    var screenOverlayContainer: js.UndefOr[Element | String] = js.undefined
    
    var sourceUri: js.UndefOr[String] = js.undefined
  }
  object LoadOptions {
    
    inline def apply(): LoadOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LoadOptions] (val x: Self) extends AnyVal {
      
      inline def setClampToGround(value: Boolean): Self = StObject.set(x, "clampToGround", value.asInstanceOf[js.Any])
      
      inline def setClampToGroundUndefined: Self = StObject.set(x, "clampToGround", js.undefined)
      
      inline def setEllipsoid(value: Ellipsoid): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
      
      inline def setEllipsoidUndefined: Self = StObject.set(x, "ellipsoid", js.undefined)
      
      inline def setScreenOverlayContainer(value: Element | String): Self = StObject.set(x, "screenOverlayContainer", value.asInstanceOf[js.Any])
      
      inline def setScreenOverlayContainerUndefined: Self = StObject.set(x, "screenOverlayContainer", js.undefined)
      
      inline def setSourceUri(value: String): Self = StObject.set(x, "sourceUri", value.asInstanceOf[js.Any])
      
      inline def setSourceUriUndefined: Self = StObject.set(x, "sourceUri", js.undefined)
    }
  }
}
