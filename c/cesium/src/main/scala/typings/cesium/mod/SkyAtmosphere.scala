package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "SkyAtmosphere")
@js.native
class SkyAtmosphere () extends js.Object {
  def this(ellipsoid: Ellipsoid) = this()
  var brightnessShift: Double = js.native
  var ellipsoid: Ellipsoid = js.native
  var hueShift: Double = js.native
  var saturationShift: Double = js.native
  var show: Boolean = js.native
  def destroy(): Unit = js.native
  def isDestroyed(): Boolean = js.native
}

