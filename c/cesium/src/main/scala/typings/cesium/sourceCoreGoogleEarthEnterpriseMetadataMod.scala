package typings.cesium

import typings.cesium.mod.GoogleEarthEnterpriseMetadata
import typings.cesium.mod.Resource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceCoreGoogleEarthEnterpriseMetadataMod {
  
  @JSImport("cesium/Source/Core/GoogleEarthEnterpriseMetadata", JSImport.Default)
  @js.native
  open class default protected () extends GoogleEarthEnterpriseMetadata {
    def this(resourceOrUrl: String) = this()
    def this(resourceOrUrl: Resource) = this()
  }
  /* static members */
  object default {
    
    @JSImport("cesium/Source/Core/GoogleEarthEnterpriseMetadata", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Converts a tile's quadkey used to request an image from a Google Earth Enterprise server into the
      * (x, y, level) position.
      * @param quadkey - The tile's quad key
      */
    inline def quadKeyToTileXY(quadkey: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("quadKeyToTileXY")(quadkey.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Converts a tiles (x, y, level) position into a quadkey used to request an image
      * from a Google Earth Enterprise server.
      * @param x - The tile's x coordinate.
      * @param y - The tile's y coordinate.
      * @param level - The tile's zoom level.
      */
    inline def tileXYToQuadKey(x: Double, y: Double, level: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("tileXYToQuadKey")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
