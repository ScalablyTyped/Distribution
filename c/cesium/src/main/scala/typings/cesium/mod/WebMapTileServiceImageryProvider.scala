package typings.cesium.mod

import typings.cesium.AnonClock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "WebMapTileServiceImageryProvider")
@js.native
class WebMapTileServiceImageryProvider protected () extends ImageryProvider {
  def this(options: AnonClock) = this()
  var clock: Clock = js.native
  var dimensions: js.Any = js.native
  val format: String = js.native
  var times: TimeIntervalCollection = js.native
  val url: String = js.native
}

