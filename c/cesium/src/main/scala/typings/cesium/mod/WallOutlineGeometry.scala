package typings.cesium.mod

import typings.cesium.anon.MinimumHeights
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "WallOutlineGeometry")
@js.native
class WallOutlineGeometry protected () extends Packable {
  def this(options: MinimumHeights) = this()
}
object WallOutlineGeometry {
  
  /* static member */
  @JSImport("cesium", "WallOutlineGeometry.createGeometry")
  @js.native
  def createGeometry(wallGeometry: WallOutlineGeometry): Geometry = js.native
  
  /* static member */
  @JSImport("cesium", "WallOutlineGeometry.fromConstantHeights")
  @js.native
  def fromConstantHeights(positions: js.Array[Cartesian3]): WallOutlineGeometry = js.native
  @JSImport("cesium", "WallOutlineGeometry.fromConstantHeights")
  @js.native
  def fromConstantHeights(
    positions: js.Array[Cartesian3],
    maximumHeight: js.UndefOr[scala.Nothing],
    minimumHeight: js.UndefOr[scala.Nothing],
    ellipsoid: Ellipsoid
  ): WallOutlineGeometry = js.native
  @JSImport("cesium", "WallOutlineGeometry.fromConstantHeights")
  @js.native
  def fromConstantHeights(positions: js.Array[Cartesian3], maximumHeight: js.UndefOr[scala.Nothing], minimumHeight: Double): WallOutlineGeometry = js.native
  @JSImport("cesium", "WallOutlineGeometry.fromConstantHeights")
  @js.native
  def fromConstantHeights(
    positions: js.Array[Cartesian3],
    maximumHeight: js.UndefOr[scala.Nothing],
    minimumHeight: Double,
    ellipsoid: Ellipsoid
  ): WallOutlineGeometry = js.native
  @JSImport("cesium", "WallOutlineGeometry.fromConstantHeights")
  @js.native
  def fromConstantHeights(positions: js.Array[Cartesian3], maximumHeight: Double): WallOutlineGeometry = js.native
  @JSImport("cesium", "WallOutlineGeometry.fromConstantHeights")
  @js.native
  def fromConstantHeights(
    positions: js.Array[Cartesian3],
    maximumHeight: Double,
    minimumHeight: js.UndefOr[scala.Nothing],
    ellipsoid: Ellipsoid
  ): WallOutlineGeometry = js.native
  @JSImport("cesium", "WallOutlineGeometry.fromConstantHeights")
  @js.native
  def fromConstantHeights(positions: js.Array[Cartesian3], maximumHeight: Double, minimumHeight: Double): WallOutlineGeometry = js.native
  @JSImport("cesium", "WallOutlineGeometry.fromConstantHeights")
  @js.native
  def fromConstantHeights(
    positions: js.Array[Cartesian3],
    maximumHeight: Double,
    minimumHeight: Double,
    ellipsoid: Ellipsoid
  ): WallOutlineGeometry = js.native
  
  /* static member */
  @JSImport("cesium", "WallOutlineGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double]): WallOutlineGeometry = js.native
  @JSImport("cesium", "WallOutlineGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: js.UndefOr[scala.Nothing], result: WallOutlineGeometry): WallOutlineGeometry = js.native
  @JSImport("cesium", "WallOutlineGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: Double): WallOutlineGeometry = js.native
  @JSImport("cesium", "WallOutlineGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: WallOutlineGeometry): WallOutlineGeometry = js.native
}
