package typings.cesium.mod

import typings.cesium.mod.ArcGisMapServerImageryProvider.ConstructorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "ArcGisMapServerImageryProvider")
@js.native
open class ArcGisMapServerImageryProvider protected () extends StObject {
  def this(options: ConstructorOptions) = this()
  
  /**
    * Gets the credit to display when this imagery provider is active.  Typically this is used to credit
    * the source of the imagery.  This function should not be called before {@link ArcGisMapServerImageryProvider#ready} returns true.
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
    * Gets or sets a value indicating whether feature picking is enabled.  If true, {@link ArcGisMapServerImageryProvider#pickFeatures} will
    * invoke the "identify" operation on the ArcGIS server and return the features included in the response.  If false,
    * {@link ArcGisMapServerImageryProvider#pickFeatures} will immediately return undefined (indicating no pickable features)
    * without communicating with the server.
    */
  var enablePickFeatures: Boolean = js.native
  
  /**
    * Gets an event that is raised when the imagery provider encounters an asynchronous error.  By subscribing
    * to the event, you will be notified of the error and can potentially recover from it.  Event listeners
    * are passed an instance of {@link TileProviderError}.
    */
  val errorEvent: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
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
    * Gets the comma-separated list of layer IDs to show.
    */
  var layers: String = js.native
  
  /**
    * Gets the maximum level-of-detail that can be requested.  This function should
    * not be called before {@link ArcGisMapServerImageryProvider#ready} returns true.
    */
  val maximumLevel: js.UndefOr[Double] = js.native
  
  /**
    * Gets the minimum level-of-detail that can be requested.  This function should
    * not be called before {@link ArcGisMapServerImageryProvider#ready} returns true.
    */
  val minimumLevel: Double = js.native
  
  /**
    * / **
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
    * not be called before {@link ArcGisMapServerImageryProvider#ready} returns true.
    */
  val rectangle: Rectangle = js.native
  
  /**
    * Requests the image for a given tile.  This function should
    * not be called before {@link ArcGisMapServerImageryProvider#ready} returns true.
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
    * not be called before {@link ArcGisMapServerImageryProvider#ready} returns true.
    */
  val tileDiscardPolicy: TileDiscardPolicy = js.native
  
  /**
    * Gets the height of each tile, in pixels.  This function should
    * not be called before {@link ArcGisMapServerImageryProvider#ready} returns true.
    */
  val tileHeight: Double = js.native
  
  /**
    * Gets the width of each tile, in pixels. This function should
    * not be called before {@link ArcGisMapServerImageryProvider#ready} returns true.
    */
  val tileWidth: Double = js.native
  
  /**
    * Gets the tiling scheme used by this provider.  This function should
    * not be called before {@link ArcGisMapServerImageryProvider#ready} returns true.
    */
  val tilingScheme: TilingScheme = js.native
  
  /**
    * Gets the ArcGIS token used to authenticate with the ArcGis MapServer service.
    */
  val token: String = js.native
  
  /**
    * Gets the URL of the ArcGIS MapServer.
    */
  val url: String = js.native
  
  /**
    * Gets a value indicating whether this imagery provider is using pre-cached tiles from the
    * ArcGIS MapServer.  If the imagery provider is not yet ready ({@link ArcGisMapServerImageryProvider#ready}), this function
    * will return the value of `options.usePreCachedTilesIfAvailable`, even if the MapServer does
    * not have pre-cached tiles.
    */
  val usingPrecachedTiles: Boolean = js.native
}
object ArcGisMapServerImageryProvider {
  
  /**
    * Initialization options for the ArcGisMapServerImageryProvider constructor
    * @property url - The URL of the ArcGIS MapServer service.
    * @property [token] - The ArcGIS token used to authenticate with the ArcGIS MapServer service.
    * @property [tileDiscardPolicy] - The policy that determines if a tile
    *        is invalid and should be discarded.  If this value is not specified, a default
    *        {@link DiscardMissingTileImagePolicy} is used for tiled map servers, and a
    *        {@link NeverTileDiscardPolicy} is used for non-tiled map servers.  In the former case,
    *        we request tile 0,0 at the maximum tile level and check pixels (0,0), (200,20), (20,200),
    *        (80,110), and (160, 130).  If all of these pixels are transparent, the discard check is
    *        disabled and no tiles are discarded.  If any of them have a non-transparent color, any
    *        tile that has the same values in these pixel locations is discarded.  The end result of
    *        these defaults should be correct tile discarding for a standard ArcGIS Server.  To ensure
    *        that no tiles are discarded, construct and pass a {@link NeverTileDiscardPolicy} for this
    *        parameter.
    * @property [usePreCachedTilesIfAvailable = true] - If true, the server's pre-cached
    *        tiles are used if they are available.  If false, any pre-cached tiles are ignored and the
    *        'export' service is used.
    * @property [layers] - A comma-separated list of the layers to show, or undefined if all layers should be shown.
    * @property [enablePickFeatures = true] - If true, {@link ArcGisMapServerImageryProvider#pickFeatures} will invoke
    *        the Identify service on the MapServer and return the features included in the response.  If false,
    *        {@link ArcGisMapServerImageryProvider#pickFeatures} will immediately return undefined (indicating no pickable features)
    *        without communicating with the server.  Set this property to false if you don't want this provider's features to
    *        be pickable. Can be overridden by setting the {@link ArcGisMapServerImageryProvider#enablePickFeatures} property on the object.
    * @property [rectangle = Rectangle.MAX_VALUE] - The rectangle of the layer.  This parameter is ignored when accessing
    *                    a tiled layer.
    * @property [tilingScheme = new GeographicTilingScheme()] - The tiling scheme to use to divide the world into tiles.
    *                       This parameter is ignored when accessing a tiled server.
    * @property [ellipsoid] - The ellipsoid.  If the tilingScheme is specified and used,
    *                    this parameter is ignored and the tiling scheme's ellipsoid is used instead. If neither
    *                    parameter is specified, the WGS84 ellipsoid is used.
    * @property [credit] - A credit for the data source, which is displayed on the canvas.  This parameter is ignored when accessing a tiled server.
    * @property [tileWidth = 256] - The width of each tile in pixels.  This parameter is ignored when accessing a tiled server.
    * @property [tileHeight = 256] - The height of each tile in pixels.  This parameter is ignored when accessing a tiled server.
    * @property [maximumLevel] - The maximum tile level to request, or undefined if there is no maximum.  This parameter is ignored when accessing
    *                                        a tiled server.
    */
  trait ConstructorOptions extends StObject {
    
