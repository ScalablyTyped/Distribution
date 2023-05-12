package typings.cesiumEngine.mod

import typings.cesiumEngine.mod.TileMapServiceImageryProvider.ConstructorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "TileMapServiceImageryProvider")
@js.native
open class TileMapServiceImageryProvider protected () extends UrlTemplateImageryProvider {
  def this(options: ConstructorOptions) = this()
}
/* static members */
object TileMapServiceImageryProvider {
  
  @JSImport("@cesium/engine", "TileMapServiceImageryProvider")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromUrl(url: String): js.Promise[TileMapServiceImageryProvider] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUrl")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TileMapServiceImageryProvider]]
  inline def fromUrl(url: String, options: ConstructorOptions): js.Promise[TileMapServiceImageryProvider] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUrl")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TileMapServiceImageryProvider]]
  /**
    * Creates a TileMapServiceImageryProvider from the specified url.
    * @example
    * const tms = await Cesium.TileMapServiceImageryProvider.fromUrl(
    *    '../images/cesium_maptiler/Cesium_Logo_Color', {
    *      fileExtension: 'png',
    *      maximumLevel: 4,
    *      rectangle: new Cesium.Rectangle(
    *        Cesium.Math.toRadians(-120.0),
    *        Cesium.Math.toRadians(20.0),
    *        Cesium.Math.toRadians(-60.0),
    *        Cesium.Math.toRadians(40.0))
    * });
    * @param url - Path to image tiles on server.
    * @param [options] - Object describing initialization options.
    * @returns A promise that resolves to the created TileMapServiceImageryProvider.
    */
  inline def fromUrl(url: Resource): js.Promise[TileMapServiceImageryProvider] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUrl")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TileMapServiceImageryProvider]]
  inline def fromUrl(url: Resource, options: ConstructorOptions): js.Promise[TileMapServiceImageryProvider] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUrl")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TileMapServiceImageryProvider]]
  
  /**
    * Initialization options for the TileMapServiceImageryProvider constructor
    * @property [url] - Path to image tiles on server. Deprecated
    * @property [fileExtension = 'png'] - The file extension for images on the server.
    * @property [credit = ''] - A credit for the data source, which is displayed on the canvas.
    * @property [minimumLevel = 0] - The minimum level-of-detail supported by the imagery provider.  Take care when specifying
    *                 this that the number of tiles at the minimum level is small, such as four or less.  A larger number is likely
    *                 to result in rendering problems.
    * @property [maximumLevel] - The maximum level-of-detail supported by the imagery provider, or undefined if there is no limit.
    * @property [rectangle = Rectangle.MAX_VALUE] - The rectangle, in radians, covered by the image.
    * @property [tilingScheme] - The tiling scheme specifying how the ellipsoidal
    * surface is broken into tiles.  If this parameter is not provided, a {@link WebMercatorTilingScheme}
    * is used.
    * @property [ellipsoid] - The ellipsoid.  If the tilingScheme is specified,
    *                    this parameter is ignored and the tiling scheme's ellipsoid is used instead. If neither
    *                    parameter is specified, the WGS84 ellipsoid is used.
    * @property [tileWidth = 256] - Pixel width of image tiles.
    * @property [tileHeight = 256] - Pixel height of image tiles.
    * @property [flipXY] - Older versions of gdal2tiles.py flipped X and Y values in tilemapresource.xml.
    * @property [tileDiscardPolicy] - A policy for discarding tile images according to some criteria
    * Specifying this option will do the same, allowing for loading of these incorrect tilesets.
    */
  trait ConstructorOptions extends StObject {
    
    var credit: js.UndefOr[Credit | String] = js.undefined
    
    var ellipsoid: js.UndefOr[Ellipsoid] = js.undefined
    
    var fileExtension: js.UndefOr[String] = js.undefined
    
    var flipXY: js.UndefOr[Boolean] = js.undefined
    
    var maximumLevel: js.UndefOr[Double] = js.undefined
    
    var minimumLevel: js.UndefOr[Double] = js.undefined
    
    var rectangle: js.UndefOr[Rectangle] = js.undefined
    
    var tileDiscardPolicy: js.UndefOr[TileDiscardPolicy] = js.undefined
    
    var tileHeight: js.UndefOr[Double] = js.undefined
    
    var tileWidth: js.UndefOr[Double] = js.undefined
    
    var tilingScheme: js.UndefOr[TilingScheme] = js.undefined
    
    var url: js.UndefOr[Resource | String | (js.Promise[Resource | String])] = js.undefined
  }
  object ConstructorOptions {
    
    inline def apply(): ConstructorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConstructorOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConstructorOptions] (val x: Self) extends AnyVal {
      
      inline def setCredit(value: Credit | String): Self = StObject.set(x, "credit", value.asInstanceOf[js.Any])
      
      inline def setCreditUndefined: Self = StObject.set(x, "credit", js.undefined)
      
      inline def setEllipsoid(value: Ellipsoid): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
      
      inline def setEllipsoidUndefined: Self = StObject.set(x, "ellipsoid", js.undefined)
      
      inline def setFileExtension(value: String): Self = StObject.set(x, "fileExtension", value.asInstanceOf[js.Any])
      
      inline def setFileExtensionUndefined: Self = StObject.set(x, "fileExtension", js.undefined)
      
      inline def setFlipXY(value: Boolean): Self = StObject.set(x, "flipXY", value.asInstanceOf[js.Any])
      
      inline def setFlipXYUndefined: Self = StObject.set(x, "flipXY", js.undefined)
      
      inline def setMaximumLevel(value: Double): Self = StObject.set(x, "maximumLevel", value.asInstanceOf[js.Any])
      
      inline def setMaximumLevelUndefined: Self = StObject.set(x, "maximumLevel", js.undefined)
      
      inline def setMinimumLevel(value: Double): Self = StObject.set(x, "minimumLevel", value.asInstanceOf[js.Any])
      
      inline def setMinimumLevelUndefined: Self = StObject.set(x, "minimumLevel", js.undefined)
      
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
      
      inline def setUrl(value: Resource | String | (js.Promise[Resource | String])): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
