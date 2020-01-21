package typings.cesium.mod

import typings.cesium.AnonCreditCrs
import typings.cesium.AnonFormat
import typings.cesium.AnonRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "WebMapServiceImageryProvider")
@js.native
class WebMapServiceImageryProvider protected () extends ImageryProvider {
  def this(options: AnonCreditCrs) = this()
  val url: String = js.native
}

/* static members */
@JSImport("cesium", "WebMapServiceImageryProvider")
@js.native
object WebMapServiceImageryProvider extends js.Object {
  var DefaultParameters: AnonFormat = js.native
  var GetFeatureInfoDefaultParameters: AnonRequest = js.native
}