    var credit: js.UndefOr[Credit | String] = js.undefined
    
    var ellipsoid: js.UndefOr[Ellipsoid] = js.undefined
    
    var enablePickFeatures: js.UndefOr[Boolean] = js.undefined
    
    var layers: js.UndefOr[String] = js.undefined
    
    var maximumLevel: js.UndefOr[Double] = js.undefined
    
    var rectangle: js.UndefOr[Rectangle] = js.undefined
    
    var tileDiscardPolicy: js.UndefOr[TileDiscardPolicy] = js.undefined
    
    var tileHeight: js.UndefOr[Double] = js.undefined
    
    var tileWidth: js.UndefOr[Double] = js.undefined
    
    var tilingScheme: js.UndefOr[TilingScheme] = js.undefined
    
    var token: js.UndefOr[String] = js.undefined
    
    var url: Resource | String
    
    var usePreCachedTilesIfAvailable: js.UndefOr[Boolean] = js.undefined
  }
  object ConstructorOptions {
    
    inline def apply(url: Resource | String): ConstructorOptions = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConstructorOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConstructorOptions] (val x: Self) extends AnyVal {
      
      inline def setCredit(value: Credit | String): Self = StObject.set(x, "credit", value.asInstanceOf[js.Any])
      
      inline def setCreditUndefined: Self = StObject.set(x, "credit", js.undefined)
      
      inline def setEllipsoid(value: Ellipsoid): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
      
      inline def setEllipsoidUndefined: Self = StObject.set(x, "ellipsoid", js.undefined)
      
      inline def setEnablePickFeatures(value: Boolean): Self = StObject.set(x, "enablePickFeatures", value.asInstanceOf[js.Any])
      
      inline def setEnablePickFeaturesUndefined: Self = StObject.set(x, "enablePickFeatures", js.undefined)
      
      inline def setLayers(value: String): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
      
      inline def setMaximumLevel(value: Double): Self = StObject.set(x, "maximumLevel", value.asInstanceOf[js.Any])
      
      inline def setMaximumLevelUndefined: Self = StObject.set(x, "maximumLevel", js.undefined)
      
      inline def setRectangle(value: Rectangle): Self = StObject.set(x, "rectangle", value.asInstanceOf[js.Any])
      
      inline def setRectangleUndefined: Self = StObject.set(x, "rectangle", js.undefined)
      
      inline def setTileDiscardPolicy(value: TileDiscardPolicy): Self = StObject.set(x, "tileDiscardPolicy", value.asInstanceOf[js.Any])
      
      inline def setTileDiscardPolicyUndefined: Self = StObject.set(x, "tileDiscardPolicy", js.undefined)
      
      inline def setTileHeight(value: Double): Self = StObject.set(x, "tileHeight", value.asInstanceOf[js.Any])
      
      inline def setTileHeightUndefined: Self = StObject.set(x, "tileHeight", js.undefined)
      
      inline def setTileWidth(value: Double): Self = StObject.set(x, "tileWidth", value.asInstanceOf[js.Any])
      
      inline def setTileWidthUndefined: Self = StObject.set(x, "tileWidth", js.undefined)
      
      inline def setTilingScheme(value: TilingScheme): Self = StObject.set(x, "tilingScheme", value.asInstanceOf[js.Any])
      
      inline def setTilingSchemeUndefined: Self = StObject.set(x, "tilingScheme", js.undefined)
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      
      inline def setUrl(value: Resource | String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUsePreCachedTilesIfAvailable(value: Boolean): Self = StObject.set(x, "usePreCachedTilesIfAvailable", value.asInstanceOf[js.Any])
      
      inline def setUsePreCachedTilesIfAvailableUndefined: Self = StObject.set(x, "usePreCachedTilesIfAvailable", js.undefined)
    }
  }
}
