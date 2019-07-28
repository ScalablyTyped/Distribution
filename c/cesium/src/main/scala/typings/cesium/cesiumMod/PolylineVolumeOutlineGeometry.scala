package typings.cesium.cesiumMod

import typings.cesium.Anon_CornerTypeEllipsoidGranularityPolylinePositions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "PolylineVolumeOutlineGeometry")
@js.native
class PolylineVolumeOutlineGeometry protected () extends Packable {
  def this(options: Anon_CornerTypeEllipsoidGranularityPolylinePositions) = this()
}

/* static members */
@JSImport("cesium", "PolylineVolumeOutlineGeometry")
@js.native
object PolylineVolumeOutlineGeometry extends js.Object {
  def createGeometry(polylineVolumeOutlineGeometry: PolylineVolumeOutlineGeometry): Geometry = js.native
  def unpack(array: js.Array[Double]): PolylineVolumeOutlineGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: Double): PolylineVolumeOutlineGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: PolylineVolumeOutlineGeometry): PolylineVolumeOutlineGeometry = js.native
}

