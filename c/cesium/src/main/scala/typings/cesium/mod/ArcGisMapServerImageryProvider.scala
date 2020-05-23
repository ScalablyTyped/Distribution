package typings.cesium.mod

import typings.cesium.anon.EnablePickFeatures
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "ArcGisMapServerImageryProvider")
@js.native
class ArcGisMapServerImageryProvider protected () extends ImageryProvider {
  def this(options: EnablePickFeatures) = this()
  def this(options: EnablePickFeatures, layers: String) = this()
  var url: String = js.native
  var usingPrecachedTiles: Boolean = js.native
}

