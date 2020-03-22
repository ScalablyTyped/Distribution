package typings.cesium.mod

import typings.cesium.AnonMinimumHeights
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "WallOutlineGeometry")
@js.native
class WallOutlineGeometry protected () extends Packable {
  def this(options: AnonMinimumHeights) = this()
}

/* static members */
@JSImport("cesium", "WallOutlineGeometry")
@js.native
object WallOutlineGeometry extends js.Object {
  def createGeometry(wallGeometry: WallOutlineGeometry): Geometry = js.native
  def fromConstantHeights(positions: js.Array[Cartesian3]): WallOutlineGeometry = js.native
  def fromConstantHeights(positions: js.Array[Cartesian3], maximumHeight: Double): WallOutlineGeometry = js.native
  def fromConstantHeights(positions: js.Array[Cartesian3], maximumHeight: Double, minimumHeight: Double): WallOutlineGeometry = js.native
  def fromConstantHeights(
    positions: js.Array[Cartesian3],
    maximumHeight: Double,
    minimumHeight: Double,
    ellipsoid: Ellipsoid
  ): WallOutlineGeometry = js.native
  def unpack(array: js.Array[Double]): WallOutlineGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: Double): WallOutlineGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: WallOutlineGeometry): WallOutlineGeometry = js.native
}

