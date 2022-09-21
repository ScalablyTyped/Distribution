package typings.cesium

import typings.cesium.mod.BingMapsImageryProvider
import typings.cesium.mod.BingMapsImageryProvider.ConstructorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bingMapsImageryProviderMod {
  
  @JSImport("cesium/Source/Scene/BingMapsImageryProvider", JSImport.Default)
  @js.native
  open class default protected () extends BingMapsImageryProvider {
    def this(options: ConstructorOptions) = this()
  }
  /* static members */
  object default {
    
    @JSImport("cesium/Source/Scene/BingMapsImageryProvider", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets or sets the URL to the Bing logo for display in the credit.
      */
    @JSImport("cesium/Source/Scene/BingMapsImageryProvider", "default.logoUrl")
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
  }
}
