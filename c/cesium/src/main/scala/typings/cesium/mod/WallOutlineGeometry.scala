package typings.cesium.mod

import typings.cesium.anon.MinimumHeights
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "WallOutlineGeometry")
@js.native
class WallOutlineGeometry protected () extends Packable {
  def this(options: MinimumHeights) = this()
}
object WallOutlineGeometry {
  
  @JSImport("cesium", "WallOutlineGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def createGeometry(wallGeometry: WallOutlineGeometry): Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("createGeometry")(wallGeometry.asInstanceOf[js.Any]).asInstanceOf[Geometry]
  
  /* static member */
  inline def fromConstantHeights(positions: js.Array[Cartesian3]): WallOutlineGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromConstantHeights")(positions.asInstanceOf[js.Any]).asInstanceOf[WallOutlineGeometry]
  inline def fromConstantHeights(positions: js.Array[Cartesian3], maximumHeight: Double): WallOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConstantHeights")(positions.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any])).asInstanceOf[WallOutlineGeometry]
  inline def fromConstantHeights(positions: js.Array[Cartesian3], maximumHeight: Double, minimumHeight: Double): WallOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConstantHeights")(positions.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any])).asInstanceOf[WallOutlineGeometry]
  inline def fromConstantHeights(
    positions: js.Array[Cartesian3],
    maximumHeight: Double,
    minimumHeight: Double,
    ellipsoid: Ellipsoid
  ): WallOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConstantHeights")(positions.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[WallOutlineGeometry]
  inline def fromConstantHeights(positions: js.Array[Cartesian3], maximumHeight: Double, minimumHeight: Unit, ellipsoid: Ellipsoid): WallOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConstantHeights")(positions.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[WallOutlineGeometry]
  inline def fromConstantHeights(positions: js.Array[Cartesian3], maximumHeight: Unit, minimumHeight: Double): WallOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConstantHeights")(positions.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any])).asInstanceOf[WallOutlineGeometry]
  inline def fromConstantHeights(positions: js.Array[Cartesian3], maximumHeight: Unit, minimumHeight: Double, ellipsoid: Ellipsoid): WallOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConstantHeights")(positions.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[WallOutlineGeometry]
  inline def fromConstantHeights(positions: js.Array[Cartesian3], maximumHeight: Unit, minimumHeight: Unit, ellipsoid: Ellipsoid): WallOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConstantHeights")(positions.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[WallOutlineGeometry]
  
  /* static member */
  inline def unpack(array: js.Array[Double]): WallOutlineGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[WallOutlineGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Double): WallOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[WallOutlineGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Double, result: WallOutlineGeometry): WallOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[WallOutlineGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Unit, result: WallOutlineGeometry): WallOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[WallOutlineGeometry]
}
