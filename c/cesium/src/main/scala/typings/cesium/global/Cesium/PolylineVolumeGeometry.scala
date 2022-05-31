package typings.cesium.global.Cesium

import typings.cesium.anon.PolylinePositions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.PolylineVolumeGeometry")
@js.native
class PolylineVolumeGeometry protected ()
  extends typings.cesium.mod.PolylineVolumeGeometry {
  def this(options: PolylinePositions) = this()
}
object PolylineVolumeGeometry {
  
  @JSGlobal("Cesium.PolylineVolumeGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def createGeometry(polylineVolumeGeometry: typings.cesium.mod.PolylineVolumeGeometry): typings.cesium.mod.Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("createGeometry")(polylineVolumeGeometry.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Geometry]
  
  /* static member */
  inline def unpack(array: js.Array[Double]): typings.cesium.mod.PolylineVolumeGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.PolylineVolumeGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Double): typings.cesium.mod.PolylineVolumeGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.PolylineVolumeGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Double, result: typings.cesium.mod.PolylineVolumeGeometry): typings.cesium.mod.PolylineVolumeGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.PolylineVolumeGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Unit, result: typings.cesium.mod.PolylineVolumeGeometry): typings.cesium.mod.PolylineVolumeGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.PolylineVolumeGeometry]
}
