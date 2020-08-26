package typings.cesium.mod

import typings.cesium.anon.Loop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "GroundPolylineGeometry")
@js.native
class GroundPolylineGeometry protected () extends Packable {
  def this(options: Loop) = this()
  var arcType: ArcType = js.native
  var granularity: Boolean = js.native
  var loop: Boolean = js.native
  var width: Double = js.native
}

/* static members */
@JSImport("cesium", "GroundPolylineGeometry")
@js.native
object GroundPolylineGeometry extends js.Object {
  def unpack(array: js.Array[Double]): GroundPolylineGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: js.UndefOr[scala.Nothing], result: GroundPolylineGeometry): GroundPolylineGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: Double): GroundPolylineGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: GroundPolylineGeometry): GroundPolylineGeometry = js.native
}

