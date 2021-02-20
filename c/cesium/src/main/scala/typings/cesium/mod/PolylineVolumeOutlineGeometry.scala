package typings.cesium.mod

import typings.cesium.anon.ShapePositions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "PolylineVolumeOutlineGeometry")
@js.native
class PolylineVolumeOutlineGeometry protected () extends Packable {
  def this(options: ShapePositions) = this()
}
object PolylineVolumeOutlineGeometry {
  
  /* static member */
  @JSImport("cesium", "PolylineVolumeOutlineGeometry.createGeometry")
  @js.native
  def createGeometry(polylineVolumeOutlineGeometry: PolylineVolumeOutlineGeometry): Geometry = js.native
  
  /* static member */
  @JSImport("cesium", "PolylineVolumeOutlineGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double]): PolylineVolumeOutlineGeometry = js.native
  @JSImport("cesium", "PolylineVolumeOutlineGeometry.unpack")
  @js.native
  def unpack(
    array: js.Array[Double],
    startingIndex: js.UndefOr[scala.Nothing],
    result: PolylineVolumeOutlineGeometry
  ): PolylineVolumeOutlineGeometry = js.native
  @JSImport("cesium", "PolylineVolumeOutlineGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: Double): PolylineVolumeOutlineGeometry = js.native
  @JSImport("cesium", "PolylineVolumeOutlineGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: PolylineVolumeOutlineGeometry): PolylineVolumeOutlineGeometry = js.native
}
