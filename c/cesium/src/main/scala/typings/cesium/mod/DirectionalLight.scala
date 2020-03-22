package typings.cesium.mod

import typings.cesium.AnonIntensity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "DirectionalLight")
@js.native
class DirectionalLight protected () extends Light {
  def this(option: AnonIntensity) = this()
  var direction: Cartesian3 = js.native
}

