package typings.cesium.mod

import typings.cesium.AnonEnablePickFeatures
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "ArcGisMapServerImageryProvider")
@js.native
class ArcGisMapServerImageryProvider protected () extends ImageryProvider {
  def this(options: AnonEnablePickFeatures) = this()
  def this(options: AnonEnablePickFeatures, layers: String) = this()
  var url: String = js.native
  var usingPrecachedTiles: Boolean = js.native
}

