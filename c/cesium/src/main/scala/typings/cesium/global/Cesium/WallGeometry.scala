package typings.cesium.global.Cesium

import typings.cesium.anon.MaximumHeights
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.WallGeometry")
@js.native
class WallGeometry protected ()
  extends typings.cesium.mod.WallGeometry {
  def this(options: MaximumHeights) = this()
}
object WallGeometry {
  
  @JSGlobal("Cesium.WallGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def createGeometry(wallGeometry: typings.cesium.mod.WallGeometry): typings.cesium.mod.Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("createGeometry")(wallGeometry.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Geometry]
  
  /* static member */
  inline def fromConstantHeights(positions: js.Array[typings.cesium.mod.Cartesian3]): typings.cesium.mod.WallGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromConstantHeights")(positions.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.WallGeometry]
  inline def fromConstantHeights(positions: js.Array[typings.cesium.mod.Cartesian3], maximumHeight: Double): typings.cesium.mod.WallGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConstantHeights")(positions.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.WallGeometry]
  inline def fromConstantHeights(positions: js.Array[typings.cesium.mod.Cartesian3], maximumHeight: Double, minimumHeight: Double): typings.cesium.mod.WallGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConstantHeights")(positions.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.WallGeometry]
  inline def fromConstantHeights(
    positions: js.Array[typings.cesium.mod.Cartesian3],
    maximumHeight: Double,
    minimumHeight: Double,
    ellipsoid: typings.cesium.mod.Ellipsoid
  ): typings.cesium.mod.WallGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConstantHeights")(positions.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.WallGeometry]
  inline def fromConstantHeights(
    positions: js.Array[typings.cesium.mod.Cartesian3],
    maximumHeight: Double,
    minimumHeight: Unit,
    ellipsoid: typings.cesium.mod.Ellipsoid
  ): typings.cesium.mod.WallGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConstantHeights")(positions.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.WallGeometry]
  inline def fromConstantHeights(positions: js.Array[typings.cesium.mod.Cartesian3], maximumHeight: Unit, minimumHeight: Double): typings.cesium.mod.WallGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConstantHeights")(positions.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.WallGeometry]
  inline def fromConstantHeights(
    positions: js.Array[typings.cesium.mod.Cartesian3],
    maximumHeight: Unit,
    minimumHeight: Double,
    ellipsoid: typings.cesium.mod.Ellipsoid
  ): typings.cesium.mod.WallGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConstantHeights")(positions.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.WallGeometry]
  inline def fromConstantHeights(
    positions: js.Array[typings.cesium.mod.Cartesian3],
    maximumHeight: Unit,
    minimumHeight: Unit,
    ellipsoid: typings.cesium.mod.Ellipsoid
  ): typings.cesium.mod.WallGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConstantHeights")(positions.asInstanceOf[js.Any], maximumHeight.asInstanceOf[js.Any], minimumHeight.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.WallGeometry]
  
  /* static member */
  inline def unpack(array: js.Array[Double]): typings.cesium.mod.WallGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.WallGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Double): typings.cesium.mod.WallGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.WallGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Double, result: typings.cesium.mod.WallGeometry): typings.cesium.mod.WallGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.WallGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Unit, result: typings.cesium.mod.WallGeometry): typings.cesium.mod.WallGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.WallGeometry]
}
