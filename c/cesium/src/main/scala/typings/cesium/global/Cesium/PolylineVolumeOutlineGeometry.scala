package typings.cesium.global.Cesium

import typings.cesium.anon.ShapePositions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.PolylineVolumeOutlineGeometry")
@js.native
class PolylineVolumeOutlineGeometry protected ()
  extends typings.cesium.mod.PolylineVolumeOutlineGeometry {
  def this(options: ShapePositions) = this()
}
object PolylineVolumeOutlineGeometry {
  
  @JSGlobal("Cesium.PolylineVolumeOutlineGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def createGeometry(polylineVolumeOutlineGeometry: typings.cesium.mod.PolylineVolumeOutlineGeometry): typings.cesium.mod.Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("createGeometry")(polylineVolumeOutlineGeometry.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Geometry]
  
  /* static member */
  inline def unpack(array: js.Array[Double]): typings.cesium.mod.PolylineVolumeOutlineGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.PolylineVolumeOutlineGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Double): typings.cesium.mod.PolylineVolumeOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.PolylineVolumeOutlineGeometry]
  inline def unpack(
    array: js.Array[Double],
    startingIndex: Double,
    result: typings.cesium.mod.PolylineVolumeOutlineGeometry
  ): typings.cesium.mod.PolylineVolumeOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.PolylineVolumeOutlineGeometry]
  inline def unpack(
    array: js.Array[Double],
    startingIndex: Unit,
    result: typings.cesium.mod.PolylineVolumeOutlineGeometry
  ): typings.cesium.mod.PolylineVolumeOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.PolylineVolumeOutlineGeometry]
}
