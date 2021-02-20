package typings.cesium.mod

import typings.cesium.anon.MaximumHeights
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "WallGeometry")
@js.native
class WallGeometry protected () extends Packable {
  def this(options: MaximumHeights) = this()
}
object WallGeometry {
  
  /* static member */
  @JSImport("cesium", "WallGeometry.createGeometry")
  @js.native
  def createGeometry(wallGeometry: WallGeometry): Geometry = js.native
  
  /* static member */
  @JSImport("cesium", "WallGeometry.fromConstantHeights")
  @js.native
  def fromConstantHeights(positions: js.Array[Cartesian3]): WallGeometry = js.native
  @JSImport("cesium", "WallGeometry.fromConstantHeights")
  @js.native
  def fromConstantHeights(
    positions: js.Array[Cartesian3],
    maximumHeight: js.UndefOr[scala.Nothing],
    minimumHeight: js.UndefOr[scala.Nothing],
    ellipsoid: Ellipsoid
  ): WallGeometry = js.native
  @JSImport("cesium", "WallGeometry.fromConstantHeights")
  @js.native
  def fromConstantHeights(positions: js.Array[Cartesian3], maximumHeight: js.UndefOr[scala.Nothing], minimumHeight: Double): WallGeometry = js.native
  @JSImport("cesium", "WallGeometry.fromConstantHeights")
  @js.native
  def fromConstantHeights(
    positions: js.Array[Cartesian3],
    maximumHeight: js.UndefOr[scala.Nothing],
    minimumHeight: Double,
    ellipsoid: Ellipsoid
  ): WallGeometry = js.native
  @JSImport("cesium", "WallGeometry.fromConstantHeights")
  @js.native
  def fromConstantHeights(positions: js.Array[Cartesian3], maximumHeight: Double): WallGeometry = js.native
  @JSImport("cesium", "WallGeometry.fromConstantHeights")
  @js.native
  def fromConstantHeights(
    positions: js.Array[Cartesian3],
    maximumHeight: Double,
    minimumHeight: js.UndefOr[scala.Nothing],
    ellipsoid: Ellipsoid
  ): WallGeometry = js.native
  @JSImport("cesium", "WallGeometry.fromConstantHeights")
  @js.native
  def fromConstantHeights(positions: js.Array[Cartesian3], maximumHeight: Double, minimumHeight: Double): WallGeometry = js.native
  @JSImport("cesium", "WallGeometry.fromConstantHeights")
  @js.native
  def fromConstantHeights(
    positions: js.Array[Cartesian3],
    maximumHeight: Double,
    minimumHeight: Double,
    ellipsoid: Ellipsoid
  ): WallGeometry = js.native
  
  /* static member */
  @JSImport("cesium", "WallGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double]): WallGeometry = js.native
  @JSImport("cesium", "WallGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: js.UndefOr[scala.Nothing], result: WallGeometry): WallGeometry = js.native
  @JSImport("cesium", "WallGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: Double): WallGeometry = js.native
  @JSImport("cesium", "WallGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: WallGeometry): WallGeometry = js.native
}
