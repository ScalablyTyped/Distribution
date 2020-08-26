package typings.cesium.mod

import typings.cesium.anon.PolylinePositions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "PolylineVolumeGeometry")
@js.native
class PolylineVolumeGeometry protected () extends Packable {
  def this(options: PolylinePositions) = this()
}

/* static members */
@JSImport("cesium", "PolylineVolumeGeometry")
@js.native
object PolylineVolumeGeometry extends js.Object {
  def createGeometry(polylineVolumeGeometry: PolylineVolumeGeometry): Geometry = js.native
  def unpack(array: js.Array[Double]): PolylineVolumeGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: js.UndefOr[scala.Nothing], result: PolylineVolumeGeometry): PolylineVolumeGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: Double): PolylineVolumeGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: PolylineVolumeGeometry): PolylineVolumeGeometry = js.native
}

