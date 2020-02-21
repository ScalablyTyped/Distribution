package typings.cesium.mod

import typings.cesium.AnonColorDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "DirectionalLight")
@js.native
class DirectionalLight protected () extends Light {
  def this(option: AnonColorDirection) = this()
  var direction: Cartesian3 = js.native
}

