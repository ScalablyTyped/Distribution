package typings.cesium.global.Cesium

import typings.cesium.anon.MinimumHeights
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.WallOutlineGeometry")
@js.native
class WallOutlineGeometry protected ()
  extends typings.cesium.mod.WallOutlineGeometry {
  def this(options: MinimumHeights) = this()
}
object WallOutlineGeometry {
  
  @JSGlobal("Cesium.WallOutlineGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def createGeometry(wallGeometry: typings.cesium.mod.WallOutlineGeometry): typings.cesium.mod.Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("createGeometry")(wallGeometry.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Geometry]
  
  /* static member */
  inline def fromConstantHeights(positions: js.Array[typings.cesium.mod.Cartesian3]): typings.cesium.mod.WallOutlineGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromConstantHeights")(positions.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.WallOutlineGeometry]
  inline def fromConstantHeights(positions: js.Array[typings.cesium.mod.Cartesian3], maximumHeight: Double): typings.cesium.mod.WallOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConstantHeights")(positions.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.WallOutlineGeometry]
  inline def fromConstantHeights(positions: js.Array[typings.cesium.mod.Cartesian3], maximumHeight: Double, minimumHeight: Double): typings.cesium.mod.WallOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConstantHeights")(positions.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.WallOutlineGeometry]
  inline def fromConstantHeights(
    positions: js.Array[typings.cesium.mod.Cartesian3],
    maximumHeight: Double,
    minimumHeight: Double,
    ellipsoid: typings.cesium.mod.Ellipsoid
  ): typings.cesium.mod.WallOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConstantHeights")(positions.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.WallOutlineGeometry]
  inline def fromConstantHeights(
    positions: js.Array[typings.cesium.mod.Cartesian3],
    maximumHeight: Double,
    minimumHeight: Unit,
    ellipsoid: typings.cesium.mod.Ellipsoid
  ): typings.cesium.mod.WallOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConstantHeights")(positions.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.WallOutlineGeometry]
  inline def fromConstantHeights(positions: js.Array[typings.cesium.mod.Cartesian3], maximumHeight: Unit, minimumHeight: Double): typings.cesium.mod.WallOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConstantHeights")(positions.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.WallOutlineGeometry]
  inline def fromConstantHeights(
    positions: js.Array[typings.cesium.mod.Cartesian3],
    maximumHeight: Unit,
    minimumHeight: Double,
    ellipsoid: typings.cesium.mod.Ellipsoid
  ): typings.cesium.mod.WallOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConstantHeights")(positions.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.WallOutlineGeometry]
  inline def fromConstantHeights(
    positions: js.Array[typings.cesium.mod.Cartesian3],
    maximumHeight: Unit,
    minimumHeight: Unit,
    ellipsoid: typings.cesium.mod.Ellipsoid
  ): typings.cesium.mod.WallOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConstantHeights")(positions.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.WallOutlineGeometry]
  
  /* static member */
  inline def unpack(array: js.Array[Double]): typings.cesium.mod.WallOutlineGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.WallOutlineGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Double): typings.cesium.mod.WallOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.WallOutlineGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Double, result: typings.cesium.mod.WallOutlineGeometry): typings.cesium.mod.WallOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.WallOutlineGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Unit, result: typings.cesium.mod.WallOutlineGeometry): typings.cesium.mod.WallOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.WallOutlineGeometry]
}
