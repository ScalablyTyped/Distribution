package typings.cesium.mod

import typings.cesium.mod.UrlTemplateImageryProvider.ConstructorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "UrlTemplateImageryProvider")
@js.native
open class UrlTemplateImageryProvider protected () extends StObject {
  def this(options: ConstructorOptions) = this()
  
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
    * Gets or sets a value indicating whether feature picking is enabled.  If true, {@link UrlTemplateImageryProvider#pickFeatures} will
    * request the <code>options.pickFeaturesUrl</code> and attempt to interpret the features included in the response.  If false,
    * {@link UrlTemplateImageryProvider#pickFeatures} will immediately return undefined (indicating no pickable
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
    * Gets the maximum level-of-detail that can be requested, or undefined if there is no limit.
    */
  val maximumLevel: js.UndefOr[Double] = js.native
  
  /**
    * Gets the minimum level-of-detail that can be requested.
    */
  val minimumLevel: Double = js.native
  
  /**
    * Asynchronously determines what features, if any, are located at a given longitude and latitude within
    * a tile.
    * @param x - The tile X coordinate.
    * @param y - The tile Y coordinate.
    * @param level - The tile level.
    * @param longitude - The longitude at which to pick features.
    * @param latitude - The latitude at which to pick features.
    * @returns A promise for the picked features that will resolve when the asynchronous
    *                   picking completes.  The resolved value is an array of {@link ImageryLayerFeatureInfo}
    *                   instances.  The array may be empty if no features are found at the given location.
    *                   It may also be undefined if picking is not supported.
    */
  def pickFeatures(x: Double, y: Double, level: Double, longitude: Double, latitude: Double): js.UndefOr[js.Promise[js.Array[ImageryLayerFeatureInfo]]] = js.native
  
  /**
    * Gets the URL template to use to use to pick features.  If this property is not specified,
    * {@link UrlTemplateImageryProvider#pickFeatures} will immediately return undefined, indicating no
    * features picked.  The URL template supports all of the keywords supported by the
    * {@link UrlTemplateImageryProvider#url} property, plus the following:
    * <ul>
    *     <li><code>{i}</code>: The pixel column (horizontal coordinate) of the picked position, where the Westernmost pixel is 0.</li>
    *     <li><code>{j}</code>: The pixel row (vertical coordinate) of the picked position, where the Northernmost pixel is 0.</li>
    *     <li><code>{reverseI}</code>: The pixel column (horizontal coordinate) of the picked position, where the Easternmost pixel is 0.</li>
    *     <li><code>{reverseJ}</code>: The pixel row (vertical coordinate) of the picked position, where the Southernmost pixel is 0.</li>
    *     <li><code>{longitudeDegrees}</code>: The longitude of the picked position in degrees.</li>
    *     <li><code>{latitudeDegrees}</code>: The latitude of the picked position in degrees.</li>
    *     <li><code>{longitudeProjected}</code>: The longitude of the picked position in the projected coordinates of the tiling scheme.</li>
    *     <li><code>{latitudeProjected}</code>: The latitude of the picked position in the projected coordinates of the tiling scheme.</li>
    *     <li><code>{format}</code>: The format in which to get feature information, as specified in the {@link GetFeatureInfoFormat}.</li>
    * </ul>
    */
  val pickFeaturesUrl: String = js.native
  
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
    * Reinitializes this instance.  Reinitializing an instance already in use is supported, but it is not
    * recommended because existing tiles provided by the imagery provider will not be updated.
    * @param options - Any of the options that may be passed to the {@link UrlTemplateImageryProvider} constructor.
    */
  def reinitialize(options: js.Promise[js.Object]): Unit = js.native
  def reinitialize(options: Any): Unit = js.native
  
  /**
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
    * Gets the URL template to use to request tiles.  It has the following keywords:
    * <ul>
    *  <li> <code>{z}</code>: The level of the tile in the tiling scheme.  Level zero is the root of the quadtree pyramid.</li>
    *  <li> <code>{x}</code>: The tile X coordinate in the tiling scheme, where 0 is the Westernmost tile.</li>
    *  <li> <code>{y}</code>: The tile Y coordinate in the tiling scheme, where 0 is the Northernmost tile.</li>
    *  <li> <code>{s}</code>: One of the available subdomains, used to overcome browser limits on the number of simultaneous requests per host.</li>
    *  <li> <code>{reverseX}</code>: The tile X coordinate in the tiling scheme, where 0 is the Easternmost tile.</li>
    *  <li> <code>{reverseY}</code>: The tile Y coordinate in the tiling scheme, where 0 is the Southernmost tile.</li>
    *  <li> <code>{reverseZ}</code>: The level of the tile in the tiling scheme, where level zero is the maximum level of the quadtree pyramid.  In order to use reverseZ, maximumLevel must be defined.</li>
    *  <li> <code>{westDegrees}</code>: The Western edge of the tile in geodetic degrees.</li>
    *  <li> <code>{southDegrees}</code>: The Southern edge of the tile in geodetic degrees.</li>
    *  <li> <code>{eastDegrees}</code>: The Eastern edge of the tile in geodetic degrees.</li>
    *  <li> <code>{northDegrees}</code>: The Northern edge of the tile in geodetic degrees.</li>
    *  <li> <code>{westProjected}</code>: The Western edge of the tile in projected coordinates of the tiling scheme.</li>
    *  <li> <code>{southProjected}</code>: The Southern edge of the tile in projected coordinates of the tiling scheme.</li>
    *  <li> <code>{eastProjected}</code>: The Eastern edge of the tile in projected coordinates of the tiling scheme.</li>
    *  <li> <code>{northProjected}</code>: The Northern edge of the tile in projected coordinates of the tiling scheme.</li>
    *  <li> <code>{width}</code>: The width of each tile in pixels.</li>
    *  <li> <code>{height}</code>: The height of each tile in pixels.</li>
    * </ul>
    */
  val url: String = js.native
  
  /**
    * Gets the URL scheme zero padding for each tile coordinate. The format is '000' where each coordinate will be padded on
    * the left with zeros to match the width of the passed string of zeros. e.g. Setting:
    * urlSchemeZeroPadding : { '{x}' : '0000'}
    * will cause an 'x' value of 12 to return the string '0012' for {x} in the generated URL.
    * It has the following keywords:
    * <ul>
    *  <li> <code>{z}</code>: The zero padding for the level of the tile in the tiling scheme.</li>
    *  <li> <code>{x}</code>: The zero padding for the tile X coordinate in the tiling scheme.</li>
    *  <li> <code>{y}</code>: The zero padding for the the tile Y coordinate in the tiling scheme.</li>
    *  <li> <code>{reverseX}</code>: The zero padding for the tile reverseX coordinate in the tiling scheme.</li>
    *  <li> <code>{reverseY}</code>: The zero padding for the tile reverseY coordinate in the tiling scheme.</li>
    *  <li> <code>{reverseZ}</code>: The zero padding for the reverseZ coordinate of the tile in the tiling scheme.</li>
    * </ul>
    */
  val urlSchemeZeroPadding: Any = js.native
}
object UrlTemplateImageryProvider {
  
  /**
    * Initialization options for the UrlTemplateImageryProvider constructor
    * @property [options] - Object with the following properties:
    * @property url - The URL template to use to request tiles.  It has the following keywords:
    * <ul>
    *     <li><code>{z}</code>: The level of the tile in the tiling scheme.  Level zero is the root of the quadtree pyramid.</li>
    *     <li><code>{x}</code>: The tile X coordinate in the tiling scheme, where 0 is the Westernmost tile.</li>
    *     <li><code>{y}</code>: The tile Y coordinate in the tiling scheme, where 0 is the Northernmost tile.</li>
    *     <li><code>{s}</code>: One of the available subdomains, used to overcome browser limits on the number of simultaneous requests per host.</li>
    *     <li><code>{reverseX}</code>: The tile X coordinate in the tiling scheme, where 0 is the Easternmost tile.</li>
    *     <li><code>{reverseY}</code>: The tile Y coordinate in the tiling scheme, where 0 is the Southernmost tile.</li>
    *     <li><code>{reverseZ}</code>: The level of the tile in the tiling scheme, where level zero is the maximum level of the quadtree pyramid.  In order to use reverseZ, maximumLevel must be defined.</li>
    *     <li><code>{westDegrees}</code>: The Western edge of the tile in geodetic degrees.</li>
    *     <li><code>{southDegrees}</code>: The Southern edge of the tile in geodetic degrees.</li>
    *     <li><code>{eastDegrees}</code>: The Eastern edge of the tile in geodetic degrees.</li>
    *     <li><code>{northDegrees}</code>: The Northern edge of the tile in geodetic degrees.</li>
    *     <li><code>{westProjected}</code>: The Western edge of the tile in projected coordinates of the tiling scheme.</li>
    *     <li><code>{southProjected}</code>: The Southern edge of the tile in projected coordinates of the tiling scheme.</li>
    *     <li><code>{eastProjected}</code>: The Eastern edge of the tile in projected coordinates of the tiling scheme.</li>
    *     <li><code>{northProjected}</code>: The Northern edge of the tile in projected coordinates of the tiling scheme.</li>
    *     <li><code>{width}</code>: The width of each tile in pixels.</li>
    *     <li><code>{height}</code>: The height of each tile in pixels.</li>
    * </ul>
    * @property [pickFeaturesUrl] - The URL template to use to pick features.  If this property is not specified,
    *                 {@link UrlTemplateImageryProvider#pickFeatures} will immediately returned undefined, indicating no
    *                 features picked.  The URL template supports all of the keywords supported by the <code>url</code>
    *                 parameter, plus the following:
    * <ul>
    *     <li><code>{i}</code>: The pixel column (horizontal coordinate) of the picked position, where the Westernmost pixel is 0.</li>
    *     <li><code>{j}</code>: The pixel row (vertical coordinate) of the picked position, where the Northernmost pixel is 0.</li>
    *     <li><code>{reverseI}</code>: The pixel column (horizontal coordinate) of the picked position, where the Easternmost pixel is 0.</li>
    *     <li><code>{reverseJ}</code>: The pixel row (vertical coordinate) of the picked position, where the Southernmost pixel is 0.</li>
    *     <li><code>{longitudeDegrees}</code>: The longitude of the picked position in degrees.</li>
    *     <li><code>{latitudeDegrees}</code>: The latitude of the picked position in degrees.</li>
    *     <li><code>{longitudeProjected}</code>: The longitude of the picked position in the projected coordinates of the tiling scheme.</li>
    *     <li><code>{latitudeProjected}</code>: The latitude of the picked position in the projected coordinates of the tiling scheme.</li>
    *     <li><code>{format}</code>: The format in which to get feature information, as specified in the {@link GetFeatureInfoFormat}.</li>
    * </ul>
    * @property [urlSchemeZeroPadding] - Gets the URL scheme zero padding for each tile coordinate. The format is '000' where
    * each coordinate will be padded on the left with zeros to match the width of the passed string of zeros. e.g. Setting:
    * urlSchemeZeroPadding : { '{x}' : '0000'}
    * will cause an 'x' value of 12 to return the string '0012' for {x} in the generated URL.
    * It the passed object has the following keywords:
    * <ul>
    *  <li> <code>{z}</code>: The zero padding for the level of the tile in the tiling scheme.</li>
    *  <li> <code>{x}</code>: The zero padding for the tile X coordinate in the tiling scheme.</li>
    *  <li> <code>{y}</code>: The zero padding for the the tile Y coordinate in the tiling scheme.</li>
    *  <li> <code>{reverseX}</code>: The zero padding for the tile reverseX coordinate in the tiling scheme.</li>
    *  <li> <code>{reverseY}</code>: The zero padding for the tile reverseY coordinate in the tiling scheme.</li>
    *  <li> <code>{reverseZ}</code>: The zero padding for the reverseZ coordinate of the tile in the tiling scheme.</li>
    * </ul>
    * @property [subdomains = 'abc'] - The subdomains to use for the <code>{s}</code> placeholder in the URL template.
    *                          If this parameter is a single string, each character in the string is a subdomain.  If it is
    *                          an array, each element in the array is a subdomain.
    * @property [credit = ''] - A credit for the data source, which is displayed on the canvas.
    * @property [minimumLevel = 0] - The minimum level-of-detail supported by the imagery provider.  Take care when specifying
    *                 this that the number of tiles at the minimum level is small, such as four or less.  A larger number is likely
    *                 to result in rendering problems.
    * @property [maximumLevel] - The maximum level-of-detail supported by the imagery provider, or undefined if there is no limit.
    * @property [rectangle = Rectangle.MAX_VALUE] - The rectangle, in radians, covered by the image.
    * @property [tilingScheme = WebMercatorTilingScheme] - The tiling scheme specifying how the ellipsoidal
    * surface is broken into tiles.  If this parameter is not provided, a {@link WebMercatorTilingScheme}
    * is used.
    * @property [ellipsoid] - The ellipsoid.  If the tilingScheme is specified,
    *                    this parameter is ignored and the tiling scheme's ellipsoid is used instead. If neither
    *                    parameter is specified, the WGS84 ellipsoid is used.
    * @property [tileWidth = 256] - Pixel width of image tiles.
    * @property [tileHeight = 256] - Pixel height of image tiles.
    * @property [hasAlphaChannel = true] - true if the images provided by this imagery provider
    *                  include an alpha channel; otherwise, false.  If this property is false, an alpha channel, if
    *                  present, will be ignored.  If this property is true, any images without an alpha channel will
    *                  be treated as if their alpha is 1.0 everywhere.  When this property is false, memory usage
    *                  and texture upload time are potentially reduced.
    * @property [getFeatureInfoFormats] - The formats in which to get feature information at a
    *                                 specific location when {@link UrlTemplateImageryProvider#pickFeatures} is invoked.  If this
    *                                 parameter is not specified, feature picking is disabled.
    * @property [enablePickFeatures = true] - If true, {@link UrlTemplateImageryProvider#pickFeatures} will
    *        request the <code>pickFeaturesUrl</code> and attempt to interpret the features included in the response.  If false,
    *        {@link UrlTemplateImageryProvider#pickFeatures} will immediately return undefined (indicating no pickable
    *        features) without communicating with the server.  Set this property to false if you know your data
    *        source does not support picking features or if you don't want this provider's features to be pickable. Note
    *        that this can be dynamically overridden by modifying the {@link UriTemplateImageryProvider#enablePickFeatures}
    *        property.
    * @property [tileDiscardPolicy] - A policy for discarding tile images according to some criteria
    * @property [customTags] - Allow to replace custom keywords in the URL template. The object must have strings as keys and functions as values.
    */
  trait ConstructorOptions extends StObject {
    
    var credit: js.UndefOr[Credit | String] = js.undefined
    
    var customTags: js.UndefOr[Any] = js.undefined
    
    var ellipsoid: js.UndefOr[Ellipsoid] = js.undefined
    
    var enablePickFeatures: js.UndefOr[Boolean] = js.undefined
    
    var getFeatureInfoFormats: js.UndefOr[js.Array[GetFeatureInfoFormat]] = js.undefined
    
    var hasAlphaChannel: js.UndefOr[Boolean] = js.undefined
    
    var maximumLevel: js.UndefOr[Double] = js.undefined
    
    var minimumLevel: js.UndefOr[Double] = js.undefined
    
    var options: js.UndefOr[js.Promise[js.Object] | Any] = js.undefined
    
    var pickFeaturesUrl: js.UndefOr[Resource | String] = js.undefined
    
    var rectangle: js.UndefOr[Rectangle] = js.undefined
    
    var subdomains: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var tileDiscardPolicy: js.UndefOr[TileDiscardPolicy] = js.undefined
    
    var tileHeight: js.UndefOr[Double] = js.undefined
    
    var tileWidth: js.UndefOr[Double] = js.undefined
    
    var tilingScheme: js.UndefOr[TilingScheme] = js.undefined
    
    var url: Resource | String
    
    var urlSchemeZeroPadding: js.UndefOr[Any] = js.undefined
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
      
      inline def setCustomTags(value: Any): Self = StObject.set(x, "customTags", value.asInstanceOf[js.Any])
      
      inline def setCustomTagsUndefined: Self = StObject.set(x, "customTags", js.undefined)
      
      inline def setEllipsoid(value: Ellipsoid): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
      
      inline def setEllipsoidUndefined: Self = StObject.set(x, "ellipsoid", js.undefined)
      
      inline def setEnablePickFeatures(value: Boolean): Self = StObject.set(x, "enablePickFeatures", value.asInstanceOf[js.Any])
      
      inline def setEnablePickFeaturesUndefined: Self = StObject.set(x, "enablePickFeatures", js.undefined)
      
      inline def setGetFeatureInfoFormats(value: js.Array[GetFeatureInfoFormat]): Self = StObject.set(x, "getFeatureInfoFormats", value.asInstanceOf[js.Any])
      
      inline def setGetFeatureInfoFormatsUndefined: Self = StObject.set(x, "getFeatureInfoFormats", js.undefined)
      
      inline def setGetFeatureInfoFormatsVarargs(value: GetFeatureInfoFormat*): Self = StObject.set(x, "getFeatureInfoFormats", js.Array(value*))
      
      inline def setHasAlphaChannel(value: Boolean): Self = StObject.set(x, "hasAlphaChannel", value.asInstanceOf[js.Any])
      
      inline def setHasAlphaChannelUndefined: Self = StObject.set(x, "hasAlphaChannel", js.undefined)
      
      inline def setMaximumLevel(value: Double): Self = StObject.set(x, "maximumLevel", value.asInstanceOf[js.Any])
      
      inline def setMaximumLevelUndefined: Self = StObject.set(x, "maximumLevel", js.undefined)
      
      inline def setMinimumLevel(value: Double): Self = StObject.set(x, "minimumLevel", value.asInstanceOf[js.Any])
      
      inline def setMinimumLevelUndefined: Self = StObject.set(x, "minimumLevel", js.undefined)
      
      inline def setOptions(value: js.Promise[js.Object] | Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setPickFeaturesUrl(value: Resource | String): Self = StObject.set(x, "pickFeaturesUrl", value.asInstanceOf[js.Any])
      
      inline def setPickFeaturesUrlUndefined: Self = StObject.set(x, "pickFeaturesUrl", js.undefined)
      
      inline def setRectangle(value: Rectangle): Self = StObject.set(x, "rectangle", value.asInstanceOf[js.Any])
      
      inline def setRectangleUndefined: Self = StObject.set(x, "rectangle", js.undefined)
      
      inline def setSubdomains(value: String | js.Array[String]): Self = StObject.set(x, "subdomains", value.asInstanceOf[js.Any])
      
      inline def setSubdomainsUndefined: Self = StObject.set(x, "subdomains", js.undefined)
      
      inline def setSubdomainsVarargs(value: String*): Self = StObject.set(x, "subdomains", js.Array(value*))
      
      inline def setTileDiscardPolicy(value: TileDiscardPolicy): Self = StObject.set(x, "tileDiscardPolicy", value.asInstanceOf[js.Any])
      
      inline def setTileDiscardPolicyUndefined: Self = StObject.set(x, "tileDiscardPolicy", js.undefined)
      
      inline def setTileHeight(value: Double): Self = StObject.set(x, "tileHeight", value.asInstanceOf[js.Any])
      
      inline def setTileHeightUndefined: Self = StObject.set(x, "tileHeight", js.undefined)
      
      inline def setTileWidth(value: Double): Self = StObject.set(x, "tileWidth", value.asInstanceOf[js.Any])
      
      inline def setTileWidthUndefined: Self = StObject.set(x, "tileWidth", js.undefined)
      
      inline def setTilingScheme(value: TilingScheme): Self = StObject.set(x, "tilingScheme", value.asInstanceOf[js.Any])
      
      inline def setTilingSchemeUndefined: Self = StObject.set(x, "tilingScheme", js.undefined)
      
      inline def setUrl(value: Resource | String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlSchemeZeroPadding(value: Any): Self = StObject.set(x, "urlSchemeZeroPadding", value.asInstanceOf[js.Any])
      
      inline def setUrlSchemeZeroPaddingUndefined: Self = StObject.set(x, "urlSchemeZeroPadding", js.undefined)
    }
  }
}
