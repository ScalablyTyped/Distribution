package typings.cesium.mod

import typings.cesium.mod.WebMapServiceImageryProvider.ConstructorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "WebMapServiceImageryProvider")
@js.native
open class WebMapServiceImageryProvider protected () extends StObject {
  def this(options: ConstructorOptions) = this()
  
  /**
    * Gets or sets a clock that is used to get keep the time used for time dynamic parameters.
    */
  var clock: Clock = js.native
  
  /**
    * Gets the credit to display when this imagery provider is active.  Typically this is used to credit
    * the source of the imagery.  This function should not be called before {@link WebMapServiceImageryProvider#ready} returns true.
    */
  val credit: Credit = js.native
  
  /**
    * The default alpha blending value of this provider, with 0.0 representing fully transparent and
    * 1.0 representing fully opaque.
    */
  var defaultAlpha: js.UndefOr[Double] = js.native
  
  /**
    * The default brightness of this provider.  1.0 uses the unmodified imagery color.  Less than 1.0
    * makes the imagery darker while greater than 1.0 makes it brighter.
    */
  var defaultBrightness: js.UndefOr[Double] = js.native
  
  /**
    * The default contrast of this provider.  1.0 uses the unmodified imagery color.  Less than 1.0 reduces
    * the contrast while greater than 1.0 increases it.
    */
  var defaultContrast: js.UndefOr[Double] = js.native
  
  /**
    * The default alpha blending value on the day side of the globe of this provider, with 0.0 representing fully transparent and
    * 1.0 representing fully opaque.
    */
  var defaultDayAlpha: js.UndefOr[Double] = js.native
  
  /**
    * The default gamma correction to apply to this provider.  1.0 uses the unmodified imagery color.
    */
  var defaultGamma: js.UndefOr[Double] = js.native
  
  /**
    * The default hue of this provider in radians. 0.0 uses the unmodified imagery color.
    */
  var defaultHue: js.UndefOr[Double] = js.native
  
  /**
    * The default texture magnification filter to apply to this provider.
    */
  var defaultMagnificationFilter: TextureMagnificationFilter = js.native
  
  /**
    * The default texture minification filter to apply to this provider.
    */
  var defaultMinificationFilter: TextureMinificationFilter = js.native
  
  /**
    * The default alpha blending value on the night side of the globe of this provider, with 0.0 representing fully transparent and
    * 1.0 representing fully opaque.
    */
  var defaultNightAlpha: js.UndefOr[Double] = js.native
  
