package typings.cesium.mod

import typings.cesium.mod.BingMapsImageryProvider.ConstructorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "BingMapsImageryProvider")
@js.native
open class BingMapsImageryProvider protected () extends StObject {
  def this(options: ConstructorOptions) = this()
  
  /**
    * Gets the credit to display when this imagery provider is active.  Typically this is used to credit
    * the source of the imagery.  This function should not be called before {@link BingMapsImageryProvider#ready} returns true.
    */
  val credit: Credit = js.native
  
  /**
    * The culture to use when requesting Bing Maps imagery. Not
    * all cultures are supported. See {@link http://msdn.microsoft.com/en-us/library/hh441729.aspx}
    * for information on the supported cultures.
    */
  val culture: String = js.native
  
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
    * as if their alpha is 1.0 everywhere.  Setting this property to false reduces memory usage
    * and texture upload time.
    */
  val hasAlphaChannel: Boolean = js.native
  
  /**
    * Gets the Bing Maps key.
    */
  val key: String = js.native
  
  /**
    * Gets the type of Bing Maps imagery to load.
    */
  val mapStyle: BingMapsStyle = js.native
  
  /**
    * Gets the maximum level-of-detail that can be requested.  This function should
    * not be called before {@link BingMapsImageryProvider#ready} returns true.
    */
  val maximumLevel: js.UndefOr[Double] = js.native
  
  /**
    * Gets the minimum level-of-detail that can be requested.  This function should
    * not be called before {@link BingMapsImageryProvider#ready} returns true.
    */
  val minimumLevel: Double = js.native
  
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
    * Gets the rectangle, in radians, of the imagery provided by this instance.  This function should
    * not be called before {@link BingMapsImageryProvider#ready} returns true.
    */
  val rectangle: Rectangle = js.native
  
  /**
    * Requests the image for a given tile.  This function should
    * not be called before {@link BingMapsImageryProvider#ready} returns true.
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
    * not be called before {@link BingMapsImageryProvider#ready} returns true.
    */
  val tileDiscardPolicy: TileDiscardPolicy = js.native
  
  /**
    * Gets the height of each tile, in pixels.  This function should
    * not be called before {@link BingMapsImageryProvider#ready} returns true.
    */
  val tileHeight: Double = js.native
  
  /**
    * Gets the width of each tile, in pixels. This function should
    * not be called before {@link BingMapsImageryProvider#ready} returns true.
    */
  val tileWidth: Double = js.native
  
  /**
    * Gets the tiling scheme used by this provider.  This function should
    * not be called before {@link BingMapsImageryProvider#ready} returns true.
    */
  val tilingScheme: TilingScheme = js.native
  
  /**
    * Gets the name of the BingMaps server url hosting the imagery.
    */
  val url: String = js.native
}
/* static members */
object BingMapsImageryProvider {
  
  @JSImport("cesium", "BingMapsImageryProvider")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets or sets the URL to the Bing logo for display in the credit.
    */
  @JSImport("cesium", "BingMapsImageryProvider.logoUrl")
  @js.native
  def logoUrl: String = js.native
  inline def logoUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logoUrl")(x.asInstanceOf[js.Any])
  
  /**
    * Converts a tile's quadkey used to request an image from a Bing Maps server into the
    * (x, y, level) position.
    * @param quadkey - The tile's quad key
    */
  inline def quadKeyToTileXY(quadkey: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("quadKeyToTileXY")(quadkey.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Converts a tiles (x, y, level) position into a quadkey used to request an image
    * from a Bing Maps server.
    * @param x - The tile's x coordinate.
    * @param y - The tile's y coordinate.
    * @param level - The tile's zoom level.
    */
  inline def tileXYToQuadKey(x: Double, y: Double, level: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("tileXYToQuadKey")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Initialization options for the BingMapsImageryProvider constructor
    * @property url - The url of the Bing Maps server hosting the imagery.
    * @property key - The Bing Maps key for your application, which can be
    *        created at {@link https://www.bingmapsportal.com/}.
    * @property [tileProtocol] - The protocol to use when loading tiles, e.g. 'http' or 'https'.
    *        By default, tiles are loaded using the same protocol as the page.
    * @property [mapStyle = BingMapsStyle.AERIAL] - The type of Bing Maps imagery to load.
    * @property [culture = ''] - The culture to use when requesting Bing Maps imagery. Not
    *        all cultures are supported. See {@link http://msdn.microsoft.com/en-us/library/hh441729.aspx}
    *        for information on the supported cultures.
    * @property [ellipsoid] - The ellipsoid.  If not specified, the WGS84 ellipsoid is used.
    * @property [tileDiscardPolicy] - The policy that determines if a tile
    *        is invalid and should be discarded.  By default, a {@link DiscardEmptyTileImagePolicy}
    *        will be used, with the expectation that the Bing Maps server will send a zero-length response for missing tiles.
    *        To ensure that no tiles are discarded, construct and pass a {@link NeverTileDiscardPolicy} for this parameter.
    */
  trait ConstructorOptions extends StObject {
    
    var culture: js.UndefOr[String] = js.undefined
    
    var ellipsoid: js.UndefOr[Ellipsoid] = js.undefined
    
    var key: String
    
    var mapStyle: js.UndefOr[BingMapsStyle] = js.undefined
    
    var tileDiscardPolicy: js.UndefOr[TileDiscardPolicy] = js.undefined
    
    var tileProtocol: js.UndefOr[String] = js.undefined
    
    var url: Resource | String
  }
  object ConstructorOptions {
    
    inline def apply(key: String, url: Resource | String): ConstructorOptions = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConstructorOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConstructorOptions] (val x: Self) extends AnyVal {
      
      inline def setCulture(value: String): Self = StObject.set(x, "culture", value.asInstanceOf[js.Any])
      
      inline def setCultureUndefined: Self = StObject.set(x, "culture", js.undefined)
      
      inline def setEllipsoid(value: Ellipsoid): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
      
      inline def setEllipsoidUndefined: Self = StObject.set(x, "ellipsoid", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setMapStyle(value: BingMapsStyle): Self = StObject.set(x, "mapStyle", value.asInstanceOf[js.Any])
      
      inline def setMapStyleUndefined: Self = StObject.set(x, "mapStyle", js.undefined)
      
      inline def setTileDiscardPolicy(value: TileDiscardPolicy): Self = StObject.set(x, "tileDiscardPolicy", value.asInstanceOf[js.Any])
      
      inline def setTileDiscardPolicyUndefined: Self = StObject.set(x, "tileDiscardPolicy", js.undefined)
      
      inline def setTileProtocol(value: String): Self = StObject.set(x, "tileProtocol", value.asInstanceOf[js.Any])
      
      inline def setTileProtocolUndefined: Self = StObject.set(x, "tileProtocol", js.undefined)
      
      inline def setUrl(value: Resource | String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
