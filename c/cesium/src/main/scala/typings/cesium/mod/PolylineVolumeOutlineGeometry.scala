package typings.cesium.mod

import typings.cesium.anon.ShapePositions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "PolylineVolumeOutlineGeometry")
@js.native
class PolylineVolumeOutlineGeometry protected () extends Packable {
  def this(options: ShapePositions) = this()
}
object PolylineVolumeOutlineGeometry {
  
  @JSImport("cesium", "PolylineVolumeOutlineGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def createGeometry(polylineVolumeOutlineGeometry: PolylineVolumeOutlineGeometry): Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("createGeometry")(polylineVolumeOutlineGeometry.asInstanceOf[js.Any]).asInstanceOf[Geometry]
  
  /* static member */
  inline def unpack(array: js.Array[Double]): PolylineVolumeOutlineGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[PolylineVolumeOutlineGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Double): PolylineVolumeOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[PolylineVolumeOutlineGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Double, result: PolylineVolumeOutlineGeometry): PolylineVolumeOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[PolylineVolumeOutlineGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Unit, result: PolylineVolumeOutlineGeometry): PolylineVolumeOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[PolylineVolumeOutlineGeometry]
}