  /**
    * The default saturation of this provider. 1.0 uses the unmodified imagery color. Less than 1.0 reduces the
    * saturation while greater than 1.0 increases it.
    */
  var defaultSaturation: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets a value indicating whether feature picking is enabled.  If true, {@link WebMapServiceImageryProvider#pickFeatures} will
    * invoke the <code>GetFeatureInfo</code> service on the WMS server and attempt to interpret the features included in the response.  If false,
    * {@link WebMapServiceImageryProvider#pickFeatures} will immediately return undefined (indicating no pickable
    * features) without communicating with the server.  Set this property to false if you know your data
    * source does not support picking features or if you don't want this provider's features to be pickable.
    */
  var enablePickFeatures: Boolean = js.native
  
  /**
    * Gets an event that is raised when the imagery provider encounters an asynchronous error.  By subscribing
    * to the event, you will be notified of the error and can potentially recover from it.  Event listeners
    * are passed an instance of {@link TileProviderError}.
    */
  val errorEvent: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Gets the getFeatureInfo URL of the WMS server.
    */
  val getFeatureInfoUrl: Resource | String = js.native
  
  /**
    * Gets the credits to be displayed when a given tile is displayed.
    * @param x - The tile X coordinate.
    * @param y - The tile Y coordinate.
    * @param level - The tile level;
    * @returns The credits to be displayed when the tile is displayed.
    */
  def getTileCredits(x: Double, y: Double, level: Double): js.Array[Credit] = js.native
  
  /**
    * Gets a value indicating whether or not the images provided by this imagery provider
    * include an alpha channel.  If this property is false, an alpha channel, if present, will
    * be ignored.  If this property is true, any images without an alpha channel will be treated
    * as if their alpha is 1.0 everywhere.  When this property is false, memory usage
    * and texture upload time are reduced.
    */
  val hasAlphaChannel: Boolean = js.native
  
  /**
    * Gets the names of the WMS layers, separated by commas.
    */
  val layers: String = js.native
  
  /**
    * Gets the maximum level-of-detail that can be requested.  This function should
    * not be called before {@link WebMapServiceImageryProvider#ready} returns true.
    */
  val maximumLevel: js.UndefOr[Double] = js.native
  
  /**
    * Gets the minimum level-of-detail that can be requested.  This function should
    * not be called before {@link WebMapServiceImageryProvider#ready} returns true.
    */
  val minimumLevel: Double = js.native
  
  /**
    * Asynchronously determines what features, if any, are located at a given longitude and latitude within
    * a tile.  This function should not be called before {@link ImageryProvider#ready} returns true.
    * @param x - The tile X coordinate.
    * @param y - The tile Y coordinate.
    * @param level - The tile level.
    * @param longitude - The longitude at which to pick features.
    * @param latitude - The latitude at which to pick features.
    * @returns A promise for the picked features that will resolve when the asynchronous
    *                   picking completes.  The resolved value is an array of {@link ImageryLayerFeatureInfo}
    *                   instances.  The array may be empty if no features are found at the given location.
    */
  def pickFeatures(x: Double, y: Double, level: Double, longitude: Double, latitude: Double): js.UndefOr[js.Promise[js.Array[ImageryLayerFeatureInfo]]] = js.native
  
  /**
    * Gets the proxy used by this provider.
    */
  val proxy: Proxy = js.native
  
  /**
    * Gets a value indicating whether or not the provider is ready for use.
    */
  val ready: Boolean = js.native
  
  /**
    * Gets a promise that resolves to true when the provider is ready for use.
    */
  val readyPromise: js.Promise[Boolean] = js.native
  
  /**
    * Gets the rectangle, in radians, of the imagery provided by this instance.  This function should
    * not be called before {@link WebMapServiceImageryProvider#ready} returns true.
    */
  val rectangle: Rectangle = js.native
  
  /**
    * Requests the image for a given tile.  This function should
    * not be called before {@link WebMapServiceImageryProvider#ready} returns true.
    * @param x - The tile X coordinate.
    * @param y - The tile Y coordinate.
    * @param level - The tile level.
    * @param [request] - The request object. Intended for internal use only.
    * @returns A promise for the image that will resolve when the image is available, or
    *          undefined if there are too many active requests to the server, and the request should be retried later.
    */
  def requestImage(x: Double, y: Double, level: Double): js.UndefOr[js.Promise[ImageryTypes]] = js.native
  def requestImage(x: Double, y: Double, level: Double, request: Request): js.UndefOr[js.Promise[ImageryTypes]] = js.native
  
  /**
    * Gets the tile discard policy.  If not undefined, the discard policy is responsible
    * for filtering out "missing" tiles via its shouldDiscardImage function.  If this function
    * returns undefined, no tiles are filtered.  This function should
    * not be called before {@link WebMapServiceImageryProvider#ready} returns true.
    */
  val tileDiscardPolicy: TileDiscardPolicy = js.native
  
  /**
    * Gets the height of each tile, in pixels.  This function should
    * not be called before {@link WebMapServiceImageryProvider#ready} returns true.
    */
  val tileHeight: Double = js.native
  
  /**
    * Gets the width of each tile, in pixels. This function should
    * not be called before {@link WebMapServiceImageryProvider#ready} returns true.
    */
  val tileWidth: Double = js.native
  
  /**
    * Gets the tiling scheme used by this provider.  This function should
    * not be called before {@link WebMapServiceImageryProvider#ready} returns true.
    */
  val tilingScheme: TilingScheme = js.native
  
  /**
    * Gets or sets a time interval collection that is used to get time dynamic parameters. The data of each
    * TimeInterval is an object containing the keys and values of the properties that are used during
    * tile requests.
    */
  var times: TimeIntervalCollection = js.native
  
  /**
    * Gets the URL of the WMS server.
    */
  val url: String = js.native
}
/* static members */
object WebMapServiceImageryProvider {
  
  /**
    * The default parameters to include in the WMS URL to obtain images.  The values are as follows:
    *    service=WMS
    *    version=1.1.1
    *    request=GetMap
    *    styles=
    *    format=image/jpeg
    */
  @JSImport("cesium", "WebMapServiceImageryProvider.DefaultParameters")
  @js.native
  val DefaultParameters: Any = js.native
  
  /**
    * The default parameters to include in the WMS URL to get feature information.  The values are as follows:
    *     service=WMS
    *     version=1.1.1
    *     request=GetFeatureInfo
    */
  @JSImport("cesium", "WebMapServiceImageryProvider.GetFeatureInfoDefaultParameters")
  @js.native
  val GetFeatureInfoDefaultParameters: Any = js.native
  
