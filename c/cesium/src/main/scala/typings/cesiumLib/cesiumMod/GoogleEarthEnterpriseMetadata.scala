package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "GoogleEarthEnterpriseMetadata")
@js.native
class GoogleEarthEnterpriseMetadata protected () extends js.Object {
  def this(resourceOrUrl: Resource) = this()
  def this(resourceOrUrl: java.lang.String) = this()
  var imageryPresent: scala.Boolean = js.native
  var key: stdLib.ArrayBuffer = js.native
  var negativeAltitudeExponentBias: scala.Double = js.native
  var negativeAltitudeThreshold: scala.Double = js.native
  var protoImagery: scala.Boolean = js.native
  val proxy: Proxy = js.native
  val readyPromise: js.Promise[scala.Boolean] = js.native
  val resource: Resource = js.native
  var terrainPresent: scala.Boolean = js.native
  val url: java.lang.String = js.native
}

/* static members */
@JSImport("cesium", "GoogleEarthEnterpriseMetadata")
@js.native
object GoogleEarthEnterpriseMetadata extends js.Object {
  def quadKeyToTileXY(quadkey: java.lang.String): cesiumLib.Anon_Level = js.native
  def tileXYToQuadKey(x: scala.Double, y: scala.Double, level: scala.Double): java.lang.String = js.native
}

