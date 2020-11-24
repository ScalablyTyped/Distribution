package typings.cesium.mod

import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "MapboxProviderCommonApi")
@js.native
abstract class MapboxProviderCommonApi () extends js.Object {
  
  /**
    * Gets the credit to display when this imagery provider is active. Typically this is used to credit the source of the imagery.
    * This function should not be called before MapboxImageryProvider#ready returns true.
    */
  val credit: Credit = js.native
  
  /**
    * Gets an event that is raised when the imagery provider encounters an asynchronous error..
    * By subscribing to the event, you will be notified of the error and can potentially recover from it.
    * Event listeners are passed an instance of TileProviderError.
    */
  val errorEvent: Event[js.Array[_]] = js.native
  
  /**
    * Gets the credits to be displayed when a given tile is displayed.
    * @param x - The tile X coordinate
    * @param y - The tile Y coordinate.
    * @param level - The tile level;
    */
  def getTileCredits(x: Double, y: Double, level: Double): js.Array[Credit] = js.native
  
  /**
    * Gets a value indicating whether or not the images provided by this imagery provider include an alpha channel.
    * If this property is false, an alpha channel, if present, will be ignored.
    * If this property is true, any images without an alpha channel will be treated as if their alpha is 1.0 everywhere.
    * When this property is false, memory usage and texture upload time are reduced.
    */
  val hasAlphaChannel: Boolean = js.native
  
  /**
    * Gets the maximum level-of-detail that can be requested.
    * This function should not be called before MapboxImageryProvider#ready returns true.
    */
  val maximumLevel: Double = js.native
  
  /**
    * Gets the minimum level-of-detail that can be requested.
    * This function should not be called before MapboxImageryProvider#ready returns true.
    * Generally, a minimum level should only be used when the rectangle of the imagery is small enough
    * that the number of tiles at the minimum level is small.
    * An imagery provider with more than a few tiles at the minimum level will lead to rendering problems.
    */
  val minimumLevel: Double = js.native
  
  /**
    * Asynchronously determines what features, if any, are located at a given longitude and latitude within a tile.
    * This function should not be called before provider ready returns true.
    * This function is optional, so it may not exist on all ImageryProviders.
    * @param x - The tile X coordinate
    * @param y - The tile Y coordinate
    * @param level - The tile level
    * @param longitude - The longitude at which to pick features
    * @param latitude - The latitude at which to pick features
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
    * Gets the rectangle, in radians, of the imagery provided by the instance.
    * This function should not be called before MapboxImageryProvider#ready returns true.
    */
  val rectangle: Rectangle = js.native
  
  /**
    * Requests the image for a given tile.
    * This function should not be called before provider ready returns true.
    * @param x - The tile X coordinate
    * @param y - The tile Y coordinate
    * @param level - The tile level
    * @param request - The request object. Intended for internal use only.
    */
  def requestImage(x: Double, y: Double, level: Double): js.UndefOr[js.Promise[HTMLImageElement | HTMLCanvasElement]] = js.native
  def requestImage(x: Double, y: Double, level: Double, request: Request): js.UndefOr[js.Promise[HTMLImageElement | HTMLCanvasElement]] = js.native
  
  /**
    * Gets the tile discard policy.
    * If not undefined, the discard policy is responsible for filtering out "missing" tiles via its shouldDiscardImage function.
    * If this function returns undefined, no tiles are filtered.
    * This function should not be called before MapboxImageryProvider#ready returns true.
    */
  val tileDiscardPolicy: TileDiscardPolicy = js.native
  
  /**
    * Gets the height of each tile, in pixels.
    * This function should not be called before MapboxImageryProvider#ready returns true.
    */
  val tileHeight: Double = js.native
  
  /**
    * Gets the width of each tile, in pixels.
    * This function should not be called before MapboxImageryProvider#ready returns true.
    */
  val tileWidth: Double = js.native
  
  /**
    * Gets the tiling scheme used by the provider.
    * This function should not be called before MapboxImageryProvider#ready returns true.
    */
  val tilingScheme: TilingScheme = js.native
  
  /**
    * Gets the URL of the Mapbox server.
    */
  val url: String = js.native
}
