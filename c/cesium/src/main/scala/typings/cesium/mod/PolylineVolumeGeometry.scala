package typings.cesium.mod

import typings.cesium.anon.PolylinePositions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "PolylineVolumeGeometry")
@js.native
class PolylineVolumeGeometry protected () extends Packable {
  def this(options: PolylinePositions) = this()
}
object PolylineVolumeGeometry {
  
  @JSImport("cesium", "PolylineVolumeGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def createGeometry(polylineVolumeGeometry: PolylineVolumeGeometry): Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("createGeometry")(polylineVolumeGeometry.asInstanceOf[js.Any]).asInstanceOf[Geometry]
  
  /* static member */
  @scala.inline
  def unpack(array: js.Array[Double]): PolylineVolumeGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[PolylineVolumeGeometry]
  @scala.inline
  def unpack(array: js.Array[Double], startingIndex: Double): PolylineVolumeGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[PolylineVolumeGeometry]
  @scala.inline
  def unpack(array: js.Array[Double], startingIndex: Double, result: PolylineVolumeGeometry): PolylineVolumeGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[PolylineVolumeGeometry]
  @scala.inline
  def unpack(array: js.Array[Double], startingIndex: Unit, result: PolylineVolumeGeometry): PolylineVolumeGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[PolylineVolumeGeometry]
}
