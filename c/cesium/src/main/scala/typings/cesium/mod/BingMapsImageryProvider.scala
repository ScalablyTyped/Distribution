package typings.cesium.mod

import typings.cesium.AnonCulture
import typings.cesium.AnonLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "BingMapsImageryProvider")
@js.native
class BingMapsImageryProvider protected () extends ImageryProvider {
  def this(options: AnonCulture) = this()
  val culture: String = js.native
  val key: String = js.native
  val mapStyle: BingMapsStyle = js.native
  val url: String = js.native
}

/* static members */
@JSImport("cesium", "BingMapsImageryProvider")
@js.native
object BingMapsImageryProvider extends js.Object {
  def quadKeyToTileXY(quadkey: String): AnonLevel = js.native
  def tileXYToQuadKey(x: Double, y: Double, level: Double): String = js.native
}

