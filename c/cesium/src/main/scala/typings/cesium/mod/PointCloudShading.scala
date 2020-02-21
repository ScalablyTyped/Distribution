package typings.cesium.mod

import typings.cesium.AnonAttenuation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "PointCloudShading")
@js.native
class PointCloudShading () extends js.Object {
  def this(option: AnonAttenuation) = this()
  var attenuation: Boolean = js.native
  var backFaceCulling: Boolean = js.native
  var baseResolution: Double = js.native
  var eyeDomeLighting: Double = js.native
  var eyeDomeLightingRadius: Double = js.native
  var eyeDomeLightingStrenght: Double = js.native
  var geometricErrorScale: Double = js.native
  var maximumAttenuation: Double = js.native
  var normalShading: Boolean = js.native
}

/* static members */
@JSImport("cesium", "PointCloudShading")
@js.native
object PointCloudShading extends js.Object {
  def isSupported(scene: Scene): Boolean = js.native
}

