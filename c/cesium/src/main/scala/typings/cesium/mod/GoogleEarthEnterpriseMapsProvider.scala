package typings.cesium.mod

import typings.cesium.mod.GoogleEarthEnterpriseMapsProvider.ConstructorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "GoogleEarthEnterpriseMapsProvider")
@js.native
open class GoogleEarthEnterpriseMapsProvider protected () extends StObject {
  def this(options: ConstructorOptions) = this()
  
  /**
    * Gets the imagery channel (id) currently being used.
    */
  val channel: Double = js.native
  
  /**
    * Gets the credit to display when this imagery provider is active.  Typically this is used to credit
    * the source of the imagery.
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
    * Gets the maximum level-of-detail that can be requested.
    */
  val maximumLevel: js.UndefOr[Double] = js.native
  
  /**
    * Gets the minimum level-of-detail that can be requested.
    */
  val minimumLevel: Double = js.native
  
  /**
    * Gets the url path of the data on the Google Earth server.
    */
  val path: String = js.native
  
  /**
    * Picking features is not currently supported by this imagery provider, so this function simply returns
    * undefined.
    * @param x - The tile X coordinate.
    * @param y - The tile Y coordinate.
    * @param level - The tile level.
    * @param longitude - The longitude at which to pick features.
    * @param latitude - The latitude at which to pick features.
    * @returns Undefined since picking is not supported.
    */
  def pickFeatures(x: Double, y: Double, level: Double, longitude: Double, latitude: Double): Unit = js.native
  
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
    * Gets the rectangle, in radians, of the imagery provided by this instance.
    */
  val rectangle: Rectangle = js.native
  
  /**
    * Requests the image for a given tile.
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
    * Gets the type of data that is being requested from the provider.
    */
  val requestType: String = js.native
  
  /**
    * Gets the tile discard policy.  If not undefined, the discard policy is responsible
    * for filtering out "missing" tiles via its shouldDiscardImage function.  If this function
    * returns undefined, no tiles are filtered.
    */
  val tileDiscardPolicy: TileDiscardPolicy = js.native
  
  /**
    * Gets the height of each tile, in pixels.
    */
  val tileHeight: Double = js.native
  
  /**
    * Gets the width of each tile, in pixels.
    */
  val tileWidth: Double = js.native
  
  /**
    * Gets the tiling scheme used by this provider.
    */
  val tilingScheme: TilingScheme = js.native
  
  /**
    * Gets the URL of the Google Earth MapServer.
    */
  val url: String = js.native
  
  /**
    * Gets the version of the data used by this provider.
    */
  val version: Double = js.native
}
/* static members */
object GoogleEarthEnterpriseMapsProvider {
  
  @JSImport("cesium", "GoogleEarthEnterpriseMapsProvider")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromUrl(url: String): js.Promise[GoogleEarthEnterpriseMapsProvider] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUrl")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GoogleEarthEnterpriseMapsProvider]]
  inline def fromUrl(url: String, options: ConstructorOptions): js.Promise[GoogleEarthEnterpriseMapsProvider] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUrl")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GoogleEarthEnterpriseMapsProvider]]
  /**
    * Creates a tiled imagery provider using the Google Earth Imagery API.
    * @example
    * const google = await Cesium.GoogleEarthEnterpriseMapsProvider.fromUrl("https://earth.localdomain", 1008);
    * @param url - The url of the Google Earth server hosting the imagery.
    * @param [options] - Object describing initialization options
    * @returns The created GoogleEarthEnterpriseMapsProvider.
    */
  inline def fromUrl(url: Resource): js.Promise[GoogleEarthEnterpriseMapsProvider] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUrl")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GoogleEarthEnterpriseMapsProvider]]
  inline def fromUrl(url: Resource, options: ConstructorOptions): js.Promise[GoogleEarthEnterpriseMapsProvider] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUrl")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GoogleEarthEnterpriseMapsProvider]]
  
  /**
    * Gets or sets the URL to the Google Earth logo for display in the credit.
    */
  @JSImport("cesium", "GoogleEarthEnterpriseMapsProvider.logoUrl")
  @js.native
  def logoUrl: String = js.native
  inline def logoUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logoUrl")(x.asInstanceOf[js.Any])
  
  /**
    * Initialization options for the GoogleEarthEnterpriseMapsProvider constructor
    * @property [url] - The url of the Google Earth server hosting the imagery. Deprecated.
    * @property channel - The channel (id) to be used when requesting data from the server.
    *        The channel number can be found by looking at the json file located at:
    *        earth.localdomain/default_map/query?request=Json&vars=geeServerDefs The /default_map path may
    *        differ depending on your Google Earth Enterprise server configuration. Look for the "id" that
    *        is associated with a "ImageryMaps" requestType. There may be more than one id available.
    *        Example:
    *        {
    *          layers: [
    *            {
    *              id: 1002,
    *              requestType: "ImageryMaps"
    *            },
    *            {
    *              id: 1007,
    *              requestType: "VectorMapsRaster"
    *            }
    *          ]
    *        }
    * @property [path = "/default_map"] - The path of the Google Earth server hosting the imagery.
    * @property [maximumLevel] - The maximum level-of-detail supported by the Google Earth
    *        Enterprise server, or undefined if there is no limit.
    * @property [tileDiscardPolicy] - The policy that determines if a tile
    *        is invalid and should be discarded. To ensure that no tiles are discarded, construct and pass
    *        a {@link NeverTileDiscardPolicy} for this parameter.
    * @property [ellipsoid] - The ellipsoid.  If not specified, the WGS84 ellipsoid is used.
    */
  trait ConstructorOptions extends StObject {
    
    var channel: Double
    
    var ellipsoid: js.UndefOr[Ellipsoid] = js.undefined
    
    var maximumLevel: js.UndefOr[Double] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var tileDiscardPolicy: js.UndefOr[TileDiscardPolicy] = js.undefined
    
    var url: js.UndefOr[Resource | String] = js.undefined
  }
  object ConstructorOptions {
    
    inline def apply(channel: Double): ConstructorOptions = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConstructorOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConstructorOptions] (val x: Self) extends AnyVal {
      
      inline def setChannel(value: Double): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setEllipsoid(value: Ellipsoid): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
      
      inline def setEllipsoidUndefined: Self = StObject.set(x, "ellipsoid", js.undefined)
      
      inline def setMaximumLevel(value: Double): Self = StObject.set(x, "maximumLevel", value.asInstanceOf[js.Any])
      
      inline def setMaximumLevelUndefined: Self = StObject.set(x, "maximumLevel", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setTileDiscardPolicy(value: TileDiscardPolicy): Self = StObject.set(x, "tileDiscardPolicy", value.asInstanceOf[js.Any])
      
      inline def setTileDiscardPolicyUndefined: Self = StObject.set(x, "tileDiscardPolicy", js.undefined)
      
      inline def setUrl(value: Resource | String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