  /**
    * Initialization options for the WebMapServiceImageryProvider constructor
    * @property url - The URL of the WMS service. The URL supports the same keywords as the {@link UrlTemplateImageryProvider}.
    * @property layers - The layers to include, separated by commas.
    * @property [parameters = WebMapServiceImageryProvider.DefaultParameters] - Additional parameters to pass to the WMS server in the GetMap URL.
    * @property [getFeatureInfoParameters = WebMapServiceImageryProvider.GetFeatureInfoDefaultParameters] - Additional parameters to pass to the WMS server in the GetFeatureInfo URL.
    * @property [enablePickFeatures = true] - If true, {@link WebMapServiceImageryProvider#pickFeatures} will invoke
    *        the GetFeatureInfo operation on the WMS server and return the features included in the response.  If false,
    *        {@link WebMapServiceImageryProvider#pickFeatures} will immediately return undefined (indicating no pickable features)
    *        without communicating with the server.  Set this property to false if you know your WMS server does not support
    *        GetFeatureInfo or if you don't want this provider's features to be pickable. Note that this can be dynamically
    *        overridden by modifying the WebMapServiceImageryProvider#enablePickFeatures property.
    * @property [getFeatureInfoFormats = WebMapServiceImageryProvider.DefaultGetFeatureInfoFormats] - The formats
    *        in which to try WMS GetFeatureInfo requests.
    * @property [rectangle = Rectangle.MAX_VALUE] - The rectangle of the layer.
    * @property [tilingScheme = new GeographicTilingScheme()] - The tiling scheme to use to divide the world into tiles.
    * @property [ellipsoid] - The ellipsoid.  If the tilingScheme is specified,
    *        this parameter is ignored and the tiling scheme's ellipsoid is used instead. If neither
    *        parameter is specified, the WGS84 ellipsoid is used.
    * @property [tileWidth = 256] - The width of each tile in pixels.
    * @property [tileHeight = 256] - The height of each tile in pixels.
    * @property [minimumLevel = 0] - The minimum level-of-detail supported by the imagery provider.  Take care when
    *        specifying this that the number of tiles at the minimum level is small, such as four or less.  A larger number is
    *        likely to result in rendering problems.
    * @property [maximumLevel] - The maximum level-of-detail supported by the imagery provider, or undefined if there is no limit.
    *        If not specified, there is no limit.
    * @property [crs] - CRS specification, for use with WMS specification >= 1.3.0.
    * @property [srs] - SRS specification, for use with WMS specification 1.1.0 or 1.1.1
    * @property [credit] - A credit for the data source, which is displayed on the canvas.
    * @property [subdomains = 'abc'] - The subdomains to use for the <code>{s}</code> placeholder in the URL template.
    *                          If this parameter is a single string, each character in the string is a subdomain.  If it is
    *                          an array, each element in the array is a subdomain.
    * @property [clock] - A Clock instance that is used when determining the value for the time dimension. Required when `times` is specified.
    * @property [times] - TimeIntervalCollection with its data property being an object containing time dynamic dimension and their values.
    * @property [getFeatureInfoUrl] - The getFeatureInfo URL of the WMS service. If the property is not defined then we use the property value of url.
    */
  trait ConstructorOptions extends StObject {
    
    var clock: js.UndefOr[Clock] = js.undefined
    
    var credit: js.UndefOr[Credit | String] = js.undefined
    
    var crs: js.UndefOr[String] = js.undefined
    
    var ellipsoid: js.UndefOr[Ellipsoid] = js.undefined
    
    var enablePickFeatures: js.UndefOr[Boolean] = js.undefined
    
    var getFeatureInfoFormats: js.UndefOr[js.Array[GetFeatureInfoFormat]] = js.undefined
    
    var getFeatureInfoParameters: js.UndefOr[Any] = js.undefined
    
    var getFeatureInfoUrl: js.UndefOr[Resource | String] = js.undefined
    
    var layers: String
    
    var maximumLevel: js.UndefOr[Double] = js.undefined
    
    var minimumLevel: js.UndefOr[Double] = js.undefined
    
    var parameters: js.UndefOr[Any] = js.undefined
    
    var rectangle: js.UndefOr[Rectangle] = js.undefined
    
    var srs: js.UndefOr[String] = js.undefined
    
    var subdomains: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var tileHeight: js.UndefOr[Double] = js.undefined
    
    var tileWidth: js.UndefOr[Double] = js.undefined
    
    var tilingScheme: js.UndefOr[TilingScheme] = js.undefined
    
    var times: js.UndefOr[TimeIntervalCollection] = js.undefined
    
    var url: Resource | String
  }
  object ConstructorOptions {
    
