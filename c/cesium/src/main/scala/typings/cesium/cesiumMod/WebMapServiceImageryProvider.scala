package typings.cesium.cesiumMod

import typings.cesium.Anon_CreditCrs
import typings.cesium.Anon_Format
import typings.cesium.Anon_Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "WebMapServiceImageryProvider")
@js.native
class WebMapServiceImageryProvider protected () extends ImageryProvider {
  def this(options: Anon_CreditCrs) = this()
  val url: String = js.native
}

/* static members */
@JSImport("cesium", "WebMapServiceImageryProvider")
@js.native
object WebMapServiceImageryProvider extends js.Object {
  var DefaultParameters: Anon_Format = js.native
  var GetFeatureInfoDefaultParameters: Anon_Request = js.native
}

