package typings.cesium.mod

import typings.cesium.anon.MinimumHeights
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "WallOutlineGeometry")
@js.native
class WallOutlineGeometry protected () extends Packable {
  def this(options: MinimumHeights) = this()
}
/* static members */
@JSImport("cesium", "WallOutlineGeometry")
@js.native
object WallOutlineGeometry extends js.Object {
  
  def createGeometry(wallGeometry: WallOutlineGeometry): Geometry = js.native
  
  def fromConstantHeights(positions: js.Array[Cartesian3]): WallOutlineGeometry = js.native
  def fromConstantHeights(
    positions: js.Array[Cartesian3],
    maximumHeight: js.UndefOr[scala.Nothing],
    minimumHeight: js.UndefOr[scala.Nothing],
    ellipsoid: Ellipsoid
  ): WallOutlineGeometry = js.native
  def fromConstantHeights(positions: js.Array[Cartesian3], maximumHeight: js.UndefOr[scala.Nothing], minimumHeight: Double): WallOutlineGeometry = js.native
  def fromConstantHeights(
    positions: js.Array[Cartesian3],
    maximumHeight: js.UndefOr[scala.Nothing],
    minimumHeight: Double,
    ellipsoid: Ellipsoid
  ): WallOutlineGeometry = js.native
  def fromConstantHeights(positions: js.Array[Cartesian3], maximumHeight: Double): WallOutlineGeometry = js.native
  def fromConstantHeights(
    positions: js.Array[Cartesian3],
    maximumHeight: Double,
    minimumHeight: js.UndefOr[scala.Nothing],
    ellipsoid: Ellipsoid
  ): WallOutlineGeometry = js.native
  def fromConstantHeights(positions: js.Array[Cartesian3], maximumHeight: Double, minimumHeight: Double): WallOutlineGeometry = js.native
  def fromConstantHeights(
    positions: js.Array[Cartesian3],
    maximumHeight: Double,
    minimumHeight: Double,
    ellipsoid: Ellipsoid
  ): WallOutlineGeometry = js.native
  
  def unpack(array: js.Array[Double]): WallOutlineGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: js.UndefOr[scala.Nothing], result: WallOutlineGeometry): WallOutlineGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: Double): WallOutlineGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: WallOutlineGeometry): WallOutlineGeometry = js.native
}