    inline def apply(layers: String, url: Resource | String): ConstructorOptions = {
      val __obj = js.Dynamic.literal(layers = layers.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConstructorOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConstructorOptions] (val x: Self) extends AnyVal {
      
      inline def setClock(value: Clock): Self = StObject.set(x, "clock", value.asInstanceOf[js.Any])
      
      inline def setClockUndefined: Self = StObject.set(x, "clock", js.undefined)
      
      inline def setCredit(value: Credit | String): Self = StObject.set(x, "credit", value.asInstanceOf[js.Any])
      
      inline def setCreditUndefined: Self = StObject.set(x, "credit", js.undefined)
      
      inline def setCrs(value: String): Self = StObject.set(x, "crs", value.asInstanceOf[js.Any])
      
      inline def setCrsUndefined: Self = StObject.set(x, "crs", js.undefined)
      
      inline def setEllipsoid(value: Ellipsoid): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
      
      inline def setEllipsoidUndefined: Self = StObject.set(x, "ellipsoid", js.undefined)
      
      inline def setEnablePickFeatures(value: Boolean): Self = StObject.set(x, "enablePickFeatures", value.asInstanceOf[js.Any])
      
      inline def setEnablePickFeaturesUndefined: Self = StObject.set(x, "enablePickFeatures", js.undefined)
      
      inline def setGetFeatureInfoFormats(value: js.Array[GetFeatureInfoFormat]): Self = StObject.set(x, "getFeatureInfoFormats", value.asInstanceOf[js.Any])
      
      inline def setGetFeatureInfoFormatsUndefined: Self = StObject.set(x, "getFeatureInfoFormats", js.undefined)
      
      inline def setGetFeatureInfoFormatsVarargs(value: GetFeatureInfoFormat*): Self = StObject.set(x, "getFeatureInfoFormats", js.Array(value*))
      
      inline def setGetFeatureInfoParameters(value: Any): Self = StObject.set(x, "getFeatureInfoParameters", value.asInstanceOf[js.Any])
      
      inline def setGetFeatureInfoParametersUndefined: Self = StObject.set(x, "getFeatureInfoParameters", js.undefined)
      
      inline def setGetFeatureInfoUrl(value: Resource | String): Self = StObject.set(x, "getFeatureInfoUrl", value.asInstanceOf[js.Any])
      
      inline def setGetFeatureInfoUrlUndefined: Self = StObject.set(x, "getFeatureInfoUrl", js.undefined)
      
      inline def setLayers(value: String): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setMaximumLevel(value: Double): Self = StObject.set(x, "maximumLevel", value.asInstanceOf[js.Any])
      
      inline def setMaximumLevelUndefined: Self = StObject.set(x, "maximumLevel", js.undefined)
      
      inline def setMinimumLevel(value: Double): Self = StObject.set(x, "minimumLevel", value.asInstanceOf[js.Any])
      
      inline def setMinimumLevelUndefined: Self = StObject.set(x, "minimumLevel", js.undefined)
      
      inline def setParameters(value: Any): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      inline def setRectangle(value: Rectangle): Self = StObject.set(x, "rectangle", value.asInstanceOf[js.Any])
      
      inline def setRectangleUndefined: Self = StObject.set(x, "rectangle", js.undefined)
      
      inline def setSrs(value: String): Self = StObject.set(x, "srs", value.asInstanceOf[js.Any])
      
      inline def setSrsUndefined: Self = StObject.set(x, "srs", js.undefined)
      
      inline def setSubdomains(value: String | js.Array[String]): Self = StObject.set(x, "subdomains", value.asInstanceOf[js.Any])
      
      inline def setSubdomainsUndefined: Self = StObject.set(x, "subdomains", js.undefined)
      
      inline def setSubdomainsVarargs(value: String*): Self = StObject.set(x, "subdomains", js.Array(value*))
      
      inline def setTileHeight(value: Double): Self = StObject.set(x, "tileHeight", value.asInstanceOf[js.Any])
      
      inline def setTileHeightUndefined: Self = StObject.set(x, "tileHeight", js.undefined)
      
      inline def setTileWidth(value: Double): Self = StObject.set(x, "tileWidth", value.asInstanceOf[js.Any])
      
      inline def setTileWidthUndefined: Self = StObject.set(x, "tileWidth", js.undefined)
      
      inline def setTilingScheme(value: TilingScheme): Self = StObject.set(x, "tilingScheme", value.asInstanceOf[js.Any])
      
      inline def setTilingSchemeUndefined: Self = StObject.set(x, "tilingScheme", js.undefined)
      
      inline def setTimes(value: TimeIntervalCollection): Self = StObject.set(x, "times", value.asInstanceOf[js.Any])
      
      inline def setTimesUndefined: Self = StObject.set(x, "times", js.undefined)
      
      inline def setUrl(value: Resource | String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
