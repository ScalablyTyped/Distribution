package typings.cesium.mod

import typings.cesium.AnonCornerTypeEllipsoidGranularityPolylinePositions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "PolylineVolumeOutlineGeometry")
@js.native
class PolylineVolumeOutlineGeometry protected () extends Packable {
  def this(options: AnonCornerTypeEllipsoidGranularityPolylinePositions) = this()
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

