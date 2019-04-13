package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "WebMapTileServiceImageryProvider")
@js.native
class WebMapTileServiceImageryProvider protected () extends ImageryProvider {
  def this(options: cesiumLib.Anon_Clock) = this()
  var clock: Clock = js.native
  var dimensions: js.Any = js.native
  val format: java.lang.String = js.native
  var times: TimeIntervalCollection = js.native
  val url: java.lang.String = js.native
}

