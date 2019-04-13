package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "BingMapsImageryProvider")
@js.native
class BingMapsImageryProvider protected () extends ImageryProvider {
  def this(options: cesiumLib.Anon_Culture) = this()
  val culture: java.lang.String = js.native
  val key: java.lang.String = js.native
  val mapStyle: BingMapsStyle = js.native
  val url: java.lang.String = js.native
}

/* static members */
@JSImport("cesium", "BingMapsImageryProvider")
@js.native
object BingMapsImageryProvider extends js.Object {
  def quadKeyToTileXY(quadkey: java.lang.String): cesiumLib.Anon_Level = js.native
  def tileXYToQuadKey(x: scala.Double, y: scala.Double, level: scala.Double): java.lang.String = js.native
}

