package typings.cesium.mod

import typings.cesium.mod.GeoJsonDataSource.LoadOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "GeoJsonDataSource")
@js.native
open class GeoJsonDataSource () extends StObject {
  def this(name: String) = this()
  
  /**
    * Gets an event that will be raised when the underlying data changes.
    */
  var changedEvent: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * This DataSource only defines static data, therefore this property is always undefined.
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
  
  def load(data: String): js.Promise[GeoJsonDataSource] = js.native
  def load(data: String, options: LoadOptions): js.Promise[GeoJsonDataSource] = js.native
  def load(data: Any): js.Promise[GeoJsonDataSource] = js.native
  def load(data: Any, options: LoadOptions): js.Promise[GeoJsonDataSource] = js.native
  /**
    * Asynchronously loads the provided GeoJSON or TopoJSON data, replacing any existing data.
    * @param data - A url, GeoJSON object, or TopoJSON object to be loaded.
    * @param [options] - An object specifying configuration options
    * @returns a promise that will resolve when the GeoJSON is loaded.
    */
  def load(data: Resource): js.Promise[GeoJsonDataSource] = js.native
  def load(data: Resource, options: LoadOptions): js.Promise[GeoJsonDataSource] = js.native
  
  /**
    * Gets an event that will be raised when the data source either starts or stops loading.
    */
  var loadingEvent: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Gets or sets a human-readable name for this instance.
    */
  var name: String = js.native
  
  def process(data: String): js.Promise[GeoJsonDataSource] = js.native
  def process(data: String, options: LoadOptions): js.Promise[GeoJsonDataSource] = js.native
  def process(data: Any): js.Promise[GeoJsonDataSource] = js.native
  def process(data: Any, options: LoadOptions): js.Promise[GeoJsonDataSource] = js.native
  /**
    * Asynchronously loads the provided GeoJSON or TopoJSON data, without replacing any existing data.
    * @param data - A url, GeoJSON object, or TopoJSON object to be loaded.
    * @param [options] - An object specifying configuration options
    * @returns a promise that will resolve when the GeoJSON is loaded.
    */
  def process(data: Resource): js.Promise[GeoJsonDataSource] = js.native
  def process(data: Resource, options: LoadOptions): js.Promise[GeoJsonDataSource] = js.native
  
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
object GeoJsonDataSource {
  
  @JSImport("cesium", "GeoJsonDataSource")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets or sets default of whether to clamp to the ground.
    */
  @JSImport("cesium", "GeoJsonDataSource.clampToGround")
  @js.native
  def clampToGround: Boolean = js.native
  inline def clampToGround_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clampToGround")(x.asInstanceOf[js.Any])
  
  /**
    * Gets an object that maps the href property of a crs link to a callback function
    * which takes the crs properties object and returns a Promise that resolves
    * to a function that takes a GeoJSON coordinate and transforms it into a WGS84 Earth-fixed Cartesian.
    * Items in this object take precedence over those defined in <code>crsLinkHrefs</code>, assuming
    * the link has a type specified.
    */
  @JSImport("cesium", "GeoJsonDataSource.crsLinkHrefs")
  @js.native
  def crsLinkHrefs: Any = js.native
  inline def crsLinkHrefs_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("crsLinkHrefs")(x.asInstanceOf[js.Any])
  
  /**
    * Gets an object that maps the type property of a crs link to a callback function
    * which takes the crs properties object and returns a Promise that resolves
    * to a function that takes a GeoJSON coordinate and transforms it into a WGS84 Earth-fixed Cartesian.
    * Items in <code>crsLinkHrefs</code> take precedence over this object.
    */
  @JSImport("cesium", "GeoJsonDataSource.crsLinkTypes")
  @js.native
  def crsLinkTypes: Any = js.native
  inline def crsLinkTypes_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("crsLinkTypes")(x.asInstanceOf[js.Any])
  
  /**
    * Gets an object that maps the name of a crs to a callback function which takes a GeoJSON coordinate
    * and transforms it into a WGS84 Earth-fixed Cartesian.  Older versions of GeoJSON which
    * supported the EPSG type can be added to this list as well, by specifying the complete EPSG name,
    * for example 'EPSG:4326'.
    */
  @JSImport("cesium", "GeoJsonDataSource.crsNames")
  @js.native
  def crsNames: Any = js.native
  inline def crsNames_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("crsNames")(x.asInstanceOf[js.Any])
  
  /**
    * Gets or sets default color for polygon interiors.
    */
  @JSImport("cesium", "GeoJsonDataSource.fill")
  @js.native
  def fill: Color = js.native
  inline def fill_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fill")(x.asInstanceOf[js.Any])
  
