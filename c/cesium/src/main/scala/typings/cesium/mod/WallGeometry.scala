package typings.cesium.mod

import typings.cesium.AnonMaximumHeights
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "WallGeometry")
@js.native
class WallGeometry protected () extends Packable {
  def this(options: AnonMaximumHeights) = this()
}

/* static members */
@JSImport("cesium", "WallGeometry")
@js.native
object WallGeometry extends js.Object {
  def createGeometry(wallGeometry: WallGeometry): Geometry = js.native
  def fromConstantHeights(positions: js.Array[Cartesian3]): WallGeometry = js.native
  def fromConstantHeights(positions: js.Array[Cartesian3], maximumHeight: Double): WallGeometry = js.native
  def fromConstantHeights(positions: js.Array[Cartesian3], maximumHeight: Double, minimumHeight: Double): WallGeometry = js.native
  def fromConstantHeights(
    positions: js.Array[Cartesian3],
    maximumHeight: Double,
    minimumHeight: Double,
    ellipsoid: Ellipsoid
  ): WallGeometry = js.native
  def unpack(array: js.Array[Double]): WallGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: Double): WallGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: WallGeometry): WallGeometry = js.native
}

