package typings.cesium.mod

import typings.cesium.anon.MaximumHeights
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "WallGeometry")
@js.native
class WallGeometry protected () extends Packable {
  def this(options: MaximumHeights) = this()
}
object WallGeometry {
  
  @JSImport("cesium", "WallGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def createGeometry(wallGeometry: WallGeometry): Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("createGeometry")(wallGeometry.asInstanceOf[js.Any]).asInstanceOf[Geometry]
  
  /* static member */
  inline def fromConstantHeights(positions: js.Array[Cartesian3]): WallGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromConstantHeights")(positions.asInstanceOf[js.Any]).asInstanceOf[WallGeometry]
  inline def fromConstantHeights(positions: js.Array[Cartesian3], maximumHeight: Double): WallGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConstantHeights")(positions.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any])).asInstanceOf[WallGeometry]
  inline def fromConstantHeights(positions: js.Array[Cartesian3], maximumHeight: Double, minimumHeight: Double): WallGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConstantHeights")(positions.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any])).asInstanceOf[WallGeometry]
  inline def fromConstantHeights(
    positions: js.Array[Cartesian3],
    maximumHeight: Double,
    minimumHeight: Double,
    ellipsoid: Ellipsoid
  ): WallGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConstantHeights")(positions.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[WallGeometry]
  inline def fromConstantHeights(positions: js.Array[Cartesian3], maximumHeight: Double, minimumHeight: Unit, ellipsoid: Ellipsoid): WallGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConstantHeights")(positions.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[WallGeometry]
  inline def fromConstantHeights(positions: js.Array[Cartesian3], maximumHeight: Unit, minimumHeight: Double): WallGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConstantHeights")(positions.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any])).asInstanceOf[WallGeometry]
  inline def fromConstantHeights(positions: js.Array[Cartesian3], maximumHeight: Unit, minimumHeight: Double, ellipsoid: Ellipsoid): WallGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConstantHeights")(positions.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[WallGeometry]
  inline def fromConstantHeights(positions: js.Array[Cartesian3], maximumHeight: Unit, minimumHeight: Unit, ellipsoid: Ellipsoid): WallGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConstantHeights")(positions.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[WallGeometry]
  
  /* static member */
  inline def unpack(array: js.Array[Double]): WallGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[WallGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Double): WallGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[WallGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Double, result: WallGeometry): WallGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[WallGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Unit, result: WallGeometry): WallGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[WallGeometry]
}
