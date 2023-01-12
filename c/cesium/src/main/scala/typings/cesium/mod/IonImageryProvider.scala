package typings.cesium.mod

import typings.cesium.mod.IonImageryProvider.ConstructorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "IonImageryProvider")
@js.native
open class IonImageryProvider protected () extends StObject {
  def this(options: ConstructorOptions) = this()
  
  /**
    * Gets the credit to display when this imagery provider is active.  Typically this is used to credit
    * the source of the imagery. This function should
    * not be called before {@link IonImageryProvider#ready} returns true.
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
    * Gets the maximum level-of-detail that can be requested.  This function should
    * not be called before {@link IonImageryProvider#ready} returns true.
    */
  val maximumLevel: js.UndefOr[Double] = js.native
  
  /**
    * Gets the minimum level-of-detail that can be requested.  This function should
    * not be called before {@link IonImageryProvider#ready} returns true. Generally,
    * a minimum level should only be used when the rectangle of the imagery is small
    * enough that the number of tiles at the minimum level is small.  An imagery
    * provider with more than a few tiles at the minimum level will lead to
    * rendering problems.
    */
  val minimumLevel: Double = js.native
  
  /**
    * Asynchronously determines what features, if any, are located at a given longitude and latitude within
    * a tile.  This function should not be called before {@link IonImageryProvider#ready} returns true.
    * This function is optional, so it may not exist on all ImageryProviders.
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
    * Gets the rectangle, in radians, of the imagery provided by the instance.  This function should
    * not be called before {@link IonImageryProvider#ready} returns true.
    */
  val rectangle: Rectangle = js.native
  
  /**
    * Requests the image for a given tile.  This function should
    * not be called before {@link IonImageryProvider#ready} returns true.
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
    * not be called before {@link IonImageryProvider#ready} returns true.
    */
  val tileDiscardPolicy: TileDiscardPolicy = js.native
  
  /**
    * Gets the height of each tile, in pixels.  This function should
    * not be called before {@link IonImageryProvider#ready} returns true.
    */
  val tileHeight: Double = js.native
  
  /**
    * Gets the width of each tile, in pixels.  This function should
    * not be called before {@link IonImageryProvider#ready} returns true.
    */
  val tileWidth: Double = js.native
  
  /**
    * Gets the tiling scheme used by the provider.  This function should
    * not be called before {@link IonImageryProvider#ready} returns true.
    */
  val tilingScheme: TilingScheme = js.native
}
object IonImageryProvider {
  
  /**
    * Initialization options for the TileMapServiceImageryProvider constructor
    * @property assetId - An ion imagery asset ID
    * @property [accessToken = Ion.defaultAccessToken] - The access token to use.
    * @property [server = Ion.defaultServer] - The resource to the Cesium ion API server.
    */
  trait ConstructorOptions extends StObject {
    
    var accessToken: js.UndefOr[String] = js.undefined
    
    var assetId: Double
    
    var server: js.UndefOr[String | Resource] = js.undefined
  }
  object ConstructorOptions {
    
    inline def apply(assetId: Double): ConstructorOptions = {
      val __obj = js.Dynamic.literal(assetId = assetId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConstructorOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConstructorOptions] (val x: Self) extends AnyVal {
      
      inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
      
      inline def setAssetId(value: Double): Self = StObject.set(x, "assetId", value.asInstanceOf[js.Any])
      
      inline def setServer(value: String | Resource): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
    }
  }
}