  inline def load(data: String): js.Promise[GeoJsonDataSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GeoJsonDataSource]]
  inline def load(data: String, options: LoadOptions): js.Promise[GeoJsonDataSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeoJsonDataSource]]
  inline def load(data: Any): js.Promise[GeoJsonDataSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GeoJsonDataSource]]
  inline def load(data: Any, options: LoadOptions): js.Promise[GeoJsonDataSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeoJsonDataSource]]
  /**
    * Creates a Promise to a new instance loaded with the provided GeoJSON or TopoJSON data.
    * @param data - A url, GeoJSON object, or TopoJSON object to be loaded.
    * @param [options] - An object specifying configuration options
    * @returns A promise that will resolve when the data is loaded.
    */
  inline def load(data: Resource): js.Promise[GeoJsonDataSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GeoJsonDataSource]]
  inline def load(data: Resource, options: LoadOptions): js.Promise[GeoJsonDataSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeoJsonDataSource]]
  
  /**
    * Gets or sets the default color of the map pin created for each point.
    */
  @JSImport("cesium", "GeoJsonDataSource.markerColor")
  @js.native
  def markerColor: Color = js.native
  inline def markerColor_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("markerColor")(x.asInstanceOf[js.Any])
  
  /**
    * Gets or sets the default size of the map pin created for each point, in pixels.
    */
  @JSImport("cesium", "GeoJsonDataSource.markerSize")
  @js.native
  def markerSize: Double = js.native
  inline def markerSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("markerSize")(x.asInstanceOf[js.Any])
  
  /**
    * Gets or sets the default symbol of the map pin created for each point.
    * This can be any valid {@link http://mapbox.com/maki/|Maki} identifier, any single character,
    * or blank if no symbol is to be used.
    */
  @JSImport("cesium", "GeoJsonDataSource.markerSymbol")
  @js.native
  def markerSymbol: String = js.native
  inline def markerSymbol_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("markerSymbol")(x.asInstanceOf[js.Any])
  
  /**
    * Gets or sets the default color of polylines and polygon outlines.
    */
  @JSImport("cesium", "GeoJsonDataSource.stroke")
  @js.native
  def stroke: Color = js.native
  
  /**
    * Gets or sets the default width of polylines and polygon outlines.
    */
  @JSImport("cesium", "GeoJsonDataSource.strokeWidth")
  @js.native
  def strokeWidth: Double = js.native
  inline def strokeWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("strokeWidth")(x.asInstanceOf[js.Any])
  
  inline def stroke_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stroke")(x.asInstanceOf[js.Any])
  
  /**
    * Initialization options for the <code>load</code> method.
    * @property [sourceUri] - Overrides the url to use for resolving relative links.
    * @property [describe = GeoJsonDataSource.defaultDescribeProperty] - A function which returns a Property object (or just a string).
    * @property [markerSize = GeoJsonDataSource.markerSize] - The default size of the map pin created for each point, in pixels.
    * @property [markerSymbol = GeoJsonDataSource.markerSymbol] - The default symbol of the map pin created for each point.
    * @property [markerColor = GeoJsonDataSource.markerColor] - The default color of the map pin created for each point.
    * @property [stroke = GeoJsonDataSource.stroke] - The default color of polylines and polygon outlines.
    * @property [strokeWidth = GeoJsonDataSource.strokeWidth] - The default width of polylines and polygon outlines.
    * @property [fill = GeoJsonDataSource.fill] - The default color for polygon interiors.
    * @property [clampToGround = GeoJsonDataSource.clampToGround] - true if we want the geometry features (polygons or linestrings) clamped to the ground.
    * @property [credit] - A credit for the data source, which is displayed on the canvas.
    */
  trait LoadOptions extends StObject {
    
    var clampToGround: js.UndefOr[Boolean] = js.undefined
    
    var credit: js.UndefOr[Credit | String] = js.undefined
    
    var describe: js.UndefOr[typings.cesium.mod.GeoJsonDataSource.describe] = js.undefined
    
    var fill: js.UndefOr[Color] = js.undefined
    
    var markerColor: js.UndefOr[Color] = js.undefined
    
    var markerSize: js.UndefOr[Double] = js.undefined
    
    var markerSymbol: js.UndefOr[String] = js.undefined
    
    var sourceUri: js.UndefOr[String] = js.undefined
    
    var stroke: js.UndefOr[Color] = js.undefined
    
    var strokeWidth: js.UndefOr[Double] = js.undefined
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
      
      inline def setCredit(value: Credit | String): Self = StObject.set(x, "credit", value.asInstanceOf[js.Any])
      
      inline def setCreditUndefined: Self = StObject.set(x, "credit", js.undefined)
      
      inline def setDescribe(value: (/* properties */ Any, /* nameProperty */ String) => Unit): Self = StObject.set(x, "describe", js.Any.fromFunction2(value))
      
      inline def setDescribeUndefined: Self = StObject.set(x, "describe", js.undefined)
      
      inline def setFill(value: Color): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setMarkerColor(value: Color): Self = StObject.set(x, "markerColor", value.asInstanceOf[js.Any])
      
      inline def setMarkerColorUndefined: Self = StObject.set(x, "markerColor", js.undefined)
      
      inline def setMarkerSize(value: Double): Self = StObject.set(x, "markerSize", value.asInstanceOf[js.Any])
      
      inline def setMarkerSizeUndefined: Self = StObject.set(x, "markerSize", js.undefined)
      
      inline def setMarkerSymbol(value: String): Self = StObject.set(x, "markerSymbol", value.asInstanceOf[js.Any])
      
      inline def setMarkerSymbolUndefined: Self = StObject.set(x, "markerSymbol", js.undefined)
      
      inline def setSourceUri(value: String): Self = StObject.set(x, "sourceUri", value.asInstanceOf[js.Any])
      
      inline def setSourceUriUndefined: Self = StObject.set(x, "sourceUri", js.undefined)
      
      inline def setStroke(value: Color): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      inline def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
    }
  }
  
  /**
    * This callback is displayed as part of the GeoJsonDataSource class.
    * @param properties - The properties of the feature.
    * @param nameProperty - The property key that Cesium estimates to have the name of the feature.
    */
  type describe = js.Function2[/* properties */ Any, /* nameProperty */ String, Unit]
}
