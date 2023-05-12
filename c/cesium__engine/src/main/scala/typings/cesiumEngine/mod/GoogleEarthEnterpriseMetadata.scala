package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "GoogleEarthEnterpriseMetadata")
@js.native
open class GoogleEarthEnterpriseMetadata () extends StObject {
  def this(resourceOrUrl: String) = this()
  def this(resourceOrUrl: Resource) = this()
  
  /**
    * True if imagery is available.
    */
  var imageryPresent: Boolean = js.native
  
  /**
    * Key used to decode packets
    */
  var key: js.typedarray.ArrayBuffer = js.native
  
  /**
    * Exponent used to compute constant to calculate negative height values.
    */
  var negativeAltitudeExponentBias: Double = js.native
  
  /**
    * Threshold where any numbers smaller are actually negative values. They are multiplied by -2^negativeAltitudeExponentBias.
    */
  var negativeAltitudeThreshold: Double = js.native
  
  /**
    * True if imagery is sent as a protocol buffer, false if sent as plain images. If undefined we will try both.
    */
  var protoImagery: Boolean = js.native
  
  /**
    * Dictionary of provider id to copyright strings.
    */
  var providers: Any = js.native
  
  /**
    * Gets the proxy used for metadata requests.
    */
  val proxy: Proxy = js.native
  
  /**
    * Gets a promise that resolves to true when the metadata is ready for use.
    */
  val readyPromise: js.Promise[Boolean] = js.native
  
  /**
    * Gets the resource used for metadata requests.
    */
  val resource: Resource = js.native
  
  /**
    * True if terrain is available.
    */
  var terrainPresent: Boolean = js.native
  
  /**
    * Gets the name of the Google Earth Enterprise server.
    */
  val url: String = js.native
}
/* static members */
object GoogleEarthEnterpriseMetadata {
  
  @JSImport("@cesium/engine", "GoogleEarthEnterpriseMetadata")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromUrl(resourceOrUrl: String): js.Promise[GoogleEarthEnterpriseMetadata] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUrl")(resourceOrUrl.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GoogleEarthEnterpriseMetadata]]
  /**
    * Creates a metadata object using the Google Earth Enterprise REST API. This is used by the GoogleEarthEnterpriseImageryProvider
    * and GoogleEarthEnterpriseTerrainProvider to share metadata requests.
    * @param resourceOrUrl - The url of the Google Earth Enterprise server hosting the imagery.
    * @returns A promise which resolves to the created GoogleEarthEnterpriseMetadata instance/
    */
  inline def fromUrl(resourceOrUrl: Resource): js.Promise[GoogleEarthEnterpriseMetadata] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUrl")(resourceOrUrl.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GoogleEarthEnterpriseMetadata]]
  
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
