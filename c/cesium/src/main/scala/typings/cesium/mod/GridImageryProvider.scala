package typings.cesium.mod

import typings.cesium.mod.GridImageryProvider.ConstructorOptions
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "GridImageryProvider")
@js.native
open class GridImageryProvider protected () extends StObject {
  def this(options: ConstructorOptions) = this()
  
  /**
    * Render a grid into a canvas with background and glow
    */
  def _createGridCanvas(): Unit = js.native
  
  /**
    * Draws a grid of lines into a canvas.
    */
  def _drawGrid(): Unit = js.native
  
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
    * @returns The resolved image as a Canvas DOM object.
    */
  def requestImage(x: Double, y: Double, level: Double): js.Promise[HTMLCanvasElement] = js.native
  def requestImage(x: Double, y: Double, level: Double, request: Request): js.Promise[HTMLCanvasElement] = js.native
  
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
}
object GridImageryProvider {
  
  /**
    * Initialization options for the GridImageryProvider constructor
    * @property [tilingScheme = new GeographicTilingScheme()] - The tiling scheme for which to draw tiles.
    * @property [ellipsoid] - The ellipsoid.  If the tilingScheme is specified,
    *                    this parameter is ignored and the tiling scheme's ellipsoid is used instead. If neither
    *                    parameter is specified, the WGS84 ellipsoid is used.
    * @property [cells = 8] - The number of grids cells.
    * @property [color = Color(1.0, 1.0, 1.0, 0.4)] - The color to draw grid lines.
    * @property [glowColor = Color(0.0, 1.0, 0.0, 0.05)] - The color to draw glow for grid lines.
    * @property [glowWidth = 6] - The width of lines used for rendering the line glow effect.
    * @property [backgroundColor = Color(0.0, 0.5, 0.0, 0.2)] - Background fill color.
    * @property [tileWidth = 256] - The width of the tile for level-of-detail selection purposes.
    * @property [tileHeight = 256] - The height of the tile for level-of-detail selection purposes.
    * @property [canvasSize = 256] - The size of the canvas used for rendering.
    */
  trait ConstructorOptions extends StObject {
    
    var backgroundColor: js.UndefOr[Color] = js.undefined
    
    var canvasSize: js.UndefOr[Double] = js.undefined
    
    var cells: js.UndefOr[Double] = js.undefined
    
    var color: js.UndefOr[Color] = js.undefined
    
    var ellipsoid: js.UndefOr[Ellipsoid] = js.undefined
    
    var glowColor: js.UndefOr[Color] = js.undefined
    
    var glowWidth: js.UndefOr[Double] = js.undefined
    
    var tileHeight: js.UndefOr[Double] = js.undefined
    
    var tileWidth: js.UndefOr[Double] = js.undefined
    
    var tilingScheme: js.UndefOr[TilingScheme] = js.undefined
  }
  object ConstructorOptions {
    
    inline def apply(): ConstructorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConstructorOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConstructorOptions] (val x: Self) extends AnyVal {
      
      inline def setBackgroundColor(value: Color): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setCanvasSize(value: Double): Self = StObject.set(x, "canvasSize", value.asInstanceOf[js.Any])
      
      inline def setCanvasSizeUndefined: Self = StObject.set(x, "canvasSize", js.undefined)
      
      inline def setCells(value: Double): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
      
      inline def setCellsUndefined: Self = StObject.set(x, "cells", js.undefined)
      
      inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setEllipsoid(value: Ellipsoid): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
      
      inline def setEllipsoidUndefined: Self = StObject.set(x, "ellipsoid", js.undefined)
      
      inline def setGlowColor(value: Color): Self = StObject.set(x, "glowColor", value.asInstanceOf[js.Any])
      
      inline def setGlowColorUndefined: Self = StObject.set(x, "glowColor", js.undefined)
      
      inline def setGlowWidth(value: Double): Self = StObject.set(x, "glowWidth", value.asInstanceOf[js.Any])
      
      inline def setGlowWidthUndefined: Self = StObject.set(x, "glowWidth", js.undefined)
      
      inline def setTileHeight(value: Double): Self = StObject.set(x, "tileHeight", value.asInstanceOf[js.Any])
      
      inline def setTileHeightUndefined: Self = StObject.set(x, "tileHeight", js.undefined)
      
      inline def setTileWidth(value: Double): Self = StObject.set(x, "tileWidth", value.asInstanceOf[js.Any])
      
      inline def setTileWidthUndefined: Self = StObject.set(x, "tileWidth", js.undefined)
      
      inline def setTilingScheme(value: TilingScheme): Self = StObject.set(x, "tilingScheme", value.asInstanceOf[js.Any])
      
      inline def setTilingSchemeUndefined: Self = StObject.set(x, "tilingScheme", js.undefined)
    }
  }
}
