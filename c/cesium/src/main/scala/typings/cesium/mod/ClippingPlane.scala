package typings.cesium.mod

import typings.cesium.AnonDistance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "ClippingPlane")
@js.native
class ClippingPlane protected () extends js.Object {
  def this(option: AnonDistance) = this()
  var distance: Double = js.native
  var normal: Cartesian3 = js.native
}

/* static members */
@JSImport("cesium", "ClippingPlane")
@js.native
object ClippingPlane extends js.Object {
  def clone(clippingPlane: ClippingPlane): ClippingPlane = js.native
  def clone(clippingPlane: ClippingPlane, result: ClippingPlane): ClippingPlane = js.native
  def fromPlane(plane: Plane): ClippingPlane = js.native
  def fromPlane(plane: Plane, result: ClippingPlane): ClippingPlane = js.native
}

