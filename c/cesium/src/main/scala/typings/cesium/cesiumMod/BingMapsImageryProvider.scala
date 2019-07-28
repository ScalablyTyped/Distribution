package typings.cesium.cesiumMod

import typings.cesium.Anon_Culture
import typings.cesium.Anon_Level
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "BingMapsImageryProvider")
@js.native
class BingMapsImageryProvider protected () extends ImageryProvider {
  def this(options: Anon_Culture) = this()
  val culture: String = js.native
  val key: String = js.native
  val mapStyle: BingMapsStyle = js.native
  val url: String = js.native
}

/* static members */
@JSImport("cesium", "BingMapsImageryProvider")
@js.native
object BingMapsImageryProvider extends js.Object {
  def quadKeyToTileXY(quadkey: String): Anon_Level = js.native
  def tileXYToQuadKey(x: Double, y: Double, level: Double): String = js.native
}

